public class CircularList {
    private IntNode tail; // tail pointer

    private int size; // size of the list

        public CircularList() {
            tail = null;

            size = 0;

        }
  public void insert(IntNode newElem) {

            /*

             * inserts the input ListElem on the head of the CircularList.

             */
            IntNode head;

      

                head = tail.getNext();

                newElem.getNext() = head;

                tail.getNext() = newElem;

            

            size++;

        }
          public boolean isEmpty() {
              return(tail == null);
            }
}