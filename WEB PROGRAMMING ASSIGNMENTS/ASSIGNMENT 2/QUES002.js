// 2) Write a javascript function named reverse which takes a string argument and returns the reversed string

function reverse()
{
    var str = "saurabh";
    console.log(str);
    // return (reverseString(str))
    var value = str.length;
    console.log(value)
    var res = "";
    for(var i = str.length-1;i>=0;i--)
    {
        res+=str[i];
    }
    console.log(res);

    return res.split("").reverse().join("");

}

console.log(reverse());