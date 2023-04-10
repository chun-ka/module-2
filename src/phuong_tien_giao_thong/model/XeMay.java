package phuong_tien_giao_thong.model;

public class XeMay extends PhuongTien{
    private String congSuat;

    public XeMay() {
    }

    public XeMay(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String tenChuSoHuu, String congSuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, tenChuSoHuu);
        this.congSuat = congSuat;
    }

    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" + super.toString()+
                "congSuat='" + congSuat + '\'' +
                '}';
    }
}
