package tn.dksoft.ebuilding.business;

import tn.dksoft.ebuilding.entities.Trole;
import tn.dksoft.ebuilding.entities.Tuser;

import java.util.List;

public interface AccountService {
    Tuser addNewUser(String userName,String email, String passWord, String confirmPassword);
    Trole addNewRole(Trole role);
    void addRoleToUser(String email, String roleName);
    Tuser loadUserByUserName(String userName);
    Tuser loadUserByEmail(String email);
    List<Tuser>listUsers();
    void removeRoleFromUser(String email,String roleName);
}
