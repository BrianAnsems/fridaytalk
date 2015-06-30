package fridaytalk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class FridayTalkController {
	
	@RequestMapping("/fridaytalk")
	public String index(ModelAndView modelAndView){
		return "index";
	}
	@RequestMapping("/sessionmenu")
	public String sessionmenu(ModelAndView modelAndView){
		return "sessionmenu";
	}
	
	@RequestMapping("/lecturelist")
	public String lecturelist(ModelAndView modelAndView){
		return "lecturelist";
	}
}
