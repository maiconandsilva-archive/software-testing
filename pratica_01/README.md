# Testes Calculadora
Esta tarefa tem como objetivo demonstrar de forma simples o processo de TDD
(Test Driven Development) através da utilização do _**Junit 5**_. Os testes
cobrem minimamente os casos possíveis de entrada e saída do método
[raízNesima](app/src/main/java/calculadora/Calculadora.java#L14)
([raíz n-ésima](https://en.wikipedia.org/wiki/Nth_root)).

As possibilidades de entrada e saída encontradas para os testes, de forma
mínima e geral, foram:

* Indice    negativo
* Indice    positivo
* Indice    zero
* Radicando negativo
* Radicando positivo
* Radicando zero
* Resultado inválido
* Resultado válido

Testes realizados apenas com números inteiros por brevidade.

## Execução

Este projeto requer Java 8.

### Execução da aplicação

```shell
./gradlew run
```

### Execucao de testes

```shell
./gradlew test
```

**Se estiver usando o cmd do windows, use `gradlew.bat` em vez de `./gradlew`**.
