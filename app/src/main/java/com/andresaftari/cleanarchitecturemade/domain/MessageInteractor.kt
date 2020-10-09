package com.andresaftari.cleanarchitecturemade.domain

class MessageInteractor(private val messageRepository: IMessageRepository) : MessageUseCase {
    override fun getMessage(name: String) = messageRepository.getWelcomeMessage(name)
}