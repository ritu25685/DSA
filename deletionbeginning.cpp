#include<iostream>
using namespace std;
struct node
{
public:
int data;
node *next;
};
struct node *head=NULL;
void insert(int new_data)
{
struct node *new_node=new node;
new_node->data=new_data;
new_node->next=head;
head=new_node;
}
void display()
{
struct node *ptr;
ptr=head;
while(ptr!=NULL)
{
cout<<ptr->data<<ends;
ptr=ptr->next;
}
}
void delbeg()
{

if(head==NULL)
{
cout<<"Linked list is emptry";
}
else
{
struct node *temp;
temp=head;
cout<<"Deleted element are: "<<head->data;
head=head->next;
delete(temp);
}
}
int main()
{
int n;
cout<<"Enter number of element in linked list: ";
cin>>n;
while(n--)
{
int k;
cout<<"Element to insert in linked list: ";
cin>>k;
insert(k);
}
cout<<"The linked list is: ";
display();
int choice;
cout<<"Enter 1 for delete element from beginning, ";
cin>>choice;
switch(choice)
{
case 1:
delbeg();
break;

default:
cout<<"Wrong input";

}
cout<<"The linked list is: ";
display();
return 0;
}
