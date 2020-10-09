package com.andresaftari.cleanarchitecturemade.domain

interface IMessageRepository {
    fun getWelcomeMessage(name: String): MessageEntity
}