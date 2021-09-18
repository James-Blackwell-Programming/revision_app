package com.example.revision_app;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ui_controller_main {

    @FXML
    public void initialize() {
        NoteList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<note>() {

            @Override
            public void changed(ObservableValue<? extends note> observableValue, note note, note t1) {
                inputText.clear();
                title.clear();
                inputText.setText(t1.getInput_text());
                title.setText(t1.getTitle());
            }
        });

        note_controller.loadNotes();
        updateUI();
    }



    @FXML
    void save(ActionEvent event) { //event = mouse click

        //create note
        note noteToSave = new note(1, title.getText(), inputText.getText(), gradings.average);
        //add note to arrayList
        RevisionApp.notes.add(noteToSave);

        //send arrayList to saveNotes function and write file to hard drive
        note_controller.saveNotes(RevisionApp.notes);

        updateUI();
    }

    void updateUI(){

        NoteList.getItems().clear();
        NoteList.getItems().addAll(FXCollections.observableArrayList(RevisionApp.notes));
    }


    @FXML
    private TextArea inputText;

    @FXML
    private Button save_button;

    @FXML
    private ListView<note> NoteList;
    @FXML
    private TextField title;

}
