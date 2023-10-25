package com.Rohit.Repo;

import com.Rohit.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddRepo extends JpaRepository<Address,Integer> {
}
