import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * @author TheLostDesu
 *
 */
public class Main {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	try {
			begin(in);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
    	
    	
    }
    
    public static void begin(Scanner in) throws InterruptedException {
    	System.out.println("�� ���������� �� �����-�� ������� ������.");
    	System.out.println("�����-�� ������� ������ ������ ��� �����");
    	System.out.println("1. ���� ������(����� ����)");
    	System.out.println("2. ������������� � ������� � �������� �����������");
    	
    	String a = in.next();
    	if(a.equals("1")) {
      	  clear();
          near_ship(in);
      	}
      	else if(a.equals("2")){
      	  clear();
          look(in);
      	}
      	else {
      	  clear();
          System.out.println("�� ����, �� ���� ���������");
      	  begin(in);
      	}
    	
    }
    
    public static void near_ship(Scanner in) throws InterruptedException {
    	System.out.println("�� ������ �� �������, �� �������, ��� ��� ������ ��� �� ������");
        System.out.println("1. ������ �������� � ������������(����� ����� � �������� ����� ������� ����������)");
    	System.out.println("2. �������� � ��������");
        System.out.println("3. �������� ������, � ���� ��������");
        String a = in.next();
        if(a.equals("1")) {
        	clear();
        	System.out.println("�� �������� � ������������, ����� ���������������� �������");
        	System.out.println("������� �� ������ d6 � ������, ��� �� ���� ������(DND moment)");
        	TimeUnit.SECONDS.sleep(2);
        	int rnd = 1 + (int) (Math.random() * 3);
        	if(rnd == 1) {
        		System.out.println("����� 1...");
            	TimeUnit.SECONDS.sleep(2);
            	System.out.println("...");
            	TimeUnit.SECONDS.sleep(2);
            	System.out.println("��� ����� �� �������");
        	}
        	else if(rnd == 2) {
        		System.out.println("������ 2...");
            	TimeUnit.SECONDS.sleep(2);
            	System.out.println("...");
            	TimeUnit.SECONDS.sleep(2);
            	System.out.println("��� ����� �� ����");
        	}
        	else {
        		System.out.println("������ 3...");
            	TimeUnit.SECONDS.sleep(2);
            	System.out.println("...");
            	TimeUnit.SECONDS.sleep(2);
            	System.out.println("��� ����� �� ����");
        	}
        	
        }
        else if(a.equals("2")) {
        	clear();
        	System.out.println("�� �������� � ��������, ������ ��������, �� ������ �� ������");
            System.out.println("��� ��������� ��������� �������� �� ���� ����������...");
        	TimeUnit.SECONDS.sleep(2);
        	System.out.println("...");
        	TimeUnit.SECONDS.sleep(2);
        	System.out.println("����� ��� �� ��������������");
        }
        else if(a.equals("3")) {
        	clear();
        	System.out.println("�� ������� ����������� �� �����, � ����������� ������� �������...");
        	TimeUnit.SECONDS.sleep(2);
        	System.out.println("...");
        	TimeUnit.SECONDS.sleep(2);
        	System.out.println("��� ������ ����");
        }
        else {
        	clear();
        	near_ship(in);
        }
    }
    
    public static void look(Scanner in) throws InterruptedException {
    	clear();
        System.out.println("�������, � ���� ��������� ������������� ��������� ����� �����");
        System.out.println("������ �� ��� ��� �������, � � ���� ���� ���-�� ������");
        System.out.println("����� �� ������ ������� ������������� �� �����");
        System.out.println("�� �� ������ ��� ������ �����?..");
    	TimeUnit.SECONDS.sleep(2);
    	System.out.println("������ ������� �� ������!...");
    	TimeUnit.SECONDS.sleep(2);
    	System.out.println("�� ����������� �� ���. ��� ������ ���������.");
    }
    
    public static void clear() {
    	for(int i = 0; i < 20; ++i) {
    		System.out.println('\n');
    	}
    }
}