function is_integer(num)
{
    if(isNaN(num))
    {
        return false;
    }
    else
    {
        return true;
    }
}

console.log(is_integer(3.2));