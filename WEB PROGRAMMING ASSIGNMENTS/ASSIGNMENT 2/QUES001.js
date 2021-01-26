// 1)With example illustrate  variable and function closure in javascript. 

var func = function(){
    var x = 10
    console.log(x);
    return function(y){
        console.log(y)
        return "hello";
    }
}

var getval = func();
console.log(getval(5))