function verify(message, key, signature) {
  return getSum(message) + getSum(key) === signature;
}


const getSum = s => {
  let sum = 0
  
  for (let i = 0, code = 0; i < s.length; i++) {
    code = s.charCodeAt(i)

    if (code > 96) {
      sum += code - 96
    } else if (code > 64) {
      sum += code - 38
    }
  }
 
  return sum
}
