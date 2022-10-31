package com.sirkostya009.campusmaps.service

import com.sirkostya009.campusmaps.Constants
import org.springframework.stereotype.Service
import java.io.File

@Service
class MapService {

    fun getMap(buildingNo: Int, floorLevel: Int) =
        File("${Constants.PathToImages}/$buildingNo/$floorLevel").readBytes()

}
