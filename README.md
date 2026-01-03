# ✈️ Calculadora de Custo de Voo Pro (Java Edition)

Este projeto é um sistema de faturamento aeronáutico desenvolvido em Java, focado na precisão de cálculos de horas de voo e gestão de custos operacionais.

## 📁 Estrutura do Projeto (O que é cada arquivo?)

Para facilitar a navegação no repositório, aqui está a função de cada componente:

* **`Voo.java`**: É o "Cérebro" do sistema (Classe de Modelo). Aqui definimos o objeto Voo e as regras de negócio, como a comparação entre Hobbs e Tach e o cálculo do valor líquido.
* **`CalculadoraCustoVoo.java`**: É a "Interface" (Classe Principal). Responsável por interagir com o usuário via terminal, coletar os dados e acionar a lógica de gravação de arquivos.
* **`README.md`**: É este documento que você está lendo. Ele serve como o manual e a vitrine do projeto para outros desenvolvedores e empresas.
* **`fatura_PT-BIA.txt`**: Um exemplo de saída gerado pelo sistema. Demonstra como o relatório final é entregue ao cliente.
* **`.class` (Arquivos compilados)**: São os arquivos binários gerados pelo Java para que o computador possa executar o programa.

---

## 🚀 Funcionalidades Profissionais
- **Lógica Hobbs vs Tach:** Seleção automática do maior horímetro (padrão internacional de faturamento).
- **Persistência de Dados:** Geração de recibos físicos em formato `.txt`.
- **Arquitetura POO:** Código modular e fácil de manter.

---

## ❓ FAQ - Perguntas Frequentes (Aviation Business)

**1. Por que o sistema compara Hobbs e Tach?**
Em aeroclubes, o motor (Tach) e o tempo de uso do piloto (Hobbs) podem divergir. Cobrar pelo maior valor garante que os custos operacionais de manutenção e instrução sejam sempre cobertos, evitando prejuízos à escola.

**2. Como o sistema trata descontos de combustível?**
O sistema permite a inserção manual de créditos de combustível. Isso é essencial quando um piloto abastece em outra localidade e precisa abater esse valor do custo total do aluguel da aeronave.

**3. O sistema aceita casas decimais nos horímetros?**
Sim. O software foi configurado com `Locale.US`, permitindo que o usuário insira décimos de hora (ex: 1200.5) usando o ponto como separador, garantindo precisão absoluta no faturamento.

**4. É possível integrar este código com um banco de dados?**
Com certeza. Devido à estrutura Orientada a Objetos (`Voo.java`), o sistema está pronto para ser conectado a bancos de dados como MySQL ou PostgreSQL em uma futura versão 4.0, permitindo histórico de faturamento por prefixo.

**5. Como o sistema evita erros de digitação?**
O uso de classes separadas permite que, no futuro, possamos adicionar "validadores" que impedem, por exemplo, que o Hobbs Final seja menor que o Inicial, protegendo a integridade dos dados financeiros.

---

## 📖 Como Executar
1. Compile os arquivos: `javac *.java`
2. Execute o sistema: `java CalculadoraCustoVoo`