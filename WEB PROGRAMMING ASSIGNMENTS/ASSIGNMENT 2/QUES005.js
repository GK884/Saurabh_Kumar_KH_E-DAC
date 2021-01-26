// 5)Write a javascript function named length_of_array , 
// which takes an array as argument and returns the number 
// of elements in that array (as opposed to what is given 
// by the length property of the array). Remember undefined 
// can also be an element if it is explicitly set at some 
// index, e.g. x[5] = undefined; . This undefined should be counted, 
// but elements which are not present in the array (as arrays can be sparse), should not be counted


function length_of_array1(length_of_array)
{
    var count = 0;
    length_of_array.forEach(i => {
        console.log(i);
        count++;
    });
    console.log(count);
}
var length_of_array = [1,2,3,4,undefined,null,undefined,10];
length_of_array1(length_of_array)

