const createRuppies = (amount) => {
  const ru = [1, 2, 5, 10, 20, 50, 100, 200, 500, 2000];

  if (amount == 0) {
    return [];
  }

  let ans;

  ru.forEach((ele, i) => {
    if (amount - ru[i] >= 0) {
      let subAns = createRuppies(amount - ru[i]);
      //   console.log(subAns);

      if (subAns !== ans && subAns + 1 < ans) {
        ans = subAns + 1;
      }
    }
  });

  console.log(ans);

  return ans;
};

createRuppies(200);
