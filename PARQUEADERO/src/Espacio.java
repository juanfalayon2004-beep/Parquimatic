public class Espacio {

    private int numero;
    private boolean ocupado;
    private Vehiculo vehiculoActual;


    public Espacio(){
        this.numero = 0;
        this.ocupado = false;
        this.vehiculoActual = null;
    }

    public Espacio (int numero){
        this.numero = numero;
        this.ocupado = false;
        this.vehiculoActual =null;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public Vehiculo getVehiculoActual() {
        return vehiculoActual;
    }

    public boolean estaDisponible(){
        return != ocupado;
    }

    public void ocupar(Vehiculo vehiculo){
        if (!= ocupado){
            this.vehiculoActual = vehiculo;
            this.ocupado = true;
        }
    }

    public void liberar(){
        this.vehiculoActual = null;
        this.ocupado = false;
    }

    @Override
    public String toString(){
        if (ocupado) {
            return "Espacio " + numero + " ocupado por " + vehiculoActual.getPlaca();
        }

        return "Espacio " + numero + " libre.";
    }
}

