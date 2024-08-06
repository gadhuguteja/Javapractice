package com.javapractice.threadpractice;

public class LeetCodePractice {

	public static void main(String[] args) {

		LeetCodePractice lp = new LeetCodePractice();
		System.out.println(lp.removeElement(new int[] {3,2,2,3}, 3));
		

	}
	
	public int removeElement(int[] nums, int val) {
		int index = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        System.out.println("Expected:"+ nums[index]);
		return index;
	}
}
