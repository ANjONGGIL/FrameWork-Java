package Javastudy;
import java.util.Scanner;
public class PhoneBook {
	public PhoneBook(String name,int num){
		this.Name = name;
		this.PhoneNo = num;
		
	}
	
	static Scanner scan = new Scanner(System.in);
	static PhoneBook [] book = new PhoneBook[50];
	private static int No = 0;
	private String Name;
	private int PhoneNo;
	
	public int getNo() {
		return No;
	}
	public void setNo(int no) {
		No = no;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		PhoneNo = phoneNo;
	}
	public static void Create(int No,String name,int pn){
		book[No-1] = new PhoneBook(name,pn);
	}
	public static void Add(){
		System.out.println("�̸��� �Է��ϼ���: ");
		String userName = scan.next();
		System.out.println("��ȭ��ȣ�� �Է��ϼ���: ");
		int userPN = scan.nextInt();
		No++;
		Create(No,userName,userPN);
	}
	public static void finder(String name){
		for(int i=0;i<book.length;i++){
			if((book[i].Name).equals(name)){
				System.out.println(book[i].getNo()+"�̸�: "+book[i].getName()+"��ȭ��ȣ : "+book[i].getPhoneNo());
			}
			else{
				System.out.println("�ش��ϴ� �̸��� �������� �ʽ��ϴ�.");
			}
		}
	}
	public static void Research(){
		System.out.println("���ϴ� ���� Ÿ���� �����ϼ���:  1: �̸� 2: ��ȭ��ȣ");
		int Type = scan.nextInt();
		if(Type == 1){
			System.out.println("�̸��� �Է��� �ּ���: ");
			String userName = scan.next();
			finder(userName);
		}
	}
	public static void Update(){
		
	}
	public static void Delete(){
		
	}
	
	public static void Menu(){
		while(true){
			System.out.println("�߰�: 1 ��ȸ: 2  ����: 3  ����: 4");
			int menu = scan.nextInt();
			switch(menu){
			case 1: 
				Add();
				break;
			case 2:
				Research();
				break;
			case 3:
				Update();
				break;
			case 4:
				Delete();
				break;
			}
		}
		
		
	}
	public static void main(String[] args) {
		
		Menu();
			
		
	}

}
