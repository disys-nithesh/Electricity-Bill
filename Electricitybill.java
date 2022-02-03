package java_project;

import java.util.Scanner;

class ElectricityBill {
	private int consumerNo;
    private String consumerName;
    private int previousMonthReading;
    private int currentMonthReading;
    private String connectionType;
  
	public String getName() { 
      return consumerName; 
    }
	public void setName(String consumer)
	{
		consumerName = consumer;
	}
  
    public int getNum() { 
      return consumerNo; 
    }
	public void setNum(int consumerNum)
	{
		consumerNo = consumerNum;
	}
  
    public int getCurrentReading() { 
      return currentMonthReading; 
    }
	public void setCurrentReading(int currentReading)
	{
		currentMonthReading = currentReading;
	}
    
    public int getPreviousReading() { 
      return previousMonthReading; 
    }
	public void setPreviousReading(int previousReading)
	{
		previousMonthReading = previousReading;
	}
  
    public String getType() { 
      return connectionType; 
    }
	public void setType(String connection)
	{
		connectionType = connection;
	}
  
    public int getBill(){
      int units=currentMonthReading-previousMonthReading;
      double bill=0;
      if(connectionType == "domestic"){
        if(units<=100){bill=units*1;}
        else if(units>100 && units<=200){bill=units*2.50;}
        else if(units>200 && units<=500){bill=units*4;}
        else if(units>500){bill=units*6;}
      }
      else if(connectionType == "commercial"){
        if(units<=100){bill=units*2;}
        else if(units>100 && units<=200){bill=units*4.50;}
        else if(units>200 && units<=500){bill=units*6;}
        else if(units>500){bill=units*7;}
      }
      return (int)bill;
    }
}

class bill {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter consumerName : ");
		String name = sc.nextLine();
		
		System.out.println("Enter consumerNumber : ");
		int id = sc.nextInt();
		
		System.out.println("Enter Current_month_reading : ");
		int currentReading = sc.nextInt();
		
		System.out.println("Enter Previous_month_reading : ");
		int previousReading = sc.nextInt();
		sc.close();
		
		System.out.println();
		System.out.println("......Bill_Generated.....");
		ElectricityBill obj = new ElectricityBill();
		obj.setName(name);
		System.out.println("Consumer_name: " + obj.getName());
      
        obj.setNum(id);
		System.out.println("Consumer_id: " + obj.getNum());
      
        obj.setCurrentReading(currentReading);
		System.out.println("Current_month_reading: " + obj.getCurrentReading());
      
        obj.setPreviousReading(previousReading);
		System.out.println("Previous_month_reading: " + obj.getPreviousReading());
	
        obj.setType("commercial");
		System.out.println("Connection_type: " + obj.getType());
      
        System.out.println("Electricity-Bill: " + obj.getBill());
    }
}




