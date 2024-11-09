package com.kabrishka.beatbox

import androidx.lifecycle.MutableLiveData

class SoundViewModel(private val beatBox: BeatBox) {

    val title: MutableLiveData<String?> = MutableLiveData()

    var sound: Sound? = null
        set(sound) {
            field = sound
            title.postValue(sound?.name)
        }

    fun onButtonClicked() {
        sound?.let {
            beatBox.play(it)
        }
    }
}

/*
class SoundViewModel: BaseObservable() {

    var sound: Sound? = null
        set(sound) {
            field = sound
            notifyChange()
        }

    val title: String?
        get() = sound?.name
}*/
