package com.example.Mapping_Basic.Repository;

import com.example.Mapping_Basic.DTO.SubjectDTO;
import com.example.Mapping_Basic.Entity.Subject;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<SubjectDTO,Long> {
}
