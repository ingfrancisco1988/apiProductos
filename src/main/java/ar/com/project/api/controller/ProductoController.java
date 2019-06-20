package ar.com.project.api.controller;

import ar.com.project.api.DTO.DtoProducto;
import ar.com.project.api.model.Producto;
import ar.com.project.api.service.ProductoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;

@RestController
@RequestMapping(path = "api/producto")
@Api(value="LoanControllerAPI", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductoController {

  @Autowired
  ProductoService productoService;

  @RequestMapping(value ="/", method = RequestMethod.POST )
  //@ResponseStatus(HttpStatus.BAD_REQUEST)
  @ApiOperation("Create the Products in the API")
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
  @ApiOperation("Select all Products saved")
  public List<Producto> selectAllProducts ( )
  {
    return  productoService.list();
  }

  @RequestMapping(value = "{id}", method = RequestMethod.GET )
  @ApiOperation("Get the Product con Id especifico")
  @ApiResponses(value = {@ApiResponse( code = 200, message = "Ok", response = DtoProducto.class) })
  public DtoProducto getProductoById(@PathVariable Integer id)
  {
    return productoService.getProductoByID(id);
  }

  @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
  @ApiOperation("Delete the Product con Id especifico")
  public void deleteProductoById(@PathVariable Integer id)
  {
      productoService.deleteProduct(id);
  }

  @RequestMapping(value = "{id}", method = RequestMethod.PUT)
  @ApiOperation("Update the Product con Id especifico")
  public Producto updateProducto(@PathVariable Integer id, @RequestBody DtoProducto dtoProducto)
  {
    return productoService.updateProduct(id , dtoProducto);
  }
}
