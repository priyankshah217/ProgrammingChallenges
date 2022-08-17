package challenges;


import org.junit.Test;

public class StringOccurrenceSortedTest {

    @Test
    public void TestGetResultString() {
        StringOccurrenceSorted st = new StringOccurrenceSorted();
        String resultString = st.getResultString("1222bbbbcccaaaammmmm");
        System.out.println(resultString);
    }
}