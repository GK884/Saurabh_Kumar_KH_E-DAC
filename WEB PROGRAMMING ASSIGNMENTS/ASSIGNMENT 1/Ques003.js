var array = [1,2,3]

for(var k in array)
{
    console.log(k + " " +array[k])
}
console.log("length1 of the array is : "+array.length);
array[10] = 30
console.log("length2 of the array is : "+array.length);
console.log("simple loop");
for (let i = 0; i < array.length; i++) {
    console.log(i +" "+ array[i]);
}
console.log("length3 of the array is : "+array.length);
console.log("for each loop")
for(k in array)
{
    console.log(k + " " +array[k]);
}

console.log("length4 of the array is : "+array.length);