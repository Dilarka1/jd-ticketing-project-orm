package com.cybertek.controller;

import com.cybertek.dto.TaskDTO;
import com.cybertek.service.PendingService;
import com.cybertek.service.ProjectService;
import com.cybertek.service.TaskService;
import com.cybertek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class PendingController {

    @Autowired
    ProjectService projectService;

    @Autowired
    UserService userService;

    @Autowired
    TaskService taskService;

    @Autowired
    TaskService service;

    @GetMapping("/pending")
    public String createPending(Model model) {

        model.addAttribute("task", new TaskDTO());
        model.addAttribute("projects", projectService.findAll());
        model.addAttribute("employees", userService.findEmployees());
        model.addAttribute("tasks", taskService.findAll());
        model.addAttribute("status", service.findAll());


        return "employee/pending";
    }

    @PostMapping("/pending")
    public String insertStatus(Model model, TaskDTO task){

        taskService.save(task);

        return "redirect:/employee/pending";
    }
}
