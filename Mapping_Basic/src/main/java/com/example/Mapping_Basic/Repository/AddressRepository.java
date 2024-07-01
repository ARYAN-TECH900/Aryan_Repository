package com.example.Mapping_Basic.Repository;

import com.example.Mapping_Basic.DTO.AddressDTO;
import com.example.Mapping_Basic.Entity.Address;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<AddressDTO, Integer> {
}
