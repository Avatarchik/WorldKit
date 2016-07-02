package com.grimfox.gec.filter

import com.grimfox.gec.Main
import com.grimfox.gec.model.ClosestPoints
import com.grimfox.gec.model.RawMatrixData.Format
import io.airlift.airline.Command
import io.airlift.airline.Option
import java.io.File

@Command(name = "cells", description = "Create Cells from points.")
class CellFilter() : ClosestPointsDataFilter<Int> {

    override val heightFunction = { closestPoints: ClosestPoints -> closestPoints.first()?.first ?: 0 }

    override val format = Format.UINT24

    @Option(name = arrayOf("-i", "--input"), description = "The data file to read as input.", required = true)
    override var inputFile: File = File(Main.workingDir, "input.bin")

    @Option(name = arrayOf("-f", "--file"), description = "The data file to write as output.", required = true)
    override var outputFile: File = File(Main.workingDir, "output.bin")
}
