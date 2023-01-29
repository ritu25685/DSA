#include<iostream>
using namespace std;
struct node{
    public:
    int data;
    node *link;
};
static struct node *start=NULL;
static int counter=0;
void insertatbeg(){
    struct node *new_node= new node;
    int n;
    cout<<"\nEnter data";
    cin>>n;
    new_node->data=n;
    new_node->link=start;
    start=new_node;
    counter++;
}
void insertatEnd(){
    int n;
    struct node *temp , *new_node=new node;
    temp=start;
    cout<<"\nEnter data";
    cin>>n;
    new_node->data=n;
    while(temp->link!=NULL){
        temp=temp->link;
    }
    temp->link=new_node->link;
    new_node->link=NULL;
    counter++;
}
void insertRan(){
    int n,p;
    cout<<"\nEnter position";
    cin>>p;
    if(p==1){
        insertatbeg();
    }
    else if(p==counter+1){
        insertatEnd();
    }
    else{
        struct node *temp,*new_node=new node;
        temp=start;
        int n;
        cout<<"\nEnter data";
        cin>>n;
        new_node->data=n;
        for(int i=0;i<p-1;i++){
            temp=temp->link;
        }
        new_node->link=temp->link;
        temp->link=new_node;
    }
}
void display(){
    struct node *ptr;
    ptr=start;
    while(ptr!=NULL){
        cout<<ptr->data<<endl;
        ptr=ptr->link;
    }
}
int main(){
    int n;
    cout<<"\nEnter the size of linked list";
    cin>>n;
    int x;
    while(x!=5){
        cout<<"\nEnter 1 for inserting at beginning,Enter 2 for inserting at end,Enter 3 for inserting at between the node,Enter 4 for display and 5 for exit :";
        cin>>x;
        switch(x){
            case 1:
            insertatbeg();
            case 2:
            insertatEnd();
            case 3:
            insertRan();
            case 4:
            cout<<"\nThe linked list :";
            display();

        }
    }
}