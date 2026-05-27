//$6.100 por hora, $47.500 hasta 12 horas.

public class EstudiantePostgrado extends Usuario{
    private String facultad;
    private String nombreProgama;
    private int horasDisponibles;

    public EstudiantePostgrado(){
        super();
        this.facultad = "";
        this.nombreProgama = "";
        this.horasDisponibles = 0;
    }

    public EstudiantePostgrado (String identificacion, double saldo, String facultad, String nombreProgama, int horasDisponibles){
        super(identificacion, saldo);
        this.facultad = facultad;
        this.nombreProgama = nombreProgama;
        this.horasDisponibles = horasDisponibles;
    }

    public String getFacultad(){
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getNombreProgama() {
        return nombreProgama;
    }

    public void setNombreProgama(String nombreProgama) {
        this.nombreProgama = nombreProgama;
    }

    public int getHorasDisponibles() {
        return horasDisponibles;
    }

    public void setHorasDisponibles(int horasDisponibles) {
        this.horasDisponibles = horasDisponibles;
    }

    @Override
    public double calcularPago(int horas){
        double pago = horas*6100;

        if(horas <= 12 && pago > 47500){
            pago = 47500;
        }

        return pago;
    }

    @Override
    public String toString(){
        return  "Estudiante de postgrado \n" +
                "Identificacion: " + identificacion + "\n" +
                "Facultad: " + facultad + "\n" +
                "Programa: " + nombreProgama  +
                "Saldo: " + saldo + "\n" +
                "Horas disponibles: " + horasDisponibles;
    }
}

