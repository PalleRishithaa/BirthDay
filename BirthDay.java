package it.core;

public class BirthDay {
	public int dd;
	public int mm;
	public int yyyy;
	public String day;
	public String month;
	public BirthDay(int date,int month,int year)
	{
		dd=date;
		mm=month;
		yyyy=year;
	}
	public void setDate(int dd)
	{
		this.dd=dd;
	}
	public void setMonth(int mm)
	{
		this.mm=mm;
	}
	public void setYear(int yyyy)
	{
		this.yyyy=yyyy;
	}
	public int getDate()
	{
		return dd;
	}
	public int getMonth()
	{
		return mm;
	}
	public int getYear()
	{
		return yyyy;
	}
	public void calcDay(int yyyy,int mm,int dd)
	{
		int dayNumber;
		dayNumber=(((yyyy-1)*365)+((yyyy-1)/4)-((yyyy-1)/100)+((yyyy-1)/400))%7;
		double leap=0;
		if((yyyy%4)==0)
		{
			if((yyyy%100)==0)
			{
				if((yyyy%400)==0)
				{
					leap=1;
				}
			}
		}
		if(mm==1)
		{
			month="January";
			if((dayNumber+dd)%7==0)
			{
				day="Sunday";
			}
			else if((dayNumber+dd)%7==1)
			{
				day="Monday";
			}
			else if((dayNumber+dd)%7==2)
			{
				day="Tuesday";
			}
			else if((dayNumber+dd)%7==3)
			{
				day="WednesDay";
			}
			else if((dayNumber+dd)%7==4)
			{
				day="Thursday";
			}
			else if((dayNumber+dd)%7==5)
			{
				day="FriDay";
			}
			else if((dayNumber+dd)%7==6)
			{
				day="SaturDay";
			}
		}
		if(mm==2)
		{
			month="February";
			if((dayNumber+dd+31)%7==0)
			{
				day="Sunday";
			}
			else if((dayNumber+dd+31)%7==1)
			{
				day="Monday";
			}
			else if((dayNumber+dd+31)%7==2)
			{
				day="Tuesday";
			}
			else if((dayNumber+dd+31)%7==3)
			{
				day="WednesDay";
			}
			else if((dayNumber+dd+31)%7==4)
			{
				day="Thursday";
			}
			else if((dayNumber+dd+31)%7==5)
			{
				day="FriDay";
			}
			else if((dayNumber+dd+31)%7==6)
			{
				day="SaturDay";
			}
		}
		
		if(mm==3)
		{
			month="March";	
			if((dayNumber+dd+31+28)%7==0)
			{       
				if(leap==1)
				{
					day="Monday";
				}
				day="Sunday";
			}
			else if((dayNumber+dd+31+28)%7==1)
			{
				if(leap==1)
				{
					day="Tuesday";
				}
				day="Monday";
			}
			else if((dayNumber+dd+31+28)%7==2)
			{
				if(leap==1)
				{
					day="WednesDay";
				}
				day="Tuesday";
			}
			else if((dayNumber+dd+31+28)%7==3)
			{
				if(leap==1)
				{
					day="ThursDay";
				}
				day="WednesDay";
			}
			else if((dayNumber+dd+31+28)%7==4)
			{
				if(leap==1)
				{
					day="FriDay";
				}
				day="Thursday";
			}
			else if((dayNumber+dd+31+28)%7==5)
			{
				if(leap==1)
				{
					day="SaturDay";
				}
				day="FriDay";
			}
			else if((dayNumber+dd+31+28)%7==6)
			{
				if(leap==1)
				{
					day="Sunday";
				}
				day="SaturDay";
		 	}
			
		}
		
		
		if(mm==4)
		{
			month="April";
			if((dayNumber+dd+(2*31)+28)%7==0)
			{
				if(leap==1)
				{
					day="Monday";
				}
				day="Sunday";
			}
			else if((dayNumber+dd+(2*31)+28)%7==1)
			{
				if(leap==1)
				{
					day="Tuesday";
				}
				day="Monday";
			}
			else if((dayNumber+dd+(2*31)+28)%7==2)
			{
				if(leap==1)
				{
					day="Wednesday";
				}
				day="Tuesday";
			}
			else if((dayNumber+dd+(2*31)+28)%7==3)
			{
				if(leap==1)
				{
					day="ThursDay";
				}
				day="WednesDay";
			}
			else if((dayNumber+dd+(2*31)+28)%7==4)
			{
				if(leap==1)
				{
					day="Friday";
				}
				day="Thursday";
			}
			else if((dayNumber+dd+(2*31)+28)%7==5)
			{
				if(leap==1)
				{
					day="saturday";
				}
				day="FriDay";
			}
			else if((dayNumber+dd+(2*31)+28)%7==6)
			{
				if(leap==1)
				{
					day="Sunday";
				}
				day= "SaturDay";
			}
		}
		if(mm==5)
		{
			month="May";
			if((dayNumber+dd+(2*31)+30+28)%7==0)
			{
				if(leap==1)
				{
					day= "Monday";
				}
				day= "Sunday";
			}
			else if((dayNumber+dd+(2*31)+30+28)%7==1)
			{
				if(leap==1)
				{
					day= "Tuesday";
				}
				day= "Monday";
			}
			else if((dayNumber+dd+(2*31)+30+28)%7==2)
			{
				if(leap==1)
				{
					day= "Wednesday";
				}
				day= "Tuesday";
			}
			else if((dayNumber+dd+(2*31)+30+28)%7==3)
			{
				if(leap==1)
				{
					day= "Thursday";
				}
				day= "WednesDay";
			}
			else if((dayNumber+dd+(2*31)+30+28)%7==4)
			{
				if(leap==1)
				{
					day= "Friday";
				}
				day= "Thursday";
			}
			else if((dayNumber+dd+(2*31)+30+28)%7==5)
			{
				if(leap==1)
				{
					day= "Saturday";
				}
				day= "FriDay";
			}
			else if((dayNumber+dd+(2*31)+30+28)%7==6)
			{
				if(leap==1)
				{
					day= "Sunday";
				}
				day= "SaturDay";
			}
		}
		if(mm==6)
		{
			month="June";
			if((dayNumber+dd+(3*31)+30+28)%7==0)
			{
				if(leap==1)
				{
					day= "Monday";
				}
				day= "Sunday";
			}
			else if((dayNumber+dd+(3*31)+30+28)%7==1)
			{
				if(leap==1)
				{
					day= "Tuesday";
				}
				day= "Monday";
			}
			else if((dayNumber+dd+(3*31)+30+28)%7==2)
			{
				if(leap==1)
				{
					day= "Wednesday";
				}
				day= "Tuesday";
			}
			else if((dayNumber+dd+(3*31)+30+28)%7==3)
			{
				if(leap==1)
				{
					day= "Thursday";
				}
				day= "WednesDay";
			}
			else if((dayNumber+dd+(3*31)+30+28)%7==4)
			{
				if(leap==1)
				{
					day= "Friday";
				}
				day= "Thursday";
			}
			else if((dayNumber+dd+(3*31)+30+28)%7==5)
			{
				if(leap==1)
				{
					day= "Saturday";
				}
				day= "FriDay";
			}
			else if((dayNumber+dd+(3*31)+30+28)%7==6)
			{
				if(leap==1)
				{
					day= "Sunday";
				}
				day= "SaturDay";
			}
		}
		if(mm==7)
		{
			month="July";
			if((dayNumber+dd+(3*31)+(2*30)+28)%7==0)
			{
				if(leap==1)
				{
					day= "Monday";
				}
				day= "Sunday";
			}
			else if((dayNumber+dd+(3*31)+(2*30)+28)%7==1)
			{
				if(leap==1)
				{
					day= "Tuesday";
				}
				day= "Monday";
			}
			else if((dayNumber+dd+(3*31)+(2*30)+28)%7==2)
			{
				if(leap==1)
				{
					day= "Wednesday";
				}
				day= "Tuesday";
			}
			else if((dayNumber+dd+(3*31)+(2*30)+28)%7==3)
			{
				if(leap==1)
				{
					day= "Thursday";
				}
				day= "WednesDay";
			}
			else if((dayNumber+dd+(3*31)+(2*30)+28)%7==4)
			{
				if(leap==1)
				{
					day= "Friday";
				}
				day= "Thursday";
			}
			else if((dayNumber+dd+(3*31)+(2*30)+28)%7==5)
			{
				if(leap==1)
				{
					day= "Saturday";
				}
				day= "FriDay";
			}
			else if((dayNumber+dd+(3*31)+(2*30)+28)%7==6)
			{
				if(leap==1)
				{
					day= "Sunday";
				}
				day= "SaturDay";
			}
		}
		if(mm==8)
		{
			month="August";
			if((dayNumber+dd+(4*31)+(2*30)+28)%7==0)
			{
				if(leap==1)
				{
					day= "Monday";
				}
				day= "Sunday";
			}
			else if((dayNumber+dd+(4*31)+(2*30)+28)%7==1)
			{
				if(leap==1)
				{
					day= "Tuesday";
				}
				day= "Monday";
			}
			else if((dayNumber+dd+(4*31)+(2*30)+28)%7==2)
			{
				if(leap==1)
				{
					day= "Wednesday";
				}
				day= "Tuesday";
			}
			else if((dayNumber+dd+(4*31)+(2*30)+28)%7==3)
			{
				if(leap==1)
				{
					day= "Thursday";
				}
				day= "WednesDay";
			}
			else if((dayNumber+dd+(4*31)+(2*30)+28)%7==4)
			{
				if(leap==1)
				{
					day= "Friday";
				}
				day= "Thursday";
			}
			else if((dayNumber+dd+(4*31)+(2*30)+28)%7==5)
			{
				if(leap==1)
				{
					day= "Saturday";
				}
				day= "FriDay";
			}
			else if((dayNumber+dd+(4*31)+(2*30)+28)%7==6)
			{
				if(leap==1)
				{
					day= "Sunday";
				}
				day= "SaturDay";
			}
		}
		if(mm==9)
		{
			month="September";
			if((dayNumber+dd+(5*31)+(2*30)+28)%7==0)
			{
				if(leap==1)
				{
					day= "Monday";
				}
				day= "Sunday";
			}
			else if((dayNumber+dd+(5*31)+(2*30)+28)%7==1)
			{
				if(leap==1)
				{
					day= "Tuesday";
				}
				day= "Monday";
			}
			else if((dayNumber+dd+(5*31)+(2*30)+28)%7==2)
			{
				if(leap==1)
				{
					day= "Wednesday";
				}
				day= "Tuesday";
			}
			else if((dayNumber+dd+(5*31)+(2*30)+28)%7==3)
			{
				if(leap==1)
				{
					day= "Thursday";
				}
				day= "WednesDay";
			}
			else if((dayNumber+dd+(5*31)+(2*30)+28)%7==4)
			{
				if(leap==1)
				{
					day= "Friday";
				}
				day= "Thursday";
			}
			else if((dayNumber+dd+(5*31)+(2*30)+28)%7==5)
			{
				if(leap==1)
				{
					day= "Saturday";
				}
				day= "FriDay";
			}
			else if((dayNumber+dd+(5*31)+(2*30)+28)%7==6)
			{
				if(leap==1)
				{
					day= "Sunday";
				}
				day= "SaturDay";
			}
		}
		if(mm==10)
		{
			month="October";
			if((dayNumber+dd+(5*31)+(3*30)+28)%7==0)
			{
				if(leap==1)
				{
					day= "Monday";
				}
				day= "Sunday";
			}
			else if((dayNumber+dd+(5*31)+(3*30)+28)%7==1)
			{
				if(leap==1)
				{
					day= "Tuesday";
				}
				day= "Monday";
			}
			else if((dayNumber+dd+(5*31)+(3*30)+28)%7==2)
			{
				if(leap==1)
				{
					day= "Wednesday";
				}
				day= "Tuesday";
			}
			else if((dayNumber+dd+(5*31)+(3*30)+28)%7==3)
			{
				if(leap==1)
				{
					day= "Thursday";
				}
				day= "WednesDay";
			}
			else if((dayNumber+dd+(5*31)+(3*30)+28)%7==4)
			{
				if(leap==1)
				{
					day= "Friday";
				}
				day= "Thursday";
			}
			else if((dayNumber+dd+(5*31)+(3*30)+28)%7==5)
			{
				if(leap==1)
				{
					day= "Saturday";
				}
				day= "FriDay";
			}
			else if((dayNumber+dd+(5*31)+(3*30)+28)%7==6)
			{
				if(leap==1)
				{
					day= "Sunday";
				}
				day= "SaturDay";
			}
		}
		if(mm==11)
		{
			month="November";
			if((dayNumber+dd+(6*31)+(3*30)+28)%7==0)
			{
				if(leap==1)
				{
					day= "Monday";
				}
				day= "Sunday";
			}
			else if((dayNumber+dd+(6*31)+(3*30)+28)%7==1)
			{
				if(leap==1)
				{
					day= "Tuesday";
				}
				day= "Monday";
			}
			else if((dayNumber+dd+(6*31)+(3*30)+28)%7==2)
			{
				if(leap==1)
				{
					day= "Wednesday";
				}
				day= "Tuesday";
			}
			else if((dayNumber+dd+(6*31)+(3*30)+28)%7==3)
			{
				if(leap==1)
				{
					day= "Thursday";
				}
				day= "WednesDay";
			}
			else if((dayNumber+dd+(6*31)+(3*30)+28)%7==4)
			{
				if(leap==1)
				{
					day= "Friday";
				}
				day= "Thursday";
			}
			else if((dayNumber+dd+(6*31)+(3*30)+28)%7==5)
			{
				if(leap==1)
				{
					day= "Saturday";
				}
				day= "FriDay";
			}
			else if((dayNumber+dd+(6*31)+(3*30)+28)%7==6)
			{
				if(leap==1)
				{
					day= "Sunday";
				}
				day= "SaturDay";
			}
		}
		if(mm==12)
		{
			month="December";
			if((dayNumber+dd+(6*31)+(4*30)+28)%7==0)
			{
				if(leap==1)
				{
					day= "Monday";
				}
				day= "Sunday";
			}
			else if((dayNumber+dd+(6*31)+(4*30)+28)%7==1)
			{
				if(leap==1)
				{
					day= "Tuesday";
				}
				day= "Monday";
			}
			else if((dayNumber+dd+(6*31)+(4*30)+28)%7==2)
			{
				if(leap==1)
				{
					day= "Wednesday";
				}
				day="Tuesday";
			}
			else if((dayNumber+dd+(6*31)+(4*30)+28)%7==3)
			{
				if(leap==1)
				{
					day= "Thursday";
				}
				day= "WednesDay";
			}
			else if((dayNumber+dd+(6*31)+(4*30)+28)%7==4)
			{
				if(leap==1)
				{
					day= "Friday";
				}
				day= "Thursday";
			}
			else if((dayNumber+dd+(6*31)+(4*30)+28)%7==5)
			{
				if(leap==1)
				{
					day= "Saturday";
				}
				day= "FriDay";
			}
			else if((dayNumber+dd+(6*31)+(4*30)+28)%7==6)
			{
				if(leap==1)
				{
					day= "Sunday";
				}
				day= "SaturDay";
			}		
		}
	}

	

	public String toString()
	{
		return day+","+month+" "+dd+","+yyyy;
	}
}
			



