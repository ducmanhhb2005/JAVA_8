public class NhanVien{
   protected String tenNhanVien;
   protected double heSoLuong;
   public NhanVien(String tenNhanVien, double heSoLuong){
       this.tenNhanVien = tenNhanVien;
       this.heSoLuong = heSoLuong;
   }
   public static final double LUONG_CO_BAN = 750000;
   public static final double LUONG_MAX = 20000000;
   public boolean tangLuong(double money){
       return true;
   }
   public double tinhLuong(){
       return 0;
   }
   public void inTT(){
       
   }
   
}
