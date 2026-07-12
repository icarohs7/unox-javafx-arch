package com.github.icarohs7.unoxjavafxarch.extensions.coroutines

import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.runBlockingTest
import kotlinx.coroutines.yield
import org.junit.Test
import se.lovef.assert.v1.shouldEqual
import tornadofx.*

class CoroutineIntegrationsKtTest {
    @Test
    fun should_convert_property_to_flow() {
        val prop = stringProperty("Omai wa mou shindeiru!")
        val flow = prop.asFlow()

        val res1 = runBlocking { flow.first() }
        res1 shouldEqual "Omai wa mou shindeiru!"

        runBlockingTest {
            var lastRes = ""
            val job = flow.onEach { lastRes = it }.launchIn(this)

            prop.set("NANI!?")
            yield()
            lastRes shouldEqual "NANI!?"
            job.cancel()
        }
    }
}