import java.util.Scanner;


public class SanPham {
	private String MaSP;
	private String TenSP;
	private long Dongia;
	private int ThoihanBH;
	public SanPham(String maSP, String tenSP, long dongia, int thoihanBH) {
		super();
		MaSP = maSP;
		TenSP = tenSP;
		Dongia = dongia;
		ThoihanBH = thoihanBH;
	}
	public String getMaSP() {
		return MaSP;
	}
	public void setMaSP(String maSP) {
		MaSP = maSP;
	}
	public String getTenSP() {
		return TenSP;
	}
	public void setTenSP(String tenSP) {
		TenSP = tenSP;
	}
	public long getDongia() {
		return Dongia;
	}
	public void setDongia(long dongia) {
		Dongia = dongia;
	}
	public int getThoihanBH() {
		return ThoihanBH;
	}
	public void setThoihanBH(int thoihanBH) {
		ThoihanBH = thoihanBH;
	}
public SanPham()
{
	Scanner kb =new Scanner(System.in);
	System.out.println("Nhap Ma SP:");
	MaSP=kb.nextLine();
	System.out.println("Nhap TenSP:");
	TenSP=kb.nextLine();
	System.out.println("Nhap Dongia:");
	Dongia=kb.nextLong();
	System.out.println("Nhap THBH:");
	ThoihanBH=kb.nextInt();
}
public void show()
{
System.out.println("Ma SP:"+MaSP);
System.out.println("Ten SP:"+TenSP);
System.out.println("Don gia:"+Dongia);
System.out.println("Thoi han BH:"+ThoihanBH);
}
}
