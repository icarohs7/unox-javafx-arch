package com.github.icarohs7.unoxjavafxarch.presentation.views

import com.github.icarohs7.unoxcore.extensions.coroutines.job
import javafx.scene.Node
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.cancelChildren
import tornadofx.*

/**
 * Base view containing a lifecycle scope that
 * cancels all its children at [onUndock]
 */
abstract class BaseArchView(title: String? = null, icon: Node? = null) : View(title, icon) {
    val lifecycleScope: CoroutineScope = MainScope()

    override fun onUndock() {
        super.onUndock()
        lifecycleScope.job.cancelChildren()
    }
}
