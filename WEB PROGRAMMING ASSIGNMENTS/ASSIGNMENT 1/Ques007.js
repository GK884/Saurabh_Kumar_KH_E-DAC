function fact(num)
{
    var f = 1;
    for(var i = 1 ; i <= num ; i++ )
    {
        f *= i; // f = f * i;
    }
    return f;
}

console.log(fact(4));