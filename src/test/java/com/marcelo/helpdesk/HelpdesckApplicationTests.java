package com.marcelo.helpdesk;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.marcelo.helpdesk.model.Tecnico;
import com.marcelo.helpdesk.services.TecnicoService;

@SpringBootTest
class HelpdesckApplicationTests {

	@Autowired
	TecnicoService service;
	
	@Test
	void contextLoads() {
		Tecnico t = service.findById(1);
		System.out.println(t);
	}

}
