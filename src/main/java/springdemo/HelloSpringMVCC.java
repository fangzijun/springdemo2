package springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller 
public class HelloSpringMVCC {
    @RequestMapping("/hello4") 
    public String HelloWorld(Model model){  
        model.addAttribute("message","Hello World!!!spring4");  
        return "hello4";  
    }  
}