package baithuchanh3;

public class Nguoi {
		protected String hoTen;
		protected java.util.Date ngaySinh;
		protected String queQuan;
		public Nguoi(){
		}
		public Nguoi(String hoTen, java.util.Date ngaySinh){
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		}
		public Nguoi(String hoTen, Date ngaySinh, String queQuan){
		this(hoTen, ngaySinh);
		this.queQuan = queQuan;
		
		}
		public void nhapThongTin(Scanner sc){
		System.out.print("Nhap ho ten: ");
		hoTen = sc.nextLine();

		...<?>...
		}
		public Date stringToDate(String ngaySinh){
		Date ngaySinhDate = null;
		// <Tham khảo: https://examples.javacodegeeks.com/core-java/text/java-simpledateformat-example>
		return ngaySinhDate;
		}
		public void inThongTin(){
		...<?>...
		}
		}

		import <?>;
		import <?>;
		public class HocSinh extends Nguoi
		{
		<?> String lop;
		<?> String khoaHoc;
		<?> int kyHoc;
		public HocSinh(){}
		public HocSinh(String hoTen, Date ngaySinh, String lop, int khoaHoc){
		super(hoTen, ngaySinh);
		...<?>...
		}

		public HocSinh(String hoTen, String lop, String khoaHoc){
		...?...
		}
		< ?> < ?> nhapThongTin(Scanner sc){
		super.nhapThongTin(sc);
		..<?>...
		}
		< ?> < ?> inThongTin(){
		super.inThongTin();
		...<?>...
		}
		public <?> getLop(){
		return <?>;
		}
		}