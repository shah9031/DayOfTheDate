package com.javaminds;


class DayOfTheDate{
	public static String dayOfTheDate(int a, int b, int c){
		int dd=a;
		int mm=b;
		int yyyy=c;
		int d=dd%7, m=0;
		if(mm==1 || mm==10){
			m=0;
		}
		else if(mm==5){
			m=1;
		}
		else if(mm==8){
			m=2;
		}
		else if(mm==2 || mm==3 || mm==11){
			m=3;
		}
		else if(mm==6){
			m=4;
		}
		else if(mm==9 || mm==12){
			m=5;
		}
		else{
			m=6;
		}
		int y11=yyyy/100;
		int count=1;
		for(int i=1;i<y11/2;i++){
			if(4*i<=y11){
				count++;
			}
		}
		int y1=((count*4-1)-y11)*2;
		int y2=0, y22=yyyy%100;
		if(yyyy%400==0 || (yyyy%4==0 && yyyy%100!=0)){
			if(mm==01 || mm==02){
				y2=((y22+(y22/4))%7)-1;
			}
			else{
				y2=(y22+(y22/4))%7;
			}
		}
		else{
			y2=(y22+(y22/4))%7;
		}
		int res=(d+m+y1+y2)%7;
		if(res==0){
			//System.out.println("Sunday");
			return "Sunday";
		}
		else if(res==1){
			//System.out.println("Monday");
			return "Monday";
		}
		else if(res==2){
			//System.out.println("Tuesday");
			return "Tuesday";
		}
		else if(res==3){
			//System.out.println("Wednesday");
			return "Wednesday";
		}
		else if(res==4){
			//System.out.println("Thursday");
			return "Thursday";
		}
		else if(res==5){
			//System.out.println("Friday");
			return "Friday";
		}
		else{
			//System.out.println("Saturday");
			return "Saturday";
		}
	}
}
