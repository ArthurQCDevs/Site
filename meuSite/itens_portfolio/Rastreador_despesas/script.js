const gastos = document.querySelector('#caixaGastos')
const ganhos = document.querySelector('#caixaGanhos')
const span = document.querySelector('span')
const form = document.querySelector('form')
const send = document.querySelector('#send')
let saldo = 0

form.addEventListener('submit', (e) => {   // No futuro pretendo incrementar esse linha de código
    e.preventDefault()                     // Ela será respos´vel por salvar o saldo do usuário na sua própria máquina.
    const fd = new FormData(form)
    const obj = Object.fromEntries(fd)

    const json = JSON.stringify(obj)
    localStorage.setItem('form', json)
})

function calcularSaldo() {
    let valor = Number(ganhos.value) - Number(gastos.value)
    if (valor > 0) {
        span.id = 'positivo'
        span.innerHTML = valor
    } else if (valor < 0) {
        span.id = 'negativo'
        span.innerText = valor
    } else {
        span.id = 'neutro'
        span.innerText = valor
    }
    console.log('pariu')


    form.addEventListener('submit', (e) => {
        e.preventDefault()
        form.reset()
    })
}

send.addEventListener('click', calcularSaldo)