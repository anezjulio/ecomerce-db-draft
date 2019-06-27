package com.ecomerce.web.webservice.repository;

import com.ecomerce.web.webservice.model.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoRepository extends CrudRepository<Producto, Long> {

    List<Producto> findByTitulo(String name);

}
