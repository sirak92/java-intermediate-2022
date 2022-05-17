 public class DoubleLinkedList<T>{
        Node<T> head;
        Node<T> tail;
        private class Node<T>{
            Node<T> next;
            Node<T> prev;
            T data;
            int index=0;
            Node(T t){this.data=t;}
        }
        public void add(T t){
            Node<T> newNode = new Node<>(t);
            if(head==null){
                head=tail=newNode;
                head.prev=null;
                tail.next=null;
                return;
            }else{

                tail.next = newNode;
                newNode.prev=tail;
                tail=newNode;
                tail.next=null;
                newNode.index=newNode.prev.index+1;
            }
        }
        private void getNext(T element){
            while(head.next!=null){
                head=head.next;
                if(head.data==element){
                    System.out.println(head.index);
                    return;
                }
            }
        }
        private void getPrev(T element){
            while(tail.prev!=null){
                tail=tail.prev;
                if(tail.data==element){
                    System.out.println(tail.index);
                }
            }
        }
        private void remove(T element){
            if(head.data==element){
                head=head.next;
            }else{
                Node<T> current = head;
                while(current.next!=null){
                    current=current.next;
                    if(current.next.data==element){
                        current.next=current.next.next;
                        return;
                    }
                    return;
                }
            }
        }
        public T removeLast(){
            T t = tail.data;
            tail=tail.prev;
            tail.next=null;
            return t;
        }
        public void print(){
            Node<T> current =head;
            while(current!=null){
                System.out.println(current.data);
                current=current.next;
            }
        }

        public static void main(String[] args) {
            DoubleLinkedList test = new DoubleLinkedList();
            test.add(2);
            test.add(7);
            test.add(5);
            test.add(3);
            test.remove(7);
            test.print();

        }
    }

