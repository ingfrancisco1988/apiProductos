package ar.com.project.api.controller;

import ar.com.project.api.DTO.DtoProducto;
import ar.com.project.api.model.Producto;
import ar.com.project.api.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;

@RestController
@RequestMapping(path = "api/producto")
public class ProductoController {

  @Autowired
  ProductoService productoService;

  @RequestMapping(value ="/", method = RequestMethod.POST )
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public Producto savePro(@RequestBody DtoProducto  dtoproducto)
  {

    Producto producto = new Producto();

    producto.setCodProducto(dtoproducto.getCodProducto());
    producto.setNombreProducto(dtoproducto.getNombreProducto());
    producto.setDescripcionProducto(dtoproducto.getDescripcionProducto());
    producto.setPrecioProducto(dtoproducto.getPrecioProducto());

    return productoService.saveProduct(producto);
  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public List<Producto> selectAllProducts ( )
  {
    return  productoService.list();
  }

  @RequestMapping(value = "{id}", method = RequestMethod.GET )
  public DtoProducto getProductoById(@PathVariable Integer id)
  {
    return productoService.getProductoByID(id);
  }

  @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
  public void deleteProductoById(@PathVariable Integer id)
  {
      productoService.deleteProduct(id);
  }
}
