package calculadora;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.ParameterizedTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.AfterAll;


/**
 *
 * @author Maicon
 */
public class CalculadoraWebTest {

    CalculadoraTest calculadoraTest = new CalculadoraTest();
    static WebDriver driver = new ChromeDriver();

    @AfterAll
    static public void tearDown() {
        driver.close();
        driver.quit();
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/CalculadoraWebTest.csv"})
    public void testRaizNesima(double radicando, double indice)
            throws InterruptedException  {

        driver.get(System.getProperty("HOST"));

        Integer segundos_espera = Integer.parseInt(System.getProperty("WAIT_SECONDS"));

        Thread.sleep(segundos_espera);

        driver.findElement(By.name("radicando")).sendKeys(String.valueOf(radicando));
        driver.findElement(By.name("indice")).sendKeys(String.valueOf(indice));

        Thread.sleep(segundos_espera);

        driver.findElement(By.id("raizSubmit")).click();

        Thread.sleep(segundos_espera);

        double resultado =  Double.parseDouble(
                driver.findElement(By.id("resultado")).getText());

        calculadoraTest.testRaizNesima(radicando, indice, resultado);

        Thread.sleep(segundos_espera);
    }
}


