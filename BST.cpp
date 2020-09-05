#include <iostream>
#include <queue>
using namespace std;

class Node{
  
 private:
    int value;
    Node *left;
    Node *right;
    
 public:
    
    void setvalue(int value) {
      this->value = value;
    }
    void setleft(Node* left) {
      this->left=left;
    }
    void setright(Node* right) {
      this->right=right;
    }
    int getValue() {
      return value;
    }
    Node* getLeft() {
      return left;
    }
    Node* getRight() {
      return right;
    }
  
  Node(int key){
      value = key;
      left=NULL;
      right=NULL;
  }
};

class BinarySearchTree{

    public:
    void insertion(Node* root,Node* newNode){
        
        if(root==NULL)
        {
            root = newNode;
            return;
        }
        
        if(root->getValue() < newNode->getValue())
        {
            if(root->getRight() == NULL)
            {
                root->setright(newNode);
                return;
            }
            else
            {
                insertion(root->getRight(),newNode);
            }
        }
        else
        {
            if(root->getLeft() == NULL)
            {
                root->setleft(newNode);
                return;
            }
            else
            {
                insertion(root->getLeft(), newNode);
            }
        }
      
    }
    
    void deletion(Node* root, int key)
    {
        if(root==NULL)
        {
            return;
        }
        
        if(root->getValue() == key)
        {
            Node* le = root->getLeft();
            root = root->getRight();
            
            insertion(root,le);
            
        }
        else if(root->getValue() < key)
        {
            
            deletion(root->getRight(),key);
            
        }
        else if(root->getValue() > key)
        {
            
            deletion(root->getLeft(), key);
            
        }
        
        
    }
    
   /* 
    
    void leaf(Node* root)
    {
        if(root==NULL)
        {
            return;
        }
        
        if(root->getLeft()==NULL && root->getRight()==NULL)
        {
            cout<<root->getValue()<<" ";
            return;
        }
        
        leaf(root->getLeft());
        leaf(root->getRight());
        
        
    }*/
    
    int max(int h1, int h2)
    {
        if(h1>h2)
        {
            return h1+1;
        }
        else
        {
            return h2+1;
        }
    }
    
    int height(Node* root)
    {
        if(root==NULL)
        {
            return -1;
        }
        
        int h1 = height(root->getLeft());
        int h2 = height(root->getRight());
        
        return max(h1,h2);
    }
    
    void inorder(Node* root)
    {
        if(root==NULL)
        {
            return;
        }
        
        inorder(root->getLeft());
        
        cout<<root->getValue()<<" ";
        
        inorder(root->getRight());
    } 
    
    void levelorder(Node* root, int level,int ht)
    {
        if(root==NULL)
        {
            return;
        }
        
        levelorder(root->getLeft(),level+1,ht);
        if(level== ht)
        {
            cout<<root->getValue()<<" ";
        }
        levelorder(root->getRight(),level+1,ht);
    }
    
     void levelorder_n(Node* root)
    {
        queue <Node*> g;
        if(root==NULL)
        {
            return;
        }
        
        g.push(root);
        g.push(NULL);
        
        while(g.size() != 0)
        {
            //cout<<g.front()<<" "<<g.size();
            Node* node = g.front();
            if(node != NULL)
            {
                if(node->getLeft() != NULL)
                {
                    g.push(node->getLeft());
                }
                if(node->getRight() != NULL)
                {
                    g.push(node->getRight());
                }
            }
            else
            {
                if(g.size()>1)
                {
                    g.push(NULL);    
                }
            }
            
            g.pop();
            if(node==NULL)
            {
                cout<<endl;
            }
            else
            {
                cout<<node->getValue()<<" ";
            }
        }
        
        
    }
    Node* bulkInsert(int a[],int n)
    {
       Node* root = new Node(a[0]);
       
       for (int i=1;i<n;i++)
       {
          Node* node1 = new Node(a[i]);
          insertion(root,node1);
       }
    
      return root;
    }
};

int main() {
	// your code goes here
	BinarySearchTree bst;
	int n;
	cin>>n;
       int a[n];
    
       for (int i=0;i<n;i++)
       {
          cin>>a[i];
       }
	
Node* root=	bst.bulkInsert(a,n);
	int h = bst.height(root);
/*	for(int i=0;i<=h;i++)
	{
	    cout<<"Level "<<i<<"-";
	    bst.levelorder(root,0,i);
	    cout<<endl;
	}*/
	
	bst.levelorder_n(root);
	
	return 0;
}
