package BTH2104;

public class main {
   
    public static void main(String[] args) {
        Hinhhoc ht = new Hinhtron(3);
        ht.ten();
        System.out.println("Dien tich = " +ht.tinhdientich());
    
        Hinhhoc hcn = new Hinhchunhat(5, 6);
        hcn.ten();
        System.out.println("Chu vi = " +hcn.tinhchuvi());
        System.out.println("Dien tich = " +hcn.tinhdientich());
        
        Hinhhoc hv = new Hinhvuong(10);
        hv.ten();
        System.out.println("Chu vi = " +hv.tinhchuvi());
        System.out.println("Dien tich = " +hv.tinhdientich());

        Hinhhoc hinhtru = new Hinhtru(6, 10);
        hinhtru.ten();
        System.out.println("Chu vi = " +hinhtru.tinhchuvi());
        System.out.println("Dien tich = " +hinhtru.tinhdientich());
        System.out.println("The tich = " +hinhtru.tinhthetich());
    }
} 
            

