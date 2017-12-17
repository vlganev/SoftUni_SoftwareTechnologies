function multiplyOrDivide(nums) {
    let N = Number(nums[0]);
    let X = Number(nums[1]);
    let sum = 0;
    if (X >= N) {
      sum = X*N;
      } else {
      sum = N / X;
      }
      console.log(sum);
}