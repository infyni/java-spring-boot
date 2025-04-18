// normal function 
function hello() {
    alert("Hello Normal function!");
}
hello(); // call normal function

var hi = function(){
    alert("Hello Anonymous function! using expression style");
}
hi(); // call anonymous function in expression style 

// arrow function: function keyword replace by =>
var callMe = () => {
    alert("Hello Arrow function!");
}
callMe(); // call arrow function
// addition of two number using express style 
var addNumber1  = function(a, b) {
    var sum = a + b;
    return sum;
}
var result1 =  addNumber1(10, 20);
alert("Sum of two number is using expression style: " + result1);
// addition of two number using arrow style. arrow function return the value without return keyword. 
var addNumber2 = (a,b)=>a+b;
var result2 = addNumber2(10, 20);
alert("Sum of two number is using arrow style: " + result2);




