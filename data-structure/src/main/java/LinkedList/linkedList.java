package LinkedList;

import java.util.Comparator;

public class linkedList <E> {
    //노드 정의
    class Node<E> {
        E data; // 데이터
        Node<E> next; // 다음 노드를 참조하는 뒤쪽 포인터

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<E> head; // 헤드 포인터
    private Node<E> tail; // 테일 포인터
    private int currentSize;

    public linkedList() { // 생성자
        head = tail = null;
    } // 빈 리스트

    /**
     * <div>
     *     <h2>검색 메서드</h2>
     *     <h3>head부터 검색하는 노드를 만날 때까지 순서대로 스캔</h3>
     *     <ol>
     *         <li>헤드 포인터가 가리키고 있는 노드(맨 앞 노드)를 임시 포인터에 할당</li>
     *         <li>헤드 포인터가 null이면, 빈 리스트이기 때문에 while 문을 탈출할 것임</li>
     *         <li>헤드 포인터가 null이 아니라면, 리스트에 요소가 있기 때문에 head부터 tail까지 검색을 시작</li>
     *         <li>compare(a,b)가 같다면 0 리턴, 왼쪽(a)이 크면 1, 오른쪽(b)이 크면 -1을 리턴</li>
     *         <li>a,b가 같다면 검색에 성공한 것임으로 인덱스 값을 리턴</li>
     *         <li>a와 b가 같지 않을 경우, 포인터를 한 칸 옆으로 옮기고, 인덱스 값을 1 증가시킴</li>
     *         <li>리스트를 전부 검색해도 찾는 노드가 없는 경우 null 리턴</li>
     *     </ol>
     * </div>
     * @param object 찾고자 하는 노드의 데이터
     * @param c Comparator c
     * @return index or null
     * </body>
     */
    public Integer search(E object, Comparator<? super E> c) {
        Node<E> pointer = head; // 1
        int index = 0;

        while (pointer != null) { // 2~3
            if (c.compare(object, pointer.data) == 0) { // 4~5
                return index;
            }
            pointer = pointer.next; // 6
            index++;
        }
        return null; // 7
    }

    /**
     * <div>
     *     <h2>addFirst 메서드</h2>
     *     <h3>맨 앞에 노드를 삽입하는 메서드</h3>
     *     <ol>
     *         <li>새 노드 생성</li>
     *         <li>newNode가 기존의 맨 앞 노드를 가리키도록 함</li>
     *         <li>헤드 포인터가 새로 추가된 맨 앞 노드(newNode)를 가리키도록 함</li>
     *         <li>사이즈 1 증가</li>
     *         <li>요소가 하나만 있는 경우, 테일 포인터도 요소를 가리키도록 함</li>
     *     </ol>
     * </div>
     * @param object 추가하고자 하는 노드의 데이터
     */
    public void addFirst(E object) {
        Node<E> newNode = new Node<>(object); // 1

        newNode.next = head; // 2

        head = newNode; // 3

        currentSize++; // 4

        if (head.next == null) { // 5
            tail = head;
        }
    }

    /**
     * <div>
     *     <h2>addLast 메서드</h2>
     *     <h3>맨 뒤에 노드를 삽입하는 메서드</h3>
     *     <ol>
     *         <li>리스트가 비어있다면 addFirst메서드로 노드를 추가</li>
     *         <li>기존의 맨 뒤 노드가 새로 추가된 노드를 가리키도록 함</li>
     *         <li>테일 포인터가 새로 추가된 노드를 가리키도록 함</li>
     *         <li>사이즈 1 증가</li>
     *     </ol>
     * </div>
     * @param object 추가하고자 하는 노드의 데이터
     */
    public void addLast(E object) {
        Node<E> newNode = new Node<>(object);

        if (currentSize == 0) { // 1
            addFirst(object);
        }
        else {
          tail.next = newNode; // 2

          tail = newNode; // 3

          currentSize++; // 4
        }
    }

    /**
     * <div>
     *     <h2>removeFirst 메서드</h2>
     *     <h3>맨 앞에 노드를 삭제하는 메서드</h3>
     *     <ol>
     *         <li>리스트가 비어있는 경우, null 리턴</li>
     *         <li>요소가 한 개만 있는 경우, 헤드 포인터와 테일 포인터에 null을 할당하여 빈 리스트로 만듬</li>
     *         <li>요소가 두 개 이상인 경우, 헤드 포인터가 두번째 노드를 가리키도록 설정</li>
     *         <li>사이즈 1 감소, 삭제된 노드의 데이터 리턴</li>
     *     </ol>
     * </div>
     */
    public E removeFirst() {
        if (head == null) { // 1
            return null;
        }
        E removedNode = head.data;
        if (head == tail) { // 2
            head = tail = null;
        }
        else { // 3
            head = head.next;
        }
        currentSize--; // 4
        return removedNode;
    }

    /**
     * <div>
     *     <h2>removeLast 메서드</h2>
     *     <h3>맨 뒤에 노드를 삭제하는 메서드</h3>
     *     <ol>
     *         <li>리스트가 비어있거나, 하나의 요소만 가지고 있는 경우 removeFirst로 노드 삭제</li>
     *         <li>while 문이 끝나면 previous 포인터는 뒤에서 두번째 노드를, current 포인터는 마지막 노드를 가리킨다.</li>
     *         <li>previous.next를 null로 설정하고,</li>
     *         <li>tail 포인터에 previous 포인터를 할당하여 맨 뒤 노드와의 연결을 완전히 끊음</li>
     *         <li>연결이 끊어진 마지막 노드의 데이터를 리턴</li>
     *     </ol>
     * </div>
     */
    public E removeLast() {
        if (head == null || currentSize == 1) { // 1
            return removeFirst();
        }
        Node<E> previous = null;
        Node<E> current = head;

        while (current != tail) { // 2
            previous = current;
            current = current.next;
        }
        previous.next = null; // 3~4
        tail = previous;
        currentSize--;

        E removedNode = current.data; // 5
        return removedNode;
    }

    /**
     * <div>
     *     <h2>remove 메서드</h2>
     *     <h3>특정 노드를 삭제하는 메서드</h3>
     *     <ol>
     *         <li>헤드 포인터가 가리키는 노드(첫번째 노드)라면 removeFirst()로 삭제</li>
     *         <li>테일 포인터가 가리키는 노드(마지막 노드)라면 removeLast()로 삭제</li>
     *         <li>빈 리스트가 아니라면 while 문 수행, 빈 리스트라면 바로 null 리턴</li>
     *     </ol>
     * </div>
     * @param object 삭제하고자 하는 노드의 데이터
     * @return 삭제된 노드 or null
     */
    public E remove(E object) {
        if (head.data.equals(object)) { // 1
            return removeFirst();
        }

        if (tail.data.equals(object)) { // 2
            return removeLast();
        }

        Node<E> current = head;
        Node<E> previous = null;

        while (current != null) { // 3
            if (((Comparable<E>) object).compareTo(current.data) == 0) {
                currentSize--;
                previous.next = current.next;
                return current.data;
            }
            previous = current;
            current = current.next;
        }
        return null;
    }

    /**
     * <div>
     *     <h2>contains 메서드</h2>
     *     <h3>특정 노드가 포함되었는지 확인하는 메서드</h3>
     *     <ol>
     *         <li>빈 리스트가 아니면 포인터가 이동하며 노드를 찾고 true 리턴, 없거나 빈 리스트라면 false 리턴</li>
     *     </ol>
     * </div>
     * @param object
     * @return
     */
    public boolean contains(E object) {
        Node<E> current = head;

        while (current != null) { // 1
            if (((Comparable<E>) object).compareTo(current.data) == 0) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * <div>
     *     <h2>peekFirst 메서드</h2>
     *     <h3>첫번째 노드를 반환하는 메서드</h3>
     * </div>
     * @return 첫번째 노드 or null
     */
    public E peekFirst() {
        if (head == null) {
            return null; // 빈 리스트인 경우
        }

        return head.data;
    }

    /**
     * <div>
     *     <h2>peekLast 메서드</h2>
     *     <h3>마지막 노드를 반환하는 메서드</h3>
     * </div>
     * @return 마지막 노드 or null
     */
    public E peekLast() {
        if (tail == null) {
            return null; // 빈 리스트인 경우
        }

        return tail.data;
    }
}
