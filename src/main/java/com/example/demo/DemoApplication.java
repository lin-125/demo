package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class DemoApplication {
    static test t;
    public static void main(String[] args) {
        t=new test();
        SpringApplication.run(DemoApplication.class, args);
    }
//    @RequestMapping
//    public String index() {
//        return "hello springboot";
//    }
    @RequestMapping("getA")
    public int getA()
    {
        return t.getA();
    }
    @RequestMapping(value = "putA",method = RequestMethod.PUT)
    public String putA(@RequestParam(value = "A") int A){
        t.a=A;
        return "success";
    }
    @RequestMapping(value="post",method = RequestMethod.POST)
    public String post(){
        return  t.b;
    }
}
