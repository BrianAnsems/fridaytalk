package fridaytalk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class controller{

	@RequestMapping(value="/fridaytalk", method=RequestMethod.GET)
	public String mainPage(){
		return "index";
	}
}