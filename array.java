// public class array {

    // public static void main(String[] args) {
        // “An array is a container that stores multiple values of the same type in one
        // place.”

        // !1️⃣ Print all elements of an array

        // 👉 Input: {10, 20, 30}
        // 👉 Output: 10 20 30
        // 💡 Hint: Use for loop

        // int arr[] = { 10, 20, 30 };
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

// cd "C:\Users\chand\OneDrive\Desktop\Git_Hub_Project\Array_pratice\java-array-practice"

// javac array.java
// java array

// !2️⃣ Find sum of array elements

// 👉 Input: {1, 2, 3, 4}
// 👉 Output: 10
// 💡 Hint: Use a variable sum
        
// int arr[]={1,2,3,4};
// int sum=0;
// for(int i=0;i<arr.length;i++)
// {
// sum=sum+arr[i];

// }
// IO.println();


//! 3️⃣ Find maximum element

// 👉 Input: {5, 9, 2, 15}
// 👉 Output: 15
// 💡 Hint: Compare each element

// int arr[]={5,9,2,15};
// int max=arr[0];
// for(int i=0;i<arr.length;i++)
// {
// if(max<arr[i])
// {
// max=arr[i];
// }
// }
// IO.println(max);
// }

//     }





// void main()
// {
//     int []arr={10,20,30,40,50};
//     for(int arrs:arr)
//     {
// IO.println(arrs);
//     }
// }

// void main()
// {
//     int []arr={10,20};
//     int sum=0;

//     for(int i=0;i<arr.length;i++)
//     {
// sum=sum+arr[i];
//     }
//     IO.println(sum);
// }

// void main()
// {
//     int []arr={10,20,30};
// int max=arr[0];
//     for(int i=0;i<arr.length;i++)
//     {
// if(arr[i]>max)
// {
// max=arr[i];
// }
//     }
//     IO.println(max);

// }

// void main()
// {
//     int []arr={10,20,30};

//     for(int i=arr.length-1;i>=0;i--)
//     {
// IO.println(arr[i]);
//     }
// }


// void main()
// {
//     int arr[]={10,20,30};
//     int key=30;
//     for(int i=0;i<arr.length;i++)
//     {
// if(arr[i]==key)
// {
// IO.println("Found");
// }
//     }
// }


// void main()
// {
//     int size=Integer.parseInt(IO.readln("Enter the size of the array"));

//     int []arr=new int[size];

//     for(int i=0;i<size;i++)
//     {
// IO.print("Enter the "+i+" index Element :");
// arr[i]=Integer.parseInt(IO.readln());
//     }


//     IO.println("Original Array Element:");
//     IO.println(Arrays.toString(arr));

//     IO.println("Printing Array in reverse order");

//     for(int i=arr.length-1;i>=0;i--)
//     {
// IO.println(arr[i]);
//     }
// }

// void main()
// {

// int size=Integer.parseInt(IO.readln("Enter the size of Array: "));
//     int []arr=new int[size];

//     for(int i=0;i<size;i++)
//     {
//         IO.println("Enter the "+i+" index Element: ");
// arr[i]=Integer.parseInt(IO.readln());
//     }

//     IO.println("Original Array is:");
//     IO.println(Arrays.toString(arr));
// }

// void main()
// {
//     int size=Integer.parseInt(IO.readln("Enter size of Array: "));
//     int arr[]=new int[size];

//     for(int i=0;i<size;i++)
//     {
// IO.print("Enter the "+i+"index Element: ");
// arr[i]=Integer.parseInt(IO.readln());
//     }

//     IO.println("Original Array is:");
//     IO.println(Arrays.toString(arr));


//     for(int i=arr.length-1;i>=0;i--)
// {
//     IO.println("After reverse");
// IO.println(arr[i]);
// }
// }

// import Array_03.FindSum;

// void main()
// {
//  int size=Integer.parseInt(IO.readln("Enter The Size of the Array: "));
//  int []arr=new int[size];
 
//  for(int i=0;i<arr.length;i++)
//  {
// IO.println("Enter the element at "+i+" index: ");
// arr[i]=Integer.parseInt(IO.readln());



// }
// int sumOfElement=FindSum.getSumOfAllElement(arr);
// IO.println("Sum of all the elements: "+sumOfElement);
// }

// class FindSum
// {
//     public static int getSumOfAllElement(int []arr)
//     {
//         int sum=0;
//         for(int element:arr)
//         {
// sum=sum+element;
//         }
//         return sum;
//     }
// }

// void main()
// {
//     int size=3;
//     int []arr=new int[size];

//     for(int i=0;i<arr.length;i++)
//     {
// IO.print("Enter the "+i+"index Element: ");
// arr[i]=Integer.parseInt(IO.readln());

// int sumOfElement=FindSum.getSumOfAllElement(arr);
// IO.println(sumOfElement);
//     }
// }
// class FindSum{

//     public static int getSumOfAllElement(int []arr)
//     {

//         int sum=0;
//         for(int element:arr)
//             {
//                 sum=sum+element;
//             }
//             return sum;
//         }
// }

// void main()
// {
//     int size=Integer.parseInt(IO.readln());
//     int arr[]=new int[size];

//     for(int i=0;i<arr.length;i++)
//     {
// IO.print("Enter The "+i+" index Element :");
// arr[i]=Integer.parseInt(IO.readln());

//     }

//     int sum=0;
//     for(int i=0;i<arr.length;i++)
//     {
// sum=sum+arr[i];
//     }
//     IO.println("Sum of the elements: "+sum);
// }


// public static void main(String[] args) {
//     {
//         int []arr=new int[3];
// for(int i=0;i<arr.length;i++)
// {
//     IO.print("Enter The "+(i+1)+" sub marks ");
// arr[i]=Integer.parseInt(IO.readln());
// }

// int sum=0;
// for(int i=0;i<arr.length;i++)
// {
//     sum=sum+arr[i];
    
// }
// IO.println("total marks is "+sum);

// double avg=sum/3;
// IO.println("Avg is"+avg);
//     }
// }

// void main()
// {
//     int []arr1={12,9,10,10};

//     Findmin.getMin(arr1);


// }
// class Findmin
// {
//     public static void getMin(int []arr)
//     {
// int min=arr[0];
// for(int element:arr)
// {
// if(element<min)
// {
// min=element;
// }
// }
//  IO.println("The min element in the array is:"+min);
//    }
// }

// import java.net.IDN;

// void main()
// {
//     int arr1[]={10,2,1};

//     Findmax.getMax(arr1);
    
    
// }

// class Findmax
// {
//     public static void getMax(int []arr)
//     {

//         int max=arr[0];

//         for(int element:arr)
//         {
// if(element>max)
// {
// max=element;
// }
//         }
//         IO.println("max value is: "+max);
//     }
// }

// void main()
// {
// int size=Integer.parseInt(IO.readln("Enter size of the array: "));
// int arr[]=new int[size];

// for(int i=0;i<size;i++)
// {
//     IO.print("Enter The "+i+" index ");
//      arr[i]=Integer.parseInt(IO.readln());

//     }


//     IO.print(Arrays.toString(arr));

// }

// void main()
// {
//     int arr[]={70,80,90,10,20,20,30};

//     IO.println("Original Array is: "+Arrays.toString(arr));

//     int temp=0;
//     for(int i=0;i<arr.length;i++)
//     {
//         for(int j=0;j<arr.length;j++)
//         {
//             if(arr[i]>arr[j])
//             {

//                 temp=arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=temp;
//             }
//         }
//     }
//     IO.println("After sorting is Ascending order: "+Arrays.toString(arr));

// }


// void main()
// {
//     int size=Integer.parseInt(IO.readln("Enter the number of size:"));
//     int value[]=new int[size];
    
//     for(int i=0;i<size;i++)
//         {
//             IO.print("Enter the "+i+" index Element:");
//             value[i]=Integer.parseInt(IO.readln());
//         }
        
//         IO.println("Original Array :"+Arrays.toString(value));
//         for(int i=0;i<value.length;i++)
//             {
//                 IO.println(value[i]);
//             }
//             IO.println("Original Array :"+Arrays.toString(value));
// }

// import java.util.Scanner;

// void main()
// {

//     Scanner sc=new Scanner(System.in);

//     System.out.println("Size Enter");
//     int size=sc.nextInt();

//     int value[]=new int[size];

//     for(int i=0;i<size;i++)
//     {
// System.out.println("Enter the "+i+" index Element:");
// value[i]=sc.nextInt();
//     }

//     for(int i=0;i<value.length;i++)
//     {
// System.out.print(value[i]+" ");
//     }

// }

//!1
//?Find Sum

// sum of the array element
// void main()
// {
// int size=2;
// int []arr=new int[size];

//     for(int i=0;i<arr.length;i++)
//     {
// IO.print("Enter the "+i+" index is: ");
// arr[i]=Integer.parseInt(IO.readln());

// }
// int sumOfElement=FindSum.getSumOfAllElement(arr);
// IO.println("Sum of the element is "+sumOfElement);
// }

// class FindSum{
//     public static int getSumOfAllElement(int[] args) {
//         int sum=0;
//         for(int element:args)
//     {
// sum=sum+element;

//     }
//     return sum;
// }
// }

//!
// void main()
// {
//     int arr[]={10,20,30};
// int sum=FindSum.getSumOfAllElement(arr);
// IO.println("sum of the array:"+sum);
// }

// class FindSum

// {
//     public static int getSumOfAllElement(int[] args) {
        
//         int sum=0;
//         for(int element:args)
//         {
//             sum=sum+element;
//         }
//         return sum;
//     }
// }


//!2
//?Find Avg

// void main()
// {
//     int noOfSub=Integer.parseInt(IO.readln("Enter Number of subject:"));
// int arr[]=new int[noOfSub];

// for(int i=0;i<arr.length;i++)
// {
// IO.print("Enter the sub"+(i+1)+" marks:");
// arr[i]=Integer.parseInt(IO.readln());


// }

// int total=0;
// for(int score:arr)
// {
// total=total+score;
// }
// IO.println("Total marks is:"+total);
// double avg=total/noOfSub;
// IO.println("Average is:"+avg);

// }

//!3
//?FInd Sum
// void main()
// {
//     int size=3;
//     int max[]=new int[size];

//     for(int i=0;i<max.length;i++)
//     {
// IO.print("Enter the "+i+" value:");
// max[i]=Integer.parseInt(IO.readln());

//     }
//     int maximumValue=Findmax.getMax(max);
//     IO.println("maximum value is:"+maximumValue);
// }

// class Findmax
// {
//     public static int getMax(int[] maximum) {
        
//         int max=0;

//         for(int element:maximum)
//         {
// if(element>max)
// {
// max=element;
// }
//         }
//         return max;
//     }
// }


//!4
//?Array sorting

// void main()
// {
//     int []arr={20,10,80,12,30,10};
//     IO.println("Original Array is:"+Arrays.toString(arr));

//     int temp=0;
//     for(int i=0;i<arr.length;i++)
//     {
// for(int j=i+1;j<arr.length;j++)
// {
// if(arr[i]>arr[j])
// {
// temp=arr[i];
// arr[i]=arr[j];
// arr[j]=temp;
// }
// }
//     }
//     IO.println("After Sorting in Ascending order: "+Arrays.toString(arr));
// }

//!5
//?Modify Array

// void main()
// {
//     int values[]={10,20,30,40,50};
//     IO.println("Original Array: "+Arrays.toString(values));

//     int []modifyArray=Modify.modifyElement(values);
//     IO.println("Array elsements after modification"+Arrays.toString(modifyArray));

//     IO.println("After Modification");
//     IO.println("Original Array: "+Arrays.toString(values));

// }


// class Modify
// {
// public static int[] modifyElement(int []arr)
// {
//     arr[0]=100;
//     arr[1]=200;
//     return arr;
// }
// }

//!5

//?Check Existing value

// void main()
// {
//     int arr[]={2,3,4,5};
//     int target=Integer.parseInt(IO.readln("Enter Target ELement:"));
//     boolean isFound=false;

//     for(int i=0;i<arr.length-1;i++)
//     {
// if(arr[i]==target)
// {
// int index=i;
// IO.println(target+"found at "+" index "+index);
// isFound=true;
// break;
// }

//     }

//     if(!isFound)
//     {
// IO.println("NOt Found");
//     }
// }


//!6
//?Find the Largest Element
// void main()
// {
//     int []arr={10,20,30,40};

//     int largest=arr[0];
//     for(int i=1;i<arr.length;i++)
//     {
// if(arr[i]>largest)
// {
// largest=arr[i];
// }
// }
// IO.println("LArgest Element: "+largest);
// }

//!7
//?Find Duplicate Element
// void main()
// {
//     int []arr={10,10,2,4,3,2};

//     for(int i=0;i<arr.length;i++)
//     {
       
//         for(int j=i+1;j<arr.length;j++)
//         {
// if(arr[i]==arr[j])
// {
// IO.println("Duplicate Array: "+arr[j]);
// break;
// }
//         }
//     }
// }


//!8

// void main()
// {
//     int []arr={2,3,9,2,7,3,2};
//     IO.println("Original Array is: "+Arrays.toString(arr));

//     for(int i=0;i<arr.length;i++)
        
//         {
// for(int j=i+1;j<arr.length;j++)
// {
// if(arr[i]==arr[j])
// {
// arr[j]=-2;
// }
// }
//         }

//         for(int element:arr)
//         {
// if(element !=-2)
// {
// IO.print(element+" ");
// }
//         }
// }



//!9
//?Inserting Element last position

// void main()
// {
//     int arr[]={10,20,30,40};

//     IO.println("Original Array "+Arrays.toString(arr));

//     int element=Integer.parseInt(IO.readln("Enter element"));

//     int []insertElementLast=InsertingElement.Insert(arr, element);
//     IO.println("Array ELement After inserting "+element);
//     IO.println(Arrays.toString(insertElementLast));
// }


// class InsertingElement{

//     public static int[] Insert(int[]array,int element)
//     {
// int newarray[]=new int[array.length+1];

// for(int i=0;i<array.length;i++)
// {
// newarray[i]=array[i];

// }
// newarray[newarray.length-1]=element;
// return newarray;
//     }
// }


//!10
//?Inserting Element past position

// import java.util.Arrays;

// class Main {
//     public static void main(String[] args) {
//         int values[] = {10, 20, 30};

//         System.out.println("Original Array: " + Arrays.toString(values));

//         int position = 0; // insert at index 1
//         int element = 99;

//         int[] result = InsertingElement.insert(values, position, element);

//         System.out.println("After Insertion: " + Arrays.toString(result));
//     }
// }

// class InsertingElement {
//     public static int[] insert(int[] arr, int position, int element) {
        
//         int[] newArray = new int[arr.length + 1];

//         for (int i = 0, j = 0; i < newArray.length; i++) {
//             if (i == position) {
//                 newArray[i] = element;
//             } else {
//                 newArray[i] = arr[j++];
//             }
//         }

//         return newArray;
//     }
// }


//

void main()
{
    int middle[]={10,20,30,40};
    IO.println("Original Array: "+Arrays.toString(middle));
    int element=Integer.parseInt(IO.readln("Enter element: "));

    int []insertElementMiddle=InsertingElement.Insert(middle,element);
    IO.println("After inserting : "+Arrays.toString(insertElementMiddle));
    
}
class InsertingElement

{
    public static int[] Insert(int[] arr,int  element) {
    
        int []newArray=new int[arr.length+1];
        int middle=arr.length/2;

        for(int i=0;i<middle;i++)
        {
newArray[i]=arr[i];
        }
        newArray[middle]=element;

        for(int i=middle;i<arr.length;i++)
        {
newArray[i+1]=arr[i];

        }
return newArray;
}
}