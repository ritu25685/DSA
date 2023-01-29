#include<iostream>
using namespace std;
struct node{
	public:
		int info;
		node *link;
};
struct node *start;
void insert(int item){
	struct node *new_node=new node;
	new_node->info=item;
	new_node->link=start;
	start=new_node;
}
void traverse(){
	struct node *ptr;
	ptr=start;
	while(ptr!=NULL){
		cout<<ptr->info<<endl;
		ptr=ptr->link;
	}
}
int main(){
	int n;
	cout<<"Enter the number of item in a list ";
	cin>>n;
	while(n--){
	   int k;
   	   cout<<"enter the item you want to insert ";
   	   cin>>k;
   	   insert(k);
	}
	cout<<"linked list is :";
	traverse();
}
