package com.myproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/start")
    public String getTitle() {
        return "<div id='result'>hello world</div>";
    }

}
