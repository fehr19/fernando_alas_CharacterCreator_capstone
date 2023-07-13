const abilityPoints = document.querySelector('#abilityPoints');
var startingPoints = 13;
abilityPoints.textContent = startingPoints;

const increase = (event, id) => {
document.querySelector(`#${id}`).value++;
console.log(id)
  startingPoints--;
  abilityPoints.textContent = startingPoints;
};

const decrease = (event, id) => {
  document.querySelector(`#${id}`).value--;
  startingPoints++;
  abilityPoints.textContent = startingPoints;
};


/* Need to write functions for the Abilities increase/decrease buttons */
