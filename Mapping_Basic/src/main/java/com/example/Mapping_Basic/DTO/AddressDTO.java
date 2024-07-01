package com.example.Mapping_Basic.DTO;

import com.example.Mapping_Basic.Entity.Student;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {

        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        int addressId;
        String city;
        String state;

        @OneToOne(mappedBy = "addressDTO")
        private StudentDTO studentDTO;
    }


