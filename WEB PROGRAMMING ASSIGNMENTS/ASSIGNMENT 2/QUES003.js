// 3)Given a javascript array of objects having a radius property as shown [{radius: 5}, {radius: 9}, {radius: 2}] , 
// write a comparator function to sort it.

var radiiA = [{radius : 5}, {radius : 9}, {radius : 2}]
// console.log(radiiA.sort());


radiiA.sort((a,b) => (a.radius > b.radius) ? 1 : ((b.radius > a.radius) ? -1 : 0));
console.log(radiiA);