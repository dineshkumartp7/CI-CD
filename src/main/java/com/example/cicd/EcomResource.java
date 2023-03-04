package com.example.cicd;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EcomResource {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue="World") String name) {
        return "<h1>Today is a wonderfull day ahead ! , " + name +"</h1>";
    }

    @GetMapping("/")
    public String index() {
        return "<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css' integrity='sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T' crossorigin='anonymous'><body style='background-color: #1abc9c;'><nav class='navbar navbar-dark bg-primary'> <a class='navbar-brand' href='#'>eCommerce Web App </a></nav><div class='bg-1'><div class='container text-center'><h3>Who Am I?</h3><img src='http://www.awardaudio.com/image/obj600geo571pg41p11.jpg' class='img-circle' alt='Bird' width='350' height='350'><h3>Sample website deployed using Jenkins CI-CD by Md Azaz</h3></div></div></body>";
    }

    @GetMapping("/hello")
    public String hello() {
        return "<h2>Hello, wonderfull job!<h2>";
    }
}
