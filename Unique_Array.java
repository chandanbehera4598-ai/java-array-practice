//!Unique element find
// void main()

// {
//     int arr[]={10,20,30,40};

//     for(int i=0;i<arr.length;i++)
//     {
// boolean isUnique=true;

// for(int j=0;j<arr.length;j++)

//     {
// if(arr[i]==arr[j]&&i!=j)
// {
// isUnique=false;
// break;
// }
//     }

//     if(isUnique)
    
// {
//     IO.println("Unique element is:"+arr[i]);
// }

// }
// }


// void main()
// {
//     int arr[]={1,2,1,2,3};
//     for(int i=0;i<arr.length;i++)
//     {
//         boolean isUnique=true;
// for(int j=0;j<arr.length;j++)
//     {
//         if(arr[i]==arr[j]&&i!=j)
//         {
// isUnique=false;
// break;
//         }
//     }
//     if(isUnique)
//     {
//         IO.println("Unique Element is "+arr[i]);
//     }

//     }
// }

//!
void main()
{
    int arr[]={10,20,10};
    
    for(int i=0;i<arr.length;i++)
    {
    
boolean isUnique=true;
    for(int j=0;j<arr.length;j++)
    {
if(arr[i]==arr[j]&&i!=j)
{
isUnique=false;
break;
}
    }
if(isUnique)
{
IO.println("it is unique value: "+arr[i]);
}
    }
}