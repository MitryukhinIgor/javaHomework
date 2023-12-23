package Proxy;
import java.util.List;
public class RealTable implements TableService{
    private List<String> subjectTable;

    public RealTable() {
        // получаем расписания из базы
        subjectTable= readTableFromBase();
    }

    private List<String> readTableFromBase() {
        return List.of("math - 08:30",
                "russian  - 9:30",
                "english - 11:10");
    }

    @Override
    public List<String> getSubjectTable() {
        return subjectTable;
    }
}