package notepad;

import notepad.model.Notepad;
import notepad.presenter.Presenter;
import notepad.ui.Console;

public class Program {


    public static void main(String[] args) {
        Console console = new Console();
        Notepad notepad = new Notepad();
        Presenter presenter = new Presenter(console, notepad);

        presenter.init();



    }
}
