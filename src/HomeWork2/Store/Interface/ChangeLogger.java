package HomeWork2.Store.Interface;

public interface ChangeLogger {
    default void addLog(String note) {
        // Запись в файл
    }

}
