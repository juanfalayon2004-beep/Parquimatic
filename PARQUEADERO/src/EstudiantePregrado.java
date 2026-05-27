//$3.700 por hora

public class EstudiantePregrado extends Usuario{
    private String carrera;
    private int horasDisponibles;

    public EstudiantePregrado(){
        super();
        this.carrera = "";
        this.horasDisponibles = 0;
    }

    public EstudiantePregrado(String identificacion, double saldo, String carrera, int horasDisponibles){
        super(identificacion, saldo);
        this.carrera = carrera;
        this.horasDisponibles = horasDisponibles;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getHorasDisponibles() {
        return horasDisponibles;
    }

    public void setHorasDisponibles(int horasDisponibles) {
        this.horasDisponibles = horasDisponibles;
    }

    @Override
    public String toString(){
        return "Estudiante de pregrado \n" +
                "Identificación: " + identificacion + "\n" +
                "Carrera: " + carrera + "\n" +
                "Saldo: " + saldo + "\n"
        "Horas Disponibles: " + horasDisponibles;
    }
}

