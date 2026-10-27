import java.util.Scanner;
import java.time.Year;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
        // Bai 4: Chon loai sach
        System.out.println("\nChon loai sach:");
        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");
        System.out.print("Lua chon (1-4): ");
        int loaiSach = sc.nextInt();
        System.out.println("\n===== THONG TIN SACH =====");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.printf("Don gia: %.2f%n", donGia);
        System.out.println("So luong: " + soLuong);
        // BAI 1: Kiem tra tinh hop le
        int namHienTai = Year.now().getValue();
        boolean giaHopLe = donGia > 0;
        boolean soLuongHopLe = soLuong >= 0;
        boolean namHopLe =
                namXuatBan > 0 && namXuatBan <= namHienTai;
        System.out.println("\n===== BAI 1: KIEM TRA HOP LE =====");
        System.out.println("Don gia: "
                + (giaHopLe ? "Hop le" : "Khong hop le"));
        System.out.println("So luong: "
                + (soLuongHopLe ? "Hop le" : "Khong hop le"));
        System.out.println("Nam xuat ban: "
                + (namHopLe ? "Hop le" : "Khong hop le"));
        // BAI 2: Phan loai gia sach
        System.out.println("\n===== BAI 2: PHAN LOAI GIA =====");
        if (giaHopLe) {
            if (donGia < 50000) {
                System.out.println("Sach gia thap");
            } else if (donGia < 100000) {
                System.out.println("Sach gia trung binh");
            } else if (donGia <= 200000) {
                System.out.println("Sach gia cao");
            } else {
                System.out.println("Sach gia dac biet");
            }
        } else {
            System.out.println("Don gia khong hop le");
        }
        // BAI 3: Phan loai ton kho
        System.out.println("\n===== BAI 3: PHAN LOAI TON KHO =====");
        if (soLuongHopLe) {
            if (soLuong == 0) {
                System.out.println("Het sach");
            } else if (soLuong <= 5) {
                System.out.println("Sap het");
            } else if (soLuong <= 20) {
                System.out.println("Con it");
            } else {
                System.out.println("Con nhieu");
            }
        } else {
            System.out.println("So luong khong hop le");
        }

        // BAI 4: Dung switch chon loai sach
        System.out.println("\n===== BAI 4: LOAI SACH =====");
        switch (loaiSach) {
            case 1:
                System.out.println("Sach giao khoa");
                break;
            case 2:
                System.out.println("Sach tham khao");
                break;
            case 3:
                System.out.println("Sach chuyen nganh");
                break;
            case 4:
                System.out.println("Sach khac");
                break;
            default:
                System.out.println("Loai sach khong hop le");
        }
        System.out.println("\n===== TINH TIEN NHAP KHO =====");
        if (giaHopLe && soLuongHopLe) {
            double thanhTien = donGia * soLuong;
            double phiVanChuyen = thanhTien * 0.05;
            double tongTienNhap = thanhTien + phiVanChuyen;

            System.out.printf("Thanh tien: %.2f%n", thanhTien);
            System.out.printf("Phi van chuyen (5%%): %.2f%n",
                    phiVanChuyen);
            System.out.printf("Tong tien nhap: %.2f%n",
                    tongTienNhap);
        } else {
            System.out.println(
                    "Khong tinh tien vi du lieu khong hop le");
        }
        sc.close();
    }
}