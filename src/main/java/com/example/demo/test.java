package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.awt.SunHints;

@RestController
@RequestMapping("/test")
public class test {
    int a;
    String b;
    double c;
    public test(){
        this.a=10;
        this.b="hello";
        this.c=1.25;
    }
    @RequestMapping("/getA")

    public int getA()
    {
        return this.a;
    }
    @RequestMapping(value="/putA",method= RequestMethod.PUT)
    public String putA(@RequestParam(value = "A") int A){
        this.a=A;
        return "success";
    }
    @RequestMapping(value="/postx",method=RequestMethod.POST)
    public String postx(){
        return this.toString();
    }
}

