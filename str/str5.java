public class str5{
public static void main(String args[]){
 String str="this Man Has A Good Heart";
 int count=0;
 int i=0;
 boolean flag=false;
 while(i<str.length()){
  char c=str.charAt(i);
  if(Character.isUpperCase(c)){
    flag=true;}
  else if(flag && Character.isLowerCase(c)){
    count++;}
  i++;}
  System.out.println(count);
}}