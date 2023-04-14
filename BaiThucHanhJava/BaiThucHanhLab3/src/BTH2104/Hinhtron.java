package BTH2104;
public class Hinhtron extends Hinhhoc {
    private float r;
     public Hinhtron(float r) 
    {
        this.r = r;
    }
    public float getR() 
    {
        return r;
    }
    public void setR(float r) 
    {
        this.r = r;
    }
    @Override
    public void ten() 
    {
        System.out.println("Hinh Tron");
    }
    @Override
    double tinhdientich()
    {
        return getPI() * r * 2;
    }
    @Override
    double tinhchuvi()
    {
        return getPI() * getPI() * r ;
    }
}
