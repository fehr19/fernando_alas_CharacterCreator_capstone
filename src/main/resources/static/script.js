var abilityPoints = 13;

const numberInput = document.querySelector('.number');
const increaseButton = document.querySelector('.increase');
const decreaseButton = document.querySelector('.decrease');

increaseButton.addEventListener('click', () => {
  abilityPoints--;
  numberInput.value++;
  document.getElementById("abilityPoints").innerHTML = abilityPoints;
});

decreaseButton.addEventListener('click', () => {
  abilityPoints++;
  numberInput.value--;
  document.getElementById("abilityPoints").innerHTML = abilityPoints;
});



const numberInput1 = document.querySelector('.number1');
const increaseButton1 = document.querySelector('.increase1');
const decreaseButton1 = document.querySelector('.decrease1');

increaseButton1.addEventListener('click', () => {
  numberInput1.value++;
  abilityPoints--;
  document.getElementById("abilityPoints").innerHTML = abilityPoints;
});

decreaseButton1.addEventListener('click', () => {
  numberInput1.value--;
  abilityPoints++;
  document.getElementById("abilityPoints").innerHTML = abilityPoints;
});

/* Need to write functions for the Abilities increase/decrease buttons */
