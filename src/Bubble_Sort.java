import java.util.Scanner;
public class Bubble_Sort {
    public static void Sort(int arr[])
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
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
        Sort(arr);
        Print(arr);
    }
}

// In C ...............................


// #include <stdio.h>
//
// void Sort(int arr[],int n)
// {
//      for(int i=0;i<n-1;i++)
//      {
//          for(int j=0;j<n-i-1;j++)
//          {
//              if(arr[j]>arr[j+1])
//              {
//                 int temp = arr[j+1];
//                 arr[j+1] = arr[j];
//                 arr[j] = temp;
//              }
//          }
//      }
// }
// void Print(int arr[],int n)
// {
//     for(int i=0;i<n;i++)
//     {
//         printf("%d ",arr[i]);
//     }
// }
// int main()
// {
//     int n;
//     scanf("%d",&n);
//     int arr[n];
//     for (int i = 0; i < n; i++) {
//         scanf("%d",&arr[i]);
//     }
//     Sort(arr,n);
//     Print(arr,n);
//
//     return 0;
// }
//
// // In C++..............................
//
//
// #include <iostream>
// using namespace std;
// void Sort(int arr[],int n)
// {
//      for(int i=0;i<n-1;i++)
//      {
//          for(int j=0;j<n-i-1;j++)
//          {
//              if(arr[j]>arr[j+1])
//              {
//                 int temp = arr[j+1];
//                 arr[j+1] = arr[j];
//                 arr[j] = temp;
//              }
//          }
//      }
// }
// void Print(int arr[],int n)
// {
//     for(int i=0;i<n;i++)
//     {
//         printf("%d ",arr[i]);
//     }
// }
// int main()
// {
//     int n;
//     cin>>n;
//     int arr[n];
//     for (int i = 0; i < n; i++) {
//         cin>>arr[i];
//     }
//     Sort(arr,n);
//     Print(arr,n);
//
//     return 0;
// }