// // if (flag[i].num + 1 == flag[i + 1]?.num) {
// //     //     console.log(" ====>>>", flag[i]);
// //     //   }

// let reverseArray = (arr) => {
//   let newArr = [];

//   for (i = arr.length - 1; i >= 0; i--) {
//     newArr.push(arr[i]);
//   }

//   return newArr;
// };

// var addTwoNumbers = function (l1, l2) {
//   let num1 = Number(reverseArray(l1).join(",").replace(/,/g, ""));
//   let num2 = Number(reverseArray(l2).join(",").replace(/,/g, ""));

//   let res = num1 + num2;

//   let mainRes = reverseArray(res.toString().split(""))

//   return mainRes;
// };

// console.log(addTwoNumbers([2, 4, 3], [5, 6, 4]));

// function myAtoi(s) {
//   let start;
//   let end;
//   const INT_MAX = 2147483647;
//   const INT_MIN = -2147483648;

//   if (Number(s).toString() !== "NaN") {
//     if (s > INT_MAX) return INT_MAX;
//     if (s < INT_MIN) return INT_MIN;
//     return Number(s);
//   }

//   for (let i = 0; i < s.length; i++) {
//     if (Number(s[i]).toString() !== "NaN") {
//       if (!start && !end) {
//         start = i + 1;
//       }
//     }
//     if (start && !end && Number(s[i]).toString() == "NaN") {
//       end = i + 1;
//     }
//   }

//   if (!end) {
//     end = s.length+1;
//   }

//   start -= 1;
//   end -= 1;

//   let res;
//   if (s[start - 1] == "-") {
//     res = Number(`-${s.slice(start, end)}`);
//   } else {
//     res = Number(s.slice(start, end));
//   }

//   console.log(start, end, res);

//   if (res > INT_MAX) return INT_MAX;
//   if (res < INT_MIN) return INT_MIN;

//   return res;
// }

function myAtoi(s) {
  let i = 0;
  let sign = 1;
  let result = 0;

  // Discard leading whitespaces
  while (i < s.length && s[i] === ' ') {
      i++;
  }

  // Check for sign
  if (i < s.length && (s[i] === '-' || s[i] === '+')) {
      sign = (s[i] === '-') ? -1 : 1;
      i++;
  }

  // Convert characters to integer
  while (i < s.length && s[i] >= '0' && s[i] <= '9') {
      result = result * 10 + (s[i] - '0');
      i++;
  }

  // Apply the sign and handle overflow
  result *= sign;

  // Clamp result within 32-bit signed integer range
  const INT_MAX = 2147483647;
  const INT_MIN = -2147483648;

  if (result > INT_MAX) return INT_MAX;
  if (result < INT_MIN) return INT_MIN;

  return result;
}

console.log(myAtoi("+-12"));
