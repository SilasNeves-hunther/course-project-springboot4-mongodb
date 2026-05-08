package com.silasneves.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.silasneves.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User ingrid = new User("1", "Ingrid Fernandes", "ingrid@gmail.com");
		User camila = new User("2", "Camila Fernandes", "camila@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(ingrid,camila));
		return ResponseEntity.ok().body(list);
	}

}
