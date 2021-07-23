
import java.util.*;

public class LimitedQueue {
	private int limit = 0;
	LinkedList<Object>list = new LinkedList<Object>();
	private int _size = 0;
	public LimitedQueue(int n) {
		this.limit = n;
	}
	public void add(Object x) {
		if (_size >= limit) {
			list.removeFirst();
			list.add(x);
		}
		else {
			list.add(x);
			_size++;
		}
	}
	public Object remove() {
		Object x = list.removeFirst();
		return x;
	}
	public int size() {
		return this._size;
	}
	public int limit() {
		return this.limit;
	}
		
}

