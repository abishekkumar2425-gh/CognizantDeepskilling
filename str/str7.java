import java.util.Scanner;
public class str7{
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter a string:");
 String str=sc.nextLine();
 System.out.print("Enter a character:");
 char ch=sc.next().charAt(0);
 int fi=str.indexOf(ch);
 int la=str.lastIndexOf(ch);
 int count=0;
 if(fi==-1||fi==la){
  System.out.println(0);
  return ;}
 boolean visit[]=new boolean[26];
 for(int i=fi+1;i<la;i++){
  char cha1=str.charAt(i);
  if(cha1==' '||cha1==ch) continue;
  int index=cha1-'a';
  if(!visit[index]){
   visit[index]=true;
   count++;
   }
  }
  System.out.println("Count "+count);
 }
}