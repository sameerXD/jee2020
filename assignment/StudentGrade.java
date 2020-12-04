package assignment;    
import java.util.Map;  
    import java.util.HashMap;  
    import java.util.TreeMap;  
    import java.util.Iterator;  
    public class StudentGrade  
    {  
    public static void main(String args[])  
    {  
    //implementation of HashMap  
    HashMap<String, String> hm=new HashMap<String, String>();  
    //addding keys and values to HashMap  
    hm.put("sameer", "1");  
    hm.put("akash", "2");  
    hm.put("nalim", "3");  
    hm.put("tokash", "4");  
    Iterator <String> it = hm.keySet().iterator();         
    System.out.println("Before Sorting");  
    while(it.hasNext())  
    {  
    	String key=it.next();  
    System.out.println("Roll no:  "+key+"     name:   "+hm.get(key));  
    }  
    System.out.println("\n");  
//    Map<Integer, String> map=new HashMap<Integer, String>();  
    System.out.println("After Sorting");  
    //using TreeMap constructor to sort the HashMap  
    TreeMap<String,String> tm=new  TreeMap<String,String> (hm);  
    Iterator itr=tm.keySet().iterator();               
    while(itr.hasNext())    
    {    
    	String key=(String)itr.next();  
    System.out.println("Roll no:  "+key+"     name:   "+hm.get(key));  
    }    
    }  
    }  