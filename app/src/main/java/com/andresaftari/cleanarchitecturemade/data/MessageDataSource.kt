package com.andresaftari.cleanarchitecturemade.data

import com.andresaftari.cleanarchitecturemade.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String) =
        MessageEntity("Hello $name!")
}