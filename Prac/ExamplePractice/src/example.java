import java.util.ArrayList;
import java.util.Collections;

public class example<K,V> {
	
	private static class Node<K,V>{
		public K key;
		public V value;		
		public Node<K,V> next;
		public Node<K,V> prev;
		
		public Node (K k,V v) {
			this.key=k;
			this.value=v;
		}
		
	}
	
	
	private ArrayList <Node<K,V>> arr;
	
	
	public example(int capacity) {
		arr=new  ArrayList<Node<K,V>>();
		arr.ensureCapacity(capacity);
		Collections.fill(arr, null);		
	}
	
	
	public void push(K key,V value) {
		
		Node<K,V> node=getNodeForKey(key); 
		
		if(node != null) {
			node.value=value;
			return;
		}
		
		node=new Node<K,V>(key, value);
		
		int index=getIndexForKey(key);
		
		if(arr.get(index)!=null) {
			node.next=arr.get(index);
			node.next.prev=node;
		}
		
		arr.set(index, node);
		
	}


	private int getIndexForKey(K key) {
		
		return Math.abs(key.hashCode()% arr.size());
	}


	private Node<K, V> getNodeForKey(K key) {
		
		int index=getIndexForKey(key);
		
		Node<K,V> current=arr.get(index);
		
		if(current != null) {
			if(current.key==key) {
				return current;
			}
			current=current.next;
		}
		
		return null;
	}
	
	
	
	
	

}
