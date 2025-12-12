"use strict"


const re_error = /^[-+*/]|[-+*/]$|[-+*/]{2,}/
const re_split = /([+\-*/])/
let display = document.querySelector("#result");


function appendToDisplay(content) {
    display.value = (display.value || "") + content
}


function clearDisplay() {
    display.value = ""
}


function calculate() {
    const value = display.value

    if (re_error.test(value)) {
        display.value = "Error"

        return;
    }

    const inputs = value.split(re_split)
    const stack = new Array();
    const n = inputs.length;

    for (let i = 0; i < n; i++) {
        if (inputs[i] == '*') {
            stack.push(stack.pop() * Number.parseFloat(inputs[i + 1]))
            i++
        } else if (inputs[i] == '/') {
            stack.push(stack.pop() / Number.parseFloat(inputs[i + 1]))
            i++
        } else if (isNaN(inputs[i])) {
            stack.push(inputs[i])
        } else {
            stack.push(Number.parseFloat(inputs[i]))
        }
    }

    let ans = stack.pop()

    while (stack.length > 0) {
        if (stack.pop() === '+') {
            ans += stack.pop()
        } else {
            ans = stack.pop() - ans
        }
    }

    display.value = ans
}