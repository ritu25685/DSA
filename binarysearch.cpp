#include<iostream>
using namespace std;
int main(){
    int n,num;
    cout<<"\nEnter the size of array";
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
    cout<<"\nEnter the element at index "<<i<<" is :";
    cin>>a[i];
    }
    cout<<"\nArray are :";
    for(int i=0;i<n;i++){
        cout<<a[i]<<" ";
    }
    
    cout<<"\nEnter the value yu want to search";
    cin>>num; int l=0,h=0;
    h=n-1;
    int mid;
    while(l<=h){

    mid=(l+h)/2;
        if(num==a[mid]){
            cout<<"\nElement found ";
            break;
        }
        else if(num<a[mid]){
            h=mid-1;
        }
        else if(num>a[mid]){
            l=mid+1;
        }
        else{
            cout<<"wrong index value";
        }
    }
}