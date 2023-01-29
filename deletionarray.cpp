#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"enter the size of an array";
    cin>>n;
    int a[n-1];
    for(int i=0;i<n;i++){
    cout<<"enter the element at index "<<i<<" is :";
    cin>>a[i];
    }
    cout<<"Array element are :";
    for(int i=0;i<n;i++){
        cout<<a[i]<<" ";
    }
    int j=n-1;cout<<"Enter the index value from which you delete";
    cin>>j;
    a[j]=a[j+1];
    cout<<"new array are :";
    for(int i=0;i<n-1;i++){
        cout<<a[i]<<" ";
        cout<<endl;
    }
    

    }
