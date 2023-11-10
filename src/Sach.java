import java.util.Scanner;

public class Sach {
	private String tenSach;
	private double giaBan;
	private int namXuatBan;
	private TacGia tacGia;
	
	// in ten sach
	
	public void tenSach() {
		System.out.println("Ten sach: " + tenSach);
	}
	public Sach(String tenSach, double giaBan, int namXuatBan, TacGia tacGia) {
		super();
		this.tenSach = tenSach;
		this.giaBan = giaBan;
		this.namXuatBan = namXuatBan;
		this.tacGia = tacGia;
	}
	
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public int getNamXuatBan() {
		return namXuatBan;
	}
	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}
	public TacGia getTacGia() {
		return tacGia;
	}
	public void setTacGia(TacGia tacGia) {
		this.tacGia = tacGia;
	}
	// so sanh cung nam
	public boolean soSanhNam(Sach sachKhac) {
		if(namXuatBan == sachKhac.namXuatBan) {
			System.out.println("Sach cung nam xuat ban");
			return true;
		}else {
			System.out.println("Sach khong cung nam xuat ban");
			return false;
		}
		
		
	}
	
	//gia sach sau khi giam gia
	public double giaTien(double x) {
		
		 
		System.out.println("So tien sau khi giam gia:" + giaBan*(1-x/100));
		return giaBan;
		
	}
	//so sanh date
	
	
	
}
