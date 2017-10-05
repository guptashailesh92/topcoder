import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class MountainRanges {
	
	public int countPeaks(int[] heights) {
		int cnt = 0;
		for (int i = 0; i < heights.length; i++) {
			boolean left = false, right = false;
			if(i == 0 || heights[i-1] < heights[i]) left = true;
			if(i == heights.length -1 || heights[i+1] < heights[i]) right = true;
			if(left && right) cnt ++;
		}
		return cnt;
	}
}
