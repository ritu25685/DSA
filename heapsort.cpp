#include<iostream>
using namespace std;
maxheapfy(A,n,i)
{
    int largest=i;
    int l=2*i;
    int r=2*i+1;
    while(l<=n && a[l]>a[largest])
    {
        largest=l;
        }
        while(r<=n && a[r]>a[largest])
    {
        largest=r;
        }
        if(largest!=i)
        {
            swap (a[largest],a[i])
            
            heapify(A.,n,largest);
            }
            
          heapsort(A,n)
          {
              for (i=n/2 ;i>=1;i--)
              {
                  maxheapify(A,n,i);
                  }
            for(i=n;i>=1;i--)
            {
                swap(A[1],a[i]);
                maxheapify(A,n,i)
                }
