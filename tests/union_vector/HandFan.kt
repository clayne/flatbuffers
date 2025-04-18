// automatically generated by the FlatBuffers compiler, do not modify

import com.google.flatbuffers.BaseVector
import com.google.flatbuffers.BooleanVector
import com.google.flatbuffers.ByteVector
import com.google.flatbuffers.Constants
import com.google.flatbuffers.DoubleVector
import com.google.flatbuffers.FlatBufferBuilder
import com.google.flatbuffers.FloatVector
import com.google.flatbuffers.LongVector
import com.google.flatbuffers.StringVector
import com.google.flatbuffers.Struct
import com.google.flatbuffers.Table
import com.google.flatbuffers.UnionVector
import java.nio.ByteBuffer
import java.nio.ByteOrder
import kotlin.math.sign

@Suppress("unused")
class HandFan : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : HandFan {
        __init(_i, _bb)
        return this
    }
    val length : Int
        get() {
            val o = __offset(4)
            return if(o != 0) bb.getInt(o + bb_pos) else 0
        }
    fun mutateLength(length: Int) : Boolean {
        val o = __offset(4)
        return if (o != 0) {
            bb.putInt(o + bb_pos, length)
            true
        } else {
            false
        }
    }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_25_2_10()
        fun getRootAsHandFan(_bb: ByteBuffer): HandFan = getRootAsHandFan(_bb, HandFan())
        fun getRootAsHandFan(_bb: ByteBuffer, obj: HandFan): HandFan {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun createHandFan(builder: FlatBufferBuilder, length: Int) : Int {
            builder.startTable(1)
            addLength(builder, length)
            return endHandFan(builder)
        }
        fun startHandFan(builder: FlatBufferBuilder) = builder.startTable(1)
        fun addLength(builder: FlatBufferBuilder, length: Int) = builder.addInt(0, length, 0)
        fun endHandFan(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
