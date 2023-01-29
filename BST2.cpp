#include<iostream>
using namespace std;
struct node{
	int data;
	struct node *leftchild;
	struct node *rightchild;
};
struct node *root=NULL;
void insert(int data){
	struct node *tempnode=new node();
	struct node *current;
	struct node *parent;
	tempnode->data=data;
	tempnode->leftchild=NULL;
	tempnode->rightchild=NULL;
	
	if(root==NULL){
		root=tempnode;
	}
	else{
		current=root;
		parent=NULL;
		
		while(1){
			parent=current;
			if(data<parent->data){
				current=current->leftchild;
				if(current==NULL){
					parent->leftchild=tempnode;
					return;
				}
			}
				else{
					current=current->rightchild;
					if(current==NULL){
						parent->rightchild=tempnode;
						return;
					}
				}
			}
		}
	}


void pre_order(struct node* root){
	if(root!=NULL){
	
	cout<<root->data<<" ";
	pre_order(root->leftchild);
	pre_order(root->rightchild);
}
}
void inorder(struct node* root){
	if(root!=NULL){
	
	inorder(root->leftchild);
	cout<<root->data<<" ";
	inorder(root->rightchild);
}
}
void post_order(struct node* root){
	if(root!=NULL){
	post_order(root->leftchild);
	post_order(root->rightchild);
	cout<<root->data<<" ";
}
}
int main(){
	int i;
	int arr[5]={10,12,45,32,20};
	for(int i;i<5;i++){
		insert(arr[i]);
	}
	cout<<"preorder traversal";
	pre_order(root);
	cout<<endl;
	cout<<"inorder traversal\n";
	inorder(root);
	cout<<endl;
	cout<<"postorder traversal\n";
	post_order(root);
	cout<<endl;
	
}
