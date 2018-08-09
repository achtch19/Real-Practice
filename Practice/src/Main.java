

class Main {
	
	
	public static void main(String[] args) {
		
		int [] [] x = {{1,2,3},{4,5,6},{7,8,9}};
		calc3Det(x);
	}
	
	public static void calc3Det(int [] [] arr) {
		int x =0;
		int [][] arr1 = new int [2][2];
		for(int i =0; i<arr[0].length;i++) {
			if(i==0) {
			
			arr1[0][0] = arr[1][1];
			arr1[0][1] = arr[1][2];
			arr1[1][0] = arr[2][1];
			arr1[1][1] = arr[2][2];
		}
			else if(i==1) {
				
				arr1[0][0] = arr[1][0];
				arr1[0][1] = arr[1][2];
				arr1[1][0] = arr[2][0];
				arr1[1][1] = arr[2][2];
			}
			else {
				
				
				arr1[0][0] = arr[1][0];
				arr1[0][1] = arr[1][1];
				arr1[1][0] = arr[2][0];
				arr1[1][1] = arr[2][1];
			}
			
			if(i%2==0) {
				x+=arr[0][i]*calc2Det(arr1);
			}
			else {
				x-=arr[0][i]*calc2Det(arr1);
			}

		
	}
		System.out.println(x);
	}
	
	public static int calc2Det(int [] [] arr) {
		
	int y = arr[0][0]*arr[1][1] - arr[0][1]*arr[1][0];
	return y;
	}
}