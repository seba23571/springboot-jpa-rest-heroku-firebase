package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Encrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		for(int i=1;i<=10;i++) {
				String encoderstr =	encoder.encode("123");
					System.out.println(encoderstr);
					//$2a$10$vokuLgRoSxQ/3cEPKL7qHuTYI0UMNSnELt56mb47Tvt8MxkP84CWu

		}

	}	}