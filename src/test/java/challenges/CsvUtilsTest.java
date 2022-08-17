package challenges;

import models.User;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class CsvUtilsTest {

    @Test
    public void shouldShowCommonRows() throws IOException {
        File input1 = new File("src/main/resources/file1.csv");
        File input2 = new File("src/main/resources/file2.csv");
        CsvUtils csvUtils = new CsvUtils();
        List<User> commonData = csvUtils.getCommonData(input1, input2);
        assertThat(commonData).hasSize(2);
    }

    @Test
    public void shouldNotAnyRows() throws IOException {
        File input1 = new File("src/main/resources/file3.csv");
        File input2 = new File("src/main/resources/file4.csv");
        CsvUtils csvUtils = new CsvUtils();
        List<User> commonData = csvUtils.getCommonData(input1, input2);
        assertThat(commonData).hasSize(0);
    }

    @Test
    public void shouldShowAllMatchingRows() throws IOException {
        File input1 = new File("src/main/resources/file1.csv");
        File input2 = new File("src/main/resources/file3.csv");
        CsvUtils csvUtils = new CsvUtils();
        List<User> commonData = csvUtils.getCommonData(input1, input2);
        assertThat(commonData).hasSize(3);
    }
}