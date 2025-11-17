package com.example.a23012021015_mad_assignment1

data class CropInfo(
    val soilType: String,
    val cropName: String,
    val expectedYield: String,
    val season: String
)

object RecommendationEngine {

    private val cropData = listOf(
        // Loamy soil
        CropInfo("loamy", "Wheat", "High", "Rabi"),
        CropInfo("loamy", "Rice", "High", "Kharif"),
        CropInfo("loamy", "Maize", "Medium", "Kharif"),
        CropInfo("loamy", "Chickpea", "High", "Rabi"),
        CropInfo("loamy", "Millet", "Medium", "Kharif"),
        CropInfo("loamy", "Barley", "High", "Rabi"),
        CropInfo("loamy", "Oats", "Medium", "Rabi"),
        CropInfo("loamy", "Mustard", "Medium", "Rabi"),
        CropInfo("loamy", "Sunflower", "Medium", "Kharif"),
        CropInfo("loamy", "Soybean", "High", "Kharif"),
        CropInfo("loamy", "Tomato", "High", "Rabi"),

        // Clay soil
        CropInfo("clay", "Sugarcane", "Medium", "Rabi"),
        CropInfo("clay", "Soybean", "Medium", "Kharif"),
        CropInfo("clay", "Cotton", "High", "Kharif"),
        CropInfo("clay", "Wheat", "Medium", "Rabi"),
        CropInfo("clay", "Rice", "High", "Kharif"),
        CropInfo("clay", "Barley", "Medium", "Rabi"),
        CropInfo("clay", "Mustard", "Medium", "Rabi"),
        CropInfo("clay", "Tomato", "High", "Rabi"),
        CropInfo("clay", "Potato", "High", "Rabi"),
        CropInfo("clay", "Chili", "Medium", "Kharif"),

        // Sandy soil
        CropInfo("sandy", "Groundnut", "Low", "Kharif"),
        CropInfo("sandy", "Pearl millet", "Low", "Kharif"),
        CropInfo("sandy", "Sunflower", "Low", "Kharif"),
        CropInfo("sandy", "Sesame", "Medium", "Kharif"),
        CropInfo("sandy", "Maize", "Medium", "Kharif"),
        CropInfo("sandy", "Sorghum", "Medium", "Kharif"),
        CropInfo("sandy", "Pumpkin", "Low", "Rabi"),
        CropInfo("sandy", "Watermelon", "Medium", "Kharif"),
        CropInfo("sandy", "Cucumber", "Medium", "Kharif"),
        CropInfo("sandy", "Tomato", "Low", "Rabi"),

        // Black soil
        CropInfo("black", "Cotton", "High", "Kharif"),
        CropInfo("black", "Chili", "Medium", "Kharif"),
        CropInfo("black", "Sugarcane", "High", "Rabi"),
        CropInfo("black", "Soybean", "High", "Kharif"),
        CropInfo("black", "Groundnut", "High", "Kharif"),
        CropInfo("black", "Maize", "Medium", "Kharif"),
        CropInfo("black", "Sorghum", "High", "Kharif"),
        CropInfo("black", "Sunflower", "High", "Kharif"),
        CropInfo("black", "Rice", "Medium", "Kharif"),
        CropInfo("black", "Wheat", "Medium", "Rabi"),

        // Red soil
        CropInfo("red", "Tomato", "Medium", "Rabi"),
        CropInfo("red", "Potato", "High", "Rabi"),
        CropInfo("red", "Maize", "Medium", "Kharif"),
        CropInfo("red", "Cotton", "Medium", "Kharif"),
        CropInfo("red", "Chili", "Medium", "Kharif"),
        CropInfo("red", "Groundnut", "High", "Kharif"),
        CropInfo("red", "Sesame", "Medium", "Kharif"),
        CropInfo("red", "Sunflower", "Medium", "Kharif"),
        CropInfo("red", "Sugarcane", "High", "Rabi"),
        CropInfo("red", "Soybean", "Medium", "Kharif"),

        // Silty soil
        CropInfo("silty", "Barley", "High", "Rabi"),
        CropInfo("silty", "Oats", "Medium", "Rabi"),
        CropInfo("silty", "Wheat", "High", "Rabi"),
        CropInfo("silty", "Rice", "High", "Kharif"),
        CropInfo("silty", "Maize", "Medium", "Kharif"),
        CropInfo("silty", "Chickpea", "High", "Rabi"),
        CropInfo("silty", "Millet", "Medium", "Kharif"),
        CropInfo("silty", "Mustard", "Medium", "Rabi"),
        CropInfo("silty", "Sunflower", "Medium", "Kharif"),
        CropInfo("silty", "Soybean", "High", "Kharif"),

        // Additional crops to reach 100+
        CropInfo("loamy", "Cabbage", "Medium", "Rabi"),
        CropInfo("loamy", "Cauliflower", "Medium", "Rabi"),
        CropInfo("clay", "Spinach", "High", "Rabi"),
        CropInfo("sandy", "Carrot", "Low", "Rabi"),
        CropInfo("black", "Pumpkin", "High", "Kharif"),
        CropInfo("red", "Okra", "Medium", "Kharif"),
        CropInfo("silty", "Lentil", "High", "Rabi"),
        CropInfo("loamy", "Onion", "High", "Rabi"),
        CropInfo("clay", "Garlic", "Medium", "Rabi"),
        CropInfo("sandy", "Cabbage", "Low", "Rabi"),
        CropInfo("black", "Brinjal", "High", "Kharif"),
        CropInfo("red", "Radish", "Medium", "Rabi"),
        CropInfo("silty", "Peas", "High", "Rabi")
    )

    fun getRecommendation(soil: String): List<CropInfo> {
        return cropData.filter { it.soilType.equals(soil, ignoreCase = true) }
    }
}
