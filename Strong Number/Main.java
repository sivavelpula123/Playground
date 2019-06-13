#include <stdio.h>
int main() {
	int n,i,f=1,r,sum=0;
     scanf("%d",&n);
  int temp=n;
  while(n!=0)
  {int f=1;
        r=n%10;
   n=n/10;
    for(i=1;i<=r;i++)
    {
      f=f*i;
    }
    sum=sum+f;
    
  }n=temp;
  if(sum==n)
  {
    printf("Yes");
  }else
  {
    printf("No");
  }
	return 0;
}