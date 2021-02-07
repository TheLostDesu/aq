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
    	System.out.println("Вы находитесь за какой-то большой стеной.");
    	System.out.println("Какие-то большие мужики ломают эту стену");
    	System.out.println("1. Пора бежать(делаю ноги)");
    	System.out.println("2. Поучаствовать в пикнике в качестве наблюдателя");
    	
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
          System.out.println("Ну друг, ну пиши нормально");
      	  begin(in);
      	}
    	
    }
    
    public static void near_ship(Scanner in) throws InterruptedException {
    	System.out.println("Вы бежите на корабль, но кажется, что вас просто так не пустят");
        System.out.println("1. Быстро вступить в разведкорпус(благо рядом с кораблем стоят господа разведчики)");
    	System.out.println("2. Вступить в гарнизон");
        System.out.println("3. Проплыть зайцем, и жить спокойно");
        String a = in.next();
        if(a.equals("1")) {
        	clear();
        	System.out.println("Вы вступили в разведкорпус, стали профессиональным убивцей");
        	System.out.println("Давайте же бросим d6 и узнаем, что же было дальше(DND moment)");
        	TimeUnit.SECONDS.sleep(2);
        	int rnd = 1 + (int) (Math.random() * 3);
        	if(rnd == 1) {
        		System.out.println("Выпал 1...");
            	TimeUnit.SECONDS.sleep(2);
            	System.out.println("...");
            	TimeUnit.SECONDS.sleep(2);
            	System.out.println("Вас съели на завтрак");
        	}
        	else if(rnd == 2) {
        		System.out.println("Выпало 2...");
            	TimeUnit.SECONDS.sleep(2);
            	System.out.println("...");
            	TimeUnit.SECONDS.sleep(2);
            	System.out.println("Вас съели на обед");
        	}
        	else {
        		System.out.println("Выпало 3...");
            	TimeUnit.SECONDS.sleep(2);
            	System.out.println("...");
            	TimeUnit.SECONDS.sleep(2);
            	System.out.println("Вас съели на ужин");
        	}
        	
        }
        else if(a.equals("2")) {
        	clear();
        	System.out.println("Вы вступили в гарнизон, прошли обучение, но ничего не поняли");
            System.out.println("При следующем нападении жирничей вы были бесполезны...");
        	TimeUnit.SECONDS.sleep(2);
        	System.out.println("...");
        	TimeUnit.SECONDS.sleep(2);
        	System.out.println("Поняв это вы самовыпилились");
        }
        else if(a.equals("3")) {
        	clear();
        	System.out.println("Вы успешно проплываете за стену, и становитесь обычным жителем...");
        	TimeUnit.SECONDS.sleep(2);
        	System.out.println("...");
        	TimeUnit.SECONDS.sleep(2);
        	System.out.println("Вас сожрал пудж");
        }
        else {
        	clear();
        	near_ship(in);
        }
    }
    
    public static void look(Scanner in) throws InterruptedException {
    	clear();
        System.out.println("Кажется, в этом маленьком представлении произошла смена ролей");
        System.out.println("Теперь вы еда для пикника, и с этим надо что-то делать");
        System.out.println("Вдруг вы видите солдата разведкорпуса на крыше");
        System.out.println("Он же должен вас спасти верно?..");
    	TimeUnit.SECONDS.sleep(2);
    	System.out.println("Солдат прыгает на помощь!...");
    	TimeUnit.SECONDS.sleep(2);
    	System.out.println("Он приземлился на вас. Вас просто раздавило.");
    }
    
    public static void clear() {
    	for(int i = 0; i < 20; ++i) {
    		System.out.println('\n');
    	}
    }
}