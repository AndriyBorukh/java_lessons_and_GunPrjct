/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author Андрей
 */
      

class Treenode
{
	Treenode ()
	{	}
	int id;
	int inf;
	// treenode  parent;
	Treenode  left;
	Treenode  right;
}

class QueueNode
{
    Treenode  tn;
    QueueNode next;
};
     
 class treeQueue
  {
    QueueNode  head;
    treeQueue()
     {
       head=null;
     }
          boolean isEmpty()
        {
            if(head == null)
                return true;
            else 
                return false;
        }
 void push (Treenode tmp)
	   {
             QueueNode  queuenode= new QueueNode ();
	     queuenode.tn=tmp;
	     if (head==null)
	     {
               head=queuenode;
	       queuenode.next=null;
	     }
	      else
	       {
		QueueNode  temp= head;
		 while (temp.next != null )
	          temp=temp.next;
			   temp.next=queuenode;
			   queuenode.next=null;
		}
 	   }        
Treenode  pop ()
 {
     QueueNode  cur= head.next ;
     Treenode  treenode= head.tn;
      if (head!=null)
       {
	 head= cur;
	 return treenode;
       }
	else
         return null;
 }

  }
 



 class Tree
 {
     Tree()
     {
     root=null;
     }
     Treenode newtreenode (int id, int inf )
     {
     Treenode ntn= new Treenode();
      ntn.id=id;
      ntn.inf=inf;
      ntn.left=null;
      ntn.right=null;
      return ntn;
     }
     void  DoSomethingWithTreenode (Treenode  node)
    {
     System.out.println( " ID"+node.id+" info"+node.inf   );
    }
     void insert ( int id, int inf    )
     {
      root= insertnode (  id,  inf , root  );
     }      
             
      Treenode insertnode ( int id, int inf , Treenode  rootnode   )
      {
       	 if (rootnode==null)
          {
	   return  newtreenode (id, inf) ;
	  }	
         if (id > rootnode.id)
	 {
	   rootnode.right= insertnode (id, inf , rootnode.right);
	   return rootnode;
	 }
         else
           if (id < rootnode.id)
	    {
	     rootnode.left= insertnode (id, inf , rootnode.left);
	     return rootnode;
	    }
           else 
              return null;
  
      }    
        
    public void delete(int id) {
    root = deletenoderec(root,id);
}  
      
 Treenode  maximalnoderec (Treenode  rootnode   )
	 {
		 if (rootnode==null)
		 {
			 return null ;
		 }
		if (rootnode.right!=null)
			 maximalnoderec (rootnode.right  );
		return rootnode;
		
	 }  
    
 Treenode deletenoderec ( Treenode rootnode, int id ) 
   {
     if (rootnode==null)
      {
        return null;
      } 
     if (rootnode.id > id )
      {
	rootnode.left= deletenoderec (rootnode.left,id);	
	return rootnode;
      }
      else if (rootnode.id<id )
	{
	 rootnode.right= deletenoderec (  rootnode.right, id  );
	 return rootnode;
	} 
         else {    
	  if (rootnode.left!=null && rootnode.right!=null  )
	   {
             Treenode maxnode =maximalnoderec(rootnode.left);
	     rootnode.id=maxnode.id;
	     rootnode.inf=maxnode.inf;
	     rootnode.left=deletenoderec ( rootnode.left, maxnode.id );	 
	     return rootnode  ; 
           }    
	    else if (rootnode.left != null)
	     {
              Treenode  temp=rootnode.left;
              rootnode=null ;
	      return temp;
             }
              else if (rootnode.right !=null)
		{
		    Treenode  temp=rootnode.right;
		                   rootnode=null ;
			         return temp;
		               }
                              else
                              {
                                 rootnode=null;
                                 return null;
                              } 
          }
        }
 
 Treenode  nodebyid ( int id  )
   {
    Treenode  node=root;
     while (node!=null)
      {
	if (node.id< id)
	 {
	   node=node.right;
	 }
          else
	   if (node.id> id)
	     {
	      node=node.left;
	     }
	      else
		{return node;}	 
       }	 
     return node;
   }
 
   void preorder (Treenode  rootnode  )  
	 {
            
          if (rootnode!=null)
	   {
             DoSomethingWithTreenode (rootnode);
             preorder ( rootnode.left  );
             preorder (rootnode.right  );
	   }
	 }

  void inorder (Treenode  rootnode  )  
	 {
	   if (rootnode!=null)
	    {
             inorder ( rootnode.left  );
	     DoSomethingWithTreenode (rootnode);
             inorder (rootnode.right  ); 
	    }
	 }

  void postorder (Treenode  rootnode  )  
	 {
	   if (rootnode!=null)
	    {
             postorder ( rootnode.left  );
             postorder (rootnode.right  );
	    DoSomethingWithTreenode (rootnode); 	 
	    }
	 }
  
  void levelorder (Treenode  rootnode  )
	 { 
          treeQueue  queue1= new treeQueue() ;
	  queue1.push (rootnode);
          Treenode  temp;
	  while ( !(queue1.isEmpty()))
	   {
	    temp = queue1.pop();
	    DoSomethingWithTreenode (temp);
	     if (temp.left !=null)
	       queue1.push(temp.left);
             if (temp.right !=null)
		queue1.push(temp.right);
            }
          }
 //----------------
     Treenode root;
 }




public class Binarytree {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tree mytree = new Tree();
         mytree.insert(1, 23 );
         mytree.insert(2, 23 );
         mytree.insert(3, 23 );
         mytree.insert(4, 23 );
         //mytree.delete(3);
        ;
         mytree.insert(5, 23 );
         mytree.insert(9, 23 );
         mytree.insert(7, 23 );
         mytree.insert(10, 23 );
         mytree.insert(6, 23 );
         mytree.insert(8, 23 );
        //  mytree.insert(3, 228 );
       // mytree.delete(4);
        Treenode tn= mytree.nodebyid(2);
   //    System.out.println("  "+mytree.root.right.right.id);
      // System.out.println("  "+mytree.root.right.right.left.id);
    //   System.out.println(tn.right.inf);
     // mytree.inorder(mytree.root);
     //  mytree.postorder(mytree.root);
       mytree.levelorder(mytree.root);
    //   mytree.preorder(mytree.root);
    }
    
}
