import java.util.Scanner;

public class Insertion_Sort {

    public static void Insert_Sort(int arr[])
    {
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int pos = i-1;
            while (pos>=0 && val<arr[pos])
            {
                arr[pos+1] = arr[pos];
                pos = pos-1;
            }
            arr[pos+1] = val;
        }
    }
public static void Print(int arr[])
{
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Insert_Sort(arr);
        Print(arr);
    }
}

//  In C.........................


 #include <stdio.h>
 void Sel_Sort(int arr[],int n)
 {
      for(int i=0;i<n;i++)
      {
           int val = arr[i];
           int pos = i-1;
           while(pos>=0 && val<arr[pos])
           {
               arr[pos+1] = arr[pos];
               pos = pos-1;
           }
           arr[pos+1] = val;
      }
 }
 void Print(int arr[],int n)
 {
     for(int i=0;i<n;i++)
     {
         printf("%d ",arr[i]);
     }
 }
 int main()
 {
     int n;
     scanf("%d",&n);
     int arr[n];
     for (int i = 0; i < n; i++) {
         scanf("%d",&arr[i]);
     }
     Sel_Sort(arr,n);
     Print(arr,n);

     return 0;
 }

 // In C++.........................


 #include <iostream>
 using namespace std;
 void Sel_Sort(int arr[],int n)
 {
      for(int i=0;i<n;i++)
      {
           int val = arr[i];
           int pos = i-1;
           while(pos>=0 && val<arr[pos])
           {
               arr[pos+1] = arr[pos];
               pos = pos-1;
           }
           arr[pos+1] = val;
      }
 }
 void Print(int arr[],int n)
 {
     for(int i=0;i<n;i++)
     {
         cout<<arr[i] << " ";
     }
 }
 int main()
 {
     int n;
     cin>>n;
     int arr[n];
     for (int i = 0; i < n; i++) {
         cin>>arr[i];
     }
     Sel_Sort(arr,n);
     Print(arr,n);

     return 0;
 }