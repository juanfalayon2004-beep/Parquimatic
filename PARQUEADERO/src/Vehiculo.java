public class Vehiculo {
    private String placa;
    private String tipo;
    private String marca;

    public Vehiculo(){
        this.placa="";
        this.tipo="";
        this.marca="";
    }

    public Vehiculo(String placa, String tipo, String marca){
        this.placa=placa;
        this.tipo=tipo;
        this.marca=marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String mostrarDatos(){
        return "Placa: " + placa + ", Tipo: " + tipo + ", Marca: " + marca;
    }
}


