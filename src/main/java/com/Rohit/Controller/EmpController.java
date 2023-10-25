package com.Rohit.Controller;

import com.Rohit.Model.Employee;
import com.Rohit.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Employees")
public class EmpController {

    @Autowired
    EmpService empService;

    @PostMapping
    public String addEmployee(@RequestBody Employee emp){
        return empService.addEmplyee(emp);
    }
    @GetMapping
    public List<Employee> getEmployee(){
        return empService.getEmployee();
    }
    @DeleteMapping("/id/{id}")
    public String delEmployee(@PathVariable Integer id){
        return empService.delEmployee(id);
    }
    @PutMapping("id/{id}")
    public String updateEmployee(@RequestParam String empName,@PathVariable Integer id){
        return empService.updateEmplyee(empName,id);
    }
    @GetMapping("/id/{id}")
    public Employee getEmployee(@PathVariable Integer id){
        return empService.getEmploye(id);
    }

}
