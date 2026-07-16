public class str3{
public static void main(String args[]){
 String str="laptop 100;mobile 21;tv 123";
 String items[]=str.split(";");
 int minvalue=Integer.MAX_VALUE;
 String minitem="";
 for(int i=0;i<items.length;i++){
   {
    String parts[]=items[i].split(" ");
    int value=Integer.parseInt(parts[1]);
    
    if(value<minvalue){
     minvalue=value;
     minitem=parts[0];
     }
    }
  }
  
  System.out.println(minitem);}}