#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"enter the size of array";
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        cout<<"enter the value f element at index"<<i<<" is :";
        cin>>a[i];
    }
    cout<<"Array are :";
    for(int i=0;i<n;i++){
        cout<<a[i]<<" ";
    }
    int temp;
    for(int i=0;i<n;i++){
        for(int j=i;j>0;j--){
            if(a[j]<a[j-1]){
                temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
            }
        }
    }
    cout<<"\nArray after sorting ";
    for(int i=0;i<n;i++){
        cout<<a[i]<<" ";
    }


}