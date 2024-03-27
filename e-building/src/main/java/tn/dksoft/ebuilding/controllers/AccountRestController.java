package tn.dksoft.ebuilding.controllers;

import org.springframework.web.bind.annotation.*;
import tn.dksoft.ebuilding.business.AccountService;
import tn.dksoft.ebuilding.dtos.RoleUserForm;
import tn.dksoft.ebuilding.entities.Trole;
import tn.dksoft.ebuilding.entities.Tuser;

import java.util.List;

@RestController
@RequestMapping("/api/account")
public class AccountRestController {
    private final AccountService accountService;

    public AccountRestController(AccountService accountService) {
        this.accountService = accountService;
    }
    @GetMapping(path = "/users")
    public List<Tuser> appUsers(){
        return accountService.listUsers();
    }
    @PostMapping("/users")
    //RequestBody: meaning that user 's data are inside body of request
    public Tuser saveUser(@RequestBody Tuser appUser){

        return accountService.addNewUser(appUser.getUserName(),appUser.getEmail(),appUser.getPassword(),appUser.getConfirmPassword());
    }
    @PostMapping("/roles")
    public Trole saveUser(@RequestBody  Trole appRole){

        return accountService.addNewRole(appRole);
    }
    @PostMapping("/addRoleToUser")
    public void addRoleToUser(@RequestBody RoleUserForm roleUserForm){
        accountService.addRoleToUser(roleUserForm.getEmail(),roleUserForm.getRoleName());
    }
}
