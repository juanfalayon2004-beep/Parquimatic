//$181.100 por mes. Dias disponibles

public class ProfesorPlanta extends Usuario{
    private String facultad;
    private String programa;
    private int diasDisponibles;

    public ProfesorPlanta(){
        super();
        this.facultad = "";
        this.programa = "";
        this.diasDisponibles = 0;
    }

    public ProfesorPlanta (String identificacion, double saldo, String facultad, String programa, int diasDisponibles){
        super(identificacion, saldo);
        this.facultad = facultad;
        this.programa = programa;
        this.diasDisponibles = diasDisponibles;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public int getDiasDisponibles() {
        return diasDisponibles;
    }

    public void setDiasDisponibles(int diasDisponibles) {
        this.diasDisponibles = diasDisponibles;
    }

    public boolean tieneMensualidadVigente(){
        return diasDisponibles>0;
    }

    @Override
    public double calcularPago(int horas){
        return 181100;
    }

    @Override
    public String toString(){
        return "Profesor de planta \n" +
                "Identificacion: " + identificacion + "\n" +
                "Facultad: " + facultad + "\n" +
                "Programa: " + programa + "\n" +
                "Saldo: " + saldo + "\n" +
                "Dias disponibles: " + diasDisponibles;
    }
}

