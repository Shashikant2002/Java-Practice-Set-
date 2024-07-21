// function searchInsert(nums, target) {
//   let index = 0;

//   for (let i = 0; i < nums.length; i++) {
//     if (nums[i] == target) {
//       index = i;
//       break;
//     }
//     if (nums[i] < target) {
//       console.log(nums[i], target);
//       index += 1;
//     }
//   }

//   return index;
// }

// console.log(searchInsert([1, 3, 4, 6], 5));

function myAtoi(s) {
  let l, r;

  for (let i = 0; i < s.length; i++) {
    if (!Number(l) || !Number(r)) {
      if (Number(l)) {
        if (Number(s[i]) || s[i] == "-") {
          r = i;
        }
      }

      if (Number(s[i]) || s[i] == "-") {
        l = i;
      }
    }
  }

  console.log(l, r);

  return Number(s.slice(l, r));
}

console.log(myAtoi("  _ -17_4564"));
