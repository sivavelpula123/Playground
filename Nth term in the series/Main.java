#include<stdio.h>

int main()
{
    int n,i;
  scanf("%d",&n);
  if(n%2==1)
  {
		 i=(n+1)/2-1;
        int res=2*i;
    printf("%d",res);
}else
  {
    i=n/2-1;
    printf("%d",i);
 }return 0;
}