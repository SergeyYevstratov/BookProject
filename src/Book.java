public class Book {
    // Атрибути класу (змінні)
    String title;   // Назва книги
    String author;  // Ім’я автора книги
    String status;  // Статус книги
    // Конструктор класу.Викликається, коли створюємо нову книгу
    public Book(String t, String a, String s) {
        title = t;     // Записуємо назву в змінну title
        author = a;    // Записуємо автора в змінну author
        status = s;    // Записуємо статус в змінну status
    }
    // Метод виводить інформацію про книгу
    public void showInfo() {
        System.out.println("Назва: " + title);   // Виводимо назву книги
        System.out.println("Автор: " + author);  // Виводимо автора
        System.out.println("Статус: " + status); // Виводимо статус
    }
}


