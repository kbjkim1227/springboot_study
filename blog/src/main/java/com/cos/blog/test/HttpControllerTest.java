package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

//사용자가 요청 -> 응답(HTML파일)
//@Controller

@RestController
public class HttpControllerTest {
	
	private static final String TAG="HttpControllerTest:";
	
	//http://localhost:8000/blog/http/lombok
	@GetMapping("/http/lombok")
	public String lombokTest() {
	  Member m = Member.builder().username("ssar")
			  					 .password("1234")
			  					 .email("ssar@nate.com").build();
	  System.out.println(TAG+"getter:"+m.getId());
	  m.setId(5000);
	  System.out.println(TAG+"setter:"+m.getId());
	  return "lombok test 완료";
	}
	
	//http://localhost:8080/http/get(select)
	@GetMapping("http/get")
	public String getTest() {
		return "get 요청";
	}
	
	//http://localhost:8080/http/post(insert)
	@PostMapping("http/post")
	public String postTest() {
		return "post 요청";
	}
	
	//http://localhost:8080/http/put(update)
	@PutMapping("http/put")
	public String putTest() {
		return "put 요청";
	}
	
	//http://localhost:8080/http/delete(delete)
	@DeleteMapping("http/delete")
	public String deleteTest() {
		return "delete 요청";
	}
	
}
