package com.example.Mapping_Basic.Controller;

import com.example.Mapping_Basic.DTO.AddressDTO;
import com.example.Mapping_Basic.Services.AddressServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AddressServices addressServices;

    @PostMapping
    public ResponseEntity<AddressDTO> addAddress(@RequestBody AddressDTO addressDTO){
         addressServices.addAddress(addressDTO);
         return new ResponseEntity<>(addressDTO, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<AddressDTO>> getAddress(){
        return new ResponseEntity<>(addressServices.getAddress(),HttpStatus.OK);
    }

}
