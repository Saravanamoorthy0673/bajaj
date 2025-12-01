package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MainService {

    public void startProcess() {
        System.out.println("Application started... workflow triggered!");
    }

}
