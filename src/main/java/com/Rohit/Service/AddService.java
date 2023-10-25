package com.Rohit.Service;

import com.Rohit.Model.Address;
import com.Rohit.Repo.IAddRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddService {
    @Autowired
    IAddRepo addRepo;

    public String addAddress(Address add) {
        addRepo.save(add);
        return "Added Address !!";
    }

    public List<Address> getAdress() {
        return addRepo.findAll();
    }

    public String delAddress(Integer id) {
        addRepo.deleteById(id);
        return "Deleted Address !!";
    }

    public Address findAdress(Integer id) {
        return addRepo.findById(id).get();
    }

    public String updateAdd(Address empAdd) {
        addRepo.save(empAdd);
        return "Updated Successfully";
    }
}
