package com.gazi.bluetoothchat.domain.chat

data class BluetoothMessage(
    val message: String,
    val senderName: String,
    val isFromLocalUser: Boolean
)
