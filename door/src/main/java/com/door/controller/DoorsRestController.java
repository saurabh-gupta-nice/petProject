package com.door.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.door.model.Door;

@RestController
@RequestMapping("/rest")
public class DoorsRestController {
	
	private static Map<String,Door> doors = new ConcurrentHashMap<String, Door>();
	static {
		
		doors.put("1", new Door("1", 14.7));
		doors.put("2", new Door("2", 11.2));
		doors.put("3", new Door("3", 12.6));
		doors.put("4", new Door("4", 13.1));
		doors.put("5", new Door("5", 100));
		doors.put("6", new Door("6", 200));
		doors.put("7", new Door("7", 50.1));

		
	}
	
	@RequestMapping( value ="/allDoors",
			method=RequestMethod.GET,
			headers = "Accept=*/*",
			produces= MediaType.APPLICATION_JSON_VALUE)
	public List<Door> getAllDoors() {
		ArrayList<Door> allDoors = new ArrayList<Door>(); 
		System.out.println("hello");
		for(int i=0; i <7;i ++) {
			allDoors.add(doors.get(Integer.toString(i)));
		}
		return allDoors;
		
	}

}
