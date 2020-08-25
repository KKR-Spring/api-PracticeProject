package com.littlehelpbykr.kr.users;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

}
