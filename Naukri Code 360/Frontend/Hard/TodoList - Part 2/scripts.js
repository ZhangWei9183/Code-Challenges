const tasksList = document.querySelector("#tasksList")
const taskInput = document.querySelector("#taskInput")


function removeInput() {
    taskInput.value = ""
}


function removeTask(task) {
    task.parentElement.remove()
}


function addTask() {
    const value = taskInput.value
    const newListItem = document.createElement("li")
    const newspan = `<span>${value}</span>`
    const newButton = '<button onclick="removeTask(this)">Remove</button>'
    newListItem.innerHTML = newspan + newButton
    tasksList.appendChild(newListItem)
    removeTask()
}
