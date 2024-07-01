package com.example.Mapping_Basic.Services;

import com.example.Mapping_Basic.DTO.AddressDTO;
//import com.example.Mapping_Basic.Entity.Address;
import com.example.Mapping_Basic.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class AddressServices {

    @Autowired
    AddressRepository addressRepository;

    public AddressDTO addAddress( AddressDTO addressDTO){

      return addressRepository.save(addressDTO);
    }

    @GetMapping
    public List<AddressDTO> getAddress(){
        return addressRepository.findAll();
    }
}
