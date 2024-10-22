package com.demo_thymeleaf.pj_thymeleaf.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo_thymeleaf.pj_thymeleaf.models.ModelTable;
import com.demo_thymeleaf.pj_thymeleaf.repository.mapper._RepositoryCustomer;

@Service
public class ServiceCustomer {

    @Autowired
    _RepositoryCustomer repository;

    public ServiceCustomer(_RepositoryCustomer repository) {
        this.repository = repository;
    }

    public void serv_add_customer (ModelTable model) {
        repository.save(model);
    }

    public List<ModelTable> serv_list_customer () {
        return repository.findAll();
    }
}
