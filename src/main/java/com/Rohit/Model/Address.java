package com.Rohit.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "empAddres")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addId;
    private  String addState;
    private  String addCity;
    private  String zipCode;


//    @OneToMany
//    @JoinColumn(name = "addsId")
//        List<Employee> emp;
}
