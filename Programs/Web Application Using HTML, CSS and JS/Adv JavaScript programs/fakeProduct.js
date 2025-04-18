function generateFakeProductData(){
    // display data on console 
//fetch('https://fakestoreapi.com/products')
//.then(res=>res.json()).then(json=>console.log(json)).catch(error=>console.log(error));

// display data on browser
fetch('https://fakestoreapi.com/products')
.then(res=>res.json()).then(products=>{
    products.map(product=>{
        var p = document.createElement('p');
        var ptagContent = 
        document.createTextNode(product.title+" "+product.price+" "+product.description+" "+product.category);
        p.appendChild(ptagContent);
        document.getElementById('products').appendChild(p);
    })
   
}).catch(error=>console.log(error));

}