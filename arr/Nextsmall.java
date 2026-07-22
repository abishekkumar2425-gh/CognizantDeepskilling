import java.util.*;
public class Nextsmall {
public static void Nextsnumber(int arr[], int n) {
   for (int i=0;i<n;i++) {
     int res = -1;
     for (int j=i+1;j<n;j++) {
         if (arr[j]<arr[i]) {
          res=arr[j];
           break;
       }
     }
       System.out.print(res + " ");
   }
 }
public static void main(String args[]) {
     int arr1[]={3,10,9,4,6,11,2,1};
     int le= arr1.length;
     Nextsnumber(arr1, le);
    }
}