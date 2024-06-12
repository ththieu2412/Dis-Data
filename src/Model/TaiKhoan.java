package Model;

import java.util.Date;

public class TaiKhoan {
    private String soTK;
    private String CMND;
    private String soDu;
    private String maCN;
    private Date ngayMoTK;

    public TaiKhoan() {}

    public TaiKhoan(String soTK, String CMND, String soDu, String maCN, Date ngayMoTK) {
        this.soTK = soTK;
        this.CMND = CMND;
        this.soDu = soDu;
        this.maCN = maCN;
        this.ngayMoTK = ngayMoTK;
    }

    public String getSoTK() {
        return soTK;
    }

    public void setSoTK(String soTK) {
        this.soTK = soTK;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getSoDu() {
        return soDu;
    }

    public void setSoDu(String soDu) {
        this.soDu = soDu;
    }

    public String getMaCN() {
        return maCN;
    }

    public void setMaCN(String maCN) {
        this.maCN = maCN;
    }

    public Date getNgayMoTK() {
        return ngayMoTK;
    }

    public void setNgayMoTK(Date ngayMoTK) {
        this.ngayMoTK = ngayMoTK;
    }
}
