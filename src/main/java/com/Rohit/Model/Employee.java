package com.Rohit.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empId;
    private String empName;

    //as we know Employee is dependant on address thats why FK is created in employee table
    @OneToOne
    @JoinColumn(name = "fk_addressId")
    Address address;
}
//one-one and many-one can be done in employess class bcos many emp can have the same addres
//but if we have one-many mapping it will be possible only in address class (Note: FK created in EMP table)
// FK is always created on many wli side...