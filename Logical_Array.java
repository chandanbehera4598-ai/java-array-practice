//!sum

// void main()
// {
//     int arr[]={1,2,3,4};
// int sum=0;
//     for(int i=0;i<arr.length;i++)
//     {
// sum=sum+arr[i];
//     }
//     IO.println(sum);
// }

//!Avg 


// void main()
// {

//     int arr[]={1,2,3,4,7};
//     int sum=0;
//     int avg=0;
//     for(int i=0;i<arr.length;i++)
//     {
// sum=sum+arr[i];
// avg=sum/arr.length-1;
//     }
//     IO.println(avg);

// }

//!maximum number find 

// void main()
// {
//  int arr[]={1,2,3,4};

//  int max=0;

//  for(int i=0;i<arr.length;i++)
//  {
//     for(int j=0;j<arr.length;j++)
//     {
// if(max<arr[j])
// {
// max=arr[j];
// }
//     }
//  }
//  IO.println(max);
// }

//!minimum number find 

void main()
{
    int arr[]={1,2,3,4};
    int min=arr[0];
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr.length;j++)
        {
if(min>arr[j])
{
min=arr[j];
}
        }
    }
    IO.println(min);
}