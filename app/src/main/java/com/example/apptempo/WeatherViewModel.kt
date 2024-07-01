package com.example.apptempo

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.apptempo.api.Constant
import com.example.apptempo.api.NetworkResponse
import com.example.apptempo.api.RetrofitInstance
import com.example.apptempo.api.WeatherModel
import kotlinx.coroutines.launch

class WeatherViewModel : ViewModel() {

    private val weatherApi = RetrofitInstance.weatherApi
    private val _weatherResult = MutableLiveData<NetworkResponse<WeatherModel>>()
    val weatherResult : LiveData<NetworkResponse<WeatherModel>> = _weatherResult

    fun getData(city: String) {
        Log.i("Cidade: ", city)
        _weatherResult.value = NetworkResponse.Loading

        viewModelScope.launch {
            try{
                val response = weatherApi.getWeather(Constant.apiKey,city)
                if(response.isSuccessful){
                    response.body()?.let {
                        _weatherResult.value = NetworkResponse.Success(it)
                    }
                } else{
                    _weatherResult.value = NetworkResponse.Error("Failed to load data")
                }
            }
            catch (e: Exception){
                _weatherResult.value = NetworkResponse.Error("Failed to load data")
            }
        }
    }
}
