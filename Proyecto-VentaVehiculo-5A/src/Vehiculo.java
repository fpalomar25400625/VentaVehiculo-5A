public class Vehiculo {
    private String marca;
    private double precio;
    private String motor;
    
    public Vehiculo(String marca, double precio, String motor) {
        this.marca = marca;
        this.precio = precio;
        this.motor = motor;
    }
    
    public String getMarca() {
        return this.marca;
    }
    
    public double getPrecio() {
        return this.precio;
    }
    
    public String getMotor() {
        return this.motor;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
   public void setMotor(String motor) {
       this.motor = motor;
   }
    
    @Override
    public String toString() {
        return "Marca " + this.marca + "\n" + 
               "Precio " + this.precio + "\n" + 
               "Motor " + this.motor  + "\n";
    }
}

/* 
  Vehiculo
marca: string
precio: double
mototr: string

Cliente
rs:String
rfc: String
email:Stirng

Venta:
cantidad: int
vehiculo: vehiculo
cliente: cliente

Venta(int cantidad, c: cliente, c:clciente)

crear repositorio github VentaVehiculo-5A
Clonar repositoria
repositorio local(VentaVehiculo-5A) (Proyectp-VentaVehiculo-5A)
Crar clase vehiculo
git status, git commit, git push
crea clase cliuente
git status, git commit, git push
crear clase venta
git status, git commit, git push
crear clase principalVenta
git status, git commit, git push
*/