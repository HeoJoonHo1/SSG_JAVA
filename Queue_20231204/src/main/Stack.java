package main;

public class Stack {

	private int top;
	private int maxSize;
	
	private Object stackArray[];

	public Stack(int maxSize) {
		this.maxSize = maxSize;
		stackArray = new Object[maxSize];
		top = -1;
	}
	
	// stack 공간이 비어 있는지?
	public boolean isEmpty() {
		return (top == -1);
	}
	
	// stack 공간이 가득 차 있는지?	
	public boolean isFull() {
		return (top == maxSize - 1);
	}
	
	// 추가
	public void push(Object item) {
		if(isFull()) {
			System.out.println("스택 공간이 가득 차 있습니다");
			return;
		}
		
		// 추가가능
		top++;
		stackArray[top] = item;
	}
	
	// 삭제
	public Object pop() {
		Object item = peek();
		top--;
		
		return item;
	}
	
	// 집어내다
	public Object peek() {	// getter
		if(isEmpty()) {
			System.out.println("스택공간이 비어 있습니다");
			return null;
		}
		
		return stackArray[top];
	}	
}




