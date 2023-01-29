#include<iostream>
using namespace std;
struct node{
	int info;
	node *next;
};
static struct node *start=NULL;
static int counter=0;
void insertAtbeginning(){
	int n;
	cout<<"\nEnter the data";
	cin>>n;
	struct node *new_node=new node;
	new_node->info=n;
	new_node->next=start;
	start=new_node;
	counter++;
}
	

void insertAtEnd(){
	int n;
	struct node *temp,*new_node=new node;
	temp=start;
	cout<<"\nEnter the data";
	cin>>n;
	new_node->info=n;
	while(temp->next!=NULL){
		temp=temp->next;
	}
	temp->next=new_node;
	new_node->next=NULL;
	counter++;
}
void insertRan(){
	int n,p;
	struct node *temp,*new_node=new node;
	temp=start;
	cout<<"\nEnter the position";
	cin>>p;
	if(p==1){
		insertAtbeginning();
	}
	else{
		
		cout<<"\nEnter the data";
		cin>>n;
		new_node->info=n;
		for(int i=0;i<p-1;i++){
			temp=temp->next;
		}
		new_node->next=temp->next;
		temp->next=new_node;
	}

}
void display(){
	struct node *ptr;
	ptr=start;
	while(ptr!=NULL){
		cout<<ptr->info<<endl;
		ptr=ptr->next;
	}
}
int main(){
	int n; 
	cout<<"\nEnter the size of linked list";
	cin>>n;
	int x;
while(x!=4){
	cout<<"Enter 1 for insert at beginning,enter 2 for insert at end,enter 3 for insert between the node,enter 4 for display ";
	cin>>x;
	switch(x){
		case 1:
		insertAtbeginning();
		break;
		case 2:
		insertAtEnd();
		break;
		case 3:
		insertRan();
		case 4:
		cout<<"\n the linked list is :";
		display();
		break;
		default:
		cout<<"\ninvalid input";
	}
}
	cout<<"the linked list is :";
	display();

	
}