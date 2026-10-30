const btn = document.getElementById("head");
const num = document.getElementById("number");
let number = 0;

btn.onclick = function () {
  number = Math.floor(Math.random() * 100) + 1;;
  num.textContent = number;
}