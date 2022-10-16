package test;
import activity.whenDo.CreateNoteForm;
import activity.whenDo.MainScreen;
import activity.whenDo.DeleteNoteForm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class DeleteNoteTest {
    MainScreen mainScreen = new MainScreen();
    CreateNoteForm createNoteForm = new CreateNoteForm();
    DeleteNoteForm deleteNoteForm = new DeleteNoteForm();
    @Test
    @Tag("deleteNote")
    public void verifyDeleteNote(){

        String title="Nueva Nota III";
        String note="Mi nueva Nota III";

        mainScreen.addNoteButton.click();
        createNoteForm.titleTxtBox.setText(title);
        createNoteForm.noteTxtBox.setText(note);
        createNoteForm.saveButton.click();

        deleteNoteForm.selectedNote(title);
        deleteNoteForm.deleteButton.click();
        deleteNoteForm.confirmDeleteButton.click();
        Assertions.assertTrue(mainScreen.isNoteNotDisplayed(title),"ERROR, the note was not deleted");
    }
}
