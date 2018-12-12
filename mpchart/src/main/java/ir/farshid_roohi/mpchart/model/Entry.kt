package ir.farshid_roohi.mpchart.model

/**
 * Created by Farshid Roohi.
 * MpChartCustom | Copyrights 12/12/18.
 */
class Entry {

    var x: Float? = null
    var y: Float? = null

    constructor() {
    }

    constructor(_x: Float, _y: Float) {
        this.x = _x
        this.y = _y
    }
}