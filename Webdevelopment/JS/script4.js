const inputSlider=document.getElementById("inputSlider");
const sliderValue=document.getElementById("sliderValue");
const passBox=document.getElementById("passBox");
const lowercaseEl =document.getElementById("lowercase");
const uppercaseE1=document.getElementById("uppercase");
const numbersE1=document.getElementById("numbers");
const symbolsE1=document.getElementById("Symbols");
const GenerateBtn=document.getElementById("getBtn");
const copyIcon=document.getElementById("copyIcon");

const lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
const uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
const numbers = "0123456789";
const symbols = "!@#$%^&*()_+-=[]{}|;:',.<>?/~`";

sliderValue.textContent=inputSlider.value;
inputSlider.addEventListener("input",()=>{
     sliderValue.textContent=inputSlider.value;
});

GenerateBtn.addEventListener("click",()=>{
     passBox.value=generatepassword();
});
function generatepassword(){
     const length=inputSlider.value;
     let characters="";
     let password="";
     characters+=lowercaseEl.checked ? lowercaseLetters :"";
     characters+=uppercaseE1.checked ? uppercaseLetters :"";
     characters+=numbersE1.checked ? numbers :"";
     characters+=symbolsE1.checked ? symbols :"";
     for(let i=0;i<length;i++){
          password+=characters.charAt(Math.floor(Math.random()*characters.length));          
     }
     return password;
}
copyIcon.addEventListener("click", () => {
     if (passBox.value) {
          navigator.clipboard.writeText(passBox.value);
          copyIcon.innerText = "check";
          setTimeout(() => {
               copyIcon.innerText = "content_copy";
          }, 3000);
     }
});