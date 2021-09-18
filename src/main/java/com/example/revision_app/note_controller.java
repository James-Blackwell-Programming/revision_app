package com.example.revision_app;

import java.io.*;
import java.util.List;

public class note_controller {

    public static void saveNotes(List<note> notesToSave){
        try(FileOutputStream savedNotes = new FileOutputStream("notes.jim");
        ObjectOutputStream oos = new ObjectOutputStream(savedNotes)){

            //write array to file
            oos.writeObject(notesToSave);



        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void loadNotes(){
        try(InputStream readNotes = new FileInputStream("notes.jim");
            ObjectInputStream ois = new ObjectInputStream(readNotes)){

            List<note> loadedNotes = (List<note>) ois.readObject();

            RevisionApp.notes.clear();
            RevisionApp.notes.addAll(loadedNotes);



        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
