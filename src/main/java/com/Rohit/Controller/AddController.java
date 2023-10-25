package com.Rohit.Controller;

import com.Rohit.Model.Address;
import com.Rohit.Model.Employee;
import com.Rohit.Service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddController {
    @Autowired
    AddService addService;


    @PostMapping
    public String addEmployee(@RequestBody Address add){
        return addService.addAddress(add);
    }
    @GetMapping
    public List<Address> getAddress(){
        return addService.getAdress();
    }
    @DeleteMapping("/id/{id}")
    public String delEmployee(@PathVariable Integer id){
        return addService.delAddress(id);
    }
    @GetMapping("/id/{id}")
    public Address getAddress(@PathVariable Integer id){
        return addService.findAdress(id);
    }
    @PutMapping
    public String updateAddress(@RequestBody Address empAdd){
        return addService.updateAdd(empAdd);
    }

}
