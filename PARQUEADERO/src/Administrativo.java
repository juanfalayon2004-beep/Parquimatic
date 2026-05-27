// $243.900 al mes. dias disponibles

public class Administrativo extends Usuario {
    private String dependencia;
    private int diasDisponibles;

    public Administrativo (){
        super();
        this.dependencia = "";
        this.diasDisponibles = 0;
    }

    public Administrativo (String identificacion, double saldo, String dependencia, int diasDisponibles){
        super(identificacion, saldo);
        this.dependencia = dependencia;
        this.diasDisponibles = diasDisponibles;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public int getDiasDisponibles() {
        return diasDisponibles;
    }

    public void setDiasDisponibles(int diasDisponibles) {
        this.diasDisponibles = diasDisponibles;
    }

    public  boolean tieneMensualidadVigente(){
        return diasDisponibles > 0;
    }

    @Override
    public double calcularPago(int horas){
        return 243900;
    }

    @Override
    public String toString(){
        return "Administrativo y HUSI \n" +
                "Identificacion: " + identificacion + "\n" +
                "Dependencia: " + dependencia + "\n" +
                "Saldo: " + saldo + "\n" +
                "Dias disponibles: " + diasDisponibles;
    }
}

