package LinkedList;

public class DoublyLinkedList<E> {
    class Node<E> {
        E data;
        Node<E> prev;
        Node<E> next;

        public Node(E data, Node<E> prev, Node<E> next) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

        private Node<E> head;
        private Node<E> tail;
        private int currentSize;

    public DoublyLinkedList() {
        head = tail = null;
    }

    /**
     * <div>
     *     <h2>이중 연결 리스트에서의 removeLast</h2>
     *     <ul>
     *         <li>단일 연결 리스트에서는 tail 포인터가 있더라도 O(n)의 시간 복잡도로 모든 노드를 거쳐야했다.</li>
     *         <li>이중 연결 리스트에서는 tail 포인터가 가리키는 노드에서 previous 포인터가 가리티는 노드를 찾으면 되기 때문에</li>
     *         <li>O(1)의 시간복잡도를 갖는다.</li>
     *     </ul>
     *
     * </div>
     * @return removedLast 삭제된 마지막 노드
     */
    public E removeLast() {
        E removedLast = tail.data;
        tail.prev.next = null;
        tail = tail.prev;

        return removedLast;
    }
}
