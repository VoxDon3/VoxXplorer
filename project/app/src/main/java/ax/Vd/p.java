/*
 * Decompiled with CFR 0.152.
 */
package ax.Vd;

import ax.Rd.b;
import ax.Vd.c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

public class p
extends c {
    private static final short[] g = p.$d2j$hex$16d77891$decode_S("ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00fe00ff00ff00fe00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00fd00fd00fd00fd00fd00fd00fd00fd00fd00fd00fd00fd00fd00fd00fd00fd00fc00fc00fc00fc00fc00fc00fc00fc00fc00fc00fd00fd00fd00fd00fd00fd00fd005200640068005e0062006500740066006f00bb0075005c005800710055004f007600690053004300720077005f0063006d00bc00fd00fd00fd00fd00fd00fd0048004600500051003c0060005d0059004400780061004d005600450037004e007300410042003a004c006a00670057006b007000fd00fd00fd00fd00fd00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00fd00e9003d00fd00fd00fd00fd00fd00fd00fd00fd00fd00fd004a00fd00fd00fd00fd00fd00fd00f700fd00fd0024002e0047004900fd003600fd006c007b006e001f0033002b00290022005b00280034002f002c003500260031003b00270023003000fa00250021002d003800320054003900780079001100120016000f007c0001001d0014001500030020000d00190005000b0010000a0006001e000400090008000e00070002000c001c0017002a00180040004b0013001a001b00fd00");

    public p() {
        super(g, ax.Rd.b.s);
    }

    private static long[] $d2j$hex$16d77891$decode_J(String src) {
        byte[] d8 = p.$d2j$hex$16d77891$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s8 = b8.asLongBuffer();
        long[] data = new long[d8.length / 8];
        s8.get(data);
        return data;
    }

    private static int[] $d2j$hex$16d77891$decode_I(String src) {
        byte[] d8 = p.$d2j$hex$16d77891$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s8 = b8.asIntBuffer();
        int[] data = new int[d8.length / 4];
        s8.get(data);
        return data;
    }

    private static short[] $d2j$hex$16d77891$decode_S(String src) {
        byte[] d8 = p.$d2j$hex$16d77891$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s8 = b8.asShortBuffer();
        short[] data = new short[d8.length / 2];
        s8.get(data);
        return data;
    }

    private static byte[] $d2j$hex$16d77891$decode_B(String src) {
        char[] d8 = src.toCharArray();
        byte[] ret = new byte[src.length() / 2];
        for (int i8 = 0; i8 < ret.length; ++i8) {
            int ll;
            int hh;
            char h8 = d8[2 * i8];
            char l8 = d8[2 * i8 + 1];
            if (h8 >= '0' && h8 <= '9') {
                hh = h8 - 48;
            } else if (h8 >= 'a' && h8 <= 'f') {
                hh = h8 - 97 + 10;
            } else if (h8 >= 'A' && h8 <= 'F') {
                hh = h8 - 65 + 10;
            } else {
                throw new RuntimeException();
            }
            if (l8 >= '0' && l8 <= '9') {
                ll = l8 - 48;
            } else if (l8 >= 'a' && l8 <= 'f') {
                ll = l8 - 97 + 10;
            } else if (l8 >= 'A' && l8 <= 'F') {
                ll = l8 - 65 + 10;
            } else {
                throw new RuntimeException();
            }
            ret[i8] = (byte)(hh << 4 | ll);
        }
        return ret;
    }
}

