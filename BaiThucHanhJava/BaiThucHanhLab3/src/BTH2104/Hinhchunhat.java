package BTH2104;

public class Hinhchunhat extends Hinhhoc{
    private float dai ;
    private float rong ;
    public Hinhchunhat(float dai, float rong) {
        this.dai = dai;
        this.rong = rong;
    }
    public float getDai() {
        return dai;
    }
    public void setDai(float dai) {
        this.dai = dai;
    }
    public float getRong() {
        return rong;
    }
    public void setRong(float rong) {
        this.rong = rong;
    }
    
    @Override
    public void ten() 
    {
        System.out.println("Hinh Chu Nhat");
    }
    @Override
    double tinhchuvi()
    {
        return (dai + rong) * 2 ;
    }

    @Override
    double tinhdientich()
    {
        return dai * rong;
    }
}
