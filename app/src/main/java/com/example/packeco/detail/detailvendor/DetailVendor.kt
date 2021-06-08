package com.example.packeco.detail.detailvendor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.packeco.R
import com.example.packeco.databinding.ActivityDetailVendorBinding
import com.mapbox.mapboxsdk.Mapbox
import com.mapbox.mapboxsdk.maps.MapboxMap
import com.mapbox.mapboxsdk.maps.Style

class DetailVendor : AppCompatActivity() {
    private lateinit var mapboxMap: MapboxMap
    private lateinit var binding: ActivityDetailVendorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Mapbox.getInstance(this, getString(R.string.mapbox_token))
        binding = ActivityDetailVendorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.map.onCreate(savedInstanceState)
        binding.map.getMapAsync { mapboxMap ->
            this.mapboxMap = mapboxMap
            mapboxMap.setStyle(Style.MAPBOX_STREETS) { style ->
            }
        }
    }

    override fun onStart() {
        super.onStart()
        binding.map.onStart()
    }
    override fun onResume() {
        super.onResume()
        binding.map.onResume()
    }
    override fun onPause() {
        super.onPause()
        binding.map.onPause()
    }
    override fun onStop() {
        super.onStop()
        binding.map.onStop()
    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        binding.map.onSaveInstanceState(outState)
    }
    override fun onDestroy() {
        super.onDestroy()
        binding.map.onDestroy()
    }
    override fun onLowMemory() {
        super.onLowMemory()
        binding.map.onLowMemory()
    }
}