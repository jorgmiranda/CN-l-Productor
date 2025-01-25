package com.rabbit.productor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rabbit.productor.service.ProductorService;

@RestController
public class ProductorController {
    
    @Autowired
    private ProductorService productorService;

    @PostMapping("/send")
    private String sendMessage(@RequestParam("message") String message){
        productorService.sendMessage(message);
        return "Mensaje Enviado: "+message;
    }
}
