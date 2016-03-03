package com.co.yc.web.controller;

/**
 * Created by Cyprian on 2/7/2016.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PageController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String findPage(){
        System.out.println("page called");
        return "pages/home";
    }

    @RequestMapping(value = "home",method = RequestMethod.GET)
    public String home(){
        return "pages/home";
    }
    @RequestMapping(value = "projects",method = RequestMethod.GET)
    public String projects(){
        return "pages/project/projects";
    }

    @RequestMapping(value = "project-details",method = RequestMethod.GET)
    public String projectDetails(){
        return "pages/project/project-details";
    }

    @RequestMapping(value = "issue-tracker",method = RequestMethod.GET)
    public String issueTracker(){
        return "pages/complains/issue-tracker";
    }
}
