package indeed;

import java.util.List;

public class MyHashMap <K,V> {
	private static int BUCKET_SIZE = 256;
	private static Entry[] buckets = new Entry[BUCKET_SIZE];
	
	
	public MyHashMap(){}
	
	public static <K, V> void put(K key, V value) {
		int hashcode = hash(key);
		Entry entry = new Entry(key, value);
		if (buckets[hashcode] == null) {
			buckets[hashcode] = entry;
		} else {
			Entry en = buckets[hashcode];
			while (en.next != null) {
				if (en.getKey() == key) {
					en.setValue(value);
					return;
				}
				en = en.next;
			}
			en.next = entry;
		}
	}

	public static <K, V> V get(K key) {
		int index = hash(key);
		Entry<K,V> e = buckets[index];
		while(e != null) {
			if (e.getKey() == key) {
				return e.getValue();
			}
			e = e.next;
		}
		return null;
	}
	
	private static <K> int hash(K k) {
		return Math.abs(k.hashCode() % BUCKET_SIZE);
	}
	
	static class Entry<K,V> {
		K key;
		V value;
		Entry next;
		
		public Entry(){}
		
		public Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}

		public K getKey() {
			return key;
		}

		public void setKey(K key) {
			this.key = key;
		}

		public V getValue() {
			return value;
		}

		public void setValue(V value) {
			this.value = value;
		}

		public Entry<K,V> getNext() {
			return next;
		}

		public void setNext(Entry next) {
			this.next = next;
		}
		
	}

}
