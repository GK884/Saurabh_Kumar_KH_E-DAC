// 4)Write a Javascript program to sort elements of an array using sorting algorithm

function func(arrayToSort) {
    for(var i = 0; i<arrayToSort.length;i++)
    {
        for (let j = 0; j < arrayToSort.length; j++) 
        {
            if(arrayToSort[i]<arrayToSort[j])
            {
                var temp = arrayToSort[i];
                arrayToSort[i] = arrayToSort[j]
                arrayToSort[j] = temp;
            }
        }
    }
    return (arrayToSort);
}

var arrayToSort = [3,6,2,4,5];
console.log(func(arrayToSort));