public class Rettangolo extends Forma{
    private float base;
    private float altezza;

    public  Rettangolo(float base, float altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public float calcolaArea() {
        return base * altezza;
    }
}
