package com.github.icarohs7.unoxjavafxarch.extensions

import javafx.event.EventTarget
import javafx.scene.Node
import tornadofx.*

/**
 * Make the given node the parent of the parameterized
 * [node]
 */
fun <T : Node> EventTarget.add(node: T, op: T.() -> Unit = {}): T {
    return node.attachTo(this, op)
}