package BTH2104;

public class Hinhtru extends Hinhhoc{
    private float r;
    private float chieucao;
    public Hinhtru(float r, float chieucao) {
        this.r = r;
        this.chieucao = chieucao;
    }
    public float getR() {
        return r;
    }
    public void setR(float r) {
        this.r = r;
    }
    public float getChieucao() {
        return chieucao;
    }
    public void setChieucao(float chieucao) {
        this.chieucao = chieucao;
    }
       
    @Override
    public void ten() 
    {
        System.out.println("Hinh Tru");
    }
    @Override
    double tinhdientich(){
        return getPI() * r * r;
    }
    @Override
    double tinhchuvi(){
        return 2 * getPI() * r ;
    }

    @Override
    double tinhthetich(){
        return chieucao * (2 * getPI() * r);
    }
}