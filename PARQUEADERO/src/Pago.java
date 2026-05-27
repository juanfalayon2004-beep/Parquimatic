public class Pago extends Movimiento{
    private String metodoPago;
    private double valorPagado;
    private double cambio;

    public Pago(){
        super();
        this.metodoPago = "";
        this.valorPagado = 0;
        this.cambio = 0;
    }

    public Pago (String identificacionUsuario, double valor, FechaHora fechaHora, String metodoPago, double valorPagado){
        super(identificacionUsuario, valor, fechaHora);
        this.metodoPago = metodoPago;
        this.valorPagado = valorPagado;
        this.cambio = calcularCambio();
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public double getValorPagado() {
        return valorPagado;
    }

    public double getCambio() {
        return cambio;
    }

    public double calcularCambio(){
        if(valorPagado >= valor){
            return valorPagado-valor;
        }
        return 0;
    }

    @Override
    public String getTipoMovimiento(){
        return "Pago";
    }

    @Override
    public String toString(){
        return super.toString() + "\n" +
                "Método de pago: " + metodoPago + "\n" +
                "Valor pagado: $" + valorPagado + "\n" +
                "Cambio: $" + cambio + "\n";
    }
}

