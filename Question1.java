import java.util.*;
class Insertionsort{
	public static void main(String args[]){
		int temp = 0;
		int j = 0;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of elements in an Array : ");
	int n = sc.nextInt();
	
	int arr[] = new int[n];
	System.out.println("Enter Array Elements >>");
	for(int i=0;i<n;i++){
		arr[i] = sc.nextInt();
	}
	
	for(int k=0;k<n;k++){
		temp = arr[k];
		j = k-1;
		while(j>-1 && temp < arr[j]){
			arr[j+1] = arr[j];
			j = j-1;
		}
		arr[j+1] = temp;
	}
	System.out.print("Sorted Elements >> ");
	for(int k=0;k<n;k++){
		System.out.print(arr[k]+" ");
	}
	

	}
}
