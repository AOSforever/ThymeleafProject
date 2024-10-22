package com.demo_thymeleaf.pj_thymeleaf.repository.mapper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo_thymeleaf.pj_thymeleaf.models.ModelTable;

@Repository
public interface _RepositoryCustomer extends JpaRepository<ModelTable, Long> {

}
