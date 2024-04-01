function computeSum1(num) {
  if (num == 0) return 0;
  return num + computeSum1(num - 1);
}


function computeSum2(num, sum) {
  if (num == 0) return sum;
  return computeSum2(num - 1, sum + num);
}

console.log(computeSum2(40000))
