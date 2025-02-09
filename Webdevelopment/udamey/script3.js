const password=document.getElementById("password");
const message=document.getElementById("message");
const strength=document.getElementById("strength");
const submit=document.querySelector("button");

password.addEventListener("input",function(){
     const passwordvalue=password.value;
     const length=passwordvalue.length;

     let s='';
     if(password===0){
          s='';
     }
     else if(length<6){
          s='Weak';
     }
     else if(length<10){
          s='Medium';
     }
     else{
          s='Strong';
     }
     strength.textContent=s;
     message.style.display="block";
});

submit.addEventListener("click",function(){
     const type=password.getAttribute('type');
     if(type==='password'){
          password.setAttribute('type','text');
     }
     else{
          password.setAttribute('type','password');
     }
});