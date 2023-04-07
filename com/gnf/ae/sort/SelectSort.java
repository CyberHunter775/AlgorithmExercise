package com.gnf.ae.sort;

/**
 * 选择排序
 */
public class SelectSort {


  public static void main(String[] args) {
    int[] nums = {1, 5, 9, 2, 55, 8, 4, 6};
    methodSelectSoft(nums);
  }
  public static void methodSelectSoft(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] > nums[j]) {
          int temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
        }
      }
    }
    AlgorithmsSortUtil.show(nums);
  }


}
