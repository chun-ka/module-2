package phuong_tien_giao_thong.model;

public class XeTai extends PhuongTien{
    private double trongTai;

    public XeTai() {
    }

    public XeTai(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String tenChuSoHuu, double trongTai) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, tenChuSoHuu);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" + super.toString()+
                "trongTai=" + trongTai +
                '}';
    }
}
