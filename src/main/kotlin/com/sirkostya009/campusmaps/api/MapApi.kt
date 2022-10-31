package com.sirkostya009.campusmaps.api

import com.sirkostya009.campusmaps.Constants
import com.sirkostya009.campusmaps.service.MapService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/")
class MapApi(
    val service: MapService
) {

    @GetMapping("/map", produces = [Constants.MapFormat])
    fun getMap(@RequestParam(name = "building", required = true) buildingNo: Int,
               @RequestParam(name = "floor", required = true) floorLevel: Int) =
        service.getMap(buildingNo, floorLevel)

}
