import Controller.InvalidArgumentsException;
import Controller.Processor;
import Model.InvalidTodoException;
import java.io.IOException;

public class Main {

  // --csv-file todos.csv --add-todo --todo-text newtodotest --complete-todo 1 --display --show-incomplete --sort-by-date
  // --csv-file todos.csv --add-todo --todo-text testtwofilter --complete-todo 1 --display --show-incomplete --show-category home --sort-by-priority
  // --csv-file todos.csv --add-todo --todo-text testduedate --due 2022-04-20 --priority 1 --complete-todo 1 --display --show-incomplete --sort-by-date
  // --csv-file todos.csv --add-todo --todo-text testcategory --category haha --complete-todo 1 --display --show-incomplete --sort-by-date
  // --csv-file todos.csv --add-todo --todo-text completetodo --complete-todo 1 --complete-todo 2 --complete-todo 3 --display

  // courtney commands
  //--csv-file todos.csv --display
  //--csv-file todos.csv --display --show-incomplete
  //--csv-file todos.csv --display --show-category school --show-incomplete --sort-by-date
  //--csv-file todos.csv --display --show-category school --show-incomplete --sort-by-date --sort-by-priority
  //--complete-todo 1 --csv-file todos.csv
  //--complete-todo 3 --add-todo --todo-text "Another todo" --display --csv-file todos.csv
  public static void main(String[] args)
      throws IOException, InvalidArgumentsException, InvalidTodoException {
    Processor.run(args);
  }
}
