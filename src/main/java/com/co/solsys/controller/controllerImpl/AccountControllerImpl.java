package com.co.solsys.controller.controllerImpl;

import com.co.solsys.controller.IAccountController;
import com.co.solsys.model.Account;
import com.co.solsys.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/account")
public class AccountControllerImpl implements IAccountController {

    @Autowired
    private IAccountService accountService;

    @Override
    @PostMapping()
    public ResponseEntity<Account> save(@Valid @RequestBody Account account) {
        return accountService.save(account);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Account> findById(@PathVariable int id) {
        return accountService.findById(id);
    }

    @Override
    @GetMapping("/findAll")
    public ResponseEntity<List<Account>> findAll() {
        return accountService.findAll();
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<Account> update(@PathVariable int id, @Valid @RequestBody Account account) {
        return accountService.update(id, account);
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        return accountService.delete(id);
    }

    @Override
    @DeleteMapping("/deleteAll")
    public ResponseEntity<String> deleteAll() {
        return accountService.deleteAll();
    }
}
