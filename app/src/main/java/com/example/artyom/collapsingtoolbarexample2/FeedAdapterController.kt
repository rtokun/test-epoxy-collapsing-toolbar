package com.example.artyom.collapsingtoolbarexample2

import com.airbnb.epoxy.EpoxyController


/**
 * Created by Yossi Segev on 09/05/2018.
 */

class FeedAdapterController : EpoxyController() {

    override fun buildModels() {
        for (i in 0..9) {
            MyWidgetModel_()
                .id(i)
                .addTo(this)
        }
    }
}
