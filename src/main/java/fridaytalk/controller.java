package fridaytalk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class controller{

	@RequestMapping("/fridaytalk")
	public String mainPage(){
		return "index";
	}
}