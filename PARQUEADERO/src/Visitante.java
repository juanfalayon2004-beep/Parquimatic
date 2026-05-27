//$11.000 por hora, tope de $47.500 hasta 12 horas

public class Visitante extends Usuario {
    private String placa;

    public Visitante (){
        super();
        this.placa ="";
    }

    public Visitante(String placa){
        super("", 0);
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public double calcularPago(int horas){
        double pago = horas*11100;

        if (horas <= 12 && pago > 47500){
            pago = 47500;
        }

        return pago;
    }

    @Override
    public void agregarVisita(Visita visita){

    }

    @Override
    public void recargarSaldo(double valor){

    }

    @Override
    public String toString(){
        return "Visitante \n" +
                "Placa: " + placa;
    }
}

