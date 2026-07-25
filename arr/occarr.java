import java.util.Scanner;
public class occarr{
public static void main(String args[]){
 int arr[]={1,1,2,2,3,3,5,6,7,4,4};
 int len=arr.length;
 int a[]=new int [len];
 for(int i=0;i<len;i++){
   for(int j=0;j<len;j++){
    if(arr[i]==j){
      a[j]=a[j]+1;}

 }}
 for(int i=0;i<len;i++)
  if(a[i]>1){
   System.out.println(i+" = "+a[i]);}
}}