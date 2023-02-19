
package vehiculo;

/**
 *
 * @author Francisco Javier Gómez Gamero
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoGomezGameroFranciscoJavier2223 miVehiculoGomezGameroFranciscoJavier2223;
        int stockActual;
        
        miVehiculoGomezGameroFranciscoJavier2223 = new VehiculoGomezGameroFranciscoJavier2223("Seat",18000,100);
        operativaVehiculosGomezGameroFranciscoJavier2223(miVehiculoGomezGameroFranciscoJavier2223, 50); 
    }

    public static void operativaVehiculosGomezGameroFranciscoJavier2223(VehiculoGomezGameroFranciscoJavier2223 miVehiculoGomezGameroFranciscoJavier2223, int cantidad) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoGomezGameroFranciscoJavier2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoGomezGameroFranciscoJavier2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoGomezGameroFranciscoJavier2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
