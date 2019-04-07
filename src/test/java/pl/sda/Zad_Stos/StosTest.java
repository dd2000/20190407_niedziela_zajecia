package pl.sda.Zad_Stos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StosTest {
    @Test
    public void shouldBeAdded() {
        // given ----> dane wejściowe (zawsze dla kolejnego testu nowy zestaw danych wejściowych)
        Stos stos = new Stos();
        // when ---->  wywołanie metody z parametrami
        stos.push(45);
        // then  ----> porównanie wyników spodziewanych z otrzymanymi
        int result = stos.value(0);
        Assertions.assertEquals(45,result);
    } // test: shouldBeAdded()

    @Test
    public void shouldBeEmpty() {
        // given ----> dane wejściowe
        Stos stos = new Stos();
        stos.push(110);

        // when ---->  wywołanie metody z parametrami
        stos.isEmty();
        // then  ----> porównanie wyników spodziewanych z otrzymanymi
        boolean result = stos.isEmty();
        Assertions.assertEquals(false,result);
    } // test: shouldBeEmpty()


} // StosTest
