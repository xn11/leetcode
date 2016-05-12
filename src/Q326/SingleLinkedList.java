import java.util.*;

public class SingleLinkedList<T> {
	
	private int size;
	private LinkedListNode<T> first = null;
	
	public SingleLinkedList() {
		size = 0;
		first = new LinkedListNode<T>(null, null);
	}
	
	public void addFirst(T data){
		LinkedListNode<T> add = new LinkedListNode<T>(data);
		add.next = first.next;
		first.next = add;	
		size++;
	}
	
	public void removeFirst(){
		first.next = first.next.next;
		size--;
	}
	
	public T get(int index){
		LinkedListNode<T> res = first;
		for (int i = 0; i <= index; i++) {
			res = res.next;
		}
		return res.data;
	}
	
	public void clear(){
		first.next = null;
		size = 0;
	}
	
	//非递归
	public void reverse(){
		if(size <= 1)
			return;
		LinkedListNode<T> iter = first.next;
		while(iter.next != null){
			addFirst(iter.next.data);
			iter.next = iter.next.next;
		}
	}
	//递归
	public void reverse2(){
		first.next = reverse2(first.next);
	}
	private LinkedListNode<T> reverse2(LinkedListNode<T> current){
		if(current == null || current.next == null)
			return current;
		LinkedListNode<T> next = current.next;
		current.next = null;
		LinkedListNode<T> head = reverse2(next);
		next.next = current;
		return head;
	}
	
	public void print(){
		LinkedListNode<T> iter = first.next;
		while(iter != null){
			System.out.print(iter.data.toString() + "  ");
			iter = iter.next;
		}
	}
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}

	public static void main(String[] args) {
		SingleLinkedList<String> list = new SingleLinkedList<>();
		list.addFirst("1");
		list.addFirst("2");
		list.addFirst("3");
		list.print();
		list.reverse2();
		list.print();
	}	
}

class LinkedListNode<T>{
	T data;
	LinkedListNode<T> next;
	
	public LinkedListNode() {
		data = null;
		next = null;
	}
	public LinkedListNode(T data) {
		this.data = data;
		next = null;
	}
	
	public LinkedListNode(T data, LinkedListNode next) {
		this.data = data;
		this.next = next;
	}
}
