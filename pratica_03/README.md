# Testes Calculadora
Esta tarefa tem como objetivo demonstrar de forma simples o processo de TDD
(Test Driven Development) através da utilização do _**Junit 5**_. Os testes
cobrem minimamente os casos possíveis de entrada e saída do método
[raízNesima](app/src/main/java/calculadora/Calculadora.java#L14)
([raíz n-ésima](https://en.wikipedia.org/wiki/Nth_root)).

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

**Link para uma breve explicação no Youtube https://youtu.be/p7NoXFlNBrY**

## Configuração

Este projeto requer Java 8 e gradle 6.8.

### Gradle wrapper na versão do projeto

```shell
gradle wrapper --gradle-version 6.8.3
```

### Variaveis de ambiente (opcionais)

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

### Execução da aplicação por linha de comando

```shell
./gradlew run
```

### Execução da aplicação web

```shell
./gradlew appRun
```

### Execucao de testes

```shell
./gradlew test
```

**Se estiver usando o cmd do windows, use `gradlew.bat` em vez de `./gradlew`**.
