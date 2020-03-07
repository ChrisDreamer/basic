import java.util.*;

public class LotteryDrawing {
	public static void main(String[] args) {
		Scanner sa = new Scanner(System.in);
		System.out.println("How mary numbers do you need to draw?");
		int intargNum= sa.nextInt();
		int[] nums=new int[intargNum];
		System.out.println("What is the lagerest number you can draw?");
		intargNum=sa.nextInt();
		int[] bechoose=new int[intargNum];
		
		for(int i=0;i<nums.length;i++) {
			nums[i]=i+1;			
		}
		
		for(int i=intargNum,randNm=0;i>0;i--) {
			randNm=(int)(Math.random()*nums.length);
			bechoose[i-1]=nums[randNm];
			
			nums[randNm]=nums[nums.length-1];
			nums=Arrays.copyOf(nums, nums.length-1);
		}
		
		Arrays.sort(bechoose);
		
		System.out.println("The number is:");
		for(int i:bechoose)
			System.out.print(i+", ");
	}
}
