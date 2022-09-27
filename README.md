# Software Testing

Assignment to practice Software Testing in Java.

This assignment has the goal of minimally demonstrating the
process of TDD (Test Driven Development) using _**Junit 5**_.
The tests cover minimally the possible input and output for the
([nth root](https://en.wikipedia.org/wiki/Nth_root)) method.

The possible input and output found, minimally and generally, were:

* Index:   negative
* Index:   positive
* Index:   zero
* Root:    negative
* Root:    positive
* Root:    zero
* Result:  Invalid 
* Result:  Valid

## Subpastas
_Each folder is an assignment completed._

### [Practice 01](/pratica_01)

> **Applying TDD concepts with Junit 8.** <br>
> Goal: testing a calculator's mathematical operation. <br>
> _Chosen operation is [nth root](https://en.wikipedia.org/wiki/Nth_root)._

**Video Explanation: https://youtu.be/K6y0frzXl8k**

### [Practice 02](/pratica_02)

> **Boundary value analysis and equivalence partitioning.** <br>
> A TDD cycle considering test cases in which data used are obtained 
> from partition limits. <br>
> _Practice 01 continuation_

**Video Explanation: https://youtu.be/hiAZC4LaZkU**

### [Practice 03](/pratica_03)

> **Web Application Feature Implementation Test with Selenium WebDriver.** <br>
> _Pratica 02_ implementation using Selenium WebDriver. <br>
> Web Interface implementation of the _nth rooth_ mathematical operation.

**Video Explanation: https://youtu.be/p7NoXFlNBrY**

### Variaveis de ambiente (pratica_03 only)

_Optional_
```
TEST_DRIVER        # Driver path to be used by Selenium (by default, chromedriver in drivers/)
TEST_BROWSER       # Browser to be used by Selenium
APP_HOST           # Web application host
APP_PORT           # porta da aplicação web
APP_CONTEXT        # Web application root url path context
TEST_WAIT_SECONDS  # Waiting time between testes
```

Use `export VARIAVEL=valor` in Linux based OSs and `set VARIAVEL="valor"` in Windows
to set the environment variables.

For more details, read `build.gradle`.

## Running

This project requires Java 8 and Gradle 6.8+.

### Project Gradle Wrapper Version

```shell
gradle wrapper --gradle-version 6.8.3
```

### Running Command Line Application

```shell
./gradlew run
```

### Running Web Application (pratica_03 only)

```shell
./gradlew appRun
```


### Running Tests

```shell
./gradlew test
```

**If using Windows CMD, run `gradlew.bat` instead of `./gradlew`**.
