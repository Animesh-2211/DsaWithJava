class LL {

    node head;
    private int size;

    LL() {
        this.size = 0;
    }

    class node { // node contains data and address of next node
        String data;
        node next;

        node(String data) { // constructor
            this.data = data;
            this.next = null; // it points to nothing
            size++;
        }
    }

    // ADD

    // first

    public void addfirst(String data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    // last

    public void addlast(String data) {

        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            return;
        }

        node curr = head; // head=curr
        while (curr.next != null) { // loops help to take the curr to the last
            curr = curr.next;
        }
        curr.next = newnode; // curr points to new and new was prevoiously pointing to null only so no need
                             // to specify

    }

    public void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }

        System.out.println("NULL");

    }

    // delete

    // first

    public void deletefirst() {

        if (head == null) {
            System.out.println("Null List");
            return;
        }
        size--;
        head = head.next;
    }

    // delete

    public void deletelast() {

        if (head == null) {
            System.out.println("Null List");
            return;
        }

        size--;

        if (head.next == null) {

            head = null;
            return;
        }
        node secondlast = head;
        node last = head.next;

        while (last.next != null) {
            secondlast = secondlast.next;
            last = last.next;
        }
        secondlast.next = null;
    }

    public int getsize() {
        return size;
    }

    public void Reverse() {

        if (head == null || head.next == null) {
            return;

        }

        node prev = head;
        node curr = head.next;

        while (curr != null) {
            node nnext = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nnext;

        }
        head.next = null;
        head = prev;

    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addfirst("ab");
        list.addfirst("cd");
        list.addlast("no");
        list.addlast("wi");
        list.addlast("lo");  
        list.addlast("wb");
        list.print();
        // list.deletefirst();
        // list.print();
        // list.deletelast();
        // list.print();
        list.Reverse();
        list.print();

        System.out.println(list.getsize());

    }
}
