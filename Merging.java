// void main()
// {
//     int []arr1={10,20,30,40,50,60};
//     int []arr2={100,200,300,400,500,600};

//     int []MergeTwo=Merge.MergeTwoElement(arr1,arr2);
//     IO.println(Arrays.toString(MergeTwo));
// }

// class Merge
// {
// public static int [] MergeTwoElement(int []x,int []y)
// {
//     int newArray[]=new int[x.length+y.length];
// int position=0;
// for(int element:x)
// {
// newArray[position]=element;
// position++;
// }

// for(int element:y)
// {
// newArray[position]=element;
// position++;
// }
// return newArray;
// }
// }

//!marge
// void main()
// {
//     int arr1[]={1,2};
//     int arr2[]={4};

//     int newArray[]=new int[arr1.length+arr2.length];

//     for(int i=0;i<arr1.length;i++)
//     {
//         newArray[i]=arr1[i];
//     }

//     for(int j=0;j<arr2.length;j++)
//     {
// newArray[arr1.length+j]=arr2[j];
//     }

//     IO.println(Arrays.toString(newArray));
// }


// !
// void main()
// {
//     int arr[]={1,2};
//     int arr1[]={5,2,2,3};

//     int newArray[]=new int[arr.length+arr1.length];

//     for(int i=0;i<arr.length;i++)
//     {
// newArray[i]=arr[i];
//     }
//     for(int j=0;j<arr1.length;j++)
//     {
// newArray[arr.length+j]=arr1[j];
//     }
//     IO.println(Arrays.toString(newArray));
// }


//!

void main()
{
    int arr1[]={1,2};
    int arr2[]={1,2};

    int []newArray=new int[arr1.length+arr2.length];

    for(int i=0;i<arr1.length;i++)
    {
newArray[i]=arr1[i];

    }
    for(int j=0;j<arr2.length;j++)
    {
newArray[arr1.length+j]=arr2[j];
    }
    // newArray[ne]
    IO.println(Arrays.toString(newArray));
}