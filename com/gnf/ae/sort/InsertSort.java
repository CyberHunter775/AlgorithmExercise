package com.gnf.ae.sort;

/**
 * 插入排序
 *
 */
public class InsertSort {

  public static void main(String[] args) {
    int[] nums = {1, 5, 9, 2, 55, 8, 4, 6};
    methodInsertSort(nums);
  }


  private static void methodInsertSort(int[] nums) {
    for (int i = 1; i < nums.length; i++) {
      for (int j = i; j > 0; j--) {
        if (nums[j] < nums[j - 1]) {
          int temp = nums[j];
          nums[j] = nums[j - 1];
          nums[j - 1] = temp;
        }
      }
    }
    AlgorithmsSortUtil.show(nums);

  }

}
