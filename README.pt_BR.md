# Testes de Software

Aprendizagem de conceitos e prática com foco em Java e Python.

Esta tarefa tem como objetivo demonstrar de forma simples o processo de TDD
(Test Driven Development) através da utilização do _**Junit 5**_. Os testes
cobrem minimamente os casos possíveis de entrada e saída do método
raízNesima ([raíz n-ésima](https://en.wikipedia.org/wiki/Nth_root)).

As possibilidades de entrada e saída encontradas para os testes, de forma
mínima e geral, foram:

* Índice    negativo
* Índice    positivo
* Índice    zero
* Radicando negativo
* Radicando positivo
* Radicando zero
* Resultado inválido
* Resultado válido


## Subpastas
_Cada subpasta é uma tarefa realizada._

### [pratica_01](/pratica_01)

> **Aplicação de conceitos de TDD através do Junit 8.** <br>
> Objetivo: Testagem de um método de cálculo de uma classe Calculadora. <br>
> _Para esta tarefa foi escolhido o cálculo [raíz n-ésima](https://en.wikipedia.org/wiki/Nth_root)._

**Explicação no Youtube: https://youtu.be/K6y0frzXl8k**

### [pratica_02](/pratica_02)

> **Análise de valores limites e partição de equivalência.** <br>
> Um ciclo TDD considerando casos de teste em que os dados que são obtidos
> a partir dos limites das partições. <br>
> _Continuação da pratica_01_

**Explicação no Youtube: https://youtu.be/hiAZC4LaZkU**

### [pratica_03](/pratica_03)

> **Teste de aplicação Web com Selenium WebDriver.** <br>
> Implementação da _pratica_02_ utilizando Selenium WebDriver. <br>
> Implementação de interface web para o método de cálculo _raíz n-ésima_.

**Explicação no Youtube: https://youtu.be/p7NoXFlNBrY**

### Variaveis de ambiente para  (pratica_03 somente)

_Opcionais_
```
TEST_DRIVER        # Caminho do driver a ser usado pelo Selenium (por padrão é usado o chromedriver na pasta drivers/
TEST_BROWSER       # Browser a ser usado pelo Selenium
APP_HOST           # host da aplicação web
APP_PORT           # porta da aplicação web
APP_CONTEXT        # subrota da aplicação web
TEST_WAIT_SECONDS  # Tempo de espera obrigado entre os testes
```

Usar `export VARIAVEL=valor` em sistemas baseados em linux e `set VARIAVEL="valor"` no Windows para atribuir
as variáveis de ambiente.

Para mais detalhes, analise o arquivo `build.gradle`.

## Execução

Este projeto requer Java 8 e gradle 6.8+.

### Gradle wrapper na versão do projeto

```shell
gradle wrapper --gradle-version 6.8.3
```

### Execução da aplicação

```shell
./gradlew run
```

### Execução da aplicação web (pratica_03 somente)

```shell
./gradlew appRun
```

### Execucao de testes

```shell
./gradlew test
```

**Se estiver usando o cmd do windows, use `gradlew.bat` em vez de `./gradlew`**.
