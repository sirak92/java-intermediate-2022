    public class QueueImplementation<T> {
        LinkedList<T> data;
        QueueImplementation(){
            data =new LinkedList<>();
        }

        public void enQueue(T t){
            data.add(t);
        }
        public T dequeue(){

            return data.removeFirst();
        }
        public void view(){
            data.printList();
        }
    }

