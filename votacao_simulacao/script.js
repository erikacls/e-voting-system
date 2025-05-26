let votos = {
    1: 0, // Candidato A
    2: 0, // Candidato B
    3: 0, // Candidato C
    4: 0  // Candidato D
};

const candidatos = {
    1: "Candidato A",
    2: "Candidato B",
    3: "Candidato C",
    4: "Candidato D"
};

const menuDiv = document.getElementById('menu');
const resultadoDiv = document.getElementById('resultado');
const resultadoTextoP = document.getElementById('resultado-texto');
const mensagemDiv = document.getElementById('mensagem');

function votar(candidatoId) {
    if (votos.hasOwnProperty(candidatoId)) {
        votos[candidatoId]++;
        mostrarMensagem(`Voto para ${candidatos[candidatoId]} registrado com sucesso!`);
    } else {
        mostrarMensagem("Candidato inválido.", true);
    }
    // O menu permanece visível após votar
}

function mostrarResultado() {
    let textoResultado = "";
    let totalVotos = 0;
    let maiorVotos = -1;
    let vencedores = [];

    for (const id in candidatos) {
        const nomeCandidato = candidatos[id];
        const contagemVotos = votos[id];
        textoResultado += `${nomeCandidato}: ${contagemVotos} voto(s)\n`;
        totalVotos += contagemVotos;

        if (contagemVotos > maiorVotos) {
            maiorVotos = contagemVotos;
            vencedores = [nomeCandidato];
        } else if (contagemVotos === maiorVotos && maiorVotos > 0) {
            vencedores.push(nomeCandidato);
        }
    }

    textoResultado += `\nTotal de votos: ${totalVotos}\n`;

    if (totalVotos === 0) {
        textoResultado += "\nNenhum voto foi registrado ainda.";
    } else if (vencedores.length > 1) {
        textoResultado += `\nHouve um empate entre: ${vencedores.join(', ')}`;
    } else {
        textoResultado += `\nO vencedor é: ${vencedores[0]} com ${maiorVotos} voto(s).`;
    }

    resultadoTextoP.textContent = textoResultado;
    menuDiv.style.display = 'none';
    resultadoDiv.style.display = 'block';
    limparMensagem();
}

function voltarMenu() {
    menuDiv.style.display = 'block';
    resultadoDiv.style.display = 'none';
    limparMensagem();
}

function sair() {
    // Simula o encerramento - em uma aplicação web real, isso poderia redirecionar ou fechar a aba/janela se permitido.
    mostrarMensagem("Sistema de votação encerrado (simulado).");
    // Poderia desabilitar os botões aqui
    const buttons = document.querySelectorAll('#menu button');
    buttons.forEach(button => button.disabled = true);
}

function mostrarMensagem(msg, erro = false) {
    mensagemDiv.textContent = msg;
    mensagemDiv.style.color = erro ? 'red' : 'green';
    // Limpa a mensagem após alguns segundos
    setTimeout(limparMensagem, 3000);
}

function limparMensagem() {
    mensagemDiv.textContent = '';
}

