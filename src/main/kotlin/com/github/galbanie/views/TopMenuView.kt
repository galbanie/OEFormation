package com.github.galbanie.views

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView
import tornadofx.*
import javafx.scene.control.MenuBar
import javafx.scene.input.KeyCombination
import javafx.stage.FileChooser
import kotlin.system.exitProcess

/**
 * Created by Galbanie on 2017-10-06.
 */
class TopMenuView : View("My View") {
    override val root = MenuBar()

    init {
        with(root){
            menu("OE Formation") {
                /*graphic = resources.imageview("/com/github/galbanie/checkmark_on_circle.png").apply {
                    fitWidth = 14.0
                    fitHeight = 14.0
                }*/
                item("Configurations"){
                    action{
                        //find<Configuration>().openModal()
                    }
                }
                separator()
                item("Quit", KeyCombination.keyCombination("Shortcut+Q")).action {
                    exitProcess(0)
                    //Platform.exit()
                    //FX.primaryStage.close()
                }
            }
            menu("File") {
                menu("New"){
                    item("Quiz", KeyCombination.keyCombination("Shortcut+N")){
                        action {
                            //find<CheckPartsEditor>(params = mapOf(CheckPartsEditor::action to Action.CREATE)).openModal()
                        }
                    }
                    item("Question"){
                        action {

                        }
                    }
                }
                item("Open", KeyCombination.keyCombination("Shortcut+O"), FontAwesomeIconView(FontAwesomeIcon.FOLDER_OPEN_ALT)){
                    //disableWhen(status.running)
                    action {
                        //fire(ChooseFileActionEvent("Open Results", arrayOf(FileChooser.ExtensionFilter("XML files (*.xml)", "*.xml")), FileChooserMode.Single, ActionFile.openXmlToCheck))
                    }
                }
                separator()
                item("Save", KeyCombination.keyCombination("Shortcut+S"), FontAwesomeIconView(FontAwesomeIcon.FLOPPY_ALT)){
                    //disableWhen(status.running)
                    action {
                        //find<ChooseCheckParts>().openModal()
                        //fire(ChooseFileActionEvent("Save Check Parts", arrayOf(FileChooser.ExtensionFilter("XML files (*.xml)", "*.xml")), FileChooserMode.Save, ActionFile.saveCheckToXml))
                    }
                }
                menu("Save Result As") {
                    //disableWhen(status.running)
                    item("CSV", KeyCombination.keyCombination("Shortcut+Alt+C")).action {
                        //fire(ChooseFileActionEvent("Export Result to CSV", arrayOf(FileChooser.ExtensionFilter("Text files (*.txt)", "*.txt"), FileChooser.ExtensionFilter("CSV files (*.csv)", "*.csv")), FileChooserMode.Save, ActionFile.saveResultToCsv))
                    }
                    item("XML", KeyCombination.keyCombination("Shortcut+Alt+X")).action {
                        //fire(ChooseFileActionEvent("Export Result to XML", arrayOf(FileChooser.ExtensionFilter("XML files (*.xml)", "*.xml")), FileChooserMode.Save, ActionFile.saveResultToXml))
                    }
                }
                separator()
                item("Import Sources", KeyCombination.keyCombination("Shortcut+I")).action {
                    //fire(ChooseFileActionEvent("Load Web Sources", arrayOf(FileChooser.ExtensionFilter("XML files (*.xml)", "*.xml")), FileChooserMode.Single, ActionFile.loadSources))
                }
                item("Export Sources", KeyCombination.keyCombination("Shortcut+E")).action {
                    //find<ChooseSource>(params = mapOf(ChooseSource::checkId to null)).openModal()
                }
            }
            menu("Edit") {
                item("Copy", KeyCombination.keyCombination("Shortcut+C"), FontAwesomeIconView(FontAwesomeIcon.CLIPBOARD)).action {

                }
                item("Paste", KeyCombination.keyCombination("Shortcut+P"), FontAwesomeIconView(FontAwesomeIcon.CLIPBOARD)).action {

                }
            }
            menu("Help") {
                item("Demo and Screencasts").action {

                }
                item("Report").action {
                    //find<ReportView>(scope).openModal()
                }
            }
        }
    }
}
