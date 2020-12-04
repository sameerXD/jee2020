package sataStruct;

public class TreeAsArray {
	
	int root=0;
	
	String arr[] = new String[7];
	
	void Root(String a) {
		arr[root] = a;
	}
	boolean isTree() {
		if(arr[root]==null) {
			return false;
		}
		return true;
	}
	
	void insertLeft(String data,int p ) {
		 int n = 2*p + 1;
		 arr[n]=data;
	}
	void insertRight(String data,int p ) {
		 int n = 2*p + 2;
		 arr[n]=data;
	}
	void printTree() {
		for(String x : arr) {
			System.out.println(x+", ");
		}
	}
	
	public static void main(String[] args) {
		TreeAsArray sam = new TreeAsArray();
		sam.Root("A");
		sam.insertLeft("B", 0);
		sam.insertRight("C", 0);
		sam.insertLeft("D", 1);
		sam.insertRight("E", 1);
		sam.printTree();
	}

}
