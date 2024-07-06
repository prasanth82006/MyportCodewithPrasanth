// console.log("Hello world!");

// window.alert("this is an alert");

// kvskjksjnv sjk

// var para=document.getElementById("myH1");
// para.textContent="Hello";
// var newpara=document.getElementById("myP");
// newpara.textContent="i like pizza";

// let students = 30;
// // students+=2;
// students **=2; // powers
// console.log(`the total strength of the students is: ${students}`);

// let results = 25 % 3+ 6 ** 7;
// console.log(results);

// let username=window.prompt("what is the password");
// console.log(username);
// if (username=="Prasanth") {
//     console.log("you are accepted");
// }
// else{
//     window.alert("harming!!");
//     console.log("you are not acceptedSubb")
// }

// let username;
// document.getElementById("mysubmit").onclick=function(){
//     username=document.getElementById("mytext").value;
//     document.getElementById("myH1").textContent=`Hello ${username}`;
//     console.log(username);
// }

// let age=parseInt(window.prompt("How old are you?"));
// age+=1;
// console.log(age);

// const PI=3.14;
// document.getElementById("mysubmit").onclick=function() {
//     let radius=document.getElementById("mytext").value;
//     let circumference= 2*PI*radius;
//     document.getElementById("myH3").textContent=`The circumference is: ${circumference}`;
// }


// let de = document.getElementById("decr");
// let re = document.getElementById("res");
// let inc = document.getElementById("incr");
// let cl = document.getElementById("counterlabel");

// let count=0;

// inc.onclick=function(){
//     count++;
//     cl.textContent=count;
// }
// de.onclick=function(){
//     count--;
//     cl.textContent=count;
// }
// re.onclick=function(){
//     count=0;
//     cl.textContent=count;
// }

// let randomnum=Math.floor(Math.random() * 10);
// console.log(randomnum);

// let Name="Prasanth  Kumar";
// let indexname=Name.slice(0,8);
// console.log(indexname);

// let username=window.prompt("Enter your username");
// username=username.trim();
// let Letter=username.charAt(0);
// Letter=Letter.toUpperCasep();
// let extra=username.slice(1,username.length);
// extra=extra.toLowerCase();
// username=Letter+extra;
// console.log(username);

// let min=0;
// let max=100;
// const answer=Math.floor(Math.random() *(max-min+1)) + min;

// let attempts=0;
// let guess;
// let running=true;

// while(running){
//     guess=window.prompt(`enter your number b/w ${min} to ${max}`);
//     guess=Number(guess);
//     if(isNaN(guess)||guess< min|| guess>max){
//         window.alert("Please enter vaild number");
//     }
//     else{
//         attempts++;
//         if(guess > answer){
//             window.alert("Too High! Try again");
//         }
//         else if(guess<answer){
//             window.alert("Too Low! Try again");
//         }
//         else{
//             window.alert(`Correct! the answer was ${answer} and the ${attempts} attempts`);
//             running=false;
//         }
//     }
// }

// let email="Prasanth@gmail.com"
// if(email.includes("@")){
//     console.log("Yes");
// }
// else{
//     console.log("NO");
// }

// const t=document.getElementById("textbox");
// const F=document.getElementById("toF");
// const C=document.getElementById("toC");
// const P=document.getElementById("p");
// let temp;

// function convert(){
//     if(F.checked){
//         temp=Number(textbox.value);
//         temp=temp*9/5+32;
//         P.textContent=temp.toFixed(2)+"*F";
//     } 
//     else if(C.checked){
//         temp=Number(textbox.value);
//         temp=(temp-32)*(5/9);
//         P.textContent=temp.toFixed(2)+"*F";
//     }
//     else{
//         P.textContent="Select a unit";
//     }
// }

// spread operators
// let name=["Prasanth","Kumar","manaswi"];
// let fruit=["mango","apples"];
// let names=[...name,...fruit,"Tulasi"];
// console.log(names);

// call Back function
// Hello(Bye);
// function Hello(callback){
//     console.log("Hello!");
//     callback(ok);
// }
// function Bye(callback1){
//     console.log("Byeee");
//     callback1();
// }
// function ok(){
//     console.log("Okk");
// }

// foreach method

// let num=[1,2,3,4,5];
// num.forEach(display)
// function display(num){
//     console.log(num);
// }

// let fruits=["apple","banana","orange","coconut"];
// // fruits.forEach(Upper);
// fruits.forEach(Capatilze);
// fruits.forEach(display);

// // function Upper(element,index,array){
// //     array[index]=element.toUpperCase();
// // }

// function Capatilze(element,index,array){
//     array[index]=element.charAt(0).toUpperCase() + element.slice(1);
// }

// function display(element){
//     console.log(element);
// }



















