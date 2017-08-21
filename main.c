#include <stdio.h>

int main() {

	int n,i,j,x,T;

	scanf("%d\n",&T);

	for(i=0;i<T;i++)
	{
	    scanf("%d",&n);
	    for(j=0;j<n;j++)
	    {
	        x = j*(j+1);
	        if(x > n)
	            break;
	        printf("%d ",x);
	    }
	    printf("\n");
	}

	return 0;
}
