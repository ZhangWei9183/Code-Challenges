function mostFrequent(arr) {
  const map = new Map()
  let max = 0
  let ans;

  for (const elem of arr) {
    
    if (map.has(elem)) {
      map.set(elem, map.get(elem) + 1)
    } else {
      map.set(elem, 1)
    }

    if (map.get(elem) > max) {
      ans = elem
      max = map.get(elem)
    }
  }

  return ans
}
