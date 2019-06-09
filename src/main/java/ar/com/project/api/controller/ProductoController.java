package ar.com.project.api.controller;

import ar.com.project.api.DTO.DtoProducto;
import ar.com.project.api.model.Producto;
import ar.com.project.api.service.ProducoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/producto")
public class ProductoController {

  @Autowired
  ProducoService producoService;

  @RequestMapping(method = RequestMethod.POST, path = "/")
  private Producto savePrduct(@RequestBody DtoProducto dtoProducto)
  {

  }

}
