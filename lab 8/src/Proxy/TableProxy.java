package Proxy;
import java.util.List;
import java.time.LocalDateTime;
public class TableProxy  implements TableService{
    private TableService tableService;
    private LocalDateTime lastUpdate;

    public TableProxy() {
        tableService = new RealTable();
// Имитируем время вставки диска с обновленным расписанием
        lastUpdate = LocalDateTime.now().minusDays(1);
    }
    private boolean isTableUpdated() {
        // Проверяем, было ли обновление расписания
        LocalDateTime currentTime = LocalDateTime.now();
        return currentTime.getDayOfYear() > lastUpdate.getDayOfYear();
    }

    private void updateTable() {
        //обновлениe расписания
        tableService = new RealTable();
        lastUpdate = LocalDateTime.now();
    }

    @Override
    public List<String> getSubjectTable() {
        if (!isTableUpdated()) {
            updateTable();
        }

        return tableService.getSubjectTable();
    }

}