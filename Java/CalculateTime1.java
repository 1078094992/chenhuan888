package de.vogella.eclipse.ide.first;
//calculate the time from 1995.5.23 in the past to 2015.3.25
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculateTime1 {
	public static void main(String[] args){
		int year=0;
		int month=0;
		int day=0;
		int k,n;
		int day1=85;
		int day2=0;
		if(year%100==0){
			if(year%400==0){
				n=29;
			}else{
				n=28;
			}
		}else if(year%4==0){
			n=29;
		}else{
			n=28;
		}//determine the leap year
		
		String temp= null;
		System.out.println("please enter the year:");
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			temp=br.readLine();
		    year=Integer.parseInt(temp);
			
			System.out.println("please enter the month:");
			BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
			temp=br1.readLine();
			month=Integer.parseInt(temp);
			
			System.out.println("please enter the day:");
			BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
			temp=br2.readLine();
			day=Integer.parseInt(temp);
			}catch(IOException e){
				e.printStackTrace();
			}//enter the day month and year
		for(k=2014;k>=year;k--){
			if(k%100==0){
				if(k%400==0){
					day1=day1+366;
				}else{
					day1=day1+365;
				}
			}else if(k%4==0){
					day1=day1+366;
			}else {
					day1=day1+365;
			}
		}
		month=month-1;
		switch(month){
		case 0: day2=day2+day;
		break;
		case 1:	day2=day2+day+31;
		break;
		case 2:	day2=day2+day+n+31;
		break;
		case 3:	day2=day2+day+n+62;
		break;
		case 4:	day2=day2+day+n+92;
		break;
		case 5:	day2=day2+day+n+123;
		break;
		case 6:	day2=day2+day+n+153;
		break;
		case 7:	day2=day2+day+n+184;
		break;
		case 8:	day2=day2+day+n+215;
		break;
		case 9:	day2=day2+day+n+245;
		break;
		case 10:day2=day2+day+n+276;
		break;
		case 11:day2=day2+day+n+306;
		
		}
		day1=day1-day2;
	System.out.println("The time is " +day1+" days");
		}
	}


