package com.bersyte.weatherapp

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.bersyte.weatherapp.databinding.ActivityMainBinding
import com.bersyte.weatherapp.viewmodel.WeatherViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: WeatherViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        viewModel.weatherResponse.observe(this, { weather ->

            binding.apply {
                tvCityName.text = "Nur - sultaan"
                tvDescription.text = weather.weather[0].description;
                tvTemperature.text = weather.main?.temp.toString();
                tvWind.text ="${weather?.wind?.speed.toString()} км/ч";
            }

        })
    }
}