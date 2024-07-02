# 🌦️ AppTempo
AppTempo is a weather android application that provides detailed meteorological information, including temperature, weather conditions, and UV index, for cities around the world. The app utilizes the WeatherAPI to fetch accurate and up-to-date weather data.

## Features
- City Search: Allows users to search and view weather information for different cities.
- Weather Details: Displays current temperature, weather conditions, and other relevant information.
- UV Index: Informs about the intensity of ultraviolet radiation to help users protect themselves from overexposure to the sun.

## Technologies Used
- **Kotlin**: Programming language used for app development.
- **Jetpack Compose**: Toolkit for building native Android UI.
- **Retrofit**: Library for making HTTP requests and integrating with the WeatherAPI.
- **Gson**: Library for converting Java objects to JSON and vice versa.
- **WeatherAPI**: Service used for fetching weather data.

## Project Structure
The project is structured as follows:

```
app/
├── api/
│   ├── Condition
│   ├── Constant
│   ├── Current
│   ├── Location
│   ├── NetworkResponse
│   ├── WeatherApi
│   └── WeatherModel
│
├── ui.theme
├── MainActivity
├── WeatherPage.kt
├── WeatherViewModel
└── res/
```

## How to Run
1. Clone the repository and open with Android Studio.

2. Register on the Weather API portal [here](https://www.weatherapi.com/) and copy your API key.

3. Add the WeatherAPI key in `Constant.kt`:

```kt
// www.weatherapi.com (https)
val apiKey = "Your_API_Key_Here"

```
4. Build with gradle and run the app on an Android emulator or device.

![image](https://github.com/GM7Avila/weather-app/assets/94200845/9cbb77f2-244d-4b27-8dc3-5711c2264d39)

## Contributions
Contributions are welcome! If you would like to contribute, please fork the repository, create a branch for your changes, and submit a pull request.
