/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jzlib;

import com.jcraft.jsch.jzlib.Tree;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

final class StaticTree {
    static final short[] f;
    static final short[] g;
    static StaticTree h;
    static StaticTree i;
    static StaticTree j;
    short[] a;
    int[] b;
    int c;
    int d;
    int e;

    static {
        short[] sArray;
        short[] sArray2 = new short[576];
        System.arraycopy(sArray2, 0, StaticTree.$d2j$hex$d080abac$decode_S("0c0008008c0008004c000800cc0008002c000800ac0008006c000800ec0008001c0008009c0008005c000800dc0008003c000800bc0008007c000800fc000800020008008200080042000800c200080022000800a200080062000800e2000800120008009200080052000800d200080032000800b200080072000800f20008000a0008008a0008004a000800ca0008002a000800aa0008006a000800ea0008001a0008009a0008005a000800da0008003a000800ba0008007a000800fa000800060008008600080046000800c600080026000800a600080066000800e6000800160008009600080056000800d600080036000800b600080076000800f60008000e0008008e0008004e000800ce0008002e000800ae0008006e000800ee0008001e0008009e0008005e000800de0008003e000800be0008007e000800fe000800010008008100080041000800c100080021000800a100080061000800e1000800110008009100080051000800d100080031000800b100080071000800f1000800090008008900080049000800c900080029000800a900080069000800e9000800190008009900080059000800d900080039000800b900080079000800f9000800050008008500080045000800c500080025000800a500080065000800e5000800150008009500080055000800d500080035000800b500080075000800f50008000d0008008d0008004d000800cd0008002d000800ad0008006d000800ed0008001d0008009d0008005d000800dd0008003d000800bd0008007d000800fd000800130009001301090093000900930109005300090053010900d3000900d30109003300090033010900b3000900b30109007300090073010900f3000900f30109000b0009000b0109008b0009008b0109004b0009004b010900cb000900cb0109002b0009002b010900ab000900ab0109006b0009006b010900eb000900eb0109001b0009001b0109009b0009009b0109005b0009005b010900db000900db0109003b0009003b010900bb000900bb0109007b0009007b010900fb000900fb010900070009000701090087000900870109004700090047010900c7000900c70109002700090027010900a7000900a70109006700090067010900e7000900e7010900170009001701090097000900970109005700090057010900d7000900d70109003700090037010900b7000900b70109007700090077010900f7000900f70109000f0009000f0109008f0009008f0109004f0009004f010900cf000900cf0109002f0009002f010900af000900af0109006f0009006f010900ef000900ef0109001f0009001f0109009f0009009f0109005f0009005f010900df000900df0109003f0009003f010900bf000900bf0109007f0009007f010900ff000900ff010900000007004000070020000700600007001000070050000700300007007000070008000700480007002800070068000700180007005800070038000700780007000400070044000700240007006400070014000700540007003400070074000700030008008300080043000800c300080023000800a300080063000800e3000800"), 0, 576);
        f = sArray2;
        short[] sArray3 = sArray = new short[60];
        sArray[0] = 0;
        sArray3[1] = 5;
        sArray3[2] = 16;
        sArray3[3] = 5;
        sArray3[4] = 8;
        sArray3[5] = 5;
        sArray3[6] = 24;
        sArray3[7] = 5;
        sArray3[8] = 4;
        sArray3[9] = 5;
        sArray3[10] = 20;
        sArray3[11] = 5;
        sArray3[12] = 12;
        sArray3[13] = 5;
        sArray3[14] = 28;
        sArray3[15] = 5;
        sArray3[16] = 2;
        sArray3[17] = 5;
        sArray3[18] = 18;
        sArray3[19] = 5;
        sArray3[20] = 10;
        sArray3[21] = 5;
        sArray3[22] = 26;
        sArray3[23] = 5;
        sArray3[24] = 6;
        sArray3[25] = 5;
        sArray3[26] = 22;
        sArray3[27] = 5;
        sArray3[28] = 14;
        sArray3[29] = 5;
        sArray3[30] = 30;
        sArray3[31] = 5;
        sArray3[32] = 1;
        sArray3[33] = 5;
        sArray3[34] = 17;
        sArray3[35] = 5;
        sArray3[36] = 9;
        sArray3[37] = 5;
        sArray3[38] = 25;
        sArray3[39] = 5;
        sArray3[40] = 5;
        sArray3[41] = 5;
        sArray3[42] = 21;
        sArray3[43] = 5;
        sArray3[44] = 13;
        sArray3[45] = 5;
        sArray3[46] = 29;
        sArray3[47] = 5;
        sArray3[48] = 3;
        sArray3[49] = 5;
        sArray3[50] = 19;
        sArray3[51] = 5;
        sArray3[52] = 11;
        sArray3[53] = 5;
        sArray3[54] = 27;
        sArray3[55] = 5;
        sArray3[56] = 7;
        sArray3[57] = 5;
        sArray3[58] = 23;
        sArray3[59] = 5;
        g = sArray;
        h = new StaticTree(sArray2, Tree.d, 257, 286, 15);
        i = new StaticTree(sArray, Tree.e, 0, 30, 15);
        j = new StaticTree(null, Tree.f, 0, 19, 7);
    }

    private StaticTree(short[] sArray, int[] nArray, int n8, int n9, int n10) {
        this.a = sArray;
        this.b = nArray;
        this.c = n8;
        this.d = n9;
        this.e = n10;
    }

    private static long[] $d2j$hex$d080abac$decode_J(String src) {
        byte[] d8 = StaticTree.$d2j$hex$d080abac$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s8 = b8.asLongBuffer();
        long[] data = new long[d8.length / 8];
        s8.get(data);
        return data;
    }

    private static int[] $d2j$hex$d080abac$decode_I(String src) {
        byte[] d8 = StaticTree.$d2j$hex$d080abac$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s8 = b8.asIntBuffer();
        int[] data = new int[d8.length / 4];
        s8.get(data);
        return data;
    }

    private static short[] $d2j$hex$d080abac$decode_S(String src) {
        byte[] d8 = StaticTree.$d2j$hex$d080abac$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s8 = b8.asShortBuffer();
        short[] data = new short[d8.length / 2];
        s8.get(data);
        return data;
    }

    private static byte[] $d2j$hex$d080abac$decode_B(String src) {
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

