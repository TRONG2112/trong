package baithuchanh2;

public class TestTG {
	public static void main(String[] args) {
		Diem A = new Diem();
		Diem B = new Diem(3,0);
		Diem C = new Diem(0,4);
		
		A.inDiem();
		B.inDiem();
		C.inDiem();
		TamGiac ABC = new TamGiac(A,B,C);
		System.out.println("Diện tích: " + ABC.dienTich());
		System.out.println("Chu vi: " + ABC.chuVi());
	}

}
