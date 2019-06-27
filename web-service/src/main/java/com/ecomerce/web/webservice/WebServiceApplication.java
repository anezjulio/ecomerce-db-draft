package com.ecomerce.web.webservice;

import com.ecomerce.web.webservice.model.Usuario;
import com.ecomerce.web.webservice.repository.UsuarioRepository;
import com.ecomerce.web.webservice.utils.Enums.TipoUsuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebServiceApplication {

	private static final Logger log = LoggerFactory.getLogger(WebServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(WebServiceApplication.class, args);
	}


	@Bean
	public CommandLineRunner demo(UsuarioRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new Usuario(	1L,"12345","Primero","churuguara","22332342232","algo@otro.com",TipoUsuario.CLIENTE,null,null));
			repository.save(new Usuario(	1L,"12345","Segundo","los teques","444444444","algo@otro.com",TipoUsuario.CLIENTE,null,null));
			repository.save(new Usuario(	1L,"12345","Tercero","los patrulleros","55555555","algo@otro.com",TipoUsuario.CLIENTE,null,null));
			repository.save(new Usuario(	1L,"12345","Cuarto","hato verde","66666666","algo@otro.com",TipoUsuario.CLIENTE,null,null));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Usuario usuario : repository.findAll()) {
				log.info(usuario.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			repository.findById(1L)
					.ifPresent(customer -> {
						log.info("Customer found with findById(1L):");
						log.info("--------------------------------");
						log.info(customer.toString());
						log.info("");
					});

			// fetch customers by last name
			log.info("Customer found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			repository.findByTipoUsuario(TipoUsuario.CLIENTE).forEach(tipoClientes -> {
				log.info(tipoClientes.toString());
			});
			// for (Customer bauer : repository.findByLastName("Bauer")) {
			// 	log.info(bauer.toString());
			// }
			log.info("");
		};
	}

}
