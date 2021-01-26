function sumArray(a)
{
    var sum = 0;
    for(var i in a)
    {
        sum += a[i];
    }
    return(sum);
    // console.log(sum)
}
var a = [2,5,8];
console.log(sumArray(a));