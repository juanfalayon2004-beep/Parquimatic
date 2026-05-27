public class FechaHora {
    private int dia;
    private int mes;
    private int anio;
    private int hora;
    private int minuto;

    public FechaHora(){
        this.dia=1;
        this.mes=1;
        this.anio=2026;
        this.hora=0;
        this.minuto=0;
    }

    public FechaHora(int dia, int mes, int anio, int hora, int minuto) {
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
        this.hora=hora;
        this.minuto=minuto;
    }

    public int getDia(){
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public String MostrarFechaHora(){
        return dia + "/" + mes + "/" + anio + "/" + hora + ":" + minuto;
    }

    public int ConvertirAMinutos(){
        int m=0;

        m+=anio*365*24*60;
        m+=mes*30*24*60;
        m+=dia*24*60;
        m+=hora*60;
        m+=minuto;

        return m;
    }

}

