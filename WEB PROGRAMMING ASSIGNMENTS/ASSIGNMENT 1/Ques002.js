// 2.WAP to illustrate the declaration of object, assignment of value and display it

var objectName = {1 : "saurabh", 2 : "manoj", 3 : "meghana"};
for(var i in objectName)
{
    console.log(i +" "+objectName[i]);
}

objectName[4] = "milan";

for(i in objectName)
{
    console.log(i+" "+objectName[i]);
}

objectName[2] = "tanuja";

for(i in objectName)
{
    console.log(i+" "+objectName[i]);
}