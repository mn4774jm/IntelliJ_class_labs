package com.thomasmullins.gui.Hello.movieRating;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovieGUI extends JFrame{
    private JPanel mainPanel;
    private JSlider ratingSlider;
    private JCheckBox wouldSeeAgainTextBox;
    private JLabel movieOpinionLabel;
    private JLabel sliderValueLabel;
    private JTextField movieTitleTextField;
    private JButton quitButton;

    MovieGUI() {
        setLocationRelativeTo(null);
        setContentPane(mainPanel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        configureEventHandlers();
    }

    private void configureEventHandlers() {
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (JOptionPane.showConfirmDialog(MovieGUI.this, "Are you sure you want to quit?",
                        "Quit", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                    System.exit(0);
                }
            }
        });
        ratingSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                String valueLabelText = ratingSlider.getValue() + " stars";
                sliderValueLabel.setText(valueLabelText);
                updateOpinion();
            }
        });
        wouldSeeAgainTextBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                updateOpinion();
            }

        });
        movieTitleTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateOpinion();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateOpinion();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }


        });
    }

    private void updateOpinion() {
        String title = movieTitleTextField.getText();

        //if the movie is blank, or just whitespace, clean opinion text
        if (title.trim().length() == 0) {
            movieOpinionLabel.setText("Enter a movie title");
        }
        else{
            int rating = ratingSlider.getValue();

            boolean seeAgain = wouldSeeAgainTextBox.isSelected();

            String template = "You rated '%s' %d stars. You %s see again.";

            String seeAgainStr = seeAgain ? "would" : "would not";

            String opinion = String.format(template, title, rating, seeAgainStr);

            movieOpinionLabel.setText(opinion);
        }
    }
}
