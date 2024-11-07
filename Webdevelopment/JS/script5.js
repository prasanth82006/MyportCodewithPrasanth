const body=document.body;
body.addEventListener("click",()=>{
     const randomcolor=getRandomColor();
     body.style.backgroundColor=randomcolor;
});
function getRandomColor(){
     const letters="0123456789ABCDEF";
     let color="#";
     for(let i=0;i<6;i++){
          color+=letters[Math.floor(Math.random()*16)];
          console.log(color); 
     }
     return color;
}