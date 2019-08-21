package com.github.icarohs7.unoxjavafxarch.extensions.coroutines

import arrow.core.Try
import javafx.beans.property.Property
import javafx.beans.value.ChangeListener
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow

/**
 * Convert the given JavaFX Property
 * to a [Flow], removing the internal
 * listener when the collecting coroutine
 * is cancelled
 */
fun <T> Property<T>.asFlow(): Flow<T> {
    return callbackFlow {
        Try { send(value) }
        val listener = ChangeListener<T> { _, _, newValue -> offer(newValue) }
        addListener(listener)
        awaitClose { removeListener(listener) }
    }
}