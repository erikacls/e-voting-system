# Sistema de Votação Simples

Este repositório contém um sistema de votação simples desenvolvido em Java com uma simulação front-end em HTML/CSS/JavaScript para visualização e testes.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- `SistemaVotacao.java`: Implementação do sistema de votação em Java
- `analise_prerequisitos.md`: Documento detalhado de análise de pré-requisitos
- `votacao_simulacao/`: Diretório contendo a simulação front-end
  - `index.html`: Estrutura HTML da simulação
  - `style.css`: Estilos CSS para a interface
  - `script.js`: Lógica JavaScript que simula o comportamento do sistema

## Sistema de Votação em Java

O sistema de votação em Java foi desenvolvido seguindo os requisitos especificados, oferecendo uma interface de console com as seguintes funcionalidades:

- Menu com 4 opções de voto (4 candidatos)
- Opção para mostrar o resultado da votação
- Opção para sair do sistema
- Contagem de votos para cada candidato
- Identificação do vencedor ou empate na exibição de resultados

### Como Executar o Sistema Java

Para executar o sistema de votação em Java, siga os passos abaixo:

1. Certifique-se de ter o JDK instalado (versão 11 ou superior recomendada)
2. Compile o arquivo Java:
   ```
   javac SistemaVotacao.java
   ```
3. Execute o programa compilado:
   ```
   java SistemaVotacao
   ```

## Simulação Front-end

A simulação front-end foi desenvolvida para permitir a visualização e teste do sistema de votação em um ambiente web, sem a necessidade de compilar e executar o código Java. Esta simulação implementa a mesma lógica do sistema Java, mas com uma interface gráfica amigável.

### Como Executar a Simulação Front-end

Para executar a simulação front-end, basta abrir o arquivo `votacao_simulacao/index.html` em qualquer navegador web moderno. Não é necessário um servidor web para executar a simulação.

### Funcionalidades da Simulação

- Interface intuitiva com botões para cada opção de voto
- Feedback visual após cada voto registrado
- Exibição detalhada dos resultados, incluindo contagem de votos por candidato
- Identificação automática do vencedor ou empate
- Navegação simples entre o menu principal e a tela de resultados

## Análise de Pré-requisitos

O documento `analise_prerequisitos.md` contém uma análise detalhada dos requisitos do sistema, incluindo:

- Requisitos funcionais e não funcionais
- Restrições do projeto
- Critérios de aceitação
- Tecnologias propostas
- Próximos passos

Este documento serve como base para o desenvolvimento e validação do sistema.

## Contribuições

Este projeto foi desenvolvido como uma demonstração de um sistema de votação simples para fins acadêmicos.

## Licença

Este projeto está disponível sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

### Projeto com simulação de votação simples utilizando Java (back-end) e HTML/CSS (front-end).

🔗 [Acesse a aplicação online](https://erikacls.github.io/sistema_votacao/)

## Tecnologias
- Java
- HTML, CSS e JS
- GitHub Pages para hospedagem
