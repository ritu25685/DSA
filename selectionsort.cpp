#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"enter the size of the array";
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        cout<<"enter the value of element at index "<<i<<" is :";
        cin>>a[i];
    }
    cout<<"Array are :";
    for(int i=0;i<n;i++){
        cout<<a[i]<<" ";
    }
    
    for(int i=0;i<n;i++){
        int min=a[i],t;
        for(int j=i+1;j<n;j++){
            if(min>a[j]){
                min=a[j];
                t=j;
            }
            else if(min<a[j]){
                a[t]=a[i];
                a[i]=min;

            }
            cout<<"New Array are :";
            for(int i=0;i<n;i++){
                cout<<a[i]<<" ";
            }
        }
    }
}