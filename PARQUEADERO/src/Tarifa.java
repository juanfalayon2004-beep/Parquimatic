public class Tarifas {

    private double tarifaPregrado;
    private double tarifaPostgrado;
    private double tarifaProfesorPlanta;
    private double tarifaProfesorCatedra;
    private double tarifaAdministrativo;
    private double tarifaVisitante;

    public Tarifas(){
        this.tarifaPregrado = 3700;
        this.tarifaPostgrado = 6100;
        this.tarifaProfesorPlanta = 181100;
        this.tarifaProfesorCatedra = 6100;
        this.tarifaAdministrativo = 243900;
        this.tarifaVisitante = 11100;
    }

    public double getTarifaPregrado() {
        return tarifaPregrado;
    }

    public double getTarifaPostgrado() {
        return tarifaPostgrado;
    }

    public double getTarifaProfesorPlanta() {
        return tarifaProfesorPlanta;
    }

    public double getTarifaProfesorCatedra() {
        return tarifaProfesorCatedra;
    }

    public double getTarifaAdministrativo() {
        return tarifaAdministrativo;
    }

    public double getTarifaVisitante() {
        return tarifaVisitante;
    }

    public void setTarifaPregrado(double tarifaPregrado) {
        this.tarifaPregrado = tarifaPregrado;
    }

    public void setTarifaPostgrado(double tarifaPostgrado) {
        this.tarifaPostgrado = tarifaPostgrado;
    }

    public void setTarifaProfesorPlanta(double tarifaProfesorPlanta) {
        this.tarifaProfesorPlanta = tarifaProfesorPlanta;
    }

    public void setTarifaProfesorCatedra(double tarifaProfesorCatedra) {
        this.tarifaProfesorCatedra = tarifaProfesorCatedra;
    }

    public void setTarifaAdministrativo(double tarifaAdministrativo) {
        this.tarifaAdministrativo = tarifaAdministrativo;
    }

    public void setTarifaVisitante(double tarifaVisitante) {
        this.tarifaVisitante = tarifaVisitante;
    }

    public void mostrarTarifas(){
        System.out.println("Pregrado: $" + tarifaPregrado);
        System.out.println("Postgrado: $" + tarifaPostgrado);
        System.out.println("Profesor planta: $" + tarifaProfesorPlanta);
        System.out.println("Profesor catedra: $" + tarifaProfesorCatedra);
        System.out.println("Administrativo: $" + tarifaAdministrativo);
        System.out.println("Visitante: $" + tarifaVisitante);
    }
}

