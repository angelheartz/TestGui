package scripts.gui;

public class MainGUIFXML {

    public static String get = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "\n" +
            "<?import javafx.scene.control.Button?>\n" +
            "<?import javafx.scene.layout.ColumnConstraints?>\n" +
            "<?import javafx.scene.layout.GridPane?>\n" +
            "<?import javafx.scene.layout.HBox?>\n" +
            "<?import javafx.scene.layout.RowConstraints?>\n" +
            "\n" +
            "<GridPane alignment=\"CENTER\" maxHeight=\"-Infinity\" maxWidth=\"-Infinity\" minHeight=\"-Infinity\" minWidth=\"-Infinity\" prefHeight=\"400.0\" prefWidth=\"600.0\" xmlns=\"http://javafx.com/javafx/11.0.1\" xmlns:fx=\"http://javafx.com/fxml/1\" fx:controller=\"scripts.GUIController\">\n" +
            "    <columnConstraints>\n" +
            "        <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\n" +
            "    </columnConstraints>\n" +
            "    <rowConstraints>\n" +
            "        <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\n" +
            "        <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\n" +
            "    </rowConstraints>\n" +
            "    <children>\n" +
            "        <HBox prefHeight=\"134.0\" prefWidth=\"564.0\" GridPane.halignment=\"CENTER\" GridPane.valignment=\"CENTER\" />\n" +
            "        <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.halignment=\"CENTER\" GridPane.rowIndex=\"1\" GridPane.valignment=\"CENTER\">\n" +
            "            <children>\n" +
            "                <Button fx:id=\"startScriptButton\" mnemonicParsing=\"false\" onAction=\"#startScriptPressed\" prefHeight=\"33.0\" prefWidth=\"161.0\" text=\"Start Script\" />\n" +
            "            </children>\n" +
            "        </HBox>\n" +
            "    </children>\n" +
            "</GridPane>\n";
}