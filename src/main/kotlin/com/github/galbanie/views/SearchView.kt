package com.github.galbanie.views

import com.github.galbanie.SearchRequest
import tornadofx.*
import javafx.scene.control.TextField

/**
 * Created by Galbanie on 2017-10-06.
 */
class SearchView : View() {
    override val root = textfield {
        promptText = "Search"
        textProperty().onChange {
            if(it != null) fire(SearchRequest(it))
        }
    }
}
