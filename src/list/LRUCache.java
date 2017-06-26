package list;

/**
 * Implement Least Recently Used (LRU) cache

LRU Cache:
In computing, cache replacement algorithms are optimizing algorithms that a computer program or a hardware maintained structure 
can follow in order to manage a cache of information stored on the computer. When the cache is full, 
the algorithm must choose which items to discard to make room for the new ones.
Source: https://en.wikipedia.org/wiki/Cache_algorithms

Initially, when the cache has room for more pages, we keep on adding the pages to the cache. 
But when cache is completely filled, then to add a new page, another page has to be removed. So, a strategy needs to be used for replacing cache pages.
Least Recently Used cache replacement algorithm is a cache replacement strategy by which the least recently 
accessed page is removed from the cache when a new page is accessed which is not already present in the cache.
 */
import java.util.HashMap;
import java.util.Map;

public class LRUCache {
	DoublyLinkedList pageList;
	Map<Integer, Node> pageMap;
	int cacheSize;
	
	LRUCache(int size) {
		this.pageList = new DoublyLinkedList();
		this.pageMap = new HashMap<Integer, Node>();
		
	}

}
