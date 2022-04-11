package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("form")
    public String form() {
        return "<html><body>" +
                "<form action=\"formdisplay\" method=\"post\" id=\"newform\">" +
                "<label for=\"name\">Name:<br />" +
                "<input type=\"text\" name='name'></label><br />" +
                "<label for=\"langOne\">My favorite language:</label><br />" +
                "<select name=\"langOne\" id=\"langOne\" form=\"newform\">" +
                    "<option value=\"JavaScript\">JavaScript</option>" +
                    "<option value=\"Java\">Java</option>" +
                    "<option value=\"Python\">Python</option>" +
                "</select><br />" +
                "<label for=\"langTwo\">My second favorite language:</label><br />" +
                "<select name=\"langTwo\" id=\"langTwo\" form=\"newform\">" +
                    "<option value=\"JavaScript\">JavaScript</option>" +
                    "<option value=\"Java\">Java</option>" +
                    "<option value=\"Python\">Python</option>" +
                "</select><br />" +
                "<label for=\"langThree\">My third favorite language:</label><br />" +
                "<select name=\"langThree\" id=\"langThree\" form=\"newform\">" +
                    "<option value=\"JavaScript\">JavaScript</option>" +
                    "<option value=\"Java\">Java</option>" +
                    "<option value=\"Python\">Python</option>" +
                "</select><br />" +
                "<input type='submit' value='Send'>" +
                "</form>" +
                "</body></html>";
    }

    @PostMapping("formdisplay")
    public String formDisplay(@RequestParam String name, @RequestParam String langOne, @RequestParam String langTwo, @RequestParam String langThree) {
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + langOne + "</li>" +
                "<li>" + langTwo + "</li>" +
                "<li>" + langThree + "</li>" + "</ol>";

//        return name;
    }
}
