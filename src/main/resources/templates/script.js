function loadCharacter() {
var name = document.getElementById("name1");
var description = document.getElementById("description1");
}

function submitEdit () {
    var nameEntry = document.getElementById("editCardName");
    var descriptionEntry = document.getElementById("cardDescription");

    name.innerText = nameEntry.value;
    description.innerText = descriptionEntry.value;

    document.getElementById("editCardName").value = "";
    document.getElementById("cardDescription").value = "";

}