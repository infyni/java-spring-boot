function someTask() {
    //alert("event fired");
    var fname = document.getElementById("fname").value;
    var pTag = document.createElement("p");     // p tag created.   <p></p>
    var pTagContent = document.createTextNode(fname); // p tag content created.  "This is a paragraph"
    pTag.appendChild(pTagContent);      // <p>This is a paragraph</p>
    pTag.setAttribute("class","para");  // adding dynamic class to p tag.  <p class="para">This is a paragraph</p>
    document.getElementsByTagName("div")[0].appendChild(pTag); // <div><p>This is a paragraph</p></div>
    document.getElementById("fname").value=""; // input field cleared
}