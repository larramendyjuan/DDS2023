package ar.edu.utn.frba.dds.macowins;

import static java.util.Objects.requireNonNull;

public class Prenda {
  public Prenda(TipoDePrenda tipoDePrenda, Material material, Color color){
    this.tipoDePrenda = requireNonNull(tipoDePrenda);
    this.material = requireNonNull(material);
    this.colorPrincipal = requireNonNull(color);
  }
  public TipoDePrenda tipoDePrenda;
  public Material material;
  public Color colorPrincipal;
  public Color colorSecundario;

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }
}
