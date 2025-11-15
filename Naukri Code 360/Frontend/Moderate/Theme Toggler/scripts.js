let darkModeButton, lightModeButton, darkMode, lightMode, section


document.addEventListener('DOMContentLoaded', () => {
    darkModeButton = document.querySelector('#dark-mode-btn')
    lightModeButton = document.querySelector('#light-mode-btn')
    darkMode = document.querySelector('.dark-mode')
    lightMode = document.querySelector('.light-mode')
    section = document.querySelector('section');
})


function toggleTheme() {
    const section = document.querySelector('section')

    if (section.classList.contains('dark-section')) {
        section.classList.remove('dark-section')
        darkMode.classList.remove('hide')
        darkModeButton.removeAttribute('disabled')
        lightMode.classList.add('hide')
        lightModeButton.setAttribute('disabled', true)
    } else {
        section.classList.add('dark-section')
        darkMode.classList.add('hide')
        darkModeButton.setAttribute('disabled', true)
        lightMode.classList.remove('hide')
        lightModeButton.removeAttribute('disabled')
    }
}
