package com.andresaftari.cleanarchitecturemade.domain

interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}