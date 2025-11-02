const formsContainer = document.querySelector("#formsContainer")
const fieldTypes = { "fieldType" : "text", "Checkbox" : "checkbox", "Radio Button" : "radio"}

const addField = () => {
    const builtFormName = document.querySelector("#builtFormName")
    builtFormName.textContent = document.querySelector("#formName").value
    const fieldType = document.querySelector("#fieldType").value
    const newLabel = document.createElement("label")
    newLabel.textContent = document.querySelector("#fieldLabel").value
    const newField = document.createElement("input")
    newLabel.appendChild(newField)
    formsContainer.appendChild(newLabel)
    alert(`fieldType:${fieldType}, newField:${newField}\n` +"Your field in the form is added successfully")
}


const saveForm = () => {
    formsContainer.removeAttribute("hidden")
}
