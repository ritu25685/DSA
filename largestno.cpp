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
int largestElement(struct node *start){
	int max;
	while(start!=NULL){
		if(max<start->info){
			max=start->info;
			start=start->link;
		}
		return max;
	}
}
static int counter=0;
int Evennumber(struct node *start){
	int m;
	while(start!=NULL){
		m=start->info;
		if(m%2==0){
			start=start->link;
			
		}
		else{
			break;
		}
		counter++;
		return counter;
	}
	
}



int main(){
	int n,info;
	cout<<"enter the size of linked list :";
	cin>>n;
	while(n--){
	
	int k;
	cout<<"enter the element of linked list";
	cin>>k;
	insert(k);
}
	cout<<"linked list is :";
	traverse();
	cout<<"maximum element in linked list :";
	cout<<largestElement(start)<<endl;
	cout<<"number of even number are :";
	cout<<Evennumber(start);	
	

}

