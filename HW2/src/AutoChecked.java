public interface AutoChecked {
    //Используются, чтобы отметить задания, которые проверяются автоматически.

    //Выполнить задание
    default void taskCompleted(){
        System.out.println("задание выполнено!");
    }
}
