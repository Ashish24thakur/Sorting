import java.util.Scanner;

public class Selection_Sort {

    public static void Sel_Sort(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
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
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Sel_Sort(arr);
        Print(arr);
    }
}

// In C++.................................


// #include <iostream>
// using namespace std;
// void Sel_Sort(int arr[],int n)
// {
//      for(int i=0;i<n;i++)
//      {
//          for(int j=i+1;j<n;j++)
//          {
//              if(arr[i]>arr[j])
//              {
//                 int temp = arr[j];
//                 arr[j] = arr[i];
//                 arr[i] = temp;
//              }
//          }
//      }
// }
// void Print(int arr[],int n)
// {
//     for(int i=0;i<n;i++)
//     {
//         cout<<arr[i]<<" ";
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
//     Sel_Sort(arr,n);
//     Print(arr,n);
//
//     return 0;
// }
//
// // In C...........................
//
//
// #include <stdio.h>
// void Sel_Sort(int arr[],int n)
// {
//      for(int i=0;i<n;i++)
//      {
//          for(int j=i+1;j<n;j++)
//          {
//              if(arr[i]>arr[j])
//              {
//                 int temp = arr[j];
//                 arr[j] = arr[i];
//                 arr[i] = temp;
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
//     Sel_Sort(arr,n);
//     Print(arr,n);
//
//     return 0;
// }
