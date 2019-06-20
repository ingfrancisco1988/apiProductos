package ar.com.project.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
@Table(name="Productos")
public class Producto  {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true, nullable = false)
  @JsonProperty("idProducto")
  private Integer idProducto;

  @JsonProperty("Cod_Producto")
  @NotNull(message = "No puede quedar null")
  //@NotEmpty(message = "Cod_Producto no puede quedar vacio")
  @Min(value = 1000, message = "Valor minimo aceptado 4 digitos")
  @Max(value = 9999, message = "Valor minimo aceptado 4 digitos")
  private Integer codProducto;

  @JsonProperty("Nombre_Producto")
  @NotNull(message = "No puede quedar null")
  @NotEmpty(message = "User_firsttName no puede quedar vacio")
  private String nombreProducto;

  @JsonProperty("Descripcion_Producto")
  @NotNull(message = "No puede quedar null")
  @NotEmpty(message = "Descripcion_Producto no puede quedar vacio")
  @Size(min = 3, max = 55, message = "Producto.descripcionProducto.size (3-55 char)")
  private String descripcionProducto;

  @JsonProperty("Precio_Producto")
  @NotNull(message = "No puede quedar null")
  //@NotEmpty(message = "Precio_Producto no puede quedar vacio")
  private Integer precioProducto;

  //Declaracion de metodos
  public Integer getIdProducto() {
    return idProducto;
  }

  public void setIdProducto(Integer idProducto) {
    this.idProducto = idProducto;
  }

  public Integer getCodProducto() {
    return codProducto;
  }

  public void setCodProducto(Integer codProducto) {
    this.codProducto = codProducto;
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
