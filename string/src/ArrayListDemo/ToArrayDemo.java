package ArrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArrayDemo {

	public static void main(String[] args) {
		
		/*
		 * 集合转化成数组
		 * 
		 * 使用的就是Collection接口中的toArray方法
		 * 
		 * 集合转化成数组：可以对集合中的元素操作的方法进行限定。不允许对其进行增删
		 * 
		 */
		
		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		
		/*
		 * toArray方法需要传入一个指定类型的数据类型的数组。
		 * 长度该如何定义呢？
		 * 如果长度小于集合的size，那么该方法就会创建一个同类型并和集合相同size的数组
		 * 如果长度大于集合的size，那么该方法就会使用指定的数组，存储集合中的元素，其他位置默认为null
		 * 
		 * 所以建议，最后长度指定为，集合的size。
		 * 
		 */
		
//		String[] arr = list.toArray(new String[2]);//[abc1, abc2, abc3]
		String[] arr = list.toArray(new String[5]);//[abc1, abc2, abc3, null, null]
		System.out.println(Arrays.toString(arr));
		

	}

}
