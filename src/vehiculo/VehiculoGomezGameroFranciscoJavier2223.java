
package vehiculo;

/**
 * Clase que representa la gestión vehículos.
 * Los objetos de esta clase permiten almacenar información
 * de los propios vehñiculos (nombre, precio y stock)
 * Se implementan metodos para comprar y vender vehículos, así como
 * métodos para establecer y obtener los parámetros.
 * 
 * @author Francisco Javier Gómez Gamero
 */
public class VehiculoGomezGameroFranciscoJavier2223 {

    /**
     * Método para obtener el nombre asignado al vehículo.
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del vehículo.
     * @param nombre nombre a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el precio asignado al vehículo.
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método para establecer el precio del vehículo.
     * @param precio precio a establecer
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Método para obtener el precio con IVA asignado al vehículo.
     * @return the precioIVA
     */
    public double getPrecioIVA() {
        return precioIVA;
    }

    /**
     * Método para establecer el precio con IVA del vehículo.
     * @param precioIVA precio con IVA a establecer
     */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    /**
     * Método para obtener el stock de vehículos.
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * Método para establecer el stocks de vehículos.
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    private String nombre;
    private double precio;
    private double precioIVA;
    private int stock;

    /**Constructor sin parámetros.
     * Crea un nuevo objeto <code>VehiculoGomezGameroFranciscoJavier2223</code> 
     * sin parámetros establecidos.
     */
    public VehiculoGomezGameroFranciscoJavier2223 ()
    {
    }
    /**Constructor de 3 parámetros (nombre, precio y stock). 
     * Crea un nuevo objeto <code>VehiculoGomezGameroFranciscoJavier2223</code> con el nombre, precio y stock indicado en los
     * parámetros.
     * @param nom nombre del vehículo
     * @param precio precio del vehículo
     * @param stock stock inicial de vehículos
     */       
    public VehiculoGomezGameroFranciscoJavier2223 (String nom, double precio, int stock)
    {
        this.nombre =nom;
        this.precio=precio;
        this.stock=stock;
    }
   /** 
    * Método para asignar el nombre del vehiculo
    * @param nom nombre a asignar al vehículo 
    */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    /**
     * Método para obtener el nombre del vehículo.
     * @param nombre 
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Método para obtener el stocks de vehículos.
     * @param stock
     */
     public int obtenerStock ()
    {
        return getStock();
    }

    /**
     * Comprar Vehiculos.
     * Método para comprar un número determinado de vehículos
     * Este método modifica el stock.
     * @param cantidad Número de vehículos a comprar.
     * @throws Exception Si el nº de vehículos a comprar es negativo.
     */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        setStock(getStock() + cantidad);
    }
    
    /**
     * Vender Vehiculos.
     * Método para vender un número determinado de vehículos
     * Este método modifica el stock.
     * @param cantidad Número de vehículos a vender.
     * @throws Exception Si el nº de vehículos a vender es negativo.
     * @throws Exception Si no hay stock suficiente para vender.
     */
    public void vender (int cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de vehiculos");
        if (obtenerStock()< cantidad)
            throw new Exception ("No se hay suficientes vehiculos para vender");
        setStock(getStock() - cantidad);
    }
    
}  
   
    

