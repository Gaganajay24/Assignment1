

import java.util.Scanner;

public class VoterValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean status=false;
		int[] voterId= {12121,34565,67789,34679};
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Voter Id : ");
		int voteId=sc.nextInt();
		
		for(int x:voterId) {
			if(x==voteId) {
				System.out.println("The VoterId is valid");
				status=true;
				break;
			}
		}
		if(status==false) {
			System.out.println("The VoterId is Invalid");
		}
		
		

	}

}
