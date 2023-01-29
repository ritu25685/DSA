#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"enter te size of array";
    cin>>n;
    int a[n+1];
    for(int i=0;i<n;i++){
        cout<<"enter the value of element at index "<<i<<" is :";
        cin>>a[i];
    }
    cout<<"values of element of an array are :";
    for(int i=0;i<n;i++){
        cout<<a[i]<<" ";

    }
    int k;
    cout<<"Enter the index value where you want to insert";
    cin>>k;
    for(int i=n;i>k;i--){
    a[i+1]=a[i];
    }
    cout<<"enter the value";
    cin>>a[k];
    cout<<"new array are:";
   
    for(int i=0;i<n;i++){
        cout<<a[i];
    }
}
