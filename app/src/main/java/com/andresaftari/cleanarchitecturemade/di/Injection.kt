package com.andresaftari.cleanarchitecturemade.di

import com.andresaftari.cleanarchitecturemade.data.IMessageDataSource
import com.andresaftari.cleanarchitecturemade.data.MessageDataSource
import com.andresaftari.cleanarchitecturemade.data.MessageRepository
import com.andresaftari.cleanarchitecturemade.domain.IMessageRepository
import com.andresaftari.cleanarchitecturemade.domain.MessageInteractor
import com.andresaftari.cleanarchitecturemade.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource = MessageDataSource()
}