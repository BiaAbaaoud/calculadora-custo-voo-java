# ✈️ Calculadora de Custo de Voo Pro (Java Edition)

Este foi o meu **primeiro projeto desenvolvido em Java**, focado em resolver um problema real do setor aeronáutico: a cobrança precisa de horas de voo.

## 🚀 Funcionalidades
- **Lógica Hobbs vs Tach:** O sistema compara automaticamente o tempo de cockpit (Hobbs) e o tempo de motor (Tach), aplicando a cobrança sobre o maior valor (regra padrão de aeroclubes).
- **Cálculo Financeiro:** Processamento de valores brutos, descontos de combustível e total líquido.
- **Exportação de Fatura:** Gera automaticamente um arquivo `.txt` formatado com todos os detalhes do voo.
- **Arquitetura Orientada a Objetos:** Projeto estruturado com classes separadas para garantir organização e escalabilidade.

## 🛠️ Tecnologias Utilizadas
- **Java 17 (OpenJDK)**
- **Programação Orientada a Objetos (POO)**
- **Manipulação de Arquivos (Java I/O)**
- **Scanner & Locales** (Tratamento de entradas de dados)

## 📁 Estrutura do Projeto
- `Voo.java`: Classe de modelo com a lógica de negócio e cálculos.
- `CalculadoraCustoVoo.java`: Classe principal com a interface de terminal e persistência de dados.

## 📖 Como Executar
1. Compile os arquivos: `javac *.java`
2. Execute o sistema: `java CalculadoraCustoVoo`