function sortDescending(arr) {
  var len = arr.length;

  for (var i = 0; i < len; i++) {
    for (var j = 0; j < len - 1; j++) {
      if (arr[j] < arr[j + 1]) {
        // Swap the elements
        var temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
      }
    }
  }
}

var numbers = [14,22,54,34,21,12,11];
sortDescending(numbers);
console.log(numbers);