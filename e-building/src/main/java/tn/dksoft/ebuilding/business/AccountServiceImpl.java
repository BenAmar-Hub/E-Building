package tn.dksoft.ebuilding.business;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.dksoft.ebuilding.entities.Trole;
import tn.dksoft.ebuilding.entities.Tuser;
import tn.dksoft.ebuilding.exceptions.EmailAlreadyTakenException;
import tn.dksoft.ebuilding.exceptions.EmailNotValidException;
import tn.dksoft.ebuilding.repositories.AppRoleRepository;
import tn.dksoft.ebuilding.repositories.AppUserRepository;
import tn.dksoft.ebuilding.validation.EmailValidator;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AppUserRepository appUserRepository;
    private final AppRoleRepository appRoleRepository;
    private final EmailValidator emailValidator;
    private final PasswordEncoder passwordEncoder;

    @Override
    public Tuser addNewUser(String userName,String email, String passWord, String confirmPassword) {
        if(appUserRepository.findByUserName(userName).orElse(null)!=null){
            throw new RuntimeException("this user already exist!");
        };
        checkEmailValidity(email);
        checkEmailExists(email);
        if (passWord.isBlank() ){
            throw new IllegalArgumentException("Password is required!");
        }
        if (confirmPassword.isBlank() ){
            throw new IllegalArgumentException("ConfirmPassword is required!");
        }
        if(passWord.equals(confirmPassword)){
            throw new RuntimeException("Passwords not match!");
        }
   /*     if (user.getRoles()==null){
            throw new IllegalArgumentException("role is required!");
        }*/
        Tuser appUser = Tuser.builder()
                .userName(userName)
                .email(email)
                .password(passwordEncoder.encode(passWord))
                .build();
        return appUserRepository.save(appUser);
    }

    @Override
    public Trole addNewRole(Trole role) {
        Trole byRoleName = appRoleRepository.findByRoleName(role.getRoleName()).orElse(null);
        if (byRoleName!=null) throw new RuntimeException(role.getRoleName()+" is already exist!");
        else return appRoleRepository.save(role);
    }
    @Override
    public void addRoleToUser(String userName, String roleName) {
        Optional<Tuser> byUserName = appUserRepository.findByUserName(userName);
        Optional<Trole> byRoleName = appRoleRepository.findByRoleName(roleName);
        if (byRoleName.isPresent()&&byUserName.isPresent()){
            byUserName.get().getRoles().add(byRoleName.get());
        }else throw new DataIntegrityViolationException(byUserName.get().getUserName()+" or "+roleName+" is not found!");;

    }

    @Override
    public Tuser loadUserByUserName(String userName) {
        if (appUserRepository.findByUserName(userName).isPresent()){
            return appUserRepository.findByUserName(userName).get();
        }else throw new DataIntegrityViolationException(userName+" is not found!");

    }

    @Override
    public Tuser loadUserByEmail(String email) {
        if (appUserRepository.findByEmail(email).isPresent()) {
            return appUserRepository.findByEmail(email).get();
        }else
            throw new DataIntegrityViolationException(email+" not found!");
    }

    @Override
    public List<Tuser> listUsers() {
        return appUserRepository.findAll();
    }

    @Override
    public void removeRoleFromUser(String email, String roleName) {
        Tuser appUser=appUserRepository.findByEmail(email).orElseThrow(EntityNotFoundException::new);
        Trole appRole = appRoleRepository.findByRoleName(roleName).orElseThrow(EntityNotFoundException::new);
        appUser.getRoles().remove(appRole);

    }

    private void checkEmailValidity(String email) {
        if (!(emailValidator.checkMailPattern(email))){
            throw new EmailNotValidException();
        }
    }

    private void checkEmailExists(String email) {
        if (appUserRepository.existsByEmail(email)) {
            throw new EmailAlreadyTakenException();
        }
    }
}
