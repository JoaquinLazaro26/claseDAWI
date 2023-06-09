package net.clinica;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class UsuarioTest {
	@Autowired
	private BCryptPasswordEncoder encoder;

	@Test
	void contextLoads() {	
		String clave = encoder.encode("123");
		System.out.println("La Clave es :" + clave);
	}

}
