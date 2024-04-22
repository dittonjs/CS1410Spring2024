let count = 0;
function increment(e) {
  e.target.innerText = "" + (count ++);
}


function doMath() {
  console.log(arguments[0] + arguments[1]);
}
