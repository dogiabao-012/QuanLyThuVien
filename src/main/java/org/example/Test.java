
package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Tao danh sach sach bang ArrayList
        ArrayList<Book> danhSachSach = new ArrayList<>();

        int luaChon;

        do {
            System.out.println("\n===== QUAN LY SACH THU VIEN =====");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi danh sach sach");
            System.out.println("3. Tim sach theo ma sach");
            System.out.println("4. Xoa sach theo ma sach");
            System.out.println("5. Thoat");
            System.out.print("Nhap lua chon: ");
            luaChon = sc.nextInt();
            sc.nextLine();
            switch (luaChon) {
                case 1:
                    try {
                        System.out.print("Nhap ma sach: ");
                        String maSach = sc.nextLine();

                        System.out.print("Nhap tieu de: ");
                        String tieuDe = sc.nextLine();

                        System.out.print("Nhap tac gia: ");
                        String tacGia = sc.nextLine();

                        System.out.print("Nhap nam xuat ban: ");
                        int namXuatBan = sc.nextInt();

                        System.out.print("Nhap so luong: ");
                        int soLuong = sc.nextInt();
                        sc.nextLine();

                        Book sach = new Book(
                                maSach, tieuDe, tacGia,
                                namXuatBan, soLuong
                        );

                        danhSachSach.add(sach);

                        System.out.println("Them sach thanh cong!");

                    } catch (IllegalArgumentException e) {
                        System.out.println("Loi: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("\nDANH SACH SACH TRONG THU VIEN");

                    if (danhSachSach.isEmpty()) {
                        System.out.println("Danh sach sach dang rong!");
                    } else {
                        for (Book b : danhSachSach) {
                            b.hienThiThongTin();
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();

                    boolean timThay = false;

                    for (Book b : danhSachSach) {
                        if (b.getMaSach().equalsIgnoreCase(maTim)) {
                            b.hienThiThongTin();
                            timThay = true;
                            break;
                        }
                    }
                    if (!timThay) {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;

                case 4:
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();

                    boolean daXoa = false;

                    for (int i = 0; i < danhSachSach.size(); i++) {
                        if (danhSachSach.get(i).getMaSach()
                                .equalsIgnoreCase(maXoa)) {

                            danhSachSach.remove(i);
                            daXoa = true;

                            System.out.println("Xoa sach thanh cong!");
                            break;
                        }
                    }
                    if (!daXoa) {
                        System.out.println("Khong tim thay sach can xoa!");
                    }
                    break;
                case 5:
                    System.out.println("Ket thuc chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (luaChon != 5);
        sc.close();
    }
}
