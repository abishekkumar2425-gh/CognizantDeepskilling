import java.util.Scanner;
import java.util.*;
public class pythstr{
public static double pythogaras(int x,int y){
 double d=Math.sqrt((x*x)+(y*y));
 return d;
 }
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 String str=sc.nextLine();
 int n=Integer.parseInt(str);
 for(int i=0;i<n;i++){
  String input=sc.nextLine();
  String parts[]=input.split(" ");
  int a=Integer.parseInt(parts[0]);
  int b=Integer.parseInt(parts[1]);
  double c=pythogaras(a,b);
  System.out.println(c);
   }
 }
}