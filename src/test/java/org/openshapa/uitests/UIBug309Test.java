package org.openshapa.uitests;

import java.awt.event.KeyEvent;

import org.fest.swing.core.KeyPressInfo;
import org.fest.swing.fixture.DialogFixture;
import org.fest.swing.fixture.JPanelFixture;
import org.fest.swing.fixture.JTextComponentFixture;

import org.testng.annotations.Test;


/**
 * Bug 309 Test The Ok button on dialogs should probably be defaulted (ie.
 * respond to Enter/Return key)
 */
public final class UIBug309Test extends OpenSHAPATestClass {

    /**
     * Different possible cell types.
     */
    private static final String[] VAR_TYPES = {
            "TEXT", "PREDICATE", "INTEGER", "NOMINAL", "MATRIX", "FLOAT"
        };

    /**
     * Test creating a new variable. Test to see if the user can press enter
     * rather than having to click on the OK button.
     *
     * @throws java.lang.Exception
     *             on any error
     */
    @Test public void testEnterInsteadOfClicking() throws Exception {
        printTestName();

        String varName = "v";
        String varType = VAR_TYPES[(int) (Math.random() * VAR_TYPES.length)];
        String varRadio = varType.toLowerCase() + "TypeButton";

        JPanelFixture ssPanel = mainFrameFixture.getSpreadsheet();

        // Create new variable.
        mainFrameFixture.clickMenuItemWithPath("Spreadsheet", "New Variable");

        // Find the new variable dialog
        DialogFixture newVariableDialog = mainFrameFixture.dialog();

        // Check if the new variable dialog is actually visible
        newVariableDialog.requireVisible();

        // Get the variable value text box
        JTextComponentFixture variableValueTextBox =
            newVariableDialog.textBox();

        // The variable value box should have no text in it
        variableValueTextBox.requireEmpty();

        // It should be editable
        variableValueTextBox.requireEditable();

        // Type in some text.
        variableValueTextBox.enterText(varName);

        // Get the radio button for text variables
        newVariableDialog.radioButton(varRadio).click();

        // Check that it is selected
        newVariableDialog.radioButton(varRadio).requireSelected();

        // Press the enter key with the text field selected.
        variableValueTextBox.pressAndReleaseKey(KeyPressInfo.keyCode(
                KeyEvent.VK_ENTER));

        // 2. Check that the column has been created
        ssPanel.panel("headerView").label().text().startsWith(varName);
    }
}
