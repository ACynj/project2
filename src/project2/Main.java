package project2;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		
//problem3.4
//		int x=(int)(Math.random()*12+1);
//		switch(x) {
//		case 1:System.out.println("January");break;
//		case 2:System.out.println("February");break;
//		case 3:System.out.println("Mrach");break;
//		case 4:System.out.println("April");break;
//		case 5:System.out.println("May");break;
//		case 6:System.out.println("June");break;
//		case 7:System.out.println("July");break;
//		case 8:System.out.println("August");break;
//		case 9:System.out.println("September");break;
//		case 10:System.out.println("October");break;
//		case 11:System.out.println("November");break;
//		case 12:System.out.println("December");break;
//		}
		
		
		
		//problem 3.9
//		Scanner in=new Scanner(System.in);
//		System.out.print("Enter the  first 9 digits of an ISBN as integer:");
//		int x=in.nextInt();
//		int num=x;
//		int sum=0;
//		String str=String.valueOf(num);
//		for(int i=9;i>1;i--) {
//			 int y=x%10;
//			 sum+=i*y;
//			 x/=10;
//		}
//		sum%=11;
//		if(sum==10) {
//			System.out.println("The ISBN_10 number is "+"0"+str+"X");
//		}
//		else {
//			sum=(char)sum;
//			System.out.println("The ISBN_10 number is "+"0"+str+sum);
//		}
//		

		//problem 3.15
//		int ticket=(int)(Math.random()*1000);
//		System.out.print("请输入三位整数：");
//		Scanner in=new Scanner(System.in);
//		int myticket=in.nextInt();
//		int t3=ticket%10;
//		int t2=ticket/10%10;
//		int t1=ticket/100%10;
//		int mt3=myticket%10;
//		int mt2=myticket/10%10;
//		int mt1=myticket/100%10;
//		if(ticket==myticket)System.out.println("恭喜您，10000奖金");
//		else if((t1==mt2&&t2==mt3&&t3==mt1)||(t1==mt2&&t2==mt1&&t3==mt3)||(t1==mt3&&t2==mt2&&t3==mt1)&&(t1==mt3&&t2==mt1&&t3==mt2)&&(t1==mt1&&t2==mt3&&t3==mt2)) {
//			System.out.println("恭喜您，3000奖金");
//		}
//		else if(t1==mt1||t1==mt2||t1==mt3||t2==mt1||t2==mt2||t2==mt3||t3==mt1||t3==mt2||t3==mt3) {
//			System.out.println("恭喜您,1000奖金");
//		}
		
		
		
		
		//problem3.19
//		Scanner in=new Scanner(System.in);
//		double a=in.nextDouble();
//		double b=in.nextDouble();
//		double c=in.nextDouble();
//		if(a+b<=c||a+c<=b||b+c<=a) {
//			System.out.println("输入不合法");
//			
//		}
//		else {
//			System.out.println(a+b+c);
//		}
		
		
		
		//problem3.21
		
//		int h;
//		int year,month,q;
//		int j,k;
//		Scanner in=new Scanner (System.in);
//		System.out.println("Enter year:");
//			year=in.nextInt();
//			System.out.println("Enter month:");
//			month=in.nextInt();
//			System.out.println("Enter the day of the month:");
//			q=in.nextInt();
//			
//			if(month==1) {
//				month=13;
//				year-=1;
//			}
//			if(month==2){
//				month=14;
//				year-=1;
//			}
//			j=year/100;
//			k=year%100;
//		h=(int)(q+(26*(month+1)/10)+k+k/4+j/4+5*j)%7;
//		switch(h) {
//		case 0:System.out.println("The day of the week is Saturday");break;
//		case 1:System.out.println("The day of the week is Sunday");break;
//		case 2:System.out.println("The day of the week is Monday");break;
//		case 3:System.out.println("The day of the week is Tuesday");break;
//		case 4:System.out.println("The day of the week is Wednesday");break;
//		case 5:System.out.println("The day of the week is thursday");break;
//		case 6:System.out.println("The day of the week is Friday");break;
//		}
		
		
		//problem3.22
//		double x,y;
//		Scanner in =new Scanner (System.in);
//		x=in.nextDouble();
//		y=in.nextDouble();
//		double len=Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
//		if(len<=10)System.out.println(x+","+y+" is in the circle!");
//		else System.out.println(x+","+y+" is not in the circle!");

		
		
		//problem3.24
//		int x=(int)(Math.random()*13+1);
//		int y=(int)(Math.random()*4+1);
//		String s1 ="";
//		String s2="";
//		switch(x) {
//		case 1:s1="Ace";break;
//		case 2:s1="2";break;
//		case 3:s1="3";break;
//		case 4:s1="4";break;
//		case 5:s1="5";break;
//		case 6:s1="6";break;
//		case 7:s1="7";break;
//		case 8:s1="8";break;
//		case 9:s1="9";break;
//		case 10:s1="10";break;
//		case 11:s1="Jack";break;
//		case 12:s1="Queen";break;
//		case 13:s1="King";break;
//		}
//		switch(y) {
//		case 1:s2="Clubs";break;
//		case 2:s2="Diamonds";break;
//		case 3:s2="Hearts";break;
//		case 4:s2="Spades";break;
//		}
//			System.out.println("The card you picked is "+s1+" of "+s2);
		
		
		
		//problem3.27
//		double x,y;
//		Scanner in =new Scanner(System.in);
//		x=in.nextDouble();
//		y=in.nextDouble();
//		double z=-1/2*x+100-y;
//		if(x>=0&&y>=0) {
//			if(z>=0) {
//				
//				System.out.print(x+","+y+" is in the triangle!");
//			}
//			else {
//				System.out.print(x+","+y+" is not in the triangle!");
//		
//			}
//		}
//		else {
//			System.out.print(x+","+y+" is not in the triangle!");
//		}
		
		
		
		//problem 3.29
//		double x,y,a,b,r1,r2;
//		Scanner in=new Scanner(System.in);
//		x=in.nextDouble();
//		y=in.nextDouble();
//		r1=in.nextDouble();
//		a=in.nextDouble();
//		b=in.nextDouble();
//		r2=in.nextDouble();
//		double len=Math.sqrt(Math.pow(x-a, 2)+Math.pow(y-b, 2));
//		if(len>(r1+r2)) System.out.println("两圆无重叠");
//		else if(len==(r1+r2))System.out.println("两圆相切");
//		else if(len<(r1+r2)&&len>=0) {
//			System.out.println("两圆重叠");
//		}
	}

}
