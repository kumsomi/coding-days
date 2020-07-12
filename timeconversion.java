import java.util.*;
public class HelloWorld{
    
    public static String time(String s)
    {
        String newtime=" ";
        String[] str=s.split(":");
        int hr=Integer.parseInt(str[0]);
        String min=str[1];
        String sp=str[2];
        String ss=str[2].substring(0,sp.length()-2);
        String p=str[2].substring(sp.length()-2,sp.length());
        if(0<=hr && hr<12 && p.equalsIgnoreCase("AM"))
            newtime=String.format("%02d",hr)+":"+min+":"+ss;
        
        else if(0<=hr && hr<12 && p.equalsIgnoreCase("PM"))
            newtime=(hr+12)+":"+min+":"+ss;
        
        else if(hr==12 && p.equalsIgnoreCase("AM"))
            newtime="00"+":"+min+":"+ss;
        
        else if(hr==12 && p.equalsIgnoreCase("PM"))
            newtime=hr+":"+min+":"+ss;
        
        return newtime;
    }
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter time:");
        String str=s.nextLine(); 
        String result=time(str);
        System.out.println("result:"+result);
        
    }
}
