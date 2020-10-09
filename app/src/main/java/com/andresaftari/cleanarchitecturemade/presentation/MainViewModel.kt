package com.andresaftari.cleanarchitecturemade.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.andresaftari.cleanarchitecturemade.domain.MessageEntity
import com.andresaftari.cleanarchitecturemade.domain.MessageUseCase

class MainViewModel(private val messageUseCase: MessageUseCase) : ViewModel() {
    private val stringMessage = MutableLiveData<MessageEntity>()

    val message: LiveData<MessageEntity>
        get() = stringMessage

    fun setName(name: String) {
        stringMessage.value = messageUseCase.getMessage(name)
    }
}