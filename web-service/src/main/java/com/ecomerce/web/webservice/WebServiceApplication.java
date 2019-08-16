package com.ecomerce.web.webservice;

import com.ecomerce.web.webservice.model.Usuario;
import com.ecomerce.web.webservice.repository.UsuarioRepository;
import com.ecomerce.web.webservice.utils.Enums.TipoUsuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Optional;

@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class WebServiceApplication {

    private static final Logger log = LoggerFactory.getLogger(WebServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(WebServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(UsuarioRepository repository) {
        return (args) -> {
            log.info("A ver si al menos funciona");
            // save a couple of customers
            repository.save(new Usuario(1L, "12345", "Primero", "churuguara", "22332342232", "algo@otro.com", TipoUsuario.CLIENTE, null, null));
            repository.save(new Usuario(3L, "12345", "Segundo", "los teques", "444444444", "algo@otro.com", TipoUsuario.CLIENTE, null, null));
            repository.save(new Usuario(4L, "12345", "Tercero", "los patrulleros", "55555555", "algo@otro.com", TipoUsuario.CLIENTE, null, null));
            repository.save(new Usuario(5L, "12345", "Cuarto", "hato verde", "66666666", "algo@otro.com", TipoUsuario.CLIENTE, null, null));

            // fetch all customers
            log.info("-------------------------------");
            for (Usuario usuario : repository.findAll()) {
                log.info(usuario.getDireccion());
            }
            log.info(" si anda::::");

            Optional<Usuario> us1 = repository.findById(1L);

            log.info(" un nombre --> : " + us1.get().getNombre());
        };
    }

}
