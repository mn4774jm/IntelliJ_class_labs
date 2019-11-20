package com.thomasmullins.more_GUIs.ToDoexample;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ToDoList extends JFrame{
    private JTextField newToDoTextField;
    private JList<String> toDoList; // very important that that generic is used here

    private DefaultListModel<String> listModel; // A JList needs a model to provide data

    private JButton addToDoButton;
    private JPanel rootPanel;
    private JButton deleteSelectedButton; // works with action listener to require that an item is selected

    protected ToDoList() {
        setContentPane(rootPanel);
        setPreferredSize(new Dimension(500, 500));

        listModel = new DefaultListModel<>();
        //create a listModel. The list starts empty, and the model contains no data.
        //when you add data to the list, you actually need to add it to the list's * model *.

        //configure the JList to use this model as its data source.
        toDoList.setModel(listModel);

        //single selection model - user can only select one thing from the list at a time
        toDoList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        addListeners(); //Tinder to move the event listener configuration to a seperate method

        //configure the submitButton to be the default button that is 'clicked' when
        //the user presses the enter key
        getRootPane().setDefaultButton(addToDoButton);

        pack(); //arrange components in GUI
        setVisible(true); // Default JFrame is not visible

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    private void addListeners() {

        //Need to listen for button clicked
        //Read the text in the text box and add this to the list

        addToDoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newToDo = newToDoTextField.getText();
                newToDo = newToDo.trim(); //remove whitespace

                //was text entered?
                if (newToDo.isEmpty()) {
                    //show a pop-up
                    JOptionPane.showMessageDialog(ToDoList.this, "Enter a to do item.");
                } else {
                    listModel.addElement(newToDo);//Add new item to the Jlist's model
                    newToDoTextField.setText("");//CLear the text field
                }
            }
        });
        //TODO deletes only item that is selected from the list
        deleteSelectedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int selectedIndex = toDoList.getSelectedIndex(); //ask the list what is selected
                if (selectedIndex != -1) {
                    listModel.remove(selectedIndex);// remove the item from the MODEL
                } else {
                    JOptionPane.showMessageDialog(ToDoList.this, "Please select an item to delete");
                }
            }
        });

        //TODO Add listener for the list being clicked on, which should remove the selected item; this has been replaced


//        toDoList.addListSelectionListener(new ListSelectionListener() {
//            @Override
//            public void valueChanged(ListSelectionEvent e) {
//                //what was selected?
//                int selectedIndex = toDoList.getSelectedIndex(); //ask the LIST what is selected
//                if (selectedIndex != -1) {
//                    listModel.remove(selectedIndex); //remove this item from the model
//                }
//            }
//        });
        //TODO creates a pop up list when the user right-clicks the mouse
        //create a menu and a listener for the pop-up menu
        JPopupMenu rightClickMenu = new JPopupMenu();
        JMenuItem deleteMenuItem = new JMenuItem("Delete");
        rightClickMenu.add(deleteMenuItem);

        deleteMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //delete
                deleteSelected();
            }
        });

        //associate the pop-up menu with the Jlist
        toDoList.setComponentPopupMenu(rightClickMenu);

        //add a mouse listener to select item in list when the user right-clicks.
        //The list items are only selected with the left clicks. So without this,
        //the pop-up will be associated with the correct item, but that item won't
        //automatically be selected when the user right-clicks on it - whatever was
        //last selected would still be selected, which would be confusing

        toDoList.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selection = toDoList.locationToIndex(e.getPoint());
                toDoList.setSelectedIndex(selection);
            }
            //Even though we don't need these events to do anything, still required to provide the methods
            @Override
            public void mousePressed(MouseEvent e) { }
            @Override
            public void mouseReleased(MouseEvent e) { }
            @Override
            public void mouseEntered(MouseEvent e) { }
            @Override
            public void mouseExited(MouseEvent e) { }
        });


    }
    private void deleteSelected() {
        int selectedIndex = toDoList.getSelectedIndex(); //Ask the LIST what is selected

        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(this, "Select an item to delete");
        } else {
            String deleteItem = toDoList.getSelectedValue();
            if (JOptionPane.showConfirmDialog(this, "Delete " + deleteItem + "?", "Delete", JOptionPane.OK_CANCEL_OPTION)
                    ==JOptionPane.OK_OPTION) {
                listModel.remove(selectedIndex); //remove the item from the model
            }
        }
    }
}
