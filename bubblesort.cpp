#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"enter the size of the array";
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
    cout<<"enter the value of element at index"<<i<<" is :";
    cin>>a[i];
    }
    cout<<"Array are :";
    for(int i=0;i<n;i++){
        cout<<a[i];
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n-1;j++){
            if(a[j]>a[j+1]){
                int t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
            }
        }
        cout<<"array after bubble sort are :";
        for(int i=0;i<n;i++){
            cout<<a[i]<<" ";
        }
    }

}