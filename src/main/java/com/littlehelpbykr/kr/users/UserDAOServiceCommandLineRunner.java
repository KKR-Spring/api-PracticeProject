package com.littlehelpbykr.kr.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private UserDaoService userDAOService;
	
	@Override
	public void run(String... args) throws Exception {
		OfficeAddress ofcAdr = new OfficeAddress("XYZ-1", "Airport Road", "Near U turn signal", "EMP-001", 75943764);
		AddressDetails adrDetails = new AddressDetails("H-55",32345, "Mg Road-1", "12th Cross-1", "Near Airport Road", 000001,ofcAdr);
		User user = new User("litteleHelpByKR-1", "2020-05-23T",adrDetails);
		userDAOService.insert(user);
	}

}
