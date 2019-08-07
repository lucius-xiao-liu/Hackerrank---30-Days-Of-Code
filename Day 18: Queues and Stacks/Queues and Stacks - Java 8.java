public class Solution {
    // create instance variables for stack and queue
    Stack<Character> stack = new Stack<Character>();
    Queue<Character> queue = new LinkedList<Character>();
    // void pushCharacter (char ch) push to stack
    void pushCharacter(char ch) {
        stack.push(ch);
    }

    // void enqueueCharacter enqueues in queue
    void enqueueCharacter(char ch) {
        queue.add(ch);
    }

    // char popCharacter returns stack
    char popCharacter() {
        return stack.pop();
    }

    // char dequeueCharacter() dequeues returns in queue
    char dequeueCharacter() {
        return queue.poll();
    }
