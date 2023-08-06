package demo2.program2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/homepage")
public class homecontroller {
	
@GetMapping("/user")
	public String getuser()
	{
		return "hii";
	}
@GetMapping("/user1/{name}")public String getuserName(@PathVariable(value="name") String n)
{
	return "hai"+""+n;
}
}
