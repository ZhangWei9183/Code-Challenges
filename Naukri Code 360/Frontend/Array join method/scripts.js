function generateArrayToParagraph() {
    const textarea = document.querySelector("#inputPara")
    const inputText = textarea.value
    let elements

    if (inputText.startsWith("[")) {
        elements = inputText.slice( 1, -1 ).split(",")
    } else {
        elements = inputText.split(",")
    }

    const p = document.querySelector("#result")
    p.textContent = elements.join(" ")
}
