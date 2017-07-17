package indeed;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Merge a number of sorted streams.
 * 
 * Print out elements in order with occurrence greater than number k.
 * 
 * 
 * @author Oscar
 *
 */

public class StreamMerge {
	
	class Stream {
		boolean hasNext();
		int next();
		int peek();
	}
	
	void mergeStreams(List<Stream> streams, int k) {
		while(streams.size() >= k) {
		
			int min = Integer.MAX_VALUE;
			int minCount = 0;
			
			Iterator<Stream> iter = streams.iterator();
			List<Stream> minStreams = new ArrayList<Stream>();
			while(iter.hasNext()) {
				Stream stream = iter.next();
				if (stream.hasNext()) {
					int peek = iter.next().peek();
					// Look for minimum
					if (peek < min) {
						min = peek;
						minCount = 1;
						minStreams = new ArrayList<Stream>();
						minStreams.add(stream);
					}
					// repeating min, increase count
					if (peek == min) {
						minCount++;
						minStreams.add(stream);
					}
				}
			}
			
			if (minCount >= k) {
				System.out.println(min);
				
			}
			
			// Remove stream from main stream list that reaches end
			for (Stream s : streams) {
				if (s.hasNext()) s.next();
				else streams.remove(s);
			}
		}
			
		
	}

}
