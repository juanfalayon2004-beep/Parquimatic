public class Caja {
    private double dineroTotal;

    public Caja(){
        this.dineroTotal = 0;
    }

    public Caja (double dineroTotal){
        this.dineroTotal = dineroTotal;
    }

    public double getDineroTotal() {
        return dineroTotal;
    }

    public void setDineroTotal(double dineroTotal) {
        this.dineroTotal = dineroTotal;
    }

    public void agregarDinero(double valor){
        if(valor>0){
            dineroTotal += valor;
        }
    }

    public boolean retirarDinero(double valor){
        if (valor > 0 && dineroTotal >= valor){
            dineroTotal -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return "Dinero en la caja: $" + dineroTotal;
    }
}

