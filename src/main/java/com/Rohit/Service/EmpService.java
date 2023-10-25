package com.Rohit.Service;

import com.Rohit.Model.Employee;
import com.Rohit.Repo.IEmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Service
public class EmpService {
    @Autowired
    IEmpRepo empRepo;

    public String addEmplyee(Employee emp) {
        empRepo.save(emp);
        return "Added SuccessFully !!";
    }

    public List<Employee> getEmployee() {
        return empRepo.findAll();
    }

    public String delEmployee(Integer id) {
        empRepo.deleteById(id);
        return "Deleted Successfully !!";
    }


    public String updateEmplyee(String empName,Integer id) {
        Employee existEmp=empRepo.findById(id).orElseThrow();
        existEmp.setEmpName(empName);
        empRepo.save(existEmp);
        return "Updated SuccessFully !!";
    }

    public Employee getEmploye(Integer id) {
        return empRepo.findById(id).get();
    }
}
