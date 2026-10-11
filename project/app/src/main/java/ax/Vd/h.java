/*
 * Decompiled with CFR 0.152.
 */
package ax.Vd;

import ax.Rd.b;
import ax.Vd.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

public class h
extends a {
    private static final short[] g = h.$d2j$hex$05164cc9$decode_S("ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00fe00ff00ff00fe00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00ff00fd00fd00fd00fd00fd00fd00fd00fd00fd00fd00fd00fd00fd00fd00fd00fd00fc00fc00fc00fc00fc00fc00fc00fc00fc00fc00fd00fd00fd00fd00fd00fd00fd004d005a006300640048006d006b0065004f00b900510066004c005e0052006e00ba006c005b004a007700540060006f00bb007300fd00fd00fd00fd00fd00fd0041004500460042003f004400700067005c00c20068005f005600570047007400c30055005d0061007100c400c500c600c700c800fd00fd00fd00fd00fd00c200c300c400c500c600c700c800c900ca00cb00cc00cd00ce00cf00d000d100d200d300d400d500d600d700d800d900da00db00dc00dd00de00df00e000e1005100e200e300e400e500e6006900e700e800e900ea00eb00ec002d00ed00ee001f00200023002b0025002c0037002f0028003b0021002e002600240029001e0027001c00220033003000310035003200360039003d00ef004300f0003c00380001001200090014000b00030017000f0002001a000c000a000e00060004000d0007000800050013001d001900160015001b00180011004b003400f1002a0010003e00f200f300f4003a00f5006200f600f700f800f900fa00fb005b00fc00fd00");

    public h() {
        super(g, ax.Rd.b.d);
    }

    private static long[] $d2j$hex$05164cc9$decode_J(String src) {
        byte[] d8 = h.$d2j$hex$05164cc9$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s8 = b8.asLongBuffer();
        long[] data = new long[d8.length / 8];
        s8.get(data);
        return data;
    }

    private static int[] $d2j$hex$05164cc9$decode_I(String src) {
        byte[] d8 = h.$d2j$hex$05164cc9$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s8 = b8.asIntBuffer();
        int[] data = new int[d8.length / 4];
        s8.get(data);
        return data;
    }

    private static short[] $d2j$hex$05164cc9$decode_S(String src) {
        byte[] d8 = h.$d2j$hex$05164cc9$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s8 = b8.asShortBuffer();
        short[] data = new short[d8.length / 2];
        s8.get(data);
        return data;
    }

    private static byte[] $d2j$hex$05164cc9$decode_B(String src) {
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

