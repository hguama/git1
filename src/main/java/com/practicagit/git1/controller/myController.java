package com.practicagit.git1.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class myController {

    @PostMapping("sumar")
    public int sumar(@RequestBody Map<String,Integer> req){
        int suma=req.get("a")+req.get("b");

        return suma;
    }

    @PostMapping("restar")
    public int restar(@RequestBody Map<String,Integer> req){
        int resta=req.get("a")-req.get("b");

        return resta;
    }

}
