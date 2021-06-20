/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 6/20/2021
 *   Time: 3:57 AM
 *   File: PaginationController.java
 */

package com.example.thymleaf.controller;

import com.example.thymleaf.entity.Employee;
import com.example.thymleaf.entity.Projects;
import com.example.thymleaf.repository.EmployeeRepository;
import com.example.thymleaf.repository.ProjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PaginationController {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private ProjectsRepository projectsRepository;

    @RequestMapping("/")
    public String home(){
        return "home1";
    }

    @RequestMapping("/projects/{page}")
    public String contact(@PathVariable("page") int page, @RequestParam("user") String name, Model model){
        Employee employee = employeeRepository.findByName(name);
        Pageable pageable = PageRequest.of(page, 2);
        Page<Projects> projectsList = projectsRepository.findByUser(employee.geteId(), pageable);
        model.addAttribute("projects",projectsList);
        System.out.println(projectsList.getTotalPages());
        return "projects";

    }
}