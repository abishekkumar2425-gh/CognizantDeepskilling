import java.util.Scanner;
public class str1{
 public static void main(String args[]){
  String s1="I am practicing Java now";
  int count = 1;
  int n=0;
   while(n<s1.length()){
    if(s1.charAt(n) ==' '){
      count++;}
    n++;
   }
   System.out.println("The number of words in the given string is "+count);}}
      