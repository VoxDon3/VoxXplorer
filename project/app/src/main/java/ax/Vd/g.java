/*
 * Decompiled with CFR 0.152.
 */
package ax.Vd;

import ax.Vd.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

public class g
extends b {
    private static final short[] g = ax.Vd.g.$d2j$hex$e040ce6d$decode_S("ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00fe00ff00ff00fe00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00fd00fd00fd00fd00fd00fd00fd00fd00fd00fd00fd00fd00fd00fd00fd00fd00fc00fc00fc00fc00fc00fc00fc00fc00fc00fc00fd00fd00fd00fd00fd00fd00fd008e008f009000910092009300940095009600970098004a0099004b009a009b009c009d009e009f00a000a100a200a300a400a500fd00fd00fd00fd00fd00fd004700ac004200ad004100ae004c00af004000b000b1004d004800b20045004300b3004e004900b400b5004f00b600b700b800b900fd00fd00fd00fd00fd00bf00c000c100c200c300c400c500c600c700c800c900ca00cb00cc00cd00ce00cf00d000d100d200d300d400d500d600d700d800d900da00db00dc00dd00de00df00e000e1004400e200e300e400e500e600e700e800e900ea00eb00ec00ed00ee00ef00f000f100f200f300f400f500f600f700f800f900fa00fb00fc00fd001b00030015001c000d000200270013001a00040017000b0008000c00050001000f0010000900070006000e0018000a0011001200140019001e001d00160036003b0025002c003a002900300035002e0037002a003c002400310026001f00220023002b002d00200028003400380021003d003e00330039002f003f0032004600");

    public g() {
        super(g, ax.Rd.b.o);
    }

    private static long[] $d2j$hex$e040ce6d$decode_J(String src) {
        byte[] d8 = ax.Vd.g.$d2j$hex$e040ce6d$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s8 = b8.asLongBuffer();
        long[] data = new long[d8.length / 8];
        s8.get(data);
        return data;
    }

    private static int[] $d2j$hex$e040ce6d$decode_I(String src) {
        byte[] d8 = ax.Vd.g.$d2j$hex$e040ce6d$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s8 = b8.asIntBuffer();
        int[] data = new int[d8.length / 4];
        s8.get(data);
        return data;
    }

    private static short[] $d2j$hex$e040ce6d$decode_S(String src) {
        byte[] d8 = ax.Vd.g.$d2j$hex$e040ce6d$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s8 = b8.asShortBuffer();
        short[] data = new short[d8.length / 2];
        s8.get(data);
        return data;
    }

    private static byte[] $d2j$hex$e040ce6d$decode_B(String src) {
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

