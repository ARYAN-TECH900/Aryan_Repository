package com.example.Mapping_Basic.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.antlr.v4.runtime.misc.NotNull;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    int addressId;

//    @NotNull(message="city cant be empty")
    String city;

    //@NotNull(message="state can't be empty ")
    String state;

    @OneToOne(mappedBy = "address")
    private Student student;
}
