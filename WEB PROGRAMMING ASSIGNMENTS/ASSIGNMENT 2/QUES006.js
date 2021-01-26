// 6) With suitable example explain OOP concepts in javascript 
// like Inheritance, Constructor, Encapsulation and Abstraction .

// function Parent(name1, age, gender)
// {
//     this.name1 = name1;
//     this.age = age;
//     this.gender = gender;
// }

// function child(name1, age, gender,car)
// {
//     Parent.call(this, name1, age, gender)
//     this.car = car;
// }
// child.prototype = Object.create(Parent.prototype);
// child.prototype.constructor = child;

// child.prototype.drivingCar = function(){
//     console.log(this.name1+" is driving "+ this.car);
// }

// var c1 = new child("saurabh", 25, "M", "brezza");
// console.log(c1.gender);
// c1.drivingCar();



function Parent(name1, age, gender, car)
{
    this.name1 = name1;
    this.gender = gender;
    this.age = age;
    this.car = car;
    Parent.gudBye = function(){
        console.log("gud bye");
    }
}
Parent.prototype.drivingCar = function(){
    console.log(this.name1+" is driving "+ this.car);
}
// var p1 = new Parent("papa", 50, "M", "brezza")
// console.log(p1);

function child(name1, age, gender, car, color)
{
    Parent.call(this, name1, age, gender, car)
    // this.name1 = arguments[0];
    // this.gender= arguments[1];
    this.color = color;
}

child.prototype = Object.create(Parent.prototype);
child.prototype.constructor = child;

child.prototype.drivingCar = function(){
    console.log(this.name1+" is driving "+ this.car+" of color "+this.color);
}


var c1 = new child("saurabh", 25, "M", "brezza", "red");

console.log(c1);

