package Javastudy;
import java.util.Scanner;

public class ParkingSystem {
	public int [] Space = new int [10];
	public ParkingSystem(){
		for(int i = 0;i<10;i++){
			this.Space[i]=0;
		}
	}

	public void getSpace(){
		for(int i = 0;i < 10;i++){
			System.out.printf("(%d)",(this.Space[i]));
		}
		System.out.println("");
	}
	public void leftSpace(){
		int count = 0;
		for(int i = 0;i < 10;i++){
			if(Space[i]==0){
				count++;
			}
		}
		System.out.printf("���� �������� : %d \n",(count));
	}
	public void request(){
		Scanner scan = new Scanner(System.in);
		int req;
		int carNo;
		System.out.println("1: ���� 2: ���� ");
		req = scan.nextInt();
		System.out.println("������ȣ�� �Է��Ͻÿ� : ");
		carNo = scan.nextInt();
		if(req == 1){
			parking(carNo);
		}
		else if(req == 2){
			exit(carNo);
		}
	}
	public void parking(int num){
		Scanner scan = new Scanner(System.in);
		System.out.println("��� ������ �̵��Ͻðڽ��ϱ� :  ");
		int parkingNo = scan.nextInt();
		if(this.Space[parkingNo-1] != 0){
			System.out.println("�ش� �������� �����Ͻ� �� �����ϴ�.");
			parking(num);
		}
		else{
			this.Space[parkingNo-1]=num;
			leftSpace();
		}
		
	}
	public void exit(int num){
		
		for(int i = 0; i < 10; i++){
			if(this.Space[i]!=num){
				System.out.println("�ش� ������ �����ϴ�.");
				return;
			}
			else{
				this.Space[i]=0;
				leftSpace();
				return;
			}
		}
		
	}
	public static void main(String[] args) {
		ParkingSystem first = new ParkingSystem();
		while(true){
			first.getSpace();
			first.request();		
			
			
			
		}
		
	}

}
