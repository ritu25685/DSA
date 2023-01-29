#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"\nEnter the size of an array";
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        cout<<"\nEnter the element at index "<<i<<" is :";
        cin>>a[i];
    }
    cout<<"\narray are :";
    for(int i=0;i<n;i++){
        cout<<a[i]<<" ";

    }
    int k,index=-1;
    cout<<"\nEnter the value you want to search";
    cin>>k;
    for(int i=0;i<n;i++){
        if(k==a[i]){
            index=i;
            cout<<"element found at index "<<i;
        }
    
        if(index==-1){
            cout<<"Element not found";
        }
    }
}