//$6.100 por hora

public class ProfesorCatedra extends Usuario{
    private String facultad;
    private String programa;
    private int horasDisponibles;

    public ProfesorCatedra(){
        super();
        this.facultad = "";
        this.programa = "";
        this.horasDisponibles = 0;
    }

    public ProfesorCatedra(String identificacion, double saldo, String facultad, String programa, int horasDisponibles){
        super(identificacion, saldo);
        this.facultad = facultad;
        this.programa = programa;
        this.horasDisponibles = horasDisponibles;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad){
        this.facultad = facultad;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public int getHorasDisponibles() {
        return horasDisponibles;
    }

    public void setHorasDisponibles(int horasDisponibles) {
        this.horasDisponibles = horasDisponibles;
    }

    @Override
    public double calcularPago(int horas){
        return horas*6100;
    }

    @Override
    public String toString(){
        return "Profesor de catedra\n" +
                "Identificacion: " + identificacion + "\n" +
                "Facultad: " + facultad + "\n" +
                "Programa: " + programa + "\n" +
                "Saldo: " + saldo + "\n" +
                "Horas disponibles: " + horasDisponibles;
    }
}

