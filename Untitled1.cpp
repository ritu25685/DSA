#include<iostream>
using namespace std;
int main(){
	int n;
	int info,root,item;
	int *l,*r;
	int * ptr=&root;
	cout<<"enter the size of array";
	cin>>n;
	int a[n];
	for(int i=0;i<n;i++){
		cout<<"enter the value of array element at index "<<i<<" is :";
		cin>>a[i];
	}
	cout<<"array elements are";
	for(int i=0;i<n;i++){
		cout<<a[i];
	}


}
