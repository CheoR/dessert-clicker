package com.example.dessertclicker.ui

import com.example.dessertclicker.data.DessertUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 * ViewModel contains app data and methods to process data
 */
class DessertViewModel {
    /*
     Game UI state
     StateFlow
        - data holder observable flow that emits the current and new state updates.
        - Its value property reflects the current state value.
        - To update state and send it to the flow, assign a new value to the value property of the
        MutableStateFlow class.
        - works with classes that need to maintain an observable immutable state.
         * - StateFlow can be exposed from the class state e.g. GameUiState,
         *  so that the composables can listen for UI state updates and make the screen state survive
         *  configuration changes.
     */
    private val _uiState = MutableStateFlow(DessertUiState())
    /*
        Backing property to avoid state updates from other classes
        makes this mutable state flow a read-only state flow

        asStateFlow() - make mutable state flow a read-only state flow
     */
    val dessertUiState: StateFlow<DessertUiState> = _uiState.asStateFlow()
}