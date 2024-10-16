package studio5;

import edu.princeton.cs.introcs.StdDraw;

public class Methods {

	/**
	 * Compute the (Euclidean) distance between two points.
	 *
	 * @param x1 x-coordinate of a point
	 * @param y1 y-coordinate of a point
	 * @param x2 x-coordinate of another point
	 * @param y2 y-coordinate of another point
	 * @return the Euclidean distance between (x1,y1) and (x2,y2)
	 */
	public static double distanceBetween(double x1, double y1, double x2, double y2) {
	    double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	    return distance;
	}

	

	/**
	 * Draw a bull's eye at the given location with the given radius.
	 *
	 * @param x      the x coordinate of the center of the bull's eye
	 * @param y      the y coordinate of the center of the bull's eye
	 * @param radius the radius of the bull's eye
	 */
	public static void drawBullsEye(double x, double y, double radius) {
	    // 黑色圆（最外层）
	    StdDraw.setPenColor(StdDraw.BLACK);
	    StdDraw.filledCircle(x, y, radius);

	    // 蓝色圆（3/4的半径）
	    StdDraw.setPenColor(0, 109, 219); // 蓝色的RGB值
	    StdDraw.filledCircle(x, y, radius * 3.0 / 4.0);

	    // 红色圆（1/2的半径）
	    StdDraw.setPenColor(146, 0, 0); // 红色的RGB值
	    StdDraw.filledCircle(x, y, radius * 1.0 / 2.0);

	    // 黄色圆（1/4的半径）
	    StdDraw.setPenColor(255, 255, 109); // 黄色的RGB值
	    StdDraw.filledCircle(x, y, radius * 1.0 / 4.0);
	}


	/**
	 * Return a new String which is the original source String with all occurrences
	 * of the target character substituted by the replacement String.
	 * 
	 * @param source      the source String
	 * @param target      the target character to be replaced
	 * @param replacement the replacement String
	 * 
	 * @return the String which results from substituting all of the target
	 *         characters in the source String with the replacement String
	 */
	public static String substituteAll(String source, char target, String replacement) {
		String result = "";
		// TODO: Finish this method
		
		return result;
	}

	/**
	 * Compute the sum of elements in an array
	 * 
	 * @param values an array of integers
	 * @return the sum of the elements in values
	 */
	public static int arraySum(int[] values) {
	    int sum = 0;  // 初始化总和为0
	    for (int value : values) {
	        sum += value;  // 累加数组中的每个元素
	    }
	    return sum;  // 返回总和
	}


	/**
	 * Return an array of a given size filled with the provided value
	 * 
	 * @param length the length of the returned array
	 * @param value  the value to fill the array with
	 * @return an array of the specified length that's filled with the provided value
	 */
	public static int[] filledArray(int length, int value) {
	    int[] values = new int[length];  // 创建一个指定长度的数组
	    for (int i = 0; i < length; i++) {
	        values[i] = value;  // 将每个元素设置为提供的 value
	    }
	    return values;  // 返回数组
	}

	// TODO: Create an arrayMean method which accepts an int array of values parameter.
	// TODO: Create a JavaDoc comment for the arrayMean method.
	/**
	 * Computes the mean (arithmetic average) of the elements in an array.
	 *
	 * This method calculates the sum of the elements in the array using the 
	 * previously defined {@link #arraySum(int[])} method, then divides the sum 
	 * by the number of elements in the array to get the mean.
	 *
	 * @param values an array of integers whose mean is to be calculated
	 * @return the arithmetic mean of the elements in the array
	 *         as a double value
	 * @throws IllegalArgumentException if the array is empty
	 */
	public static double arrayMean(int[] values) {
	    if (values.length == 0) {
	        throw new IllegalArgumentException("Array must not be empty");
	    }
	    return (double) arraySum(values) / values.length;
	}


	
}
