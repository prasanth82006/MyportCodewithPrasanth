const btn=document.querySelectorAll("button");
const display=document.getElementById("result");
for(let i=0;i<btn.length;i++){
     btn[i].addEventListener('click',()=>{
          const value=btn[i].textContent;
          if(value=="AC"){
               clearResult();
          }
          else if(value=='='){
               calculateResult();
          }
          else{
               appendValue(value);
          }
     })
}
function clearResult(){
     display.value="";
}
function calculateResult(){
     display.value=eval(display.value);
}
function appendValue(value){
     display.value+=value;
}