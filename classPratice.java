//Reverse

// void  main()
// {
//     int arr[]={1,2,3};
//     for(int i=arr.length-1;i>=0;i--)
//     {
// IO.print(arr[i]);
//     }
// }


//!Sum
// void main()
// {
// int arr[]={1,2,3};
// int sum=0;
// for(int i=0;i<arr.length;i++)
// {
// sum=sum+arr[i];
// }
// IO.println(sum);
// }

//!Avg
// void main()
// {

//     int marks[]={10,20,30};
//     int sum=0;
    
//     for(int i=0;i<marks.length;i++)
//         {
//             sum=sum+marks[i];
//         }

//         double rev=sum/marks.length-1;
//     IO.println(rev);
// }


//!Min

// void main()
// {
//     int arr[]={1,2,3};
//     int min=arr[0];
//     for(int i=0;i<arr.length;i++)
//     {
// if(min>arr[i])
// {
// min=arr[i];
// }
//     }
//     IO.println(min);
// }
// void main()
// {
//     int arr[]={1,2,3};
//     int max=arr[0];
//     for(int i=0;i<arr.length;i++)
//     {
// if(max<arr[i])
// {
// max=arr[i];
// }
//     }
//     IO.println(max);
// }

//!Sorting 
// void main()
// {
//     int arr[]={1,2,5,4};
//     int temp=0;
//     for(int i=0;i<arr.length;i++)
//     {
// for(int j=0;j<arr.length;j++)
// {
//     if(arr[i]<arr[j])
//     {

//         temp=arr[i];
//         arr[i]=arr[j];
//         arr[j]=temp;
//     }
// }
//     }
//     IO.println("Array sorting in Ascending order : "+Arrays.toString(arr));
// }


//!Duplicate 

// void main()
// {
//     int arr[]={1,2,3,4,1};
//     for(int i=0;i<arr.length;i++)
//     {
//         for(int j=i+1;j<arr.length;j++)
//         {
// if(arr[i]==arr[j])
// {
// IO.println(arr[j]);
// break;
// }
//         }
//     }
// }

//!Modify

// void main()
// {
//     int arr[]={10,20,30};
//     arr[0]=100;
//     IO.println(Arrays.toString(arr));
// }


//

//!target
// void main()
// {
//     int arr[]={1,2,3,4,5};
//     int target=6;
//     boolean isFound=false;

//     for(int i=0;i<arr.length;i++)
//     {
//         if(arr[i]==target)
//             {
//     int index=i;
//     IO.println(target+" found at "+index+" index ");
//     isFound=true;
//     break;

// }
//     }
//     if(!isFound)
//     {
// IO.println(target+" not available ");
//     }
// }

//!Remove duplicate
// void main()
// {
//     int arr[]={1,2,3,2,4,1};
//     for(int i=0;i<arr.length;i++)
//     {
//         for(int j=i+1;j<arr.length;j++)
//         {
// if(arr[i]==arr[j])
// {
//     arr[j]=-1;

// }
//         }
//     }
    
//     for(int element:arr)
//     {
// if(element!=-1)
// {
// IO.println(element);
// }
//     }
// }

// //!insert end

// import java.sql.Array;

// void main()
// {
//     int arr[]={1,2,3};
//     int element=4;

//     int newArray[]=new int[arr.length+1];

//     for(int i=0;i<arr.length;i++)
//     {
// newArray[i]=arr[i];
//     }

//     newArray[newArray.length-1]=element;

//     IO.println(Arrays.toString(newArray));
// }


//!inserting st
// import java.lang.reflect.Array;

// void main()
// {
// int arr[]={1,2};
// int element=3;

// int newArray[]=new int[arr.length+1];
// newArray[0]=element;
// for(int i=0;i<arr.length;i++)
// {
// newArray[i+1]=arr[i];
// }
// IO.println(Arrays.toString(newArray));

// }


//!mid

// void main()
// {
//     int arr[]={1,3};
//     int element=2;

//     int newArray[]=new int [arr.length+1];

//     int middle=arr.length/2;

//     for(int i=0;i<middle;i++)
//     {
// newArray[i]=arr[i];

//     }

//     newArray[middle]=element;

//     for(int j=middle;j<arr.length;j++)
// {
//     newArray[j+1]=arr[j];
//     }
//     IO.println(Arrays.toString(newArray));

// }

//!merge

// void main()
// {
//     int arr1[]={1,2};
//     int arr2[]={3,4};


//     int newArray[]=new int [arr1.length+arr2.length];
// int position=0;
//     for(int element : arr1)
//     {
// newArray[position]=element;
// position++;
//     }

//     for(int element : arr2)
//     {
//         newArray[position]=element;
//         position++;

//     }
//     IO.println(Arrays.toString(newArray));

// }

//!

// void main()
// {
//     int arr[]={1,2,2};
//     for(int i=0;i<arr.length;i++)
//         {
//         boolean isFound=true;
//         for(int j=0;j<arr.length;j++)
//         {
// if(arr[i]==arr[j]&& i!=j)
// {isFound=false;
//     break;

// }
//         }
// if(isFound)
// {
//     IO.println(arr[i]);
// }

//     }
// }

//Second largest
// void main()

// {
//     int arr[]={10,20,30};
// int temp=0;
//     for(int i=0;i<arr.length;i++)
//     {
//         for(int j=i+1;j<arr.length;j++)
//         {
//             if(arr[i]<arr[j])
//             {
// temp=arr[i];
// arr[i]=arr[j];
// arr[j]=temp;
//             }

//         }
//     }
//     // IO.println(Arrays.toString(arr));
//     IO.println(arr[1]);
// }

// void main()
// {
//     int arr[]={1,2,3};
//     int  target=2;
//     boolean isFound=false;
//     for(int i=0;i<arr.length;i++)
//     {
//         int index=i;
//         if(arr[i]==target)
//         {
// IO.println(target+" found at "+index+" index ");

// isFound=true;
// break;
//         }

//     }
//     if(!isFound)
//     {
// IO.println("not available"+target);
//     }
// }

// void main()
// {
//     int arr[]={1,2,3,2};
//     for(int i=0;i<arr.length;i++)
//     {
//         for(int j=i+1;j<arr.length;j++)
//         {
// if(arr[i]==arr[j])
// {
// IO.println(arr[j]);
// }
//         }
//     }
// }

// void main()
// {
//     int []arr={1,2,2};

//     for(int i=0;i<arr.length;i++)
//     {
//         for(int j=i+1;j<arr.length;j++)
//         {
//             if(arr[i]==arr[j])
//             {
//                 arr[j]=-1;
//             }
//         }
//     }
    
// //     for(int element : arr)
// //     {
// // if(element!=-1)
// // {
// // IO.println(element);
// // }
// //     }

// for(int k=0;k<arr.length;k++)
// {
// if(arr[k]!=  -1)
// {
// IO.print(arr[k]+" ");
// }
// }

// }

// void main()
// {
//     int arr[]={1,2};

//     int element=2;

//     int newArray[]=new int[arr.length+1];

// for(int i=0;i<arr.length;i++)
// {
// newArray[i]=arr[i];
// }
// newArray[newArray.length-1]=element;
// IO.println(Arrays.toString(newArray));


// }

// void main()
// {
//     int arr[]={1,2};
//     int element=1;

//     int newArray[]=new int[arr.length+1];
//     newArray[0]=element;

//     for(int i=0;i<arr.length;i++)
//     {
// newArray[i+1]=arr[i];
//     }
//     IO.println(Arrays.toString(newArray));
// }

// void main()
// {
//     int arr[]={1,1,4,2,5,3};

//     int temp=0;
//     for(int i=0;i<arr.length;i++)
//     {
// for(int j=i+1;j<arr.length;j++)
// {
// if(arr[i]<arr[j])
// {
//     temp=arr[i];
//     arr[i]=arr[j];
//     arr[j]=temp;

// }
// }
// IO.println(arr[i]);
//     }
// }

// import java.lang.reflect.Array;

// void main()
// {
//     int arr[]={1,3};
//     int element=2;
// int newArray[]=new int[arr.length+1];
//     int mid=arr.length/2;

//     for(int i=0;i<mid;i++)
//     {
// newArray[i]=arr[i];
//     }
//     newArray[mid]=element;

//     for(int i=mid;i<arr.length;i++)
//     {
// newArray[i+1]=arr[i];
//     }
//     IO.println(Arrays.toString(newArray));
// }


// void main()
// {
//     int arr[]={1,2};
//     int arr1[]={3};

//     int newArray[]=new int[arr.length+arr1.length];

// int postion=0;
//     for(int element : arr)
//     {
//        newArray[postion]=element;
//        postion++;
    
//     }

//     for(int element:arr1)
//     {
// newArray[postion]=element;
// postion++;
//     }
// IO.println(Arrays.toString(newArray));

// }


// void main()
// {
//     int arr[]={1,2,1};

// for(int i=0;i<arr.length;i++)
// {
// boolean isFound=true;

// for(int j=0;j<arr.length;j++)
// {
// if(arr[i]==arr[j]&&i!=j)
// {
// isFound=false;
// break;
// }
// }

// if(isFound)
// {
// IO.println(arr[i]);
// }
// }
// }


// void main()
// {
//     int arr[]={1,2,3};

//     int temp=0;
// for(int i=0;i<arr.length;i++)
// {
//     for(int j=i+1;j<arr.length;j++)
//     {
// if(arr[i]<arr[j])
// {
// temp=arr[i];
// arr[i]=arr[j];
// arr[j]=temp;
// }

// }
// }
// IO.println(arr[1]);
// }

//!

// void main()

// {
//     int arr[]={3,1,2,3};
// IO.println(isSorted(arr));
// }

// public static boolean isSorted(int []arr)
// {
//     for(int i=0;i<arr.length-1;i++)
//     {
// if(arr[i]>arr[i+1])
// {
// return false;
// }
//     }
//     return true;
// }

//!

// void main()
// {
//     int arr[]={1,2};

//     int temp=arr[0];

//     for(int i=0;i<arr.length-1;i++)
//     {
// arr[i]=arr[i+1];
//     }
//     arr[arr.length-1]=temp;

//     IO.println(Arrays.toString(arr));
// }


//!

// import java.lang.reflect.Array;

// void main()
// {
//     int arr[]={0,1};

//     int temp=0;
//     for(int i=0;i<arr.length;i++)
//     {
// if(arr[i]==0)
// {
// for(int j=i+1;j<arr.length;j++)
// {
// if(arr[j]!=0)
// {
// temp=arr[i];
// arr[i]=arr[j];
// arr[j]=temp;
// break;

// }
// }
// }
//     }
//     IO.println(Arrays.toString(arr));
    
// }

//!

// void main()
// {
//     int arr[]={1,2,3};
//     int sum=5;
//     for(int i=0;i<arr.length;i++)
//     {
// for(int j=i+1;j<arr.length;j++)
// {
//     if(arr[i]+arr[j]==sum)
//     {
// IO.println(sum+" found at "+i+","+j+" index");
//     }

// }
//     }
// }

//!
// void main()
// {
//     int arr[]={10,20,20,30,40,30};

// int temp=0;
// for(int i=0;i<arr.length;i++)
// {

// for(int j=i+1;j<arr.length;j++)
// {
//     temp=arr[i];
//     arr[i]=arr[j];
//     arr[j]=temp;
// }

// }


// int largest=arr[arr.length-1];
// int SecondLargest=-1;

// for(int i=arr.length-2;i>=0;i--)
// {
//     if(arr[i]!=largest)
//     {

//         SecondLargest=arr[i];
//         break;
//     }
// }
// IO.println((SecondLargest));
// }

//!

// void main()
// {
//     int arr[]={1,1,0,1,1,1};

//     int count=0;
//     int maxConsecutive=0;

//     for(int i=0;i<arr.length;i++)
//     {
// if(arr[i]==1)
// {
// count++;
// if(count>maxConsecutive)
// {
// maxConsecutive=count;
// }
// }
// else
// {
//     count=0;
// }
//     }
//     IO.println(count);
// }

// void main()
// {
//     int arr[]={1,2,2,3};

//     int temp=0;
    
//     for(int i=0;i<arr.length;i++)
//     {
//         for(int j=i+1;j<arr.length;j++)
//         {
//             if(arr[i]<arr[j])
//             {

//             }
// temp=arr[i];
// arr[i]=arr[j];
// arr[j]=temp;
//         }
//     }

//     int largest=arr[arr.length-1];
//     int SecondLargest=-1;
//     for(int i=arr.length-2;i>=0;i++)
//     {
// if(arr[i]!=SecondLargest)
// {
// SecondLargest=arr[i];
// break;
// }
//     }
//     IO.println(SecondLargest);
// }


// void main()
// {
//     int arr[]={1,2,3};
//     int target=3;

//     for(int i=0;i<arr.length;i++)
//     {
// for(int j=i+1;j<arr.length;j++)
// {
// if(arr[i]+arr[j]==target)
// {
// IO.println(target+" Found at "+i+","+j+" index");
// }
// }
//     }

// }

// void main()
// {
//     int arr[]={1,2,3};

//    IO.println(isSorted(arr));
// }

// public static boolean isSorted(int []arr)
// {
//     for(int i=0;i<arr.length-1;i++)
//     {
// if(arr[i]>arr[i+1])
// {
// return false;
// }
//     }return true;
// }

void main()
{
    int arr[]={1,2,3};

    int temp=arr[arr.length-1];
    for(int i=0;i<arr.length-1;i++)
    {
arr[i]=arr[i];
    }

    arr[0]=temp;
    IO.println(Arrays.toString(arr));
}

// void main()
// {
//     int arr[]={0,1};

//     int temp=0;
// for(int i=0;i<arr.length;i++)
// {
// if(arr[i]==0)
// {
// for(int j=i+1;j<arr.length;j++)
// {
//     if(arr[j]!=0)
//     {
// temp=arr[i];
// arr[i]=arr[j];
// arr[j]=temp;
// break;
//     }

// }
// }
// }
// IO.println(Arrays.toString(arr));
// }


// void main()
// {
//     int arr[]={1,0,1,1};

//     int count=0;
//     int count2=0;

//     for(int i=0;i<arr.length;i++)
//     {
// if(arr[i]==1)
// {
// count++;
// if(count>count2)
// {
// count2=count;
// }
// }else{
//     count=0;
// }

//     }
//     IO.println(count2);
// }

// void main()
// {
//     int arr[]={1,2,3};

//     for(int i=0;i<arr.length;i++)
//     {
// for(int j=i;j<arr.length;j++)
// {
// for(int k=i;k<=j;k++)
// {
// IO.print(arr[k]);
// }
// IO.println();
// }
//     }
// }


// void main()
// {
//     int arr[]={1,1,0,1,1,1};

//     int count1=0;
//     int count2=0;

//     for(int i=0;i<arr.length;i++)
//     {
// if(arr[i]==1)
// {
// count1++;
// if(count1>count2)
// {
// count2=count1;
// }
// }else{
// count1=0;
// }
//     }
//     IO.println(count2);
// }



// void main()
// {
//     int arr[]={0,2,0,1};

//     int temp=0;
//     for(int i=0;i<arr.length;i++)
//     {
//         if(arr[i]==0)
//         {
//             for(int j=i+1;j<arr.length;j++)
//             {
//                 if(arr[j]!=0)
//                 {

//                     temp=arr[i];
//                     arr[i]=arr[j];
//                     arr[j]=temp;
//                     break;
//                 }
//             }

//         }

//     }
//     IO.println(Arrays.toString(arr));


// }

// void main()
// {
//     int size=3;
//     int arr[]=new int[size];
// for(int i=0;i<size;i++)
// {
// IO.println("Enter the "+i+" index element ");
// arr[i]=Integer.parseInt(IO.readln());
// }
// int temp=arr[0];
// for(int j=0;j<arr.length-1;j++)
// {
// arr[j]=arr[j+1];
// }
// arr[arr.length-1]=temp;
// IO.println(Arrays.toString(arr));
// }

// void main()
// {
//     int arr[]={1,2,3};
//     IO.println(isSorted(arr));
// }

// public static boolean isSorted(int arr[])
// {

//     for(int i=0;i<arr.length-1;i++)
//         {
//             if(arr[i]>arr[i+1])
//                 {
//                     return false;
//                 }
//             }
//             return true;
//  }


// void main()
// {
//     int size=Integer.parseInt(IO.readln("Enter size"));

//     int arr[]=new int[size];

//     for(int i=0;i<arr.length;i++)
//     {
// IO.println("enter the "+i+"Index value ");
// arr[i]=Integer.parseInt(IO.readln());
//     }

//     for(int i=0;i<arr.length;i++)
//     {
//         for(int j=i;j<arr.length;j++)
//         {
//             for(int k=i;k<=j;k++)
//             {
// IO.print(arr[k]);
//             }
//             IO.println();
//         }
//     }
// }

// void main()
// {
//     int arr[]={1,2,1,3,2,3,4};

//     int temp=0;

//     for(int i=0;i<arr.length;i++)
//     {
//         for(int j=i+1;j<arr.length;j++)
//         {
// temp=arr[i];
// arr[i]=arr[j];
// arr[j]=temp;
//         }
//     }

// int largest=arr[arr.length-1];
// int secondlargest=-1;

// for(int i=arr.length-2;i>=0;i--)
// {
// if(arr[i]!=largest)
// {
// secondlargest=arr[i];
// break;
// }
// }
// IO.println(secondlargest);
// }