
package org.example;
import java.time.Year;
public class Book {

    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    public Book(String maSach, String tieuDe, String tacGia,
                int namXuatBan, int soLuong) {

        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;

        setNamXuatBan(namXuatBan);
        setSoLuong(soLuong);
    }
    public String getMaSach() {
        return maSach;
    }
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    public String getTieuDe() {
        return tieuDe;
    }
    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }
    public String getTacGia() {
        return tacGia;
    }
    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }
    public int getNamXuatBan() {
        return namXuatBan;
    }
    public void setNamXuatBan(int namXuatBan) {
        int currentYear = Year.now().getValue();

        if (namXuatBan > 0 && namXuatBan <= currentYear) {
            this.namXuatBan = namXuatBan;
        } else {
            throw new IllegalArgumentException(
                    "Nam xuat ban phai lon hon 0 va khong vuot qua nam hien tai!"
            );
        }
    }

    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            throw new IllegalArgumentException(
                    "So luong sach khong duoc am!"
            );
        }
    }
    public void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Tieu de: " + tieuDe);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("So luong: " + soLuong);
        System.out.println("---------------------------");
    }
}
