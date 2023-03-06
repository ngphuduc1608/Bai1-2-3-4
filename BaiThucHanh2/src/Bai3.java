import java.util.Scanner;

public class Bai3 {
public static void main(String[] args) {
	String hoten;
	int namsinh,tuoi;
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap ten :");
	hoten=sc.nextLine();
	System.out.println("Nhap nam sinh:");
	namsinh=sc.nextInt();
	
	tuoi=2023-namsinh;
	if(tuoi<16) {
		System.out.println("Ban "+hoten+ " o do tuoi vi thanh nien");
	}else if(tuoi<18) {
		System.out.println("Ban "+hoten+ " o do tuoi truong thanh");
	}else {
		System.out.println("Ban "+hoten+ " da gia");
	}
}
}
