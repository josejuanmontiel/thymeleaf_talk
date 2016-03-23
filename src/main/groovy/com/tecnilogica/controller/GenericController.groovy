package com.tecnilogica.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
public class GenericController {

    @RequestMapping("/generic/{page}")
    public String home(Model model, @PathVariable(value="page") String page) {
        return page;
    }
}
