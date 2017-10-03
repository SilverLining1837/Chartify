
public class Test {
	public static int recursiveBS(int target, int[] list, int start,int end)
    {
        if(list[(start+end)/2]-target<0)
           return  recursiveBS(target, list, ((start+end)/2)+1, end);
        else if(list[(start+end)/2]-target>0)
           return recursiveBS(target, list,start, (start+end)/2);
        else
        	return list[(start+end)/2];
    }
	public static int recursiveLS(int target, int[] list, int start){
		if(target==list[start])
			return target;
		else if(start+1<list.length)
			return recursiveLS(target, list, start+1);
		else
			return -1;
	}
	public static int fibonacci(int n){
		if(n==1 || n==0)
			return n;
		else
			return fibonacci(n-1)+fibonacci(n-2);
	}
	public static void main(String[] args){
		int[] x={1, 2, 3 ,4 ,5 ,6};
		System.out.println(recursiveLS(5,x, 0));
		System.out.println(fibonacci(7));
	}
}
