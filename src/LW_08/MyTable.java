package LW_08;

import javax.swing.*;
import java.awt.*;

public class MyTable extends JTable {
    private static final String[][] data = {
            {"Chames", "Male", "23"},
            {"Dinuka", "Male", "22"},
            {"Chames", "Male", "23"},
            {"Dinuka", "Male", "22"},
            {"Chames", "Male", "23"},
            {"Dinuka", "Male", "22"},
            {"Chames", "Male", "23"},
            {"Dinuka", "Male", "22"},
    };
    private static final String[] columnNames = {"Name", "Gender", "Age"};


    public MyTable() {
        super(data, columnNames);
        setSize(300, getPreferredSize().height);
    }
}
