/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.http2;

import ax.Gb.l;
import ax.tb.i;
import ax.xc.f;
import ax.xc.g;
import ax.xc.h;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import okhttp3.internal.Util;

public final class Huffman {
    private static final int[] CODES;
    private static final byte[] CODE_BIT_COUNTS;
    public static final Huffman INSTANCE;
    private static final Node root;

    static {
        byte[] byArray;
        INSTANCE = new Huffman();
        CODES = Huffman.$d2j$hex$1697a22e$decode_I("f81f0000d8ff7f00e2ffff0fe3ffff0fe4ffff0fe5ffff0fe6ffff0fe7ffff0fe8ffff0feaffff00fcffff3fe9ffff0feaffff0ffdffff3febffff0fecffff0fedffff0feeffff0fefffff0ff0ffff0ff1ffff0ff2ffff0ffeffff3ff3ffff0ff4ffff0ff5ffff0ff6ffff0ff7ffff0ff8ffff0ff9ffff0ffaffff0ffbffff0f14000000f8030000f9030000fa0f0000f91f000015000000f8000000fa070000fa030000fb030000f9000000fb070000fa000000160000001700000018000000000000000100000002000000190000001a0000001b0000001c0000001d0000001e0000001f0000005c000000fb000000fc7f000020000000fb0f0000fc030000fa1f0000210000005d0000005e0000005f000000600000006100000062000000630000006400000065000000660000006700000068000000690000006a0000006b0000006c0000006d0000006e0000006f000000700000007100000072000000fc00000073000000fd000000fb1f0000f0ff0700fc1f0000fc3f000022000000fd7f0000030000002300000004000000240000000500000025000000260000002700000006000000740000007500000028000000290000002a000000070000002b000000760000002c00000008000000090000002d0000007700000078000000790000007a0000007b000000fe7f0000fc070000fd3f0000fd1f0000fcffff0fe6ff0f00d2ff3f00e7ff0f00e8ff0f00d3ff3f00d4ff3f00d5ff3f00d9ff7f00d6ff3f00daff7f00dbff7f00dcff7f00ddff7f00deff7f00ebffff00dfff7f00ecffff00edffff00d7ff3f00e0ff7f00eeffff00e1ff7f00e2ff7f00e3ff7f00e4ff7f00dcff1f00d8ff3f00e5ff7f00d9ff3f00e6ff7f00e7ff7f00efffff00daff3f00ddff1f00e9ff0f00dbff3f00dcff3f00e8ff7f00e9ff7f00deff1f00eaff7f00ddff3f00deff3f00f0ffff00dfff1f00dfff3f00ebff7f00ecff7f00e0ff1f00e1ff1f00e0ff3f00e2ff1f00edff7f00e1ff3f00eeff7f00efff7f00eaff0f00e2ff3f00e3ff3f00e4ff3f00f0ff7f00e5ff3f00e6ff3f00f1ff7f00e0ffff03e1ffff03ebff0f00f1ff0700e7ff3f00f2ff7f00e8ff3f00ecffff01e2ffff03e3ffff03e4ffff03deffff07dfffff07e5ffff03f1ffff00edffff01f2ff0700e3ff1f00e6ffff03e0ffff07e1ffff07e7ffff03e2ffff07f2ffff00e4ff1f00e5ff1f00e8ffff03e9ffff03fdffff0fe3ffff07e4ffff07e5ffff07ecff0f00f3ffff00edff0f00e6ff1f00e9ff3f00e7ff1f00e8ff1f00f3ff7f00eaff3f00ebff3f00eeffff01efffff01f4ffff00f5ffff00eaffff03f4ff7f00ebffff03e6ffff07ecffff03edffff03e7ffff07e8ffff07e9ffff07eaffff07ebffff07feffff0fecffff07edffff07eeffff07efffff07f0ffff07eeffff03");
        byte[] byArray2 = byArray = new byte[256];
        byArray[0] = 13;
        byArray2[1] = 23;
        byArray2[2] = 28;
        byArray2[3] = 28;
        byArray2[4] = 28;
        byArray2[5] = 28;
        byArray2[6] = 28;
        byArray2[7] = 28;
        byArray2[8] = 28;
        byArray2[9] = 24;
        byArray2[10] = 30;
        byArray2[11] = 28;
        byArray2[12] = 28;
        byArray2[13] = 30;
        byArray2[14] = 28;
        byArray2[15] = 28;
        byArray2[16] = 28;
        byArray2[17] = 28;
        byArray2[18] = 28;
        byArray2[19] = 28;
        byArray2[20] = 28;
        byArray2[21] = 28;
        byArray2[22] = 30;
        byArray2[23] = 28;
        byArray2[24] = 28;
        byArray2[25] = 28;
        byArray2[26] = 28;
        byArray2[27] = 28;
        byArray2[28] = 28;
        byArray2[29] = 28;
        byArray2[30] = 28;
        byArray2[31] = 28;
        byArray2[32] = 6;
        byArray2[33] = 10;
        byArray2[34] = 10;
        byArray2[35] = 12;
        byArray2[36] = 13;
        byArray2[37] = 6;
        byArray2[38] = 8;
        byArray2[39] = 11;
        byArray2[40] = 10;
        byArray2[41] = 10;
        byArray2[42] = 8;
        byArray2[43] = 11;
        byArray2[44] = 8;
        byArray2[45] = 6;
        byArray2[46] = 6;
        byArray2[47] = 6;
        byArray2[48] = 5;
        byArray2[49] = 5;
        byArray2[50] = 5;
        byArray2[51] = 6;
        byArray2[52] = 6;
        byArray2[53] = 6;
        byArray2[54] = 6;
        byArray2[55] = 6;
        byArray2[56] = 6;
        byArray2[57] = 6;
        byArray2[58] = 7;
        byArray2[59] = 8;
        byArray2[60] = 15;
        byArray2[61] = 6;
        byArray2[62] = 12;
        byArray2[63] = 10;
        byArray2[64] = 13;
        byArray2[65] = 6;
        byArray2[66] = 7;
        byArray2[67] = 7;
        byArray2[68] = 7;
        byArray2[69] = 7;
        byArray2[70] = 7;
        byArray2[71] = 7;
        byArray2[72] = 7;
        byArray2[73] = 7;
        byArray2[74] = 7;
        byArray2[75] = 7;
        byArray2[76] = 7;
        byArray2[77] = 7;
        byArray2[78] = 7;
        byArray2[79] = 7;
        byArray2[80] = 7;
        byArray2[81] = 7;
        byArray2[82] = 7;
        byArray2[83] = 7;
        byArray2[84] = 7;
        byArray2[85] = 7;
        byArray2[86] = 7;
        byArray2[87] = 7;
        byArray2[88] = 8;
        byArray2[89] = 7;
        byArray2[90] = 8;
        byArray2[91] = 13;
        byArray2[92] = 19;
        byArray2[93] = 13;
        byArray2[94] = 14;
        byArray2[95] = 6;
        byArray2[96] = 15;
        byArray2[97] = 5;
        byArray2[98] = 6;
        byArray2[99] = 5;
        byArray2[100] = 6;
        byArray2[101] = 5;
        byArray2[102] = 6;
        byArray2[103] = 6;
        byArray2[104] = 6;
        byArray2[105] = 5;
        byArray2[106] = 7;
        byArray2[107] = 7;
        byArray2[108] = 6;
        byArray2[109] = 6;
        byArray2[110] = 6;
        byArray2[111] = 5;
        byArray2[112] = 6;
        byArray2[113] = 7;
        byArray2[114] = 6;
        byArray2[115] = 5;
        byArray2[116] = 5;
        byArray2[117] = 6;
        byArray2[118] = 7;
        byArray2[119] = 7;
        byArray2[120] = 7;
        byArray2[121] = 7;
        byArray2[122] = 7;
        byArray2[123] = 15;
        byArray2[124] = 11;
        byArray2[125] = 14;
        byArray2[126] = 13;
        byArray2[127] = 28;
        byArray2[128] = 20;
        byArray2[129] = 22;
        byArray2[130] = 20;
        byArray2[131] = 20;
        byArray2[132] = 22;
        byArray2[133] = 22;
        byArray2[134] = 22;
        byArray2[135] = 23;
        byArray2[136] = 22;
        byArray2[137] = 23;
        byArray2[138] = 23;
        byArray2[139] = 23;
        byArray2[140] = 23;
        byArray2[141] = 23;
        byArray2[142] = 24;
        byArray2[143] = 23;
        byArray2[144] = 24;
        byArray2[145] = 24;
        byArray2[146] = 22;
        byArray2[147] = 23;
        byArray2[148] = 24;
        byArray2[149] = 23;
        byArray2[150] = 23;
        byArray2[151] = 23;
        byArray2[152] = 23;
        byArray2[153] = 21;
        byArray2[154] = 22;
        byArray2[155] = 23;
        byArray2[156] = 22;
        byArray2[157] = 23;
        byArray2[158] = 23;
        byArray2[159] = 24;
        byArray2[160] = 22;
        byArray2[161] = 21;
        byArray2[162] = 20;
        byArray2[163] = 22;
        byArray2[164] = 22;
        byArray2[165] = 23;
        byArray2[166] = 23;
        byArray2[167] = 21;
        byArray2[168] = 23;
        byArray2[169] = 22;
        byArray2[170] = 22;
        byArray2[171] = 24;
        byArray2[172] = 21;
        byArray2[173] = 22;
        byArray2[174] = 23;
        byArray2[175] = 23;
        byArray2[176] = 21;
        byArray2[177] = 21;
        byArray2[178] = 22;
        byArray2[179] = 21;
        byArray2[180] = 23;
        byArray2[181] = 22;
        byArray2[182] = 23;
        byArray2[183] = 23;
        byArray2[184] = 20;
        byArray2[185] = 22;
        byArray2[186] = 22;
        byArray2[187] = 22;
        byArray2[188] = 23;
        byArray2[189] = 22;
        byArray2[190] = 22;
        byArray2[191] = 23;
        byArray2[192] = 26;
        byArray2[193] = 26;
        byArray2[194] = 20;
        byArray2[195] = 19;
        byArray2[196] = 22;
        byArray2[197] = 23;
        byArray2[198] = 22;
        byArray2[199] = 25;
        byArray2[200] = 26;
        byArray2[201] = 26;
        byArray2[202] = 26;
        byArray2[203] = 27;
        byArray2[204] = 27;
        byArray2[205] = 26;
        byArray2[206] = 24;
        byArray2[207] = 25;
        byArray2[208] = 19;
        byArray2[209] = 21;
        byArray2[210] = 26;
        byArray2[211] = 27;
        byArray2[212] = 27;
        byArray2[213] = 26;
        byArray2[214] = 27;
        byArray2[215] = 24;
        byArray2[216] = 21;
        byArray2[217] = 21;
        byArray2[218] = 26;
        byArray2[219] = 26;
        byArray2[220] = 28;
        byArray2[221] = 27;
        byArray2[222] = 27;
        byArray2[223] = 27;
        byArray2[224] = 20;
        byArray2[225] = 24;
        byArray2[226] = 20;
        byArray2[227] = 21;
        byArray2[228] = 22;
        byArray2[229] = 21;
        byArray2[230] = 21;
        byArray2[231] = 23;
        byArray2[232] = 22;
        byArray2[233] = 22;
        byArray2[234] = 25;
        byArray2[235] = 25;
        byArray2[236] = 24;
        byArray2[237] = 24;
        byArray2[238] = 26;
        byArray2[239] = 23;
        byArray2[240] = 26;
        byArray2[241] = 27;
        byArray2[242] = 26;
        byArray2[243] = 26;
        byArray2[244] = 27;
        byArray2[245] = 27;
        byArray2[246] = 27;
        byArray2[247] = 27;
        byArray2[248] = 27;
        byArray2[249] = 28;
        byArray2[250] = 27;
        byArray2[251] = 27;
        byArray2[252] = 27;
        byArray2[253] = 27;
        byArray2[254] = 27;
        byArray2[255] = 26;
        CODE_BIT_COUNTS = byArray;
        root = new Node();
        int n8 = byArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            INSTANCE.addCode(i8, CODES[i8], CODE_BIT_COUNTS[i8]);
        }
    }

    private Huffman() {
    }

    private final void addCode(int n8, int n9, int n10) {
        Node node = new Node(n8, n10);
        Object object = root;
        while (n10 > 8) {
            n8 = n9 >>> (n10 -= 8) & 0xFF;
            Node[] nodeArray = object.getChildren();
            l.c(nodeArray);
            Node node2 = nodeArray[n8];
            object = node2;
            if (node2 != null) continue;
            nodeArray[n8] = object = new Node();
        }
        n8 = 8 - n10;
        n9 = n9 << n8 & 0xFF;
        object = object.getChildren();
        l.c(object);
        i.n(object, node, n9, (1 << n8) + n9);
    }

    public final void decode(g object, long l8, f f8) {
        Object object2;
        l.f(object, "source");
        l.f(f8, "sink");
        Object object3 = root;
        int n8 = 0;
        long l9 = 0L;
        int n9 = 0;
        while (true) {
            object2 = object3;
            if (l9 >= l8) break;
            n8 = n8 << 8 | Util.and(object.readByte(), 255);
            n9 += 8;
            while (n9 >= 8) {
                object3 = ((Node)object3).getChildren();
                l.c(object3);
                object3 = object3[n8 >>> n9 - 8 & 0xFF];
                l.c(object3);
                if (((Node)object3).getChildren() == null) {
                    f8.writeByte(((Node)object3).getSymbol());
                    n9 -= ((Node)object3).getTerminalBitCount();
                    object3 = root;
                    continue;
                }
                n9 -= 8;
            }
            ++l9;
        }
        for (int i8 = n9; i8 > 0; i8 -= ((Node)object).getTerminalBitCount()) {
            object = object2.getChildren();
            l.c(object);
            object = object[n8 << 8 - i8 & 0xFF];
            l.c(object);
            if (((Node)object).getChildren() != null || ((Node)object).getTerminalBitCount() > i8) break;
            f8.writeByte(((Node)object).getSymbol());
            object2 = root;
        }
    }

    public final void encode(h h8, f f8) throws IOException {
        l.f(h8, "source");
        l.f(f8, "sink");
        int n8 = h8.G();
        long l8 = 0L;
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            int n10 = Util.and(h8.n(i8), 255);
            int n11 = CODES[n10];
            n10 = CODE_BIT_COUNTS[n10];
            l8 = l8 << n10 | (long)n11;
            n9 += n10;
            while (n9 >= 8) {
                f8.writeByte((int)(l8 >> (n9 -= 8)));
            }
        }
        if (n9 > 0) {
            f8.writeByte((int)(l8 << 8 - n9 | 255L >>> n9));
        }
    }

    public final int encodedLength(h h8) {
        l.f(h8, "bytes");
        int n8 = h8.G();
        long l8 = 0L;
        for (int i8 = 0; i8 < n8; ++i8) {
            int n9 = Util.and(h8.n(i8), 255);
            l8 += (long)CODE_BIT_COUNTS[n9];
        }
        return (int)(l8 + (long)7 >> 3);
    }

    private static long[] $d2j$hex$1697a22e$decode_J(String src) {
        byte[] d8 = Huffman.$d2j$hex$1697a22e$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s8 = b8.asLongBuffer();
        long[] data = new long[d8.length / 8];
        s8.get(data);
        return data;
    }

    private static int[] $d2j$hex$1697a22e$decode_I(String src) {
        byte[] d8 = Huffman.$d2j$hex$1697a22e$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s8 = b8.asIntBuffer();
        int[] data = new int[d8.length / 4];
        s8.get(data);
        return data;
    }

    private static short[] $d2j$hex$1697a22e$decode_S(String src) {
        byte[] d8 = Huffman.$d2j$hex$1697a22e$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s8 = b8.asShortBuffer();
        short[] data = new short[d8.length / 2];
        s8.get(data);
        return data;
    }

    private static byte[] $d2j$hex$1697a22e$decode_B(String src) {
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

    private static final class Node {
        private final Node[] children;
        private final int symbol;
        private final int terminalBitCount;

        public Node() {
            this.children = new Node[256];
            this.symbol = 0;
            this.terminalBitCount = 0;
        }

        public Node(int n8, int n9) {
            this.children = null;
            this.symbol = n8;
            n8 = n9 &= 7;
            if (n9 == 0) {
                n8 = 8;
            }
            this.terminalBitCount = n8;
        }

        public final Node[] getChildren() {
            return this.children;
        }

        public final int getSymbol() {
            return this.symbol;
        }

        public final int getTerminalBitCount() {
            return this.terminalBitCount;
        }
    }
}

