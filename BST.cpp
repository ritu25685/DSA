#iptr=ptr->leftChild;
}
else//goto right tree
{
ptr=ptr->rightChild;
}
}
if(ptr==NULL)
{nclude <iostream>

using namespace std;

struct node {
   int data;
   struct node *leftChild;
   struct node *rightChild;
};

struct node *root = NULL;

void insert(int data) {
   struct node *tempNode = new node();
   struct node *current;
   struct node *parent;

   tempNode->data = data;
   tempNode->leftChild = NULL;
   tempNode->rightChild = NULL;

   //if tree is empty
   if(root == NULL) {
      root = tempNode;
   } else {
      current = root;
      parent = NULL;

      while(1) {
         parent = current;
         
         //go to left of the tree
         if(data < parent->data) {
            current = current->leftChild;                
           
            //insert to the left
            if(current == NULL) {
               parent->leftChild = tempNode;
               return;
            }
         }  //go to right of the tree
         else {
            current = current->rightChild;

            //insert to the right
            if(current == NULL) {
               parent->rightChild = tempNode;
               return;
            }
         }
      }            
   }
}


void pre_order_traversal(struct node* root) {
   if(root != NULL) {
      cout<<root->data<<" ";
      pre_order_traversal(root->leftChild);
      pre_order_traversal(root->rightChild);
   }
}

void inorder_traversal(struct node* root) {
   if(root != NULL) {
      inorder_traversal(root->leftChild);
      cout<<root->data<<" ";          
      inorder_traversal(root->rightChild);
   }
}

void post_order_traversal(struct node* root) {
   if(root != NULL) {
      post_order_traversal(root->leftChild);
      post_order_traversal(root->rightChild);
      cout<< root->data<<" ";
   }
}

struct node *search(int data)
{
struct node *ptr=root;
cout<<"\n\nVisiting elements";

while(ptr->data!=data)
{
if(ptr!=NULL)
{
//goto left tree
if(data<ptr->data)
{

return NULL;
}
}
return ptr;

}
int main() {
   int i;
   int array[7] = { 27, 14, 35, 10, 19, 31, 42 };

   for(i = 0; i < 7; i++)
      insert(array[i]);

   cout<<"\nPreorder traversal: ";
   pre_order_traversal(root);

  cout<<"\nInorder traversal: ";
   inorder_traversal(root);

   cout<<"\nPost order traversal: ";
   post_order_traversal(root);  
   
   struct node *temp;
   temp=search(10);  
   if(temp==NULL)
   {
   cout<<"\nData not found in the tree";
}  
else
{
cout<<"\nData found in tree %d",temp->data;
}

   return 0;
}
