function calculateAge() {
     const today = new Date();
     const birthdateInput = document.getElementById("birthdate").value;
     const birthdateParts = birthdateInput.split("-");
     const birthYear = parseInt(birthdateParts[0], 10);
     const birthMonth = parseInt(birthdateParts[1], 10) - 1;
     const birthDay = parseInt(birthdateParts[2], 10);
     const birthDate = new Date(birthYear, birthMonth, birthDay);

     const isValidDate = (date) => {
         return Object.prototype.toString.call(date) === "[object Date]" && !isNaN(date);
     };
 
     if (!isValidDate(birthDate)) {
         alert("Invalid Date Format: Please enter a valid date in YYYY-MM-DD format.");
         return;
     }
     const ageInMilliseconds = today - birthDate;
     const ageInSeconds = Math.floor(ageInMilliseconds / 1000);
     const ageInMinutes = Math.floor(ageInSeconds / 60);
     const ageInHours = Math.floor(ageInMinutes / 60);
     const ageInDays = Math.floor(ageInHours / 24);
     const ageInWeeks = Math.floor(ageInDays / 7);
     const ageInMonths = Math.floor(ageInDays / 30.44);
     const ageInYears = Math.floor(ageInDays / 365.25);
 
     const remainingMonths = Math.floor((ageInDays % 365.25) / 30.44);
     const remainingDays = Math.floor((ageInDays % 365.25) % 30.44);
     const resultContainer = document.getElementById("resultcontainer");
     const result = document.getElementById("result");
     result.innerHTML = `
         <div class="result-item">
             <h3>Age:</h3>
             <p>${ageInYears} years, ${remainingMonths} months, ${remainingDays} days</p>
         </div>`;
         
     resultContainer.style.display = "block";
 }
 
 const ageCalculatorForm = document.getElementById("ageCalculator");
 ageCalculatorForm.addEventListener("submit", (event) => {
     event.preventDefault();
     calculateAge();
 });
 