package com.example.artyom.collapsingtoolbarexample2

import android.view.View
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder


@EpoxyModelClass(layout = R.layout.wallet_item)
abstract class MyWidgetModel : EpoxyModelWithHolder<MyWidgetModel.Holder>() {

    inner class Holder : EpoxyHolder() {

        override fun bindView(itemView: View) {
        }
    }
}
