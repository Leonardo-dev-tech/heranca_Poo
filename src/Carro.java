public class Carro  extends Veiculo{
    private int portas;
    public Carro( String marca, String modelo, int portas) {
        super(marca,modelo);
        this.portas = portas;
    }

    @Override
    public String toString() {
        return super.toString()  + "portas=" + this.portas + '}';
    }
}
