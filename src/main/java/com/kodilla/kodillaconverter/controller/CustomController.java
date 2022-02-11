package com.kodilla.kodillaconverter.controller;

import com.kodilla.kodillaconverter.domain.MyCustomClass;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/custom/")
public class CustomController {

    @PostMapping(path = "add")
    public void acceptCustomTextType(@RequestBody MyCustomClass theClass) {
        System.out.println(theClass.getFiledOne());
        System.out.println(theClass.getFieldTwo());
        System.out.println(theClass.getFieldThree());
    }

    @PostMapping(path = "convert")
    public void convertNewMessage(@RequestBody MyCustomClass customClass) {
        System.out.println(customClass.getFiledOne());
        System.out.println(customClass.getFieldTwo());
    }
}
