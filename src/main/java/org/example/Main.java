
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Bai 1: Nhap thong tin sach
        System.out.println("===== QUAN LY SACH THU VIEN =====");
        System.out.print("Nhap ma sach: ");
        String maSach = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        String tenSach = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        String tacGia = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        int namXuatBan = sc.nextInt();
        System.out.print("Nhap don gia: ");
        double donGia = sc.nextDouble();
        System.out.print("Nhap so luong: ");
        int soLuong = sc.nextInt();
        // Bai 2: Tinh thanh tien
        double thanhTien = donGia * soLuong;
        // Bai 3: Tinh phi van chuyen
        double phiVanChuyen = thanhTien * 0.05;
        // Bai 4: Tinh tong tien nhap
        double tongTienNhap = thanhTien + phiVanChuyen;
        System.out.println("\n===== THONG TIN SACH =====");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.printf("Don gia: %.2f%n", donGia);
        System.out.println("So luong: " + soLuong);
        System.out.println("\n===== KET QUA TINH TOAN =====");
        System.out.printf("Thanh tien: %.2f%n", thanhTien);
        System.out.printf("Phi van chuyen: %.2f%n", phiVanChuyen);
        System.out.printf("Tong tien nhap: %.2f%n", tongTienNhap);
        sc.close();
    }
}
