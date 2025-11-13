const myModal = document.getElementById("myModal")

const openModal = () => {
    myModal.style.display = "block"
}

const closeModal = () => {
    myModal.style.display = "none"
}

const openModalBtn = document.querySelector("#openModalBtn")
openModalBtn.addEventListener("click", openModal)

const closeModalBtn = document.querySelector("#closeModalBtn")
closeModalBtn.addEventListener("click", closeModal)
