package com.cg.gla.fs.controller;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.gla.fs.service.CustomerService;
import com.cg.gla.fs.model.Theater;

@RestController
@RequestMapping("/city")
public class CustomerController {
@Autowired
CustomerService theCustomerService;



}
