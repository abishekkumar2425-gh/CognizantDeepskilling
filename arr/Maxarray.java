import java.util.*;
public class Maxarray{

public static void MaxOfArray(int arr[], int n){
 int max=arr[0];
 int index=0;
 int i=1;
 while(i<n){
  if(arr[i]>max){
    max=arr[i];
    index=i;
    }
   i++;   
  }
  System.out.println(max);
  System.out.println(index);   
}
public static void main(String args[]){
 int arr1[]={20,10,70,6,5,99,77,3,104};
 int le=arr1.length;
 MaxOfArray(arr1,le);
}
}