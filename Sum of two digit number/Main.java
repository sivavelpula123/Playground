#include<stdio.h>
int main()
{
  int n,r,a;
  scanf("%d",&n);
     r=n/10;
      n=n%10;
  a=r+n;
  
  printf("%d",a);
  return 0;
}