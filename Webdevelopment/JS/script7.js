function Count() {
     var text = document.getElementById("inputtext").value;
     let count = 0;
     text = text.toLowerCase();
     for (let i = 0; i < text.length; i++) {
         var char = text.charAt(i);
         if (check(char)) {
             count++;
         }
     }
     var result = document.getElementById("result");
     result.textContent = "Total Vowels: " + count;
 }
 
 function check(char) {
     var vowels = ["a", "e", "i", "o", "u"];
     return vowels.includes(char);
 }
 