package com.andresaftari.cleanarchitecturemade.data

import com.andresaftari.cleanarchitecturemade.domain.IMessageRepository

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String) = messageDataSource.getMessageFromSource(name)
}