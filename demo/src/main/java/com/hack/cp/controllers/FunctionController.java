package com.hack.cp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/f")
public class FunctionController{

    @GetMapping("/turnOn")
    public void turnOn() {
//        model.addAttribute("race", "name layout");
        System.out.print("turnOn");
    }

    @GetMapping("/turnOff")
    public void turnOff() {
//        model.addAttribute("race", "name layout");
        System.out.print("turnOff");
    }

    @GetMapping("/phones")
    public String phones(@RequestParam(name="name") String name) {
        System.out.print(name);

        return "home";
    }


}