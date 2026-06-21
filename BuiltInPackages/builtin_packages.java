package BuiltInPackages;
import java.util.Arrays;
import java.util.ArrayList;
public class builtin_packages {
	public static void main(String args[]) {
		/*String text="Hello java";
		System.out.println(text.length());
		int max=Math.max(10,20);
		System.out.println(max);
		System.out.println("Time "+System.currentTimeMillis());
		double n=Integer.parseInt("100");
		System.out.println(n);*/
		/*Integer a=100;
		int b=a;
		a=Integer.parseInt("1000");
		String s=Integer.toString(a);
		System.out.println(a);
		System.out.println(b);
		System.out.println(s);
		Float f1=0.101f;
		float f2=f1;
		System.out.println(f2);*/
/*		int arr[]= {12,2,6,10,85,0};
		System.out.println("Unsorted ");
		printArray(arr);
		Arrays.sort(arr);
		System.out.println("Sorted ");
		printArray(arr);
		int i=Arrays.binarySearch(arr, 9);
		System.out.println("Found at "+i);
		int arr2[]=new int[5];
		Arrays.fill(arr2, 10);
		System.out.println("Filled array:");
		printArray(arr2);
		boolean r=Arrays.equals(arr, arr2);
		System.out.println(r);
		
	}
	static void printArray(int arr[]) {
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}*/
		ArrayList<Integer>list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		System.out.println(list.get(0));
		list.remove(2);
		System.out.println(list);
		System.out.println(list.size());
		}
}

