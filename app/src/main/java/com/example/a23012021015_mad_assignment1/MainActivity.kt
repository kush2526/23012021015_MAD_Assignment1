package com.example.a23012021015_mad_assignment1

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var etSoilType: EditText
    private lateinit var btnGetRecommendation: MaterialButton
    private lateinit var rvRecommendations: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etSoilType = findViewById(R.id.etSoilType)
        btnGetRecommendation = findViewById(R.id.btnGetRecommendation)
        rvRecommendations = findViewById(R.id.rvRecommendations)

        rvRecommendations.layoutManager = LinearLayoutManager(this)

        btnGetRecommendation.setOnClickListener {
            val soil = etSoilType.text.toString().trim()
            if (soil.isEmpty()) {
                Snackbar.make(findViewById(R.id.mainLayout), "Please enter soil type!", Snackbar.LENGTH_SHORT).show()
            } else {
                val recommendations: List<Crop> = RecommendationEngine.getRecommendation(soil)
                    .map { Crop(it.toString()) }  // only if engine returns List<String>

                if (recommendations.isEmpty()) {
                    Snackbar.make(findViewById(R.id.mainLayout), "No crops found for $soil soil.", Snackbar.LENGTH_LONG).show()
                } else {
                    rvRecommendations.adapter = CropAdapter(recommendations)
                }
            }
        }
    }
}
