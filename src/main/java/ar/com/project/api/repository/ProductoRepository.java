package ar.com.project.api.repository;

import ar.com.project.api.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoRepository extends JpaRepository<Producto, Integer> {


}
