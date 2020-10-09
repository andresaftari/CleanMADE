package com.andresaftari.cleanarchitecturemade.data

import com.andresaftari.cleanarchitecturemade.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}