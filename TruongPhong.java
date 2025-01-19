public class TruongPhong extends NhanVien{
    private double phuCap;
    private double soNamDuongChuc;
    public TruongPhong(String tenNhanVien, double heSoLuong ,double phuCap, double soNamDuongChuc){
        super(tenNhanVien, heSoLuong);
        this.phuCap = phuCap;
        this.soNamDuongChuc = soNamDuongChuc;
    }
    @Override 
    public double tinhLuong(){
        return this.LUONG_CO_BAN*this.heSoLuong+phuCap;
    }
    public static void main(String[] args){
        TruongPhong tp = new TruongPhong("Tran Duc Manh",2,20000,5);
        System.out.print(tp.tinhLuong());
    }
    
}
