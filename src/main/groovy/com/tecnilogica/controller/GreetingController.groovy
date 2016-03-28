package com.tecnilogica.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam

import org.springframework.validation.BindingResult
import javax.validation.Valid

import com.tecnilogica.model.Greeting

@Controller
public class GreetingController {

    @RequestMapping(value="/greeting", method=RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting())
        return "greeting"
    }

    @RequestMapping(value="/greeting", method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute @Valid Greeting greeting, BindingResult bindingResult, Model model) {

        // Si hay errores volvemos...
        if (bindingResult.hasErrors()) {
            return "greeting";
        }

        model.addAttribute("greeting", greeting)
        return "results"
    }

}
