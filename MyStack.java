import java.util.*;

/*
mplement the following operations of a stack using queues.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
empty() -- Return whether the stack is empty.
Example:

MyStack stack = new MyStack();

stack.push(1);
stack.push(2);
stack.top();   // returns 2
stack.pop();   // returns 2
stack.empty(); // returns false
Notes:

You must use only standard operations of a queue -- which means only push to
back, peek/pop from front, size, and is empty operations are valid.
Depending on your language, queue may not be supported natively.
You may simulate a queue by using a list or deque (double-ended queue),
as long as you use only standard operations of a queue.
You may assume that all operations are valid (for example, no pop or top
operations will be called on an empty stack).
*/

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

class MyStack
{
	Deque<Integer> stack;

	// Initialize data structure.
	public MyStack()
	{
		stack = new ArrayDeque();
	}

	// Push element x to the stack.
	public void push(int x)
	{
		stack.addFirst(x);
	}

	// Removes element on top of the stack and returns it.
	public int pop()
	{
		return stack.removeFirst();
	}

	// Return the top of the stack without removing it.
	public int top()
	{
		return stack.getFirst();
	}

	// Checks if the stack is empty.
	public boolean empty()
	{
		if (stack.size() == 0)
		{
			return true;
		}

		return false;
	}
}
