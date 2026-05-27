public class Recarga extends Movimiento{
    private double saldoAnterior;
    private double saldoNuevo;

    public Recarga(){
        super();
        this.saldoAnterior = 0;
        this.saldoNuevo = 0;
    }

    public Recarga(String identificacionUsuario, double valor, FechaHora fechaHora, double saldoAnterior){
        super(identificacionUsuario, valor, fechaHora);
        this.saldoAnterior = saldoAnterior;
        this.saldoNuevo = saldoAnterior + valor;
    }

    public double getSaldoAnterior() {
        return saldoAnterior;
    }

    public double getSaldoNuevo() {
        return saldoNuevo;
    }

    @Override
    public String getTipoMovimiento(){
        return "Recarga.";
    }

    @Override
    public String toString(){
        return super.toString() + "\n" +
                "Saldo anterior: $" + saldoAnterior + "\n" +
                "Saldo nuevo: $" + saldoNuevo;
    }
}

