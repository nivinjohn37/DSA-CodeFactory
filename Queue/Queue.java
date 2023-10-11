class Queue{
    int rear, front, size, capacity;
    int array[];

    Queue(int capacity){
        this.capacity = capacity;
        front = this.size = 0;
        rear = this.capacity - 1;
        array = new int[this.capacity];
    }

    public boolean isFull(Queue queue){
        return queue.capacity == queue.size;
    }

    public boolean isEmpty(Queue queue){
        return queue.size == 0;
    }

    public void enqueue(int num){
        if(isFull(this)){
            return;
        }else{
            this.rear = (this.rear + 1) % this.capacity;
            this.array[this.rear] = num;
            this.size = this.size + 1;
        }
    }

    public int dequeue(int num){
        if(isEmpty(this)){
            return Integer.MIN_VALUE;
        }
        int item = this.array[this.front];
        this.front = (this.front+1)%this.capacity;
        this.size = this.size - 1;
        return item;
    }

    int front()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
 
        return this.array[this.front];
    }
 
    // Method to get rear of queue
    int rear()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
 
        return this.array[this.rear];
    }
}