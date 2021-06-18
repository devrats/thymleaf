/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 6/18/2021
 *   Time: 6:16 PM
 *   File: HomeController.java
 */

package com.example.thymleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.LinkedList;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(Model model){
        List list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        model.addAttribute("list",list);
        model.addAttribute("name", "devvrat");
        model.addAttribute("isActive", false);
        model.addAttribute("gender","M");
        model.addAttribute("title","ooo");
        return "home";
    }
    @RequestMapping("index")
    public String index(){
        return "section";
    }
}