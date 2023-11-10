
public class Main {
	public static void main(String[] args) {
		Date date = new Date(12, 2, 1998);
		Date date1 = new Date(12, 2, 1998);
		
		TacGia tacGia = new TacGia("Hieu", date);
		TacGia tacGia1 = new TacGia("Hieu", date1);
		Sach sach = new Sach("The Power", 10000.2, 2011, tacGia);
		Sach sach1 = new Sach("The Power of Focus", 10000.2, 2011, tacGia);
		
		sach.tenSach();
		sach1.tenSach();
		
		sach.soSanhNam(sach1);
		
		sach.giaTien(10);
		
		
	}
}
