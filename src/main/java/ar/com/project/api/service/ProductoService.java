package ar.com.project.api.service;


import ar.com.project.api.DTO.DtoProducto;
import ar.com.project.api.model.Producto;
import ar.com.project.api.repository.ProductoRepository;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoService {

  @Autowired
  ProductoRepository productoRepository;

  public Producto saveProduct(Producto producto)
  {
    return productoRepository.save(producto);
  }

  public List<Producto> list(){
    List<Producto> lista = new ArrayList<Producto>();
     productoRepository.findAll().forEach(lista::add);
     return lista;
  }

  public DtoProducto getProductoByID ( Integer idProducto){
    Producto producto = productoRepository.getOne(idProducto);

    DtoProducto dtoProducto =new DtoProducto();



      dtoProducto.setIdProducto(producto.getIdProducto());
      dtoProducto.setCodProducto(producto.getCodProducto());
      dtoProducto.setNombreProducto(producto.getNombreProducto());
      dtoProducto.setDescripcionProducto(producto.getDescripcionProducto());
      dtoProducto.setPrecioProducto(producto.getPrecioProducto());
      return dtoProducto;



  }

  public void deleteProduct(Integer id)
  {
    productoRepository.deleteById(id);
  }

  public Producto updateProduct(Integer id, DtoProducto dtoProducto)
  {
    Producto producto= productoRepository.getOne(id);

    producto.setCodProducto(dtoProducto.getCodProducto());
    producto.setNombreProducto(dtoProducto.getNombreProducto());
    producto.setDescripcionProducto(dtoProducto.getDescripcionProducto());
    producto.setPrecioProducto(dtoProducto.getPrecioProducto());
    return productoRepository.save(producto);
  }
}
