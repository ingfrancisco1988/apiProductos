package ar.com.project.api.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CapturadorErrores implements ErrorController {
  private final static String PATH = "/error";
  @Override
  @RequestMapping(PATH)
  @ResponseBody
  public String getErrorPath() {
    // TODO Auto-generated method stub
    return "Error 404 Redireccione a esta ruta  https://apiproducto.herokuapp.com/swagger-ui.html#/";
  }

}
