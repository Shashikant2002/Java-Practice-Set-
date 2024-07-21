function searchInsert(nums, target) {
  let index = 0;

  for (let i = 0; i < nums.length; i++) {
    if (nums[i] > target) {
      ++index;
    }
  }

  return index;
}

console.log(searchInsert([2,8,6,5], 8));
