// let a = parseFloat(prompt("Enter the number 1: "));
// let b = parseFloat(prompt("Enter the number 2: "));
// let c = Math.random();
// let d = prompt("Enter the Operator (+, -, /, *, **): ");
// function add(a, b) {
//     return a + b;
// }

// function subtract(a, b) {
//     return a - b;
// }

// function division(a, b) {
//     if (b === 0) {
//         return "Error: Division by zero is not allowed!";
//     }
//     return a / b;
// }

// function multiply(a, b) {
//     return a * b;
// }

// function P(a, b) {
//     return a ** b;
// }

// if (c < 0.1) {
//     console.log("Random number is less than 0.1. Executing operation...");
//     let result;
//      switch (d) {
//      case "+":
//           result = subtract(a, b);
//           break;
//      case "-":
//           result = division(a, b);
//           break;
//      case "/":
//           result = P(a, b);
//           break;
//      case "*":
//           result = add(a, b);
//           break;
//      case "**":
//           result = multiply(a, b);
//           break;
//      default:
//           result = "Error: Invalid operator!";
//           break;
//      }

//      console.log(`The result of ${a} ${d} ${b} is: ${result}`);
// }
// else{
//      let result;
//      switch (d) {
//      case "+":
//           result = add(a, b);
//           break;
//      case "-":
//           result = subtract(a, b);
//           break;
//      case "/":
//           result = division(a, b);
//           break;
//      case "*":
//           result = multiply(a, b);
//           break;
//      case "**":
//           result = P(a, b);
//           break;
//      default:
//           result = "Error: Invalid operator!";
//           break;
//      }

//      console.log(`The result of ${a} ${d} ${b} is: ${result}`);
// }


// let rand=Math.random();
// let first,second,third;

// if(rand<0.33){
//      first="Crazy";
// }
// else if(rand>0.33&&rand <0.66){
//      first="Amazing";
// }
// else{
//      first="Fire";
// }

// if(rand<0.33){
//      second="Engine";
// }
// else if(rand>0.33&&rand <0.66){
//      second="Foods";
// }
// else{
//      second="Garments";
// }

// if(rand<0.33){
//      third="Bros";
// }
// else if(rand>0.33&&rand <0.66){
//      third="Limited";
// }
// else{
//      third="Hub";
// }

// console.log(`The Random name is ${first} ${second} ${third}`);


//  let a=prompt("Enter the number 1: ");
//  let sum=1;
//  function factor(a){
//      for(let i=1;i<=a;i++){
//           sum=sum*i;
//      }
//      console.log(sum);
//  }
//  factor(a);
 
// let a=6;
// function factorial(number){
//      let arr=Array.from(Array(number+1).keys());
//      let c=arr.slice(1,).reduce((a,b)=>{
//           return a*b;
//      });
//      console.log(c);
     
// }
// factorial(a);

// document.title="Prasanth Kumar";

// document.body.firstElementChild;
// document.body.firstElementChild.childNodes
// document.body.firstElementChild.children

// let a=document.getElementsByClassName("box");
// console.log(a);
// a[2].style.background.color="red"


// document.getElementById("box1").style.backgroundColor="red"

//Example -12
// let boxes=document.getElementsByClassName("box");
// // let boxes=document.querySelector(".container").children;
// function getrandomcolor(){
//      let val1=Math.ceil(Math.random()*255);
//      let val2=Math.ceil(Math.random()*255);
//      let val3=Math.ceil(Math.random()*255);
//      return `rgb(${val1},${val2},${val3})`;
// }
// // Array.from(boxes).forEach(e=>{
// //      e.style.backgroundColor=getrandomcolor();
// // });
// for(let i=0;i<boxes.length;i++){
//      boxes[i].style.backgroundColor=getrandomcolor();
// }

// function createCard(title, cName, views, monthsOld, duration, thumbnail) {
//      let viewStr;
//      if (views < 1000) {
//          viewStr = views;
//      } else if (views >= 1000000) { // Corrected the condition
//          viewStr = (views / 1000000).toFixed(1) + "M"; // Added .toFixed(1) for better formatting
//      } else {
//          viewStr = (views / 1000).toFixed(1) + "K"; // Added .toFixed(1) for better formatting
//      }
 
//      // Create the card HTML
//      let html = `<div class="card">
//          <div class="image">
//              <img src="${thumbnail}" alt="Thumbnail">
//              <div class="capsule">${duration}</div>
//          </div>
//          <div class="text">
//              <h1>${title}</h1>
//              <p>${cName} . ${viewStr} views . ${monthsOld} months ago</p>
//          </div> 
//      </div>`;
//      document.querySelector(".container").innerHTML += html; // Cleaner append operation
//  }
//  createCard(
//      "Introduction to Backend | Sigma Web Dev video #2",
//      "CodeWithHarry",
//      560000,
//      7,
//      "31:22",
//      "https://i.ytimg.com/vi/tVzUXW6siu0/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLACwWOixJVrKLFindK92kYMgTcQbw"
//  );
 
// let b = document.getElementById("btn");
// b.addEventListener("click", (e) => {
//      // e.stopPropagation();
//     document.querySelector(".box").innerHTML = "Yeah You have clicked the Button!!";
// });

// let a=prompt("Enter the first number: ");
// let b=prompt("Enter the second number: ");
// let sum=parseInt(a)+parseInt(b);
// console.log("The Sum is: ",sum);


// let  obj={
//      a:"Prasanth",
//      b:"Hemanth"
// };
// console.log(obj);

// let animal={
//      eats:true
// };

// let rabbit={
//      jumps:true
// };
// rabbit.__proto__=animal;


class Animal{
     constructor(name){
          this.name=name;
          console.log("Objected Created...");
     }
     eats(){
          console.log("i am eating!!");
     }
     jumps(){
          console.log("I will jump higher than you");
     }
}
class Lion extends Animal{

}
let a= new Animal("Bunny");
let b=new Lion("shera");