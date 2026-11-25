package net.youssfi.demoappdevops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MyRestController {
    @GetMapping("/test")
    public String test(){
        return "Hello Mohamed";
    }
}
