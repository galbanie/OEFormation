package com.github.galbanie

import com.github.galbanie.views.SearchView
import com.github.galbanie.views.TopMenuView
import tornadofx.*

/**
 * Created by Galbanie on 2017-10-05.
 */
class OeFormationWorkspace : Workspace() {
    init {
        add(TopMenuView::class)
        add(SearchView::class)
    }
}