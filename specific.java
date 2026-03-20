void main()
{
    int []arr={10,20,30,40};
    int element=90;
    int position=3;

    int newarray[]=new int[arr.length+1];

        for(int i=0,j=0;i<newarray.length;i++)
        {
if(i==position)
{
newarray[j]=element;

}else
{
    newarray[i]=arr[j];
    j++;
}
        }
    IO.print(Arrays.toString(newarray));
}