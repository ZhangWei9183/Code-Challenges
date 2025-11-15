function calculateBMI () {
    const weight = Number(document.querySelector('#weight').value)
    const height = Number(document.querySelector('#height').value) / 100
    const result = weight / ( height * height )
    
    const resultDiv = document.querySelector('#result')

    resultDiv.textContent = result.toFixed(2)
}
