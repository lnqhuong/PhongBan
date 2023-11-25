import java.util.ArrayList;
import java.util.Scanner;

public class PhongBan {
    Scanner sc = new Scanner(System.in);

    private static int idMP = 1001;
    private int maphong; 
    private String tenphong; // ten phong
    private int trgphong; // ma truong phong kieu int
    private ArrayList<NhanVien> dsNhanvien;
    
    // danh sach nhan vien chua thuoc phong ban nao
    // số lượng nhân viên (cho tăng tự động mỗi khi thêm nhân viên)


    // constructor 
    public PhongBan () {
    }


    // constructor PhongBan không có ArrayList dsNhanVien
    public PhongBan (int maphong, String tenphong, int trgphong)
    {
        this.maphong=maphong;
        this.tenphong=tenphong;
        this.trgphong=trgphong;
    }

    // constructor PhongBan có ArrayList dsNhanVien
    public PhongBan (int maphong, String tenphong, int trgphong, ArrayList<NhanVien> dsNhanvien)
    {
        this.maphong=maphong;
        this.tenphong=tenphong;
        this.trgphong=trgphong;
        this.dsNhanvien = dsNhanvien;
    }
    public void nhap(ArrayList<NhanVien> dsNhanVienRong)
    {
        // bỏ switch case
        System.out.print("Nhap ten phong: ");
        tenphong = sc.nextLine();
        PhongBan pb = new PhongBan();

            // làm mới danh sách nhân viên sau mỗi lần thêm nhân viên vào phòng ban (nghĩa là người đó không còn là mã phòng ban rỗng nữa)
            // for (NhanVien nv : dsNhanVienRong) {
            //     if (nv.getMaPhongBan() == 0)
            //         dsNhanVienRong.add(nv);
            // } 

            //xuat danh sach nhan vien chua thuoc phong ban nao, rong la maphong = 0
        System.out.println("Danh sach nhan vien chua thuoc phong ban nao: ");
        int i = 0;
        for (NhanVien nv : dsNhanVienRong) {
            System.out.println((i++) +". " + nv.toString()); // có thể viết hàm toString() như ở phía dưới tui có viết á để xuất thông tin của nhân viên đó ra
            System.out.println("=============================");
        }
        int stt;
        int slnv; // số lượng nhân viên
        System.out.println("Nhap so luong nhan vien muon them: ");
        slnv = Integer.parseInt(sc.nextLine());
        for (int k=1; k<=slnv; k++) {
            System.out.println("Nhap stt nhan vien muon them: ");
            stt = Integer.parseInt(sc.nextLine());
                    
            NhanVien nhanvien = dsNhanVienRong.get(stt);
            nhanvien.setMaPhongBan(maphong);
            // note
            // dsBangLuong.suanv(nhanvien);
            // dsDuAn.suanv(nhanvien);
            dsNhanvien.add(nhanvien);
                if (stt < 0 || stt >= dsNhanVienRong.size()) {
                    System.out.println("----- Lua chon khong hop le -----");
                }
        }
        for(NhanVien nv : dsNhanvien) {
            System.out.println("--- Danh sach nhan vien trong phong ban ---");
            int j = 0;
            System.out.println((j++) +". " + nv.toString());
            System.out.println("=============================");
        }
        int stt2;
        System.out.println("Nhap stt muon chon nhan vien lam truong phong: ");
        stt2 = Integer.parseInt(sc.nextLine());
        NhanVien nhanvien2 = new NhanVien();
        nhanvien2 = dsNhanvien.get(stt2);
        trgphong = nhanvien2.getID();

        //xuat danh sach nhan vien chua thuoc phong ban nao, rong la ""
        // System.out.println("Danh sach nhan vien chua thuoc phong ban nao: ");
        // kiem tra dieu kien nhan vien chua thuoc phong ban
        // int i = 0;
        // kiem tra ma phong nhan vien co bang rong~ ko
        // ArrayList<Nhanvien> nvRong~ = new ArrayList<Nhanvien>();
        // for (Nhanvien nv : dsNhanVien){
        //   if (nhanvien.getMaPhong()=="") 
        // them vo mang nhan vien rong~
        //     System.out.print(i);
        //     nv.xuat();
        //     i++;
        // }

        // xuat ra mang nhan vien rong        
        // System.out.println("Danh sach nhan vien thuoc phong ban: ");
        // int i = 0;
        // for (Nhanvien nv : dsNhanVien){
        //     System.out.print(i);
        //     nv.xuat();
        //     i++;
        // }


        // int stt;
        // do {
        //     System.out.print("Chon truong phong cua phong ban (STT): ");
        //     stt = Integer.parseInt(sc.nextLine());
        // } while (stt < 0 || stt >= nv.size());
        // them nhanvien do vo list phong ban ma nguoi dung nhap 
        // dsNhanVien.add(result.get(stt)\ss); nam trong do while nhap nhieu` nhan vien
        maphong = idMP++;
    }

    // output
    public void xuat() {
        System.out.println("" +maphong+ "," +tenphong+ "," +trgphong);
    }
    // get&set maphong
    public int getMaphong () {
        return maphong;
    }
    public void setMaphong (int maphong) {
        this.maphong=maphong;
    }

    // get&set tenphong
    public String getTenphong () {
        return tenphong;
    }
    public void setTenphong (String tenphong) {
        this.tenphong=tenphong;
    }

    // get&set trgphong
    public int getTrgphong () {
        return trgphong;
    }
    public void setTrgphong (int trgphong) {
        this.trgphong=trgphong;
    }

    public String toString() {
        return maphong + ", " + tenphong + ", " + trgphong;
    }

    // get&set slnv (so luong nhan vien)
}