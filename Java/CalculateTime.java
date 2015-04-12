package de.vogella.eclipse.ide.first;
//Calculate the time from 1995.5.23 to 2015.5.23
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculateTime {
	public static void main(String[] args){
		int year=0;
		int month=0;
		int day=0;
		int k,n;
		int day1=139;
		String temp= null;
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
			n=28;}//determine the leap year
		
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
		
		
		year=year-1;
		for( k=year;k>=1995;k--){
			if(year%100==0){
				if(year%400==0){
					day2=day2+366;
				}else{
					day2=day2+365;
				}
			}else if(year%4==0){
					day2=day2+366;
			}else{
					day2=day2+365;
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
		day2=day2-day1;
	System.out.println("the time is " +day2+" days");
		}

	}
