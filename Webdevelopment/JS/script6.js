const gererateBtn=document.getElementById("generateBtn");
gererateBtn.addEventListener("click",updatecolor)
function getRandomColor(){
     const letters="0123456789ABCDEF";
     let color="#";
     for(let i=0;i<6;i++){
          color+=letters[Math.floor(Math.random()*16)];
          console.log(color); 
     }
     return color;
}
function updatecolor(){
     const colorBox=document.getElementById("colorBox");
     const colorText=document.getElementById("colorText");
     const randomColor=getRandomColor();
     colorBox.style.backgroundColor=randomColor;
     colorText.textContent=randomColor;
}