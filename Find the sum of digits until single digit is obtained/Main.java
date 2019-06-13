#include<stdio.h>
int sumofdigits(int n);
int sumofdigits(int n)
{
  int sum=0,r;
  while(n!=0)
  {
    r=n%10;
    sum=sum+r;
    n=n/10;
  }
  return sum;
}
    int main()
    {
		int num;
      scanf("%d",&num);
      int sod=num;
      while(sod>=10)
      {
			sod=sumofdigits(sod);
      }
      printf("%d",sod);
    }

    
       