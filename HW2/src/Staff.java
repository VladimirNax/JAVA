public interface Staff {
    //Интерфейс используется для обучающего персонала.

    void helpStudent(Student student); // Помочь студенту (без реализации)

    default void giveAdditionalMaterials() { //Дать дополнительные материалы
        System.out.println("Дополнительные материалы: https://habr.com/post/");
    }
}
