function removeDuplicates(nums) {
  let j = 1;

  for (let i = 0; i < nums.length; i++) {
    if (nums[i] != nums[i + 1]) {
      nums[j] = nums[i + 1];
    }
  }
}

console.log(removeDuplicates([0, 0, 1, 1, 1, 2, 2, 3, 3, 4]));
