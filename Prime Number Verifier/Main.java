// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int n,i;
  scanf("%d",&n);
  if(n==0||n==1)
  {
    printf("neither");
    return 0;
  }
  if(n<0)
  {
    printf("component");
   return 0;
  }  
    for(i=2;i<n;i++)
    {
      int prime=0;
      if(n%i==0)
      {
           printf("composite");
        return 0;
      }}
    
        printf("prime");
 return 0;
  }

