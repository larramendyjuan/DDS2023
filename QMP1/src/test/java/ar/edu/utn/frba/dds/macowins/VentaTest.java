//package ar.edu.utn.frba.dds.macowins;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import org.junit.jupiter.api.Test;
//
//public class VentaTest {
//  @Test
//  public void TestTotalVentasVentaDeCamisaNueva() {
//    assertEquals(VentaDeCamisaNueva(4000, 2).calcularTotalVenta(), 8000, 0);
//    assertEquals(VentaDeCamisaNueva(5000, 3).calcularTotalVenta(), 15000, 0);
//  }
//
//  @Test
//  public void TestTotalVentasVentaDeSacoEnLiquidacion() {
//    assertEquals(VentaDeSacoEnLiquidacion(3000, 3).calcularTotalVenta(), 4500, 0);
//    assertEquals(VentaDeSacoEnLiquidacion(8000, 4).calcularTotalVenta(), 16000, 0);
//  }
//
//  @Test
//  public void TestTotalVentasVentaDePantalonEnPromocion() {
//    assertEquals(VentaDePantalonEnPromocion(200, 2).calcularTotalVenta(), 2600, 0);
//    assertEquals(VentaDePantalonEnPromocion(100, 2).calcularTotalVenta(), 2800, 0);
//  }
//
//  private Venta VentaDePantalonEnPromocion(int descuento, int cantidad) {
//    // TODO completar
//    var prenda = new Prenda(1500, TipoDePrenda.PANTALON, "Promocion", descuento);
//
//    var detalle = new Detalle(prenda, cantidad);
//
//    var list = new ArrayList<Detalle>();
//
//    list.add(detalle);
//
//    var venta = new Venta(new Date(), list);
//
//    return venta;
//  }
//
//  private Venta VentaDeCamisaNueva(double precioBase, int cantidad) {
//    // TODO completar
//    var prenda = new Prenda(precioBase, TipoDePrenda.CAMISA, "Nueva", 0);
//
//    var detalle = new Detalle(prenda, cantidad);
//
//    var list = new ArrayList<Detalle>();
//
//    list.add(detalle);
//
//    var venta = new Venta(new Date(), list);
//
//    return venta;
//  }
//
//  private Venta VentaDeSacoEnLiquidacion(double precioBase, int cantidad) {
//    // TODO completar
//    var prenda = new Prenda(precioBase, TipoDePrenda.SACO, "Liquidacion", 0);
//    var detalle = new Detalle(prenda, cantidad);
//
//    var list = new ArrayList<Detalle>();
//
//    list.add(detalle);
//
//    var venta = new Venta(new Date(), list);
//
//    return venta;
//  }
//}
