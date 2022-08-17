package challenges;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import models.User;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class CsvUtils {

    public List<User> getCommonData(File input1, File input2) throws IOException {
        List<User> userList1 = getListOfData(input1);
        List<User> userList2 = getListOfData(input2);
        userList1.retainAll(userList2);
        return userList1;
    }

    @SuppressWarnings("unchecked")
    private <V> List<V> getListOfData(File input) throws IOException {
        CsvSchema csv = CsvSchema.emptySchema().withHeader();
        CsvMapper csvMapper = new CsvMapper();
        return (List<V>) csvMapper.readerFor(User.class).with(csv).readValues(input).readAll();
    }
}
