
import java.util.ArrayList;
import java.util.Scanner;
class Sach {
    String maSach;
    String tenSach;
    int soLuong;
    double donGia;
    public Sach(String maSach, String tenSach,
                int soLuong, double donGia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
    public double tinhGiaTri() {
        return soLuong * donGia;
    }
    public void hienThi() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("So luong: " + soLuong);
        System.out.println("Don gia: " + donGia);
        System.out.println("Thanh tien: " + tinhGiaTri());
        System.out.println("---------------------------");
    }
}
public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Sach> danhSach = new ArrayList<>();
    // BAI 1: Nhap n sach bang vong lap
    public static void nhapSach() {
        int n;
        System.out.print("Nhap so luong sach: ");
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap thong tin sach thu " + (i + 1));
            System.out.print("Ma sach: ");
            String ma = sc.nextLine();
            System.out.print("Ten sach: ");
            String ten = sc.nextLine();
            System.out.print("So luong: ");
            int sl = sc.nextInt();
            System.out.print("Don gia: ");
            double gia = sc.nextDouble();
            sc.nextLine();
            Sach sach = new Sach(ma, ten, sl, gia);
            danhSach.add(sach);
        }
        System.out.println("\nDa nhap sach thanh cong!");
    }
    // BAI 2: Tinh tong so luong va tong gia tri sach
    public static void tinhTong() {
        int tongSoLuong = 0;
        double tongGiaTri = 0;
        for (int i = 0; i < danhSach.size(); i++) {
            Sach sach = danhSach.get(i);

            tongSoLuong += sach.soLuong;
            tongGiaTri += sach.tinhGiaTri();
        }
        System.out.println("\n===== THONG KE SACH =====");
        System.out.println("Tong so luong sach: " + tongSoLuong);
        System.out.println("Tong gia tri sach: " + tongGiaTri);
    }
    // BAI 4: Tim sach theo ma
    public static void timSach() {
        sc.nextLine();
        System.out.print("Nhap ma sach can tim: ");
        String maCanTim = sc.nextLine();
        boolean timThay = false;
        for (int i = 0; i < danhSach.size(); i++) {
            Sach sach = danhSach.get(i);
            if (sach.maSach.equalsIgnoreCase(maCanTim)) {
                System.out.println("\nTim thay sach!");
                sach.hienThi();
                timThay = true;
                break;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay sach co ma: " + maCanTim);
        }
    }
    // BAI 3: Menu lap den khi chon Thoat
    public static void menu() {
        int chon;

        do {
            System.out.println("\n========== QUAN LY THU VIEN ==========");
            System.out.println("1. Nhap n sach");
            System.out.println("2. Tinh tong so luong va tong gia tri sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Hien thi danh sach sach");
            System.out.println("0. Thoat");
            System.out.println("======================================");
            System.out.print("Nhap lua chon cua ban: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    nhapSach();
                    break;
                case 2:
                    tinhTong();
                    break;
                case 3:
                    timSach();
                    break;
                case 4:
                    System.out.println("\n===== DANH SACH SACH =====");

                    if (danhSach.isEmpty()) {
                        System.out.println("Danh sach sach dang rong!");
                    } else {
                        for (int i = 0; i < danhSach.size(); i++) {
                            System.out.println("\nSach thu " + (i + 1));
                            danhSach.get(i).hienThi();
                        }
                    }
                    break;
                case 0:
                    System.out.println("Da thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);
    }
    public static void main(String[] args) {
        menu();
        sc.close();
    }
}
