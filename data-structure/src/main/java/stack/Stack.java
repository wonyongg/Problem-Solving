package stack;

public class Stack<E> {
    /* 스택 배열 */
    private E[] stack;
    /* 스택 용량 */
    private int capacity;
    /* 스택 포인터 */
    private int pointer;

    /**
     * 스택 생성시 초기 용량 설정 후 포인터는 0에 둠
     * @param capacity 용량
     */
    public Stack(int capacity) {
        this.capacity = capacity;
        this.pointer = 0;
    }

    /**
     * <div>
     *     <h2>push 메서드</h2>
     *     <ol>
     *         <li>스택에 x를 넣음</li>
     *         <li>pointer >= capacity(스택이 가득찼다면) RuntimeException 던지기</li>
     *     </ol>
     * </div>
     * @param x
     * @return 스택에 넣은 x 값 리턴
     */
    public E push(E x) {
        if (pointer >= capacity) throw new RuntimeException("Overflow Stack Exception.");
        return stack[pointer++] = x;
    }

    /**
     * <div>
     *     <h2>pop 메서드</h2>
     *     <ol>
     *         <li>스택에 가장 나중에 넣은 값(최신값)을 뺌</li>
     *         <li>point <= 0 (스택이 비어있다면) RuntimeException 던지기</li>
     *     </ol>
     * </div>
     * @return 스택에서 뺀 값
     */
    public E pop() {
        if (pointer <= 0) throw new RuntimeException("Empty Stack Exception.");
        return stack[pointer--];
    }

    /**
     * <div>
     *     <h2>peek 메서드</h2>
     *     <ol>
     *         <li>스택에 가장 나중에 넣은 값(최신값)을 리턴</li>
     *         <li>point <= 0 (스택이 비어있다면) RuntimeException 던지기</li>
     *     </ol>
     * </div>
     * @return 스택에 가장 나중에 넣은 값
     */
    public E peek() {
        if (pointer <= 0) throw new RuntimeException("Empty Stack Exception.");
        return stack[pointer - 1];
    }

    /**
     * <div>
     *     <h2>clear 메서드</h2>
     *     <ol>
     *         <li>스택에 들어있는 요소 전부 비우기</li>
     *         <li>pointer를 0으로 바꾸면 끝</li>
     *     </ol>
     * </div>
     */
    public void clear() {
        pointer = 0;
    }

    /**
     * <div>
     *     <h2>indexOf 메서드</h2>
     *     <ol>
     *         <li>for문으로 x와 같은 스택 요소의 인덱스 값을 리턴</li>
     *         <li>x와 같은 스택 요소가 없다면 -1 리턴</li>
     *     </ol>
     * </div>
     * @param x 찾으려는 스택 요소
     * @return index or -1
     */
    public int indexOf(E x) {
        for (int i = pointer - 1; i >= 0; i--) {
            if (stack[i] == x) return i;
        }
        return -1;
    }

    /**
     * <div>
     *     <h2>getCapacity 메서드</h2>
     *     <ol>
     *         <li>스택 용량 리턴</li>
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
     *         <li>스택 크기 = pointer이기 때문에 pointer 리턴</li>
     *     </ol>
     * </div>
     * @return pointer
     */
    public int size() {
        return pointer;
    }

    /**
     * <div>
     *     <h2>isEmpty 메서드</h2>
     *     <ol>
     *         <li>pointer <= 0(스택이 비어있다면) true</li>
     *         <li>스택이 비어있지 않다면 false</li>
     *     </ol>
     * </div>
     * @return true or false
     */
    public boolean isEmpty() {
        return pointer <= 0;
    }

    /**
     * <div>
     *     <h2>isFull 메서드</h2>
     *     <ol>
     *         <li>pointer >= capacity(포인터가 용량과 같거나 크다면 스택이 꽉 찼다는 뜻이므로) true</li>
     *         <li>포인터가 용량보다 작다면 스택의 용량이 남아있다는 뜻이므로 false</li>
     *     </ol>
     * </div>
     * @return true or false
     */
    public boolean isFull() {
        return pointer >= capacity;
    }

    /**
     * <div>
     *     <h2>dump 메서드</h2>
     *     <ol>
     *         <li>스택 요소를 바닥부터 꼭대기 순서로 출력</li>
     *         <li>만약 pointer가 0과 같거나 작으면 스택이 비어있다는 뜻이므로 Stack is Empty 문장 출력</li>
     *     </ol>
     * </div>
     */
    public void dump() {
        if (pointer <= 0) {
            System.out.println("Stack is Empty.");
        } else {
            for (E x : stack) {
                System.out.println(x);
            }
        }
    }
}
