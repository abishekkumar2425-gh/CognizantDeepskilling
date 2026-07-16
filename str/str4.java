public class str4{
public static void main(String args[]){
 String str="askzn ; tech : company , pondi";
 char arr[]=str.toCharArray();
 int n=str.length()-1;
 int a=0;
 while(a<n){
   if(Character.isLetter(arr[a]) && Character.isLetter(arr[n])){
     char temp=arr[a];
     arr[a]=arr[n];
     arr[n]=temp;
     a++;
     n--;}
   else if(!Character.isLetter(arr[a])){
    a++;}
   else {
    n--;}

  }
  System.out.print(String.valueOf(arr));
 }
}