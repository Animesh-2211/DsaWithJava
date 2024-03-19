public class reverselist {
    
    node head;
    


    
    class node{
        String data;
        node next;
        

        node(String data){
            this.data=data;
            this.next=null;
        
        }
    }

    public void Reverse(){

        if(head==null || head.next==null){
            return;

        }

        node prev=head;
        node curr=head.next;

        while(curr != null){
            node nnext=curr.next;
            curr.next= prev;


            prev=curr;
            curr=nnext;

        }
        head.next=null;
        head=prev;

    }
    public void print(){
        if(head==null){
           System.out.println("List is empty");
           return;
        }
       node curr=head; 
       while(curr!= null ){ 
           System.out.print(curr.data+ " -> ");
           curr = curr.next ;
       }

       System.out.println("NULL");

    }
    }

