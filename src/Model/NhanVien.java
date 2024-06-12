package Model;

public class NhanVien {
    private String id;

    private String ho;
    
    private String ten;
    
    private String CMND;
    
    private String diaChi;
    
    private String phai;
    
    private String soDT;
    
    private String maCN;
    
    private int trangThaiXoa;

    public NhanVien() {}

    public NhanVien(String id, String ho, String ten, String CMND, String diaChi, String phai, String soDT, String maCN, int trangThaiXoa) {
        this.id = id;
        this.ho = ho;
        this.ten = ten;
        this.CMND = CMND;
        this.diaChi = diaChi;
        this.phai = phai;
        this.soDT = soDT;
        this.maCN = maCN;
        this.trangThaiXoa = trangThaiXoa;
    }

    public String getMaCN() {
        return maCN;
    }

    public String getId() {
        return id;
    }

    public String getHo() {
        return ho;
    }

    public String getTen() {
        return ten;
    }

    public String getCMND() {
        return CMND;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getPhai() {
        return phai;
    }

    public String getSoDT() {
        return soDT;
    }

    public int getTrangThaiXoa() {
        return trangThaiXoa;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setPhai(String phai) {
        this.phai = phai;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public void setMaCN(String maCN) {
        this.maCN = maCN;
    }

    public void setTrangThaiXoa(int trangThaiXoa) {
        this.trangThaiXoa = trangThaiXoa;
    }
}
