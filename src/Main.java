import java.util.*;

public class Main {

    public static void main(String[] args) {

        helpPrint("Min Stack");

        minStack mStack = new minStack();

        //Calls the isEmpty method from minStack
        System.out.println("mStack.isEmpty() = " + mStack.isEmpty());
        System.out.println();

        //Fills min stack with random values and print them
        System.out.println("Min Stack filled with mStack.push() in for loop:");
        System.out.print("[");
        for(int i = 0; i < 15; i++){
            mStack.push((int)(Math.random()*10));
            if(i == 14){
                System.out.print(mStack.peek());
            }else{
                System.out.print(mStack.peek() + "," + " ");
            }
        }
        System.out.println("] <-> IN/OUT");
        System.out.println();

        //Calls the peek method from minStack
        System.out.println("mStack.peek() = " + mStack.peek());
        System.out.println();

        //Calls the minPeek method from minStack
        System.out.println("mStack.minPeek() = " + mStack.minPeek());
        System.out.println();

        //Calls the isEmpty method from minStack
        System.out.println("mStack.isEmpty() = " + mStack.isEmpty());
        System.out.println();

        //Calls the pop method from minStack
        System.out.println("mStack.pop() = " + mStack.pop());
        System.out.println("mStack.pop() = " + mStack.pop());
        System.out.println("mStack.pop() = " + mStack.pop());



        helpPrint("Queue made with Stacks");

        //Creates the myQueue
        myQueue queue = new myQueue();

        //Calls the isEmpty method from myQueue
        System.out.println("queue.isEmpty() = " + queue.isEmpty());
        System.out.println();

        //Fills queue with random values and print them
        System.out.println("Queue filled with queue.push() in for loop:");
        System.out.print("OUT <- [");
        for(int i = 0; i < 15; i++){
            int temp = (int)(Math.random()*10);
            queue.push(temp);
            if(i == 14){
                System.out.print(temp);
            }else{
                System.out.print(temp + "," + " ");
            }
        }
        System.out.println("] <- IN");
        System.out.println();

        //Calls the peek method from myQueue
        System.out.println("queue.peek() = " + queue.peek());
        System.out.println();

        //Calls the isEmpty method from myQueue
        System.out.println("queue.isEmpty() = " + queue.isEmpty());
        System.out.println();

        //Calls the pop method from myQueue
        System.out.println("queue.pop() = " + queue.pop());
        System.out.println("queue.pop() = " + queue.pop());
        System.out.println("queue.pop() = " + queue.pop());



        helpPrint("Stack made with Queues");

        //Creates the myStack
        myStack stack = new myStack();

        //Calls the isEmpty method from myQueue
        System.out.println("stack.isEmpty() = " + stack.isEmpty());
        System.out.println();

        //Fills stack with random values and print them
        System.out.println("Stack filled with stack.push() in for loop:");
        System.out.print("[");
        for(int i = 0; i < 15; i++){
            stack.push((int)(Math.random()*10));
            if(i == 14){
                System.out.print(stack.peek());
            }else{
                System.out.print(stack.peek() + "," + " ");
            }
        }
        System.out.println("] <-> IN/OUT");
        System.out.println();

        //Calls the peek method from myQueue
        System.out.println("stack.peek() = " + stack.peek());
        System.out.println();

        //Calls the isEmpty method from myQueue
        System.out.println("stack.isEmpty() = " + stack.isEmpty());
        System.out.println();

        //Calls the pop method from myQueue
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());



        helpPrint("Linked List Code");

        //Create the ListNodes
        ListNode head = new ListNode(0);
        ListNode reverse = new ListNode(0);
        ListNode sort = new ListNode(0);
        ListNode rotate = new ListNode(0);
        ListNode unique = new ListNode(0);
        ListNode delete = new ListNode(0);

        //Create pointers located at the head
        ListNode current = head;
        ListNode currentReverse = reverse;
        ListNode currentSort = sort;
        ListNode currentRotate = rotate;
        ListNode currentUnique = unique;
        ListNode currentDelete = delete;

        //use the current pointers to add nodes to the lists
        for(int i = 0; i < 11; i++){
            int randomNumber = (int)(Math.random()*10);

            current.next = new ListNode(randomNumber);
            current = current.next;

            currentReverse.next = new ListNode(randomNumber);
            currentReverse = currentReverse.next;

            currentSort.next = new ListNode(randomNumber);
            currentSort = currentSort.next;

            currentRotate.next = new ListNode(randomNumber);
            currentRotate = currentRotate.next;

            currentUnique.next = new ListNode(randomNumber);
            currentUnique = currentUnique.next;

            currentDelete.next = new ListNode(randomNumber);
            currentDelete = currentDelete.next;
        }

        //the first node is 0, so we use .next to skip the first value
        head = head.next;
        reverse = reverse.next;
        sort = sort.next;
        rotate = rotate.next;
        unique = unique.next;
        delete = delete.next;

        //calls and print the middle value of a Linked List
        System.out.println("Middle of the Liked List: " + findMiddle(head));
        System.out.println();

        //calls and print the middle value of a Linked List
        System.out.println("Sum of the Liked List: " + sumLinkedList(head));
        System.out.println();


        //print the values of the linked list one by one
        System.out.println("The Linked List");
        helpPrint2(head);


        //calls the reverseLinkedList method to reverse the list, so the list is now reversed
        reverse = reverseLinkedList(reverse);

        //print the values of the linked list one by one
        System.out.println("The Same Linked List Reversed");
        helpPrint2(reverse);


        //calls the sortList method to reverse the list, so the list is now sorted
        sort = sortList(sort);

        //print the values of the linked list one by one
        System.out.println("The Same Link List Sorted");
        helpPrint2(sort);


        //calls the rotateRight method to rotate the list by a random amount
        int temp = (int)(Math.random()*20);
        rotate = rotateRight(rotate, temp);

        //print the values of the linked list one by one
        System.out.println("The Same Linked List Rotated Right By " + temp);
        helpPrint2(rotate);


        //calls the deleteDuplicates method to delete any duplicates
        unique = deleteDuplicates(unique);

        //print the values of the linked list one by one
        System.out.println("The Same Linked List Without Repeating Numbers");
        helpPrint2(unique);


        //calls the removeElement method to delete a random value
        int temp2 = (int)(Math.random()*10);
        delete = removeElements(delete, temp2);

        //print the values of the linked list one by one
        System.out.println("The Same Linked List Without The Number " + temp2);
        helpPrint2(delete);


        helpPrint("Tree Code Example");

        //prints the example tree
        System.out.println("""
            Visualized Binary Tree:
                
                      1
                     / \\
                    2   3
                   / \\   \\
                  4   5   6
                 / \\     / \\
                7   8   9   0
                """);

        //fills the tree according to visual
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.left.left = new TreeNode(4);
        tree.left.left.left = new TreeNode(7);
        tree.left.left.right = new TreeNode(8);
        tree.left.right = new TreeNode(5);
        tree.right = new TreeNode(3);
        tree.right.right = new TreeNode(6);
        tree.right.right.left = new TreeNode(9);
        tree.right.right.right = new TreeNode(0);

        //prints preorder traversal
        System.out.println("Preorder Traversal");
        System.out.println(preorderTraversal(tree));
        System.out.println();

        //prints inorder traversal
        System.out.println("Inorder Traversal");
        System.out.println(inorderTraversal(tree));
        System.out.println();

        //prints postorder traversal
        System.out.println("Postorder Traversal");
        System.out.println(postorderTraversal(tree));
        System.out.println();

        //End of main method
    }

    //This method finds the middle of a Linked List
    public static int findMiddle(ListNode head){

        if(head == null) return 0;

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.val;
    }

    //This methode reverses a Linked List
    public static ListNode reverseLinkedList(ListNode head){

        if(head == null || head.next == null) return head;

        ListNode current = head;
        ListNode prev = null;

        while(current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    //This method sums up the value of a Linked List
    public static int sumLinkedList(ListNode head){

        if(head == null) return 0;

        ListNode current = head;
        int sum = 0;

        while(current != null){
            sum += current.val;
            current = current.next;
        }
        return sum;
    }

    //This method sorts the Linked List
    public static ListNode sortList(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode prev = null, fast = head, slow = head;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(slow);

        return merge(left, right);
    }

    //SortList calls this method to complete the merge sort algorithm
    private static ListNode merge(ListNode left, ListNode right){

        ListNode dummy = new ListNode(69);
        ListNode current = dummy;

        while(left != null && right != null){
            if(left.val < right.val){
                current.next = left;
                left = left.next;
            }else{
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        if(left != null){
            current.next = left;
        }else if(right != null){
            current.next = right;
        }

        return dummy.next;
    }

    //This method rotates Linked Lists by a k number of spaces
    public static ListNode rotateRight(ListNode head, int k) {

        if(head == null || k == 0) return head;

        ListNode current = head;
        int size = 1;

        while(current.next != null){
            current = current.next;
            size++;
        }
        current.next = head;

        k %= size;

        for(int i = 0; i < size - k; i++){
            current = current.next;
        }
        head = current.next;
        current.next = null;

        return head;
    }

    //This method removes all the duplicates in the Linked List
    public static ListNode deleteDuplicates(ListNode head) {

        if(head == null) return null;

        ListNode current = head;

        while(current.next != null){
            if(current.val == current.next.val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return head;
    }

    //This method removes a specific element in a Linked List
    public static ListNode removeElements(ListNode head, int val) {

        if(head == null) return null;

        ListNode current = head;

        while(current.next != null){
            if(current.next.val == val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return head.val == val ? head.next : head;
    }

    public static void helpPrint(String name){
        System.out.println();
        System.out.println("-----------------------------------------------------------");
        System.out.println("--" + name + "--");
        System.out.println("-----------------------------------------------------------");
        System.out.println();
    }

    public static void helpPrint2(ListNode head){
        while(head != null){
            System.out.print(head.val + " " + "->" + " ");
            head = head.next;
        }
        System.out.println("null");
        System.out.println();
    }

    //Creates a class variable to be used in multiple methods
    private final static List<Integer> result = new LinkedList<>();

    //This method calls a preorder method
    public static List<Integer> preorderTraversal(TreeNode root) {
        if(!result.isEmpty()) result.clear(); //This extra line just resets the used list.
        dfsPreOrder(root);
        return result;
    }

    private static void dfsPreOrder(TreeNode root) {
        if (root != null) {
        result.add(root.val);
        dfsPreOrder(root.left);
        dfsPreOrder(root.right);
        }
    }

    //This method calls an inorder method
    public static List<Integer> inorderTraversal(TreeNode root) {
        if(!result.isEmpty()) result.clear(); //This extra line just resets the used list.
        dfsInOrder(root);
        return result;
    }

    private static void dfsInOrder(TreeNode root) {
        if (root != null) {
            dfsInOrder(root.left);
            result.add(root.val);
            dfsInOrder(root.right);
        }
    }

    //This method calls a postorder method
    public static List<Integer> postorderTraversal(TreeNode root) {
        if(!result.isEmpty()) result.clear(); //This extra line just resets the used list.
        dfsPostOrder(root);
        return result;
    }

    private static void dfsPostOrder(TreeNode root) {
        if (root != null) {
            dfsPostOrder(root.left);
            dfsPostOrder(root.right);
            result.add(root.val);
        }
    }

    //End of main class
}

class minStack{

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public minStack(){
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    //we only add number that are smaller and smaller to the minStack
    public void push(int x){
        stack.add(x);
        if(minStack.isEmpty() || x <= minStack.peek()){
            minStack.add(x);
        }
    }

    //we only pop from the minStack if it's equal to the stack's value
    public int pop(){
        if(stack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        return stack.pop();
    }

    public int peek(){
        return stack.peek();
    }

    public int minPeek(){
        return minStack.peek();
    }

    public boolean isEmpty(){
        return minStack.isEmpty();
    }
}

class myQueue{

    Stack<Integer> inStack;
    Stack<Integer> outStack;

    //Initializes the queue
    public myQueue(){
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void push(int x){
        inStack.add(x);
    }

    //fills the outStack if it's empty first and then pops
    public int pop(){
        peek();
        return outStack.pop();
    }

    //in order to flip the numbers we use a second stack to get the queue effect
    //we fill the outStack by emptying the inStack
    public int peek(){
        if(outStack.isEmpty()){
            while(!inStack.isEmpty()){
                outStack.add(inStack.pop());
            }
        }
        return outStack.peek();
    }

    public boolean isEmpty(){
        return inStack.isEmpty() && outStack.isEmpty();
    }
}

class myStack{

    Queue<Integer> queue = new LinkedList<>();

    public void push(int x){
        queue.add(x);

        //This while loop will always rotate the most recent number to the front of the queue
        //This will essentially make the queue behave like a stack
        int size = queue.size();
        while(size-- > 1){
            queue.add(queue.poll());
        }
    }

    public int peek(){
        if(queue.isEmpty()){
            return -1;
        }
        return queue.peek();
    }

    public int pop(){
        if(queue.isEmpty()){
            return -1;
        }
        return queue.poll();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }
}

class ListNode{

    //This variable will point to another node
    ListNode next;
    int val;

    //This method will set the value of a node
    ListNode(int val){
        this.val = val;
    }
}

class TreeNode {

    int val;

    //These variables will create variable for children nodes
    TreeNode left;
    TreeNode right;

    //This method will set the value of a node
    TreeNode(int val) {
        this.val = val;
    }
}