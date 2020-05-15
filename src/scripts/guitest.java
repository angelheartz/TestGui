package scripts;

import org.tribot.script.Script;
import org.tribot.script.ScriptManifest;
import scripts.gui.GUI;
import scripts.gui.MainGUIFXML;

@ScriptManifest(
        name = "testr",
        description = "test",
        category = "test",
        authors = "test"
)
public class guitest extends Script {
    private GUI gui;

    @Override
    public void run() {
        gui = new GUI(MainGUIFXML.get);
        gui.show();
        while (gui.isOpen())
            sleep(500);
    }
}
