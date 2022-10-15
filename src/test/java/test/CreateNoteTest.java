package test;

import activity.whenDo.CreateNoteForm;
import activity.whenDo.MainScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

public class CreateNoteTest {
    MainScreen mainScreen = new MainScreen();
    CreateNoteForm createNoteForm = new CreateNoteForm();

    @Test
    public void verifyCreateNewNote(){
        String title="Nueva Nota Mobile Test";
        String note="MI nueva Nota";

        mainScreen.addNoteButton.click();
        createNoteForm.titleTxtBox.setText(title);
        createNoteForm.noteTxtBox.setText(note);
        createNoteForm.saveButton.click();

        Assertions.assertTrue(mainScreen.isNoteDisplayed(title),
                "ERROR, the note was not created");

    }

    @AfterEach
    public void closeApp(){
        Session.getInstance().closeApp();
    }


}