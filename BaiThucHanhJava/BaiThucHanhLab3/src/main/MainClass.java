package main;
import shapes.HinhChuNhat;
import shapes.HinhTron;
import shapes.HinhTru;
import shapes.HinhVuong;
public class MainClass {
    public static void main(String[]agrs ){
        HinhTron hinhtron = new HinhTron();
        hinhtron.xuatTen();
        hinhtron.nhapbankinh();
        hinhtron.tinhchuvi();
        hinhtron.tinhdientich();
        hinhtron.inChuvi();
        hinhtron.inDientich();
        //hinhtru
        HinhTru hinhtru = new HinhTru();
        hinhtru.xuatTen();
        hinhtru.nhapchieucao();
        hinhtru.tinhthetich();
        hinhtru.inThetich();
        //hinhchunhat
        HinhChuNhat hinhchunhat = new HinhChuNhat();
        hinhchunhat.xuatTen();
        hinhchunhat.nhapchieudai();
        hinhchunhat.nhapchieurong();
        hinhchunhat.tinhchuvi();
        hinhchunhat.tinhdientich();
        hinhchunhat.inChuvi();
        hinhchunhat.inDientich();
        //hinhvuong
        HinhVuong hinhvuong =  new HinhVuong();
        hinhvuong.xuatTen();
        hinhvuong.nhapcanh();
        hinhvuong.tinhchuvi();
        hinhvuong.tinhchuvi();
        hinhvuong.tinhdientich();
        hinhvuong.inChuvi();
        hinhvuong.inDientich();
    }
}
