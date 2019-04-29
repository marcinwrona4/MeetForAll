package meetforall.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeetforallController {
		
	    @RequestMapping("/")
	    public String sayHello() {
	        return "MeetForAll application\n";
	    }
	 
	}
