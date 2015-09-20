package tn.freeways.pm.web.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Rest Controller for saying Hello World ! 
 * 
 * @author HaithemMosbahi
 *
 */
@RestController
public class HelloResource {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String helloFreeways(){
		return "Hello World ! Hello Freeways !";
	}

}
