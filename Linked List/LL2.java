import java.util.*;

//frameworks   
class LL2 {
    public static void main(String[] args) {
        
        LinkedList<String> list= new LinkedList<String>(); //empty string list


        list.addFirst("b");
        list.addFirst("e");
        list.addFirst("b");
        list.addFirst("i");
        System.out.println(list);
         list.addLast("o");
        System.out.println(list.size());
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+ " -> ");
        }
         System.out.println("NULL");


    }
    
}
//search== if(list.get(i)==key)