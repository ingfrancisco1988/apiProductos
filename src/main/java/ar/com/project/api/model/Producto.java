package ar.com.project.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;


@Entity

@Table(name="PRODUCTOS")
public class Producto  {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true, nullable = false)
  private Integer idProducto;


  @JsonProperty("Codigo_producto")
  @Column(name = "cod_producto")
  private Integer codProducto;

  @JsonProperty("Nombre_Producto")
  @Column(name = "nombre_producto")
  private String nombreProducto;

  @JsonProperty("Descipcion_producto")
  @Column(name = "descipcion_producto")
  private String descripcionProducto;

  @JsonProperty("Precio_Producto")
  @Column(name = "precio_producto")
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
