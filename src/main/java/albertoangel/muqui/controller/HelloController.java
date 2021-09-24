package albertoangel.muqui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloController {
 
    @RequestMapping("/helloworld")
    public ModelAndView hello() {
 
        String helloWorldMessage = "Hello world says Albert!!";
        // hello point to hello.jsp
        return new ModelAndView("hello", "message", helloWorldMessage);
    }
}
 