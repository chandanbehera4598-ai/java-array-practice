//  !1️⃣ Insert at Ending

// 👉 {10,20,30} + 5 → {10,20,30,5}
//  void main()
// {
//  int arr[]={10,20,30};
//  int element=Integer.parseInt(IO.readln("Enter element:"));
//  IO.println("Original Array: "+Arrays.toString(arr));
//  int []insertElementLast=InsertFirstPosition.Insert(arr, element);
//  IO.println("After insrt Element: "+Arrays.toString(insertElementLast));
// }

// class InsertFirstPosition
// {

//     public static int[] Insert(int[]array,int element)
//     {
//         int newArray[]=new int[array.length+1];

//         for(int i=0;i<array.length;i++)
//         {
// newArray[i]=array[i];
// }
// newArray[newArray.length-1]=element;
// return newArray;
//     }
// }

import java.sql.Array;

////  !1️⃣ Insert at Starting
/// 
// void main()
// {
//     int []arr={10,20,30};
//     int element=9;
//     int newArray[]=new int[arr.length+1];
//     newArray[0]=element;
//     for(int i=0;i<arr.length;i++)
//     {
// newArray[i+1]=arr[i];

//     }
//     IO.println(Arrays.toString(newArray));
// }

//!
// void main()
// {
//     int arr[]={1,2,3};
//     int element=7;

//     int newArray[]=new int[arr.length+1];
//     for(int i=0;i<arr.length;i++)
//         {
//             newArray[i]=arr[i];
            
//         }
//         newArray[newArray.length-1]=element;
//     IO.println(Arrays.toString(newArray));
// }


//!Inserting ending
// void main()
// {
//     int size=4;
//     int arr[]=new int[size];
//     int element=Integer.parseInt(IO.readln("Enter element:"));
//     for(int i=0;i<size;i++)
//     {
// IO.print("Enter the "+i+"Index");
// arr[i]=Integer.parseInt(IO.readln());

// }

// int newArray[]=new int[arr.length+1];
// for(int j=0;j<size;j++)
//     {
//         newArray[j]=arr[j];
//     }
//     newArray[newArray.length-1]=element;
// IO.println(Arrays.toString(newArray));
// }


//!3 Insert at specific index

// 👉 index = 2, value = 99
// 👉 {10,20,30} → {10,20,99,30}
// void main()
// {
//     int arr[]={10,20,30};
//     int element=90;
//     int position=2;

//     int newArray[]=new int[arr.length+1];
//     for(int i=0,j=0;i<newArray.length;i++)
//     {
//         if(i==position)
//         {
// newArray[i]=element;
//         }else{
//             newArray[i]=arr[j];
//             j++;
//         }

        
//     }
//     IO.println(Arrays.toString(newArray));
// }

//!Middle

// void main()
// {
//     int arr[]={10,20,30,30};

//     int element=90;

//     int middle=arr.length/2;
//     int newArray[]=new int[arr.length+1];
//     for(int i=0;i<middle;i++)
//     {
// newArray[i]=arr[i];
//     }
    
// newArray[middle]=element;

// for(int j=middle;j<arr.length;j++)
// {
// newArray[j+1]=arr[j];

// }
// IO.println(Arrays.toString(newArray));

// }

//! ❓ Q1:

// Given an array of integers, insert an element at a specific index and return the new array.


// void main()
// {
//     int size=Integer.parseInt(IO.readln("Enter size of Array: "));

//     int []arr=new int[size];

//     int element=90;
//     int index=3;

// for(int i=0;i<size;i++)
// {
// IO.println("Enter the "+i+" index Element ");
// arr[i]=Integer.parseInt(IO.readln());
// }

// int newArray[]=new int[arr.length+1];
// for(int j=0,k=0;j<newArray.length;j++)
// {
// if(j==index)
// {
// newArray[k]=element;
// }else{
// newArray[j]=arr[k];
// k++;
// }
// }
// IO.println(Arrays.toString(newArray));

// }


//!❓ Q2:

// Write a Java program to insert an element at the beginning of an array.


// void main()
// {
//     int size=5;
//     int arr[]=new int[size];
// int element=90;
//     for(int i=0;i<size;i++)
//     {
// IO.print("Enter the "+i+" index Element ");
// arr[i]=Integer.parseInt(IO.readln());
//     }

//     int newArray[]=new int[arr.length+1];

//     for(int j=0;j<arr.length;j++)
//     {
// newArray[j]=arr[j];
//     }
//     newArray[newArray.length-1]=element;

//     IO.println(Arrays.toString(newArray));
// }


//!❓ Q3:

// Write a program to insert an element at the end of an array.


// void main()
// {
//     int arr[]={10,20,30,40};
//     int element=5;

//     int newArray[]=new int[arr.length+1];
// newArray[0]=element;
//     for(int i=0;i<arr.length;i++)
//     {
// newArray[i+1]=arr[i];
//     }
//     IO.println(Arrays.toString(newArray));
// }


//!❓ Q4:

// Given a sorted array, insert an element in the correct position so that the array remains sorted.


void main()
{
    int arr[]={10,20,30};
    int element=25;

    int newArray[]=new int[arr.length+1];
    int i=0,j=0;

    boolean inserted=false;
   
    while(i<newArray.length)
{
if(!inserted && (j==arr.length || element<arr[j]))
{
newArray[i]=element;
inserted=true;
}else{
    newArray[i]=arr[j];
    j++;
}
i++;
}
    for(int num : newArray)
    {
IO.println(num+" ");
    }
}    