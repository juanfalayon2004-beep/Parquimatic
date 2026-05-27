public class Visita {
    private FechaHora entrada;
    private FechaHora salida;
    private int tiempoMinutos;
    private boolean pagada;

    public Visita() {
        this.entrada = new FechaHora();
        this.salida = null;
        this.tiempoMinutos = 0;
        this.pagada = false;
    }

    public Visita(FechaHora entrada) {
        this.entrada = entrada;
        this.salida = null;
        this.tiempoMinutos = 0;
        this.pagada = false;
    }

    public FechaHora getEntrada() {
        return entrada;
    }

    public void setEntrada(FechaHora entrada) {
        this.entrada = entrada;
    }

    public FechaHora getSalida() {
        return salida;
    }

    public void setSalida(FechaHora salida) {
        this.salida = salida;
    }

    public int getTiempoMinutos() {
        return tiempoMinutos;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void marcarPagada(){
        this.pagada=true;
    }

    public void cerrarVisita(FechaHora salida){
        this.salida = salida;
        this.tiempoMinutos = calcularTiempo();
    }

    public int calcularTiempo(){
        if (entrada==null || salida==null){
            return 0;
        }

        int minutosEntrada = entrada.ConvertirAMinutos();
        int minutosSalida = salida.ConvertirAMinutos();

        return minutosSalida-minutosEntrada;
    }

    public int calcularHorasCobradas(){
        if(tiempoMinutos<=0){
            return 0;
        }

        int horas = tiempoMinutos/60;
        if (tiempoMinutos %60 != 0){
            horas++;
        }
        return horas;
    }

    public String mostrarVisita(){
        String texto = "Entrada: " + entrada.MostrarFechaHora();

        if (salida != null){
            texto += ", Salida: " + salida.MostrarFechaHora();
            texto += ", Tiempo: " + tiempoMinutos + "minutos";
        }
        else{
            texto += "Salida: pendiente.";
        }

        texto += ", Pagada; " + pagada;
        return texto;
    }
}

