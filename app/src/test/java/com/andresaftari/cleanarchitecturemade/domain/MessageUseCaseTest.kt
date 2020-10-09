package com.andresaftari.cleanarchitecturemade.domain

import com.andresaftari.cleanarchitecturemade.data.MessageRepository
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MessageUseCaseTest {
    private lateinit var messageUseCase: MessageUseCase

    @Mock
    private lateinit var messageRepository: MessageRepository

    @Before
    fun setUp() {
        messageUseCase = MessageInteractor(messageRepository)
        val dummyMessage = MessageEntity("Hello $NAME")
        `when`(messageRepository.getWelcomeMessage(NAME)).thenReturn(dummyMessage)
    }

    @Test
    fun `should get data from repository`() {
        messageUseCase.getMessage(NAME)

        verify(messageRepository).getWelcomeMessage(NAME)
        verifyNoMoreInteractions(messageRepository)
    }

    companion object {
        const val NAME = 123
    }
}