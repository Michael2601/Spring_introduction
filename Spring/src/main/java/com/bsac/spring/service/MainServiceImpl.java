package com.bsac.spring.service;

import com.bsac.spring.model.HelloForm;
import org.springframework.stereotype.Service;

@Service
public class MainServiceImpl implements MainService{

    @Override
    public String helloWorld() {
        return new HelloForm().getName();
    }
    
}

