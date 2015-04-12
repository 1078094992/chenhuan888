package date;

import java.util.Calendar;

//自己设计的算法
public class ArithmeticBySelf {
	int year;
	int month;
	int date;
	int[] months= new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		
	//判断是否为闰年
	public int isLeap(int y){
		if((y % 100 == 0) && (y % 400 != 0)){
			months[1] = 28;
			return 365;
		}
		else if(y % 4 == 0){
			months[1] = 29;
			return 366;
		}
		else{
			months[1] = 28;
			return 365;
		}
	}
	
	//计算当前时间与java1.0发布的时间相差多少天
	public int calculate(){
		year = 1995;
		month = 5;
		date = 23;
		Calendar c = Calendar.getInstance();
		int thisy = c.get(Calendar.YEAR);
		int thism = c.get(Calendar.MONTH) + 1;
		int thisd = c.get(Calendar.DATE);
		
		int sum = 0;
		int i;
		
		//年级别的计算
		for(i=thisy-1;i>year;i--){
			sum = sum + isLeap(i);
		}
		
		//月级别的计算
		if(thisy != year){
			for(i=thism+12-1;i>=month;i--){
				
				if(i>12){
					isLeap(thisy);
					sum = sum + months[i-12-1];
				}

				if(i<=12){
					isLeap(year);
					sum = sum + months[i-1];	
				}
			}
		}
		else{
			for(i=thism-1;i>=month;i--){
				isLeap(thisy);
				sum = sum + months[i-1];
			}
		}
		
		//日级别的计算
		sum = sum + thisd - date;
		
		System.out.println(sum + " days");
		return sum;
	}
	
	//计算当前日期与某一天的日期相差多少天
	//形参依次代表所求日期的年，月，日
	public int calculate(int y,int m,int d){
		year = y;
		month = m;
		date = d;
		
		Calendar c = Calendar.getInstance();
		int thisy = c.get(Calendar.YEAR);
		int thism = c.get(Calendar.MONTH) + 1;
		int thisd = c.get(Calendar.DATE);
		
		int sum = 0;
		int i;
		
		//年级别的计算
		for(i=thisy-1;i>year;i--){
			sum = sum + isLeap(i);
		}
		
		//月级别的计算
		if(thisy != year){
			for(i=thism+12-1;i>=month;i--){
				
				if(i>12){
					isLeap(thisy);
					sum = sum + months[i-12-1];
				}

				if(i<=12){
					isLeap(year);
					sum = sum + months[i-1];	
				}
			}
		}
		else{
			for(i=thism-1;i>=month;i--){
				isLeap(thisy);
				sum = sum + months[i-1];
			}
		}
		
		//日级别的计算
		sum = sum + thisd - date;
		
		System.out.println(sum + " days");
		return sum;
	}
	

	
	public static void main(String[] args) {
		ArithmeticBySelf a = new ArithmeticBySelf();
		a.calculate();
		a.calculate(2015,2,21);
		
		ArithmeticByLibrary b = new ArithmeticByLibrary();
		b.calculate();
		b.calculate(2015,2,21);

	}
}

//调用java类库的算法
class ArithmeticByLibrary {
	public long calculate(){
		Calendar now = Calendar.getInstance();

        Calendar date = Calendar.getInstance();
        date.set(1995,5-1,23);
        
        long t1 = date.getTimeInMillis();
        long t2 = now.getTimeInMillis();
        long days = (t2 - t1)/(24 * 60 * 60 * 1000);
        System.out.println(days + " days");
        return days;
	}
	
	//计算当前日期与某一天的日期相差多少天
	//形参依次代表所求日期的年，月，日
	public long calculate(int y,int m,int d){
		Calendar now = Calendar.getInstance();

        Calendar date = Calendar.getInstance();
        date.set(y, m-1, d);
        
        //转换为相对时间
        long t1 = date.getTimeInMillis();
        long t2 = now.getTimeInMillis();
        //计算天数
        long days = (t2 - t1)/(24 * 60 * 60 * 1000);
        System.out.println(days + " days");
        return days;
	}
}
