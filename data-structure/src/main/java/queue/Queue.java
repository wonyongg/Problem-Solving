package queue;

public class Queue<E> {
    /* 큐 배열 */
    private E[] que;
    /* 큐 용량 */
    private int capacity;
    /* 현재 큐 크기 */
    private int num;
    /* 큐 front 포인터 */
    private int front;
    /* 큐 rear 포인터 */
    private int rear;

    /**
     * 큐 생성 시 초기 용량 설정
     * 현재 크기, front, rear 포인터는 0으로 설정
     * @param capacity 용량
     */
    public Queue(int capacity) {
        num = front = rear = 0;
        this.capacity = capacity;
    }

    /**
     * <div>
     *     <h2>enque 메서드</h2>
     *     <ol>
     *         <li>큐에 x를 넣음</li>
     *         <li>현재 크기가 용량보다 크거나 같다면 RuntimeException 던지기</li>
     *     </ol>
     * </div>
     * @param x
     * @return 큐에 넣은 x 값 리턴
     */
    public E enque(E x) {
        if (num >= capacity) throw new RuntimeException("Overflow Queue Exception.");
        que[rear++] = x;
        num++;

        if (rear == capacity) rear = 0;

        return x;
    }

    /**
     * <div>
     *     <h2>deque 메서드</h2>
     *     <ol>
     *         <li>현재 크기가 0이하면 RuntimeException 던지기</li>
     *     </ol>
     * </div>
     * @return 큐에서 뺀 값
     */
    public E deque() {
        if (num <= 0) throw new RuntimeException("Empty Queue Exception.");
        E x = que[front++];
        num--;

        if (front == capacity) front = 0;

        return x;
    }

    /**
     * <div>
     *     <h2>peek 메서드</h2>
     *     <ol>
     *         <li>현재 크기가 0이하면 RuntimeException 던지기</li>
     *         <li>스택에 가장 처음에 넣은 값을 뺌</li>
     *     </ol>
     * </div>
     * @return 큐에서 가장 처음 넣은 값
     */
    public E peek() {
        if (num <= 0) throw new RuntimeException("Empty Queue Exception.");

        return que[front];
    }

    /**
     * <div>
     *     <h2>clear 메서드</h2>
     *     <ol>
     *         <li>큐에 들어있는 요소 전부 비우기</li>
     *     </ol>
     * </div>
     */
    public void clear() {
        num = front = rear = 0;
    }

    /**
     * <div>
     *     <h2>indexOf 메서드</h2>
     *     <ol>
     *         <li>for문으로 x와 같은 큐 요소의 인덱스 값을 리턴</li>
     *         <li>x와 같은 큐 요소가 없다면 -1 리턴</li>
     *     </ol>
     * </div>
     * @param x 찾으려는 큐 요소
     * @return index or -1
     */
    public int indexOf(E x) {
        for (int i = 0; i < num; i++) {
            /* capacity가 12일 때, 0 -> 1 -> 2- > 3 ... 9 -> 10 -> 11 -> 0 -> 1 */
            int index = (i + front) % capacity;
            if (que[index] == x) return index;
        }

        return -1;
    }

    /**
     * <div>
     *     <h2>getCapacity 메서드</h2>
     *     <ol>
     *         <li> 용량 리턴</li>
     *     </ol>
     * </div>
     * @return capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * <div>
     *     <h2>size 메서드</h2>
     *     <ol>
     *         <li>큐의 현재 크기 = num이기 때문에 num 리턴</li>
     *     </ol>
     * </div>
     * @return num
     */
    public int size() {
        return num;
    }

    /**
     * <div>
     *     <h2>isEmpty 메서드</h2>
     *     <ol>
     *         <li>num <= 0(큐가 비어있다면) true</li>
     *         <li>큐가 비어있지 않다면 false</li>
     *     </ol>
     * </div>
     * @return true or false
     */
    public boolean isEmpty() {
        return num <= 0;
    }

    /**
     * <div>
     *     <h2>isFull 메서드</h2>
     *     <ol>
     *         <li>num >= capacity(현재 크기가 용량과 같거나 크다면 큐가 꽉 찼다는 뜻이므로) true</li>
     *         <li>현재 크기 용량보다 작다면 스택의 용량이 남아있다는 뜻이므로 false</li>
     *     </ol>
     * </div>
     * @return true or false
     */
    public boolean isFull() {
        return num >= capacity;
    }

    /**
     * <div>
     *     <h2>dump 메서드</h2>
     *     <ol>
     *         <li>만약 현재 크기가 0과 같거나 작으면 큐가 비어있다는 뜻이므로 "Que is Empty" 문장 출력</li>
     *         <li>큐 요소를 front에서 rear 순으로 출력</li>
     *     </ol>
     * </div>
     */
    public void dump() {
        if (num <= 0) {
            System.out.println("Que is Empty.");
        } else {
            for (int i = 0; i < num; i++) {
                System.out.println(que[(i + front) % capacity]);
            }
        }
    }
}
