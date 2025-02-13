package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Function.huffman;

@RestController
public class Controller {

    public huffman hf=null;
    @GetMapping("/encode")
    public String e(@RequestParam("input") String input) throws Exception {
        hf=new huffman(input);
        String encode= hf.encode(input);
        return encode;
    }
    @GetMapping("/decode")
    public String d(@RequestParam("input") String input) throws Exception {
        return hf.decode(input);
    }
    @GetMapping("/clear")
    public void clear() {
        hf=null;
    }

}
