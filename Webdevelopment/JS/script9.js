const paragrapgh = [
     "The quick brown fox jumps over the lazy dog. This is a classic sentence used to test fonts and keyboards.",
     "Learning to code is a valuable skill in today's digital age. It opens doors to various career paths and fosters problem-solving skills.",
     "Data science is transforming industries by providing insights from data, which helps in making informed decisions.",
     "JavaScript is a versatile programming language used for web development, capable of creating dynamic and interactive web applications.",
     "Artificial Intelligence and Machine Learning are revolutionizing the tech world, offering smart solutions in various fields like healthcare and finance."
 ];
 const item = document.getElementById("items");
const datacontainer = document.getElementById("data");

function shuffle(array) {
    let currentIndex = array.length;
    let randomIndex;

    while (currentIndex != 0) {
        randomIndex = Math.floor(Math.random() * currentIndex);
        currentIndex--;
        [array[currentIndex], array[randomIndex]] = [array[randomIndex], array[currentIndex]];
    }
    return array;
}

function generate() {
    if (item.value == 0) {
        alert("The Value cannot be Zero");
    } else if (item.value > paragrapgh.length) {
        const randomIndex = Math.floor(Math.random() * paragrapgh.length);
        datacontainer.innerHTML = `<p>${paragrapgh[randomIndex]}</p>`;
    } else {
        const shuffledParagrapghs = [...paragrapgh]; 
        shuffle(shuffledParagrapghs);
        const selected = shuffledParagrapghs.slice(0, item.value);
        const paragraghHTML = selected.map(paragrapgh => `<p>${paragrapgh}</p>`).join("");
        datacontainer.innerHTML = paragraghHTML;
    }
}
