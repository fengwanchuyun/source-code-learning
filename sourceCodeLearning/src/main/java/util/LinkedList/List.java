package util.LinkedList;


public class List<Type> {
    // not mandatory to set max size
    public static final int MAX_SIZE = 50;
    // set private variables
    private int size;
    private int position;
    private Node<Type> head;
    private Node<Type> tail;
    private Node<Type> currNode;

    // constructor
    // remember that an empty list has a "size" of -1 and its "position" is at -1
    public List() {
        this.head = null;
        this.tail = null;
        this.currNode = null;
        this.position = -1;
    }

    // copy constructor
    // clones the list l and last element = current element
    public List(List<Type> l) {
        Node<Type> n = l.head;

        this.head = this.tail = this.currNode = null;
        this.size = 0;
        this.position = 0;

        while (n != null) {
            this.InsertAfter(n.getData());
            n = n.getLink();
        }
    }

    // heads to the beginning of the list
    public void First() {
        this.currNode = head;
        this.position = 0;
    }

    // heads to the end of the list
    // the end of the list where the last non-empty item in the list is
    public void Last() {
        this.position = size - 1;
        this.currNode = this.tail;
    }

    // navigates to the specified element (0-index)
    // won't run for invalid positions or if list is empty
    public void SetPos(int pos) {
        if (size == 0) {
            this.position = -1;
        }
        else if (pos >= 0 && pos < size) {
            int i = 0;
            Node<Type> someNode = this.head;
            while (i++ < pos && someNode != null) {
                someNode = someNode.getLink();
            }
            this.currNode = someNode;
            this.position = i;
        }
        else {
            SetPos(size - 1);
        }

    }
    private void posAdd() {
        this.SetPos(this.position + 1);
    }
    private void posMinus() {
        this.SetPos(this.position - 1);
    }

    // goes to previous index (can't happen if list is empty)
    // there should be no wrap-around
    public void Prev() {
        if (currNode == null) {
            First();
        }
        if (this.position == 0) return;

        Node<Type> n = this.currNode;
        First();
        while (this.currNode != null) {
            if (this.currNode.getLink() == n) {
                break;
            }
            Next();
        }
    }

    // goes to next index (not possible for empty list)
    // there should be no wrap-around
    public void Next() {
        if (this.currNode != null) {
            if (this.currNode.getLink() != null) {
                this.currNode = this.currNode.getLink();
                position++;
            }
            else {
                this.currNode = null;
            }
        }
        else {
            ;
        }
    }

    // returns location of curr (or -1 if empty)
    public int GetPos() {
        return this.position;
    }

    // returns the value of curr (or -1 if empty)
    public Type GetValue() {
        if (this.currNode == null) {
            return null;
        }
        else {
            return this.currNode.getData();
        }
    }

    // size does not imply capacity
    public int GetSize() {
        return this.size;
    }

    // inserts item before curr (can't happen in full list)
    // the new element becomes curr
    public void InsertBefore(Type data) {
        if (this.size < MAX_SIZE) {
            Node<Type> n = new Node<>();
            n.setData(data);
            if (head == null) {
                //System.out.println(String.format("Node added as head: %s containing %s", n, n.getData()));
                head = n;
                First();
            }
            else if (tail == null) {
                Node<Type> oldHead = this.head;
                oldHead.setLink(null);
                this.tail = oldHead;
                n.setLink(this.tail);
                this.head = n;
                this.currNode = head;
            }
            else if (this.currNode == head) {
                n.setLink(head);
                this.head = n;
                First();
            }
            else {
                Prev();
                this.InsertAfter(data);
                position++;
            }
            size++;
        }
    }

    // inserts item after curr (can't happen in full list)
    // new element becomes curr
    public void InsertAfter(Type data) {
        if (this.size < MAX_SIZE) {
            Node<Type> n = new Node<>();
            n.setData(data);
            if (this.head == null) {
                this.head = n;
                First();
            }
            else if (this.tail == null) {
                this.tail = n;
                this.head.setLink(tail);
                Last();
            }
            else if (this.currNode == this.tail) {
                this.tail.setLink(n);
                n.setLink(null);
                this.tail = n;
                this.currNode = tail;
                Last();
            }
            else {
                Node<Type> currNode = this.currNode;
                Next();
                Node<Type> nextNode = this.currNode;

                currNode.setLink(n);
                n.setLink(nextNode);
                this.currNode = n;
                position++;
            }
            this.size++;
        }
    }

    // removes curr (can't occur in empty list)
    public void Remove() {
        if (this.size == 0) return;

        if (this.currNode == null) {
            System.out.println("Remove called on null node (you probably Next\'d on the tail, call prev() to go back)");
            return;
        }

        if (this.currNode == head) {
            Node<Type> nextNode = this.currNode.getLink();
            if (nextNode != null && nextNode == this.tail) {
                this.head = this.tail;
                this.tail = null;
                this.head.setLink(null);
                this.size--;
                First();
            }
            else if (nextNode == null) {
                this.head = null;
                this.size--;
                this.position = -1;
            }
            else {
                this.head = this.head.getLink();
                this.size--;
                First();
            }
        }
        else if (this.currNode == this.tail) {
            Prev();
            if (this.currNode != null && this.currNode == head) {
                this.tail = null;
                this.head.setLink(null);
                this.size--;
                First();
            }
            else {
                this.tail = this.currNode;
                this.tail.setLink(null);
                this.size--;
                Last();
            }
        }
        else {
            final Node<Type> nodeBeforecurrNode, nodeAftercurrNode;
            Prev();
            nodeBeforecurrNode = this.currNode;
            Next();
            Next();
            nodeAftercurrNode = this.currNode;

            nodeBeforecurrNode.setLink(nodeAftercurrNode);
            this.currNode = nodeAftercurrNode;
            this.size--;
        }
        if (this.size == 0) this.position = -1;
    }

    // replaces value of curr with the specified value (can't occur for empty list)
    public void Replace(Type data) {
        assert this.currNode != null;
        this.currNode.setData(data);
    }

    // is list empty?
    public boolean IsEmpty() {
        return this.size == 0;
    }

    // is list full?
    public boolean IsFull() {
        return this.size == MAX_SIZE;
    }

    // returns if two lists are equal (value)
    public boolean Equals(List<Type> l) {
        if (this.size != l.size) return false;
        Node<Type> someNode = this.head, otherNode = l.head;
        while (someNode != null) {
            if (someNode.getData() != otherNode.getData()) {
                return false;
            }

            someNode = someNode.getLink();
            otherNode = otherNode.getLink();
        }
        return true;
    }

    // returns the concatenation of two lists
    // l should not be modified
    // l should be concatenated to the end of *this
    // the last element of the new list is curr
    public List<Type> Add(List<Type> l) {
        List<Type> concatList = new List<>(this);
        if (this.tail == null) return concatList;

        concatList.tail.setLink(l.head);
        concatList.tail = l.tail;
        concatList.size += l.size;
        concatList.Last();
        return concatList;
    }

    // returns a string representation of the entire list
    // if list is empty, the string "null" will be returned
    public String toString() {
        if (this.size == 0) return "null";
        Node<Type> someNode = this.head;
        StringBuilder sb = new StringBuilder();

        while (someNode != null && someNode.getData() != null) {
            sb.append(someNode.getData().toString());
            sb.append(" ");
            someNode = someNode.getLink();
        }
        return sb.toString();
    }


    public int indexOf(Type data) {
        Node<Type> someNode = this.head;
        int i = 0;
        while (someNode != null) {
            if (someNode.getData().equals(data)) {
                return i;
            }
            someNode = someNode.getLink();
            i++;
        }
        return -1;
    }

    public boolean hasNext() {
        if (this.currNode == null) {
            return false;
        }
        return this.currNode.getLink() != null;
    }

    public Type get(int index) {
        checkElementIndex(index);
        return node(index).getData();
    }
    private void checkElementIndex(int index) {
        if (!isElementIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }
    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }
    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }
    Node<Type> node(int index) {
        Node<Type> x = head;
        if(index == 0){
            return head;
        }else if(index == size){
            return tail;
        }else {
            for (int i = 0; i < index; i++)
                x = x.getLink();
            return x;
        }

//        return null;
    }
}
