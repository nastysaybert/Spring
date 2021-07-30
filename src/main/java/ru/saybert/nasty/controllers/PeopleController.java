package ru.saybert.nasty.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.management.modelmbean.ModelMBeanOperationInfo;

@Controller
@RequestMapping("/people")
public class PeopleController {

    @GetMapping()
    public String index(Model model){
        //Получим всех людей из DAO и передадим их на представление
        return null;
    }

    @GetMapping("/{id}")
    public String show (@PathVariable("id") int id,
                        Model model){
        // Получим одного человека по его id из DAO и передадим на отображение в представление

        return null;
    }
}
