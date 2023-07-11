var abilityPoints = 13;

const numberInput1 = document.querySelector('.number1');
const increaseButton1 = document.querySelector('.increase1');
const decreaseButton1 = document.querySelector('.decrease1');

increaseButton.addEventListener('click', () => {
  abilityPoints--;
  numberInput1.value++;
  document.getElementById("abilityPoints").innerHTML = abilityPoints;
});

decreaseButton.addEventListener('click', () => {
  abilityPoints++;
  numberInput1.value--;
  document.getElementById("abilityPoints").innerHTML = abilityPoints;
});



var numberInput2 = document.querySelector('.number2');
var increaseButton2 = document.querySelector('.increase2');
var decreaseButton2 = document.querySelector('.decrease2');

increaseButton1.addEventListener('click', () => {
  numberInput2.value++;
  abilityPoints--;
  document.getElementById("abilityPoints").innerHTML = abilityPoints;
});

decreaseButton1.addEventListener('click', () => {
  numberInput2.value--;
  abilityPoints++;
  document.getElementById("abilityPoints").innerHTML = abilityPoints;
});

/* Need to write functions for the Abilities increase/decrease buttons */
