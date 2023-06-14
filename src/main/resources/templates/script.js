const abilityPoints = document.querySelector('.abilityPoints')

const numberInput = document.querySelector('.number');
const increaseButton = document.querySelector('.increase');
const decreaseButton = document.querySelector('.decrease');

increaseButton.addEventListener('click', () => {
  abilityPoints.value--;
  numberInput.value++;
});

decreaseButton.addEventListener('click', () => {
  abilityPoints.value++;
  numberInput.value--;
});

const numberInput1 = document.querySelector('.number1');
const increaseButton1 = document.querySelector('.increase1');
const decreaseButton1 = document.querySelector('.decrease1');

increaseButton1.addEventListener('click', () => {
  abilityPoints.value--;
  numberInput1.value++;
});

decreaseButton1.addEventListener('click', () => {
  abilityPoints.value++;
  numberInput1.value--;
});

