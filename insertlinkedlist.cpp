#include<iostream>
using namespace std;
struct node{
	public:
		int data;
		node *next;
};
static struct node *head=NULL;
static int counter=0;
void insertAtbeginning(){
	int n;
	cout<<"enter data";
	cin>>n;
	struct node *new_node=new node;
	new_node->data=n;
	new_node->next=head;
	head=new_node;
	counter++;
}
void insertAtEnd(){
	int n;
	struct node *temp,*new_node=new node;
	temp=head;
	cout<<"enter data";
	cin>>n;
	new_node->data=n;
	while(temp->next!=NULL){
		temp=temp->next;
	}
	temp->next=new_node;
	new_node->next=NULL;
	counter++;
}
void insertran()
{
	int n,p;
	struct node *temp,*new_node=new node;
	temp=head;
	cout<<"enter position";
	cin>>p;
	if(p>counter)
	{
		cout<<"nvalid position"<<endl;
	}
	else if(p==1){
		insertAtbeginning();
	}
	else if(p==counter+1){
		insertAtEnd();
	}
	else{
		int n;
		cout<<"enter data";
		cin>>n;
		new_node->data=n;
		for(int i=0;i<p-1;i++){
			temp=temp->next;
		}
		new_node->next=temp->next;
		temp->next=new_node;
		counter++;
	}
	cout<<endl;
}
void display(){
	struct node *ptr;
	ptr=head;
	while(ptr!=NULL){
		cout<<ptr->data<<" ";
		ptr=ptr->next;
	}
}
	int main()
   {
		int k;
		cout<<"enter the size of number of nodes : ";
		cin>>k;
		int x;
		while(x!=5){
			cout<<"enter 1 for insert at begginning,2 for insert at the end,3 for insert at a position and 5 fro exit:";
			cin>>x;
			switch(x){
				case 1:
					insertAtbeginning();
					break;
					case 2:
						insertAtEnd();
						break;
						case 3:
							insertran();
							break;
							case 4:
								cout<<"the linked list is :";
								display();
								break;
								default:
									cout<<"invalid input";
						
			}
		}
		
      cout<<"the linked list is :";
	  display();		

		
	}

