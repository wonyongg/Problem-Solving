package LinkedList;

public class CircleLinkedList<E> {
    class Node<E> {
        E data;
        Node<E> next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int currentSize;

    public CircleLinkedList() {
        head = tail = null;
    }

    /**
     * 원형 연결 리스트
     * 원형 연결 리스트는 마지막 next 포인터가 연결 리스트의 노드를 가리킨다.
     *
     * 원형 연결 리스트의 마지막 next 포인터가 head를 가리키는지 확인하는 방법은 두 가지가 있다.
     *
     * head 포인터를 사용
     * 임시 포인터(tmp)를 만들고 head에서부터 반복하여
     * tmp == head or tmp.next == head인지 확인하면 된다.
     * 이때의 시간복잡도는 O(n)이다.
     *
     * tail 포인터를 사용
     * tail.next == head인지 확인하면 된다.
     * 이때의 시간복잡도는 O(1)이다.
     d
     * 만약 next 포인터가 head 포인터가 가리키는 노드가 아닌 연결리스트의 임의의 노드를 가리키는 경우
     * ex) A - B - (C - D - E - F - C)
     *
     * tail 포인터를 사용
     * tail 포인터에서 반복하여 tail 포인터가 다시 나타나는지 확인하면 된다.
     * tail.next != null
     * 이때의 시간복잡도는 O(n)이다.
     *
     * 임시 포인터 2개를 사용
     * 고정용 임시 포인터로 시작점을 잡고, 이동용 임시 포인터를 이용하여 currentSize만큼 떨어진 노드까지 시작점과 같은 노드가 있는지 탐색한다.
     * 만약 찾지 못한 경우 고정용 임시 포인터가 가리키는 시작점을 다음 노드로 옮기고, 이동용 임시 포인터로 같은 노드를 찾는 것을 반복한다.
     * 이떼의 시간복잡도는 O(n^2)이다.
     * n 개의 노드가 각각 n번씩 탐색하기 때문.
     */
}
