function greeting(fname,callback){
    return "Welcome "+callback(fname)+" to the JavaScript world!";
}
var maleInfo = function(fname){
    return "Mr "+fname;
}
var femaleInfo = (fname)=>"Miss "+fname;

//alert(greeting("John",maleInfo));
//alert(greeting("Mary",femaleInfo));
// alert(greeting("John", function(fname){
//     return "Mr "+fname;
// }));

alert(greeting("Mary", (fname)=>"Miss "+fname));