# Análise de Pré-requisitos: Sistema de Votação Simples em Java

## 1. Introdução

Este documento descreve a análise inicial e os pré-requisitos para o desenvolvimento de um sistema de votação simples utilizando a linguagem de programação Java. O objetivo é detalhar as funcionalidades essenciais, o escopo do projeto e as tecnologias envolvidas, servindo como um guia para as fases subsequentes de desenvolvimento e implementação.

O sistema proposto visa permitir que usuários registrem votos para um conjunto pré-definido de candidatos, visualizem os resultados da votação e encerrem o processo. A simplicidade é um fator chave, focando na funcionalidade básica de contagem de votos e apresentação de resultados.

## 2. Escopo do Projeto

O projeto se concentrará exclusivamente no desenvolvimento das funcionalidades descritas a seguir. Não estão incluídos no escopo recursos como autenticação de usuários, segurança avançada, persistência de dados em banco de dados complexos (além da memória durante a execução ou arquivos simples, se necessário para a simulação), ou interfaces gráficas de usuário (GUI) elaboradas, a menos que especificamente mencionado para a simulação front-end.

## 3. Requisitos Funcionais

Os requisitos funcionais definem o que o sistema deve fazer. Com base na solicitação inicial, os seguintes requisitos foram identificados:

*   **RF01: Apresentação do Menu:** O sistema deve exibir um menu principal na interface de console (ou na simulação front-end) com as seguintes opções:
    *   Opção 1: Votar no Candidato A
    *   Opção 2: Votar no Candidato B
    *   Opção 3: Votar no Candidato C
    *   Opção 4: Votar no Candidato D
    *   Opção 5: Mostrar Resultado da Votação
    *   Opção 6: Sair do Sistema
*   **RF02: Registro de Voto:** Ao selecionar uma das opções de voto (1 a 4), o sistema deve registrar um voto para o candidato correspondente.
*   **RF03: Continuidade da Votação:** Após o registro de um voto, o sistema deve exibir novamente o menu principal, permitindo que múltiplos votos sejam registrados sequencialmente.
*   **RF04: Contagem de Votos:** O sistema deve manter uma contagem interna e atualizada do número de votos recebidos por cada um dos quatro candidatos.
*   **RF05: Apresentação de Resultados:** Ao selecionar a opção 

Mostrar Resultado
 (RF05), o sistema deve exibir a contagem de votos para cada um dos quatro candidatos. Adicionalmente, o sistema deve identificar e anunciar qual candidato recebeu o maior número de votos, declarando-o como o vencedor da votação. Em caso de empate, o sistema deve indicar que houve um empate entre os candidatos com o maior número de votos.
*   **RF06: Encerramento do Sistema:** Ao selecionar a opção "Sair" (Opção 6), o sistema deve encerrar sua execução de forma limpa.

## 4. Requisitos Não Funcionais

Os requisitos não funcionais descrevem as qualidades do sistema, como desempenho, usabilidade e confiabilidade.

*   **RNF01: Usabilidade:** A interface (console ou simulação front-end) deve ser clara e intuitiva, facilitando a compreensão das opções e a interação do usuário.
*   **RNF02: Desempenho:** O sistema deve responder prontamente às interações do usuário, sem atrasos perceptíveis no registro de votos ou na exibição de resultados, considerando a natureza simples da aplicação.
*   **RNF03: Confiabilidade:** A contagem de votos deve ser precisa e consistente durante toda a execução do sistema.
*   **RNF04: Manutenibilidade:** O código Java deve ser bem estruturado, comentado e seguir boas práticas de programação para facilitar futuras modificações ou correções.

## 5. Restrições

*   **Tecnologia:** O núcleo lógico do sistema deve ser desenvolvido em Java.
*   **Persistência:** Os dados da votação (contagem de votos) serão mantidos apenas em memória durante a execução do programa. Não haverá persistência em banco de dados ou arquivos após o encerramento do sistema, a menos que seja implementada uma simulação simples para o front-end.
*   **Interface:** A interface primária será baseada em console. Uma simulação front-end (HTML/JS) será criada para demonstração e teste visual, mas não será uma aplicação web completa e robusta.
*   **Candidatos:** O número de candidatos é fixo em quatro, conforme especificado.

## 6. Critérios de Aceitação

O sistema será considerado aceito se atender aos seguintes critérios:

*   O menu é exibido corretamente com todas as seis opções.
*   É possível registrar votos para cada um dos quatro candidatos.
*   O menu é reexibido após cada voto.
*   A contagem de votos para cada candidato é incrementada corretamente.
*   A opção de resultado exibe a contagem correta para cada candidato.
*   A opção de resultado identifica corretamente o vencedor ou indica um empate.
*   A opção de sair encerra o programa.
*   A simulação front-end reflete a lógica de votação e resultados.

## 7. Tecnologias Propostas

*   **Linguagem de Programação:** Java (JDK 11 ou superior recomendado)
*   **Ambiente de Desenvolvimento:** Qualquer IDE Java padrão (Eclipse, IntelliJ IDEA, VS Code com extensões Java)
*   **Simulação Front-end:** HTML, CSS, JavaScript (para interação e visualização)
*   **Controle de Versão:** Git (para hospedagem no GitHub)

## 8. Próximos Passos

Com a aprovação desta análise de pré-requisitos, o próximo passo será o desenvolvimento do código-fonte em Java, seguido pela criação da simulação front-end e a integração para testes e visualização.
