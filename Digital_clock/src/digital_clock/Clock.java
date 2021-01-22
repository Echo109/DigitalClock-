/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digital_clock;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author tibip
 */
public class Clock {
    
   private int Hrs;
   private int Min;
   private int Sec;
   
 
  
    public int getHrs() {
        return Hrs;
    }

    public void setHrs(int Hrs) throws Exception{
        
        if(Hrs<0 || Hrs>23)
        {
           throw new InvalidHrException("Hour value entered is not valid");
        }
       
        this.Hrs = Hrs;
      
    }
    
    public int getMin() {
        return Min;
    }

    public void setMin(int Min) throws Exception{
        
        if(Min<0 || Min>59)
        {
           throw new InvalidMinException("Minute value entered is not valid");
        }
        
        this.Min = Min;
    }

    public int getSec() {
        return Sec;
    }

    public void setSec(int Sec) throws Exception {
        
        if(Sec<0 || Sec>59)
        {
           throw new InvalidSecException("Second value entered is not valid");
        }
        this.Sec = Sec;
    }
   
    public Clock() throws Exception{
    
        setHrs(0);
        setMin(0);
        setSec(0);
        
        
    }
    
    public Clock(int Hrs, int Min, int Sec) throws Exception{
        
        setHrs(Hrs);
        setMin(Min);
        setSec(Sec);
    }
    
    
    public void IncrementHour() throws Exception{
        if(getHrs()== 23) 
        { //if hour is 23 then set hour to 0
            setHrs(0);
        }else{
            setHrs(getHrs()+1); //increment hour by 1
        }
    }
    
    
    public void DecrementHour() throws Exception {
        if(getHrs()== 0) 
        {
            throw new InvalidHrException("Hours value is invalid");
        }else{
            setHrs(getHrs()-1);   //Decrement hour by 1
        }
    }
    
    public void IncrementMinutes() throws Exception{
        if(getMin()>= 59) 
        { //if current minute is 59, set minute to 0 and increment hour by 1
            setMin(0);
            IncrementHour();
        }
        else {
            setMin(getMin()+1); //increment hour by 1
        }
    }
    
    public void DecrementMinutes() throws Exception {
        if(getMin() == 0) {
            throw new InvalidMinException("Minutes value is invalid");
        }else {
            setMin(getMin() - 1);   //Decrement minute by 1
        }
    }
   
    public void IncrementSeconds() throws Exception{
        if(getSec() >= 59) 
        {  //if current second is 59, set second to 0 and increment minute by 1
            setSec(0);
            IncrementMinutes();
        }
        else {
            setSec(getSec()+1); //increment second by 1
        }
    }
    
    public void DecrementSeconds() throws Exception {
        if(getSec() == 0) 
        { //If current second is 0 throw exception
            throw new InvalidSecException("Seconds value is invalid");
        }else {
            setSec(getSec() - 1);   //decrement second by 1
        }
    }
   
    public String ConvertTo12Hr() throws Exception{
        String new_date = getHrs()+":"+getMin()+":"+getSec();  //format the clock object to string
        DateFormat date_format = new SimpleDateFormat("HH:mm:ss"); // the HH is 24 hr clock format
        DateFormat Twelve_hr = new SimpleDateFormat("hh:mm:ss aa"); // aa is for AM and PM
        Date date = date_format.parse(new_date);
        
        return Twelve_hr.format(date); //converts 24 hr clock to 12 hr
       
    }


   
    

    
}
