public class str6{
public static void main(String args[]){
 String str="chennaicity";
 int n=str.length();
 char arr[]=str.toCharArray();
 String str1="even";
 int pos,res;
 if(str1.equals("even")){
   pos=0;
   res=n-1;
    }
 else{
   pos=1;
   res=n-2;
    }
 //int i=pos;
 while(pos<res){
   char temp=arr[pos];
   arr[pos]=arr[res];
   arr[res]=temp;
   pos=pos+2;
   res=res-2;
   }
 System.out.println(new String(arr));
}
}