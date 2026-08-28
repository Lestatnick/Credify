# Simulador de Financiamento de Veículo

Projeto desenvolvido em Java para simular o financiamento de um veículo e verificar se o valor da parcela está dentro do limite de 30% do salário mensal informado.

## Funcionalidades

- Cadastro do nome do cliente e tratativas de erro para números e caracteres.
- Entrada e validação do valor do veículo.
- Entrada e validação do salário mensal.
- Escolha da quantidade de parcelas.
- Aplicação de juros de acordo com a quantidade de parcelas.
- Cálculo do valor total com juros.
- Cálculo do valor de cada parcela.
- Cálculo do limite de 30% do salário.
- Verificação da aprovação ou reprovação do financiamento.
- Exibição de um resumo da simulação.


## Taxas de Juros

| Parcelas | Juros |
| :---: | :---: |
| 12x | 5% |
| 24x | 10% |
| 36x | 15% |
| 48x | 20% |
| 60x | 30% |

## Estrutura do Projeto

```text
src/
├── Main.java
├── Entrada.java
├── Calculo.java
└── Exibicao.java
```

* `Main.java` — Controla o fluxo principal do programa.
* `Entrada.java` — Realiza a leitura e validação dos dados.
* `Calculo.java` — Contém os cálculos e a regra de aprovação.
* `Exibicao.java` — Apresenta o resultado da simulação.

## Tecnologias

* Java
* Git
* GitHub

## Como Executar

1. Clone este repositório.
2. Abra o projeto em uma IDE compatível com Java.
3. Compile os arquivos `.java`.
4. Execute a classe `Main`.

## Exemplo de Uso

```text
Digite o nome: João
Digite o valor do veículo: R\$ 50000
Digite o salário mensal: R\$ 3000
Digite a quantidade de parcelas (12, 24, 36, 48 ou 60): 60

===== Resumo da Simulação =====
Nome: João
Valor do veículo: R\$ 50000,00
Quantidade de parcelas: 60x
Juros aplicado: 30%
Valor total com juros: R\$ 65000,00
Valor da parcela: R\$ 1083,33
Salário informado: R\$ 3000,00
Limite de 30%: R\$ 900,00
Situação: REPROVADO
```
