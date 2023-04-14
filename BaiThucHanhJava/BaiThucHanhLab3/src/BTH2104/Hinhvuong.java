package BTH2104;

public class Hinhvuong extends Hinhhoc {
    private float canh;

    public Hinhvuong(float canh) {
        this.canh = canh;
    }

    public float getCanh() {
        return canh;
    }

    public void setCanh(float canh) {
        this.canh = canh;
    }
   
    @Override
    public void ten() 
    {
        System.out.println("Hinh Vuong");
    }
    @Override
    double tinhchuvi()
    {
        return (canh + canh) * 2 ;
    }
    
    @Override
    double tinhdientich()
    {
        return canh * canh;
    }

}
