/**
 * 
 */
package com.practice.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Anand Singh <email: avsmips@gmail.com>
 *
 */
@RestController
public class SampleController {

	@GetMapping("/")
	@ResponseBody
	public String ping(){
		return "Service is Up and Running";
	}
}
