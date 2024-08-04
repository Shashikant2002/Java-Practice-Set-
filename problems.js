// let input_1 = { a: 1, b: 2, c: 3, d: 10, e: 12, f: 6 };
// let input_2 = { a: 2, e: 12, f: 6, d: 10 };

// // console.log(Object.entries(input_1));
// // console.log(Object.entries(input_2));

// let data = new Object();

// Object.entries(input_1).forEach((in_1) => {
//   Object.entries(input_2).forEach((in_2) => {
//     if (in_1[0] == in_2[0] && in_1[1] == in_2[1]) {
//       data[in_1[0]] = in_1[1];
//     }
//   });
// });

// console.log(data);

// Second Largest ==================>
// let input_1 = [2, -8, 5, 8, 10, 12];

// let seLargest = input_1.sort((a, b) => a - b)[input_1.length - 2];

// console.log(seLargest);

// ================================>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

// let arr = [8, 5, 6, 7, 1, 2, 3, 4, 5, 101, 121, 200];

// let flag = [];

// for (let ele of arr) {
//   flag.push({ num: ele, start: true });
// }

// flag.forEach((ele, i) => {
//   let incInclude = arr.includes(ele.num + 1);
//   let decInclude = arr.includes(ele.num - 1);

//   if (incInclude && decInclude) {
//     ele.start = false;
//   }
// });

// console.log(flag);

// let countResult = [];

// flag.forEach((ele, ind) => {
//   if (ele.start) {
//     let tsp = ind;
//     let tep = 0;

//     console.log("start =====================>>>>>>>>>>>>>");

//     let newData = [ele.num];

//     for (let i = ind + 1; i < flag.length; i++) {
//       if (flag[i].start) {
//         break;
//       } else {
//           console.log(" ====>>>", flag[i], i);
//           newData.push(flag[i].num)
//           if (flag[i].num - 1 == flag[i - 1]?.num) {
//           // console.log(flag[i].num, "   ", flag[i + 1]?.num);

//         }
//       }
//     }
//     countResult.push(newData)
//     console.log(newData);
//   }
// });

// console.log(countResult);

// let arr = [8, 5, 6, 7, 1, 2, 3, 4, 5, 101, 121, 200];

// let subSeq = [];

// for (let i = 0; i < arr.length; i++) {
//   if (i == 0) {
//     subSeq.push({ ele: arr[i], start: true });
//   } else {
//     if (arr[i] + 1 == arr[i + 1]) {
//       subSeq.push({ ele: arr[i], start: false });
//     } else {
//       subSeq.push({ ele: arr[i], start: true });
//     }
//   }

//   let incInclude = arr[i] + 1;
//   let decInclude = arr[i] - 1;

//   console.log("new =======>>>>>>>");
//   console.log(incInclude, decInclude);
// }

// console.log(subSeq);

// function topKFrequent(nums, k) {
//   console.log(nums);

//   if (nums.length == 1) {
//     return nums;
//   }

//   let tempRes = [];

//   nums.forEach((element) => {
//     let isIncluded = tempRes.findIndex((ele) => element == ele.num);

//     if (isIncluded == -1) {
//       tempRes.push({ num: element, count: 1 });
//     } else {
//       console.log(isIncluded);
//       tempRes[isIncluded].count += 1;
//     }
//   });

//   let sorted = tempRes.sort((a, b) => a.count - b.count);
//   let result = sorted.splice(sorted.length - k, k);

//   return result.map((ele) => ele.num);
// }

// console.log(topKFrequent([1, 1, 1, 2, 2, 3], 2));

// function findLongestConsecutiveSequence(arr) {
//   if (arr.length === 0) return [];

//   // Sort the array
//   arr.sort((a, b) => a - b);

//   let longestStreak = 1;
//   let currentStreak = 1;
//   let longestSequence = [arr[0]];
//   let currentSequence = [arr[0]];

//   for (let i = 1; i < arr.length; i++) {
//     if (arr[i] !== arr[i - 1]) {
//       if (arr[i] === arr[i - 1] + 1) {
//         currentStreak++;
//         currentSequence.push(arr[i]);
//       } else {
//         if (currentStreak > longestStreak) {
//           longestStreak = currentStreak;
//           longestSequence = [...currentSequence];
//         }
//         currentStreak = 1;
//         currentSequence = [arr[i]];
//       }
//     }
//   }

//   if (currentStreak > longestStreak) {
//     longestSequence = [...currentSequence];
//   }

//   return longestSequence;
// }

// // Example usage:
// const input = [8, 5, 6, 7, 1, 2, 3, 4, 5, 101, 121, 200];
// const longestSequence = findLongestConsecutiveSequence(input);
// console.log(longestSequence); // Output: [1, 2, 3, 4, 5]

function clumsy(n) {
  let seq = ["*", "/", "+", "-"];
  let seqNum = 1;

  let res = n;

  let newSeqArr = "";

  for (let i = n - 1; i > 0; i--) {
    switch (seqNum) {
      case 2:
        console.log(res, seq[seqNum - 1], i, " seq =>> ", res / i);
        res = Math.floor(res / i);
        seqNum += 1;
        break;
      case 1:
        console.log(res, seq[seqNum - 1], i, " seq =>> ", res * i);
        res = Math.floor(res * i);
        seqNum += 1;
        break;
      case 3:
        console.log(res, seq[seqNum - 1], i, " seq =>> ", res + i);
        res = Math.floor(res + i);
        seqNum += 1;
        break;
      case 4:
        console.log(res, seq[seqNum - 1], i, " seq =>> ", res - i);
        res = Math.floor(res - i);
        // seqNum = 1;
        seqNum = (seqNum + 1) % 4;
        break;
    }
  }

  return res;
}

console.log(clumsy(10));
