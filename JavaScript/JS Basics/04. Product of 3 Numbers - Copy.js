function product3Number(nums) {
  let X = Number(nums[0]);
  let Y = Number(nums[1]);
  let Z = Number(nums[2]);
  let count = 0;
  if (X < 0) {
    count++;
  }
  if (Y < 0) {
    count++;
  }
  if (Z < 0) {
    count++;
  }
  if (count % 2 == 0) {
    console.log("Positive");
  } else {
    console.log("Negative");
  }
}