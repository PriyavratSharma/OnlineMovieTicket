package com.cg.gla.fs.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cg.gla.fs.model.Theater;
import com.cg.gla.fs.repository.CustomerRepository;


@Service
public class CustomerService {
@Autowired
CustomerRepository theCustomerRepository;



}
