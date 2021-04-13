package com.maptiler.maplibresamples.data

import com.maptiler.maplibresamples.CustomMapFragment
import com.maptiler.maplibresamples.GeoJsonOverlayFragment
import com.maptiler.maplibresamples.RasterOverlayFragment
import com.maptiler.maplibresamples.SimpleMapFragment
import java.util.*

object SdkExamples {
    val ITEMS: MutableList<SdkSample> = ArrayList()

    val ITEM_MAP: MutableMap<String, SdkSample> = HashMap()

    init {
        addItem(
            SdkSample(
                "Simple Map",
                "Create simple map",
                SimpleMapFragment::class.qualifiedName!!
            )
        )
        addItem(
            SdkSample(
                "Custom Map",
                "Custom layer",
                CustomMapFragment::class.qualifiedName!!
            )
        )
        addItem(
            SdkSample(
                "GeoJson Overlay",
                "Add line from GeoJson",
                GeoJsonOverlayFragment::class.qualifiedName!!
            )
        )
        addItem(
            SdkSample(
                "Raster Overlay",
                "Add raster overlay to the map",
                RasterOverlayFragment::class.qualifiedName!!
            )
        )
    }

    private fun addItem(item: SdkSample) {
        ITEMS.add(item)
    }

    data class SdkSample(
        val title: String,
        val description: String,
        val targetFragment: String
    ) {
        override fun toString(): String = title
    }
}
