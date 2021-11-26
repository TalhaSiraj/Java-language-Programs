package TV;

public class Mainclass {
public static void main(String [] args) {
	
Television T1 = new Television();
Television T2 = new Television(3);
Television T3 = new Television(4,21);
Television T4 = new Television(5,72,false);

System.out.println("Channel No: "+T1.channel+"\tVolume level : "+T1.volumelevel+"\tTurn: "+T1.start);
System.out.println("Channel No: "+T2.channel);
System.out.println("Channel No: "+T3.channel+"\tVolume level : "+T3.volumelevel);
System.out.println("Channel No: "+T4.channel+"\tVolume level : "+T4.volumelevel+"\tTurn: "+T4.start);
}
}








