const certificates = [
     {
         title: "Python Course",
         image: "python course.png"
     },
     {
         title: "Code Battle",
         image: "code battle.png"
     },
     {
         title: "Web Development",
         image: "web development.png"
     },
     {
          title:"javascript Course",
          image:"udemy.jpg"
     }
 ];
 
 const certificateContainer = document.querySelector(".certificate-container");
 const modal = document.createElement("div");
 modal.className = "modal";
 modal.innerHTML = `
     <div class="modal-content">
         <span class="close">&times;</span>
         <p class="modal-title"></p>
         <hr>
         <img src="" alt="Certificate Image" class="modal-img">
     </div>
 `;
 document.body.appendChild(modal);
 certificates.forEach((certificate) => {
     const card = document.createElement("div");
     card.className = "certificate-card";
     card.innerHTML = `
         alt="${certificate.title}" <img src="${certificate.image}"  class="certificate-img">
     `;
     certificateContainer.appendChild(card);
     const img = card.querySelector(".certificate-img");
     img.addEventListener("click", () => {
         const modalImg = modal.querySelector(".modal-img");
         const modalTitle = modal.querySelector(".modal-title");
 
         modalImg.src = certificate.image;
         modalTitle.textContent = certificate.title;
         modal.style.display = "block";
     });
 });
 const closeModal = modal.querySelector(".close");
 closeModal.addEventListener("click", () => {
     modal.style.display = "none";
 });
 modal.addEventListener("click", (e) => {
     if (e.target === modal) {
         modal.style.display = "none";
     }
 });
 