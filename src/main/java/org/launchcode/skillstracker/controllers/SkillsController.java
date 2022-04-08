package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String list() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>Please learn these:</h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "</ol>";
    }
}
