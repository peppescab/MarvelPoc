package ch.zu.peppescab.marvel.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ch.zu.peppescab.marvel.data.CharsRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    private val charsRepositoryImpl: CharsRepositoryImpl
): ViewModel() {

    private val _titleInputFlow = MutableStateFlow<List<CharModel>>(
        emptyList()
    )
    val titleInputFlow: StateFlow<List<CharModel>> get() = _titleInputFlow


    fun loadChars(){
        viewModelScope.launch{
            _titleInputFlow.value = charsRepositoryImpl.getAllChars()
        }
    }
}