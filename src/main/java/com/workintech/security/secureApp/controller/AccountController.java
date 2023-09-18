package com.workintech.security.secureApp.controller;

import com.workintech.security.secureApp.entity.Account;
import com.workintech.security.secureApp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/account")
public class AccountController {

    private AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/")
    public List<Account> findAll(){
        return accountService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Account> findById(@PathVariable int id){
        return accountService.getById(id);
    }

    @PostMapping("/")
    public Account save(@RequestBody String accountName) {
        return accountService.addAccount(accountName);
    }

    @PutMapping("/{id}")
    public Account save(@RequestBody String accountName, @PathVariable int id){
        return accountService.updateAccount(id, accountName);
    }

    @DeleteMapping("/{id}")
    public Account delete(@PathVariable int id){
        return accountService.deleteAccount(id);
    }

}