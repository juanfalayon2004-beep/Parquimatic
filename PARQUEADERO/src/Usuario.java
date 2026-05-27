import java.util.ArrayList;

public abstract class Usuario {
    protected String identificacion;
    protected double saldo;

    protected ArrayList<Vehiculo> vehiculos;
    protected ArrayList<Visita> visitas;

    public Usuario(){
        this.identificacion = "";
        this.saldo = 0;

        vehiculos = new ArrayList<Vehiculo>();
        visitas = new ArrayList<Visita>();
    }

    public Usuario (String identificacion, double saldo){
        this.identificacion = identificacion;
        this.saldo = saldo;

        vehiculos = new ArrayList<Vehiculo>();
        visitas = new ArrayList<Visita>();
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public ArrayList<Visita> getVisitas() {
        return visitas;
    }

    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }

    public void eliminarVehiculo(String placa){

        for (int i=0; i< vehiculos.size();i++){
            if (vehiculos.get(i).getPlaca().equalsIgnoreCase(placa)){
                vehiculos.remove(i);
                return;
            }
        }
    }

    public Vehiculo buscarVehiculo(String placa){
        for (Vehiculo vehiculo: vehiculos) {
            if (vehiculo.getPlaca().equalsIgnoreCase(placa)){
                return vehiculo;
            }
        }
        return null;
    }

    public void agregarVisita(Visita visita){
        visitas.add(visita);
    }

    public void recargarSaldo(double valor){
        saldo += valor;
    }

    public boolean descontarSaldo (double valor){
        if(saldo >= valor){
            saldo -= valor;
            return true;
        }

        return false;
    }

    public void mostrarVehiculos(){
        for(Vehiculo vehiculo: vehiculos){
            System.out.println(vehiculo.mostrarDatos());
        }
    }

    public void mostrarVisitas(){
        for(Visita visita: visitas){
            System.out.println(visita.mostrarVisita());
            System.out.println("--");
        }
    }

    public abstract double calcularPago(int horas);
}


