package com.ludus.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexControl {

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value="/store", method= RequestMethod.GET)
    public String about() {
        return "store";
    }
}
