class QNode{
    int key;
    QNode next;
    
    public QNode(int key){
        this.key = key;
        this.next = null;
    }
}

public class QueueLinkedList {
    QNode front, rear;
    public Queue(){
        this.front = this.rear = null;
    }

    void enqueue(int num){
        QNode temp = new QNode(num);
        if(this.rear == null){
            this.front = this.rear = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }

    int dequeue(){
        if(this.front == null){
            return Integer.MIN_VALUE;
        }else{
            int num = this.front.key;
            this.front = this.front.next;
            if(this.front == null){
                this.front = this.rear;
            }
            
            return num;

        }
    }

}
