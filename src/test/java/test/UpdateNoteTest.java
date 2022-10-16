package test;

import activity.whenDo.CreateNoteForm;
import activity.whenDo.MainScreen;
import activity.whenDo.UpdateNoteForm;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

public class UpdateNoteTest {

    MainScreen mainScreen = new MainScreen();
    CreateNoteForm createNoteForm = new CreateNoteForm();
    UpdateNoteForm updateNoteForm = new UpdateNoteForm();
    @Test
    @Tag("updateNote")
    public void verifyUpdateNote(){
        String title="Nueva Nota II";
        String note="Mi nueva Nota II";

        String updateTitle="Nota Actualizada II";
        String updateNote="Mi Nota Actualizada II";

        mainScreen.addNoteButton.click();
        createNoteForm.titleTxtBox.setText(title);
        createNoteForm.noteTxtBox.setText(note);
        createNoteForm.saveButton.click();

        mainScreen.selectedNote(title);
        updateNoteForm.titleTxtBox.setText(updateTitle);
        updateNoteForm.noteTxtBox.setText(updateNote);
        updateNoteForm.saveButton.click();

        Assertions.assertTrue(mainScreen.isNoteDisplayed(updateTitle), "ERROR, the note was not updated");

    }

    @AfterEach
    public void closeApp(){
        Session.getInstance().closeApp();
    }

}
