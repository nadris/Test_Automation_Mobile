package activity.whenDo;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class UpdateNoteForm {

    public TextBox titleTxtBox= new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public TextBox noteTxtBox= new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
    public Button saveButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));

    public void selectedNote(String title){
        Button selectedNote= new Button(By.xpath("//android.widget.TextView[@text='"+title+"']"));
        selectedNote.click();
    }
}
