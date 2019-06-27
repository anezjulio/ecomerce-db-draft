package com.ecomerce.web.webservice.repository;

import com.ecomerce.web.webservice.model.Usuario;
import com.ecomerce.web.webservice.utils.Enums.TipoUsuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    List<Usuario> findByTipoUsuario(TipoUsuario tipoUsuario);

}
