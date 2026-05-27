public abstract class Movimiento {
    protected String indentificacionUsuario;
    protected double valor;
    protected FechaHora fechaHora;

    public Movimiento(){
        this.indentificacionUsuario = "";
        this.valor = 0;
        this.fechaHora = new FechaHora();
    }

    public Movimiento (String identificacionUsuario, double valor, FechaHora fechaHora){
        this.indentificacionUsuario = identificacionUsuario;
        this.valor = valor;
        this.fechaHora = fechaHora;
    }

    public String getIndentificacionUsuario() {
        return indentificacionUsuario;
    }

    public void setIndentificacionUsuario(String indentificacionUsuario) {
        this.indentificacionUsuario = indentificacionUsuario;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public FechaHora getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(FechaHora fechaHora) {
        this.fechaHora = fechaHora;
    }

    public abstract String getTipoMovimiento();

    @Override
    public String toString(){
        return "Tipo: " + getTipoMovimiento() + "\n" +
                "Usuario: " + indentificacionUsuario + "\n" +
                "Valor: $" + valor + "\n" +
                "Fecha: " + fechaHora.MostrarFechaHora();
    }
}

