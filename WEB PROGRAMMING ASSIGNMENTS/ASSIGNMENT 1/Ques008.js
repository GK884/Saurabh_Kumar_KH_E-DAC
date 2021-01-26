// 1 2 5 10 25
// 87 = 25*3 + 10*1 + 2*1

function printMoney(a,notes)
{
    for(var i = 0;i<a;i++)
        console.log(notes);
}
function BreakMoney(money)
{

    if(money >= 25)
    {
        var a = parseInt(money/25);
        console.log("money divided by 25 is: "+ a);
        printMoney(a,"25");
        money = parseInt(money%25);
        console.log("25 last : "+money)
    }
    if(money >= 10)
    {
        var a = parseInt(money/10);
        console.log("money divided by 10 is: "+ a);
        printMoney(a,"10");
        money = parseInt(money%10);
        console.log("10 last : "+money)
    }
    if(money >= 5)
    {
        var a = parseInt(money/5);
        console.log("money divided by 5 is: "+ a);
        printMoney(a,"5");
        money = parseInt(money%5);
        console.log("5 last : "+money)
    }
    if(money >= 2)
    {
        var a = parseInt(money/2);
        console.log("money divided by 2 is: "+ a);
        printMoney(a,"2");
        money = parseInt(money%2);
        console.log("2 last : "+money)
    }
    if(money >= 1)
    {
        var a = parseInt(money/1);
        console.log("money divided by 1 is: "+ a);
        printMoney(a,"1");
        console.log("1 last : "+money)
    }
}

BreakMoney(101);