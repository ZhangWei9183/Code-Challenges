function findMinNo() {
    const arrayInput = document.querySelector("#arrayInput").value.split(",")
    const array = arrayInput.map(x => Number(x))
    const min = array.reduce((x, y) => Math.min(x, y))
    document.querySelector("#result").textContent = min
}
