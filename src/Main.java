public class Main {
    public static void main(String[] args) {
        DemonstrateQueue();
    }

    public static class Stack {
        class Node {
            String data;
            Node prev;
            Node(Integer data){
                this.data = toOctalString(data);

            }
        }
        private Node top;

        public Boolean isEmpty(){
            return top == null;
        }

        public void Push(int data){
            Node element = new Node(data);
            element.prev = top;
            top = element;
        }

        public String Pop(){
            if(top == null) return null;
            String tmp = top.data;
            top = top.prev;
            return tmp;
        }

        public void Show() {
            Node cur = top;

            if(cur == null) {
                System.out.println("List is empty \n");
                return;
            }
            System.out.println("Nodes of stack: ");
            while(cur != null) {
                System.out.print(cur.data + " ");
                cur = cur.prev;
            }
            System.out.println("\n");
        }
        public static String toOctalString(int number) {
            String octalString = "";

           if (number < 0) {
               return "null";
           }

            do {
                int digit = number % 8;
                octalString = digit + octalString;
                number /= 8;
            } while (number != 0);

            return octalString;
        }
    }
    public static void DemonstrateQueue() {
        Stack newStack= new Stack();
        System.out.println("isEmpty: \t" + newStack.isEmpty());

        newStack.Push(0);
        newStack.Push(1);
        newStack.Push( 45);

        System.out.println("after adding: ");
        newStack.Show();

        newStack.Pop();
        newStack.Pop();

        System.out.println("after deleting: ");
        newStack.Show();
    }
}