package ar.com.project.api.DTO;

import java.io.Serializable;

public class DtoProducto implements Serializable {
  private Integer idProducto;
  private Integer codigoProducto;
  private  String nombreProducto;
  private String descripcionProducto;
  private Integer precioProducto;

  public Integer getIdProducto() {
    return idProducto;
  }

  public void setIdProducto(Integer idProducto) {
    this.idProducto = idProducto;
  }

  public Integer getCodigoProducto() {
    return codigoProducto;
  }

  public void setCodigoProducto(Integer codigoProducto) {
    this.codigoProducto = codigoProducto;
  }

  public String getNombreProducto() {
    return nombreProducto;
  }

  public void setNombreProducto(String nombreProducto) {
    this.nombreProducto = nombreProducto;
  }

  public String getDescripcionProducto() {
    return descripcionProducto;
  }

  public void setDescripcionProducto(String descripcionProducto) {
    this.descripcionProducto = descripcionProducto;
  }

  public Integer getPrecioProducto() {
    return precioProducto;
  }

  public void setPrecioProducto(Integer precioProducto) {
    this.precioProducto = precioProducto;
  }
}
