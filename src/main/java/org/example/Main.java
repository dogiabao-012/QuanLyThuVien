
package org.example;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> maSach = new ArrayList<>();
    static ArrayList<String> danhSachSach = new ArrayList<>();
    static ArrayList<Integer> soLuongSach = new ArrayList<>();
    static ArrayList<Double> donGiaSach = new ArrayList<>();
    // BAI 1: SU DUNG MANG INT[]
    public static void bai1() {
        System.out.println("\n===== BAI 1: MANG INT[] =====");
        int[] soLuong = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap so luong sach thu " + (i + 1) + ": ");
            soLuong[i] = sc.nextInt();
        }
        int tong = 0;
        int lonNhat = soLuong[0];
        for (int i = 0; i < 5; i++) {
            tong += soLuong[i];

            if (soLuong[i] > lonNhat) {
                lonNhat = soLuong[i];
            }
        }
        double trungBinh = (double) tong / 5;
        System.out.println("\n===== KET QUA BAI 1 =====");
        System.out.print("So luong 5 cuon sach: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(soLuong[i] + " ");
        }
        System.out.println("\nTong so luong: " + tong);
        System.out.println("Trung binh so luong: " + trungBinh);
        System.out.println("So luong lon nhat: " + lonNhat);
        sc.nextLine();
    }
    public static int timViTri(String ma) {
        return maSach.indexOf(ma);
    }

    // BAI 2 VA BAI 3: THEM SACH
    public static void themSach() {
        System.out.println("\n===== THEM SACH =====");
        System.out.print("Nhap ma sach: ");
        String ma = sc.nextLine();
        if (timViTri(ma) != -1) {
            System.out.println("Ma sach da ton tai!");
            return;
        }
        System.out.print("Nhap ten sach: ");
        String ten = sc.nextLine();
        System.out.print("Nhap so luong: ");
        int soLuong = sc.nextInt();
        System.out.print("Nhap don gia: ");
        double donGia = sc.nextDouble();
        sc.nextLine();
        if (soLuong < 0 || donGia < 0) {
            System.out.println("So luong va don gia khong duoc am!");
            return;
        }
        maSach.add(ma);
        String thongTin = "Ma sach: " + ma
                + " | Ten sach: " + ten
                + " | So luong: " + soLuong
                + " | Don gia: " + donGia;

        danhSachSach.add(thongTin);
        soLuongSach.add(soLuong);
        donGiaSach.add(donGia);
        System.out.println("Them sach thanh cong!");
    }
    // BAI 2 VA BAI 3: HIEN THI SACH
    public static void hienThiSach() {

        System.out.println("\n===== DANH SACH SACH =====");

        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sach sach dang rong!");
            return;
        }

        for (int i = 0; i < danhSachSach.size(); i++) {
            System.out.println((i + 1) + ". " + danhSachSach.get(i));
        }

        System.out.println("Tong so dau sach: " + danhSachSach.size());
    }

    // BAI 2 VA BAI 3: TIM SACH
    public static void timSach() {

        System.out.println("\n===== TIM SACH =====");

        System.out.print("Nhap ma sach can tim: ");
        String ma = sc.nextLine();

        int viTri = timViTri(ma);

        if (viTri != -1) {
            System.out.println("Tim thay sach:");
            System.out.println(danhSachSach.get(viTri));
        } else {
            System.out.println("Khong tim thay sach!");
        }
    }
    // BAI 2 VA BAI 3: XOA SACH
    public static void xoaSach() {
        System.out.println("\n===== XOA SACH =====");
        System.out.print("Nhap ma sach can xoa: ");
        String ma = sc.nextLine();
        int viTri = timViTri(ma);
        if (viTri != -1) {
            maSach.remove(viTri);
            danhSachSach.remove(viTri);
            soLuongSach.remove(viTri);
            donGiaSach.remove(viTri);
            System.out.println("Xoa sach thanh cong!");

        } else {
            System.out.println("Khong tim thay ma sach!");
        }
    }
    // BAI 3: SUA SACH
    public static void suaSach() {
        System.out.println("\n===== SUA THONG TIN SACH =====");
        System.out.print("Nhap ma sach can sua: ");
        String ma = sc.nextLine();
        int viTri = timViTri(ma);
        if (viTri != -1) {
            System.out.print("Nhap ten sach moi: ");
            String ten = sc.nextLine();
            System.out.print("Nhap so luong moi: ");
            int soLuong = sc.nextInt();
            System.out.print("Nhap don gia moi: ");
            double donGia = sc.nextDouble();
            sc.nextLine();
            if (soLuong < 0 || donGia < 0) {
                System.out.println("Du lieu khong hop le!");
                return;
            }
            String thongTin = "Ma sach: " + ma
                    + " | Ten sach: " + ten
                    + " | So luong: " + soLuong
                    + " | Don gia: " + donGia;

            danhSachSach.set(viTri, thongTin);
            soLuongSach.set(viTri, soLuong);
            donGiaSach.set(viTri, donGia);

            System.out.println("Cap nhat sach thanh cong!");

        } else {
            System.out.println("Khong tim thay sach!");
        }
    }
    public static void tinhTongSoLuong() {

        int tong = 0;

        for (int i = 0; i < soLuongSach.size(); i++) {
            tong += soLuongSach.get(i);
        }

        System.out.println("\nTong so luong sach: " + tong);
    }
    public static void tinhTongGiaTri() {
        double tong = 0;
        for (int i = 0; i < danhSachSach.size(); i++) {
            tong += soLuongSach.get(i) * donGiaSach.get(i);
        }
        System.out.println("\nTong gia tri sach: " + tong);
    }
    // BAI 4: MENU QUAN LY THU VIEN
    public static void menu() {
        int chon;
        do {

            System.out.println("\n========== QUAN LY THU VIEN ==========");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");
            System.out.println("======================================");
            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    themSach();
                    break;
                case 2:
                    hienThiSach();
                    break;
                case 3:
                    timSach();
                    break;
                case 4:
                    xoaSach();
                    break;
                case 5:
                    suaSach();
                    break;
                case 6:
                    tinhTongSoLuong();
                    break;
                case 7:
                    tinhTongGiaTri();
                    break;
                case 8:
                    System.out.println("Da thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 8);
    }
    public static void main(String[] args) {
        System.out.println("===== BAI THUC HANH TUAN 6 =====");
        bai1();
        menu();
        sc.close();
    }
}
