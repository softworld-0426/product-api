package com.co.solsys.controller.controllerImpl;

import com.co.solsys.controller.IBillingAddressController;
import com.co.solsys.model.BillingAddress;
import com.co.solsys.service.IBillingAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/billing")
public class BillingAddressControllerImpl implements IBillingAddressController {

    @Autowired
    private IBillingAddressService billingAddressService;

    @Override
    @PostMapping()
    public ResponseEntity<BillingAddress> save(@Valid @RequestBody BillingAddress billingAddress) {
        return billingAddressService.save(billingAddress);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<BillingAddress> findById(@PathVariable int id) {
        return billingAddressService.findById(id);
    }

    @Override
    @GetMapping("/findAll")
    public ResponseEntity<List<BillingAddress>> findAll() {
        return billingAddressService.findAll();
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<BillingAddress> update(@PathVariable int id, @Valid @RequestBody BillingAddress billingAddress) {
        return billingAddressService.update(id, billingAddress);
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        return billingAddressService.delete(id);
    }

    @Override
    @DeleteMapping("/deleteAll")
    public ResponseEntity<String> deleteAll() {
        return billingAddressService.deleteAll();
    }

}
