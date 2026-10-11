/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jzlib;

import com.jcraft.jsch.jzlib.Adler32;
import com.jcraft.jsch.jzlib.CRC32;
import com.jcraft.jsch.jzlib.GZIPHeader;
import com.jcraft.jsch.jzlib.InfBlocks;
import com.jcraft.jsch.jzlib.ZStream;
import java.io.ByteArrayOutputStream;

final class Inflate {
    private static byte[] o = new byte[]{0, 0, -1, -1};
    int a;
    int b;
    long c = -1L;
    long d;
    int e;
    int f;
    int g;
    InfBlocks h;
    private final ZStream i;
    private int j;
    private int k = -1;
    private byte[] l = new byte[4];
    GZIPHeader m = null;
    private ByteArrayOutputStream n = null;

    Inflate(ZStream zStream) {
        this.i = zStream;
    }

    private void a(int n8, long l8) {
        for (int i8 = 0; i8 < n8; ++i8) {
            this.l[i8] = (byte)(0xFFL & l8);
            l8 >>= 8;
        }
        this.i.m.b(this.l, 0, n8);
    }

    private int f(int n8, int n9) throws Return {
        int n10 = n8;
        if (this.n == null) {
            this.n = new ByteArrayOutputStream();
            n10 = n8;
        }
        while (this.d > 0L) {
            ZStream zStream = this.i;
            n8 = zStream.c;
            if (n8 != 0) {
                zStream.c = n8 - 1;
                ++zStream.d;
                byte[] byArray = zStream.a;
                n8 = zStream.b;
                n10 = byArray[n8];
                this.n.write(byArray, n8, 1);
                zStream = this.i;
                zStream.m.b(zStream.a, zStream.b, 1);
                zStream = this.i;
                ++zStream.b;
                --this.d;
                n10 = n9;
                continue;
            }
            throw new Return(n10);
        }
        return n10;
    }

    private int g(int n8, int n9, int n10) throws Return {
        int n11 = n9;
        if (this.k == -1) {
            this.k = n8;
            this.d = 0L;
            n11 = n9;
        }
        while ((n9 = this.k) > 0) {
            ZStream zStream = this.i;
            int n12 = zStream.c;
            if (n12 != 0) {
                zStream.c = n12 - 1;
                ++zStream.d;
                long l8 = this.d;
                byte[] byArray = zStream.a;
                n11 = zStream.b;
                zStream.b = n11 + 1;
                this.d = l8 | (long)((byArray[n11] & 0xFF) << (n8 - n9) * 8);
                this.k = n9 - 1;
                n11 = n10;
                continue;
            }
            throw new Return(n11);
        }
        if (n8 == 2) {
            this.d &= 0xFFFFL;
        } else if (n8 == 4) {
            this.d &= 0xFFFFFFFFL;
        }
        this.k = -1;
        return n11;
    }

    private int h(int n8, int n9) throws Return {
        int n10 = n8;
        if (this.n == null) {
            this.n = new ByteArrayOutputStream();
            n10 = n8;
        }
        while (true) {
            ZStream zStream = this.i;
            n8 = zStream.c;
            if (n8 == 0) break;
            zStream.c = n8 - 1;
            ++zStream.d;
            byte[] byArray = zStream.a;
            n10 = zStream.b;
            n8 = byArray[n10];
            if (n8 != 0) {
                this.n.write(byArray, n10, 1);
            }
            zStream = this.i;
            zStream.m.b(zStream.a, zStream.b, 1);
            zStream = this.i;
            ++zStream.b;
            if (n8 == 0) {
                return n9;
            }
            n10 = n9;
        }
        throw new Return(n10);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    int b(int var1_1) {
        block103: {
            block100: {
                block101: {
                    block102: {
                        var14_2 = this.i;
                        if (var14_2 == null || var14_2.a == null) break block103;
                        var3_13 = -5;
                        if (var1_1 == 4) {
                            var2_14 = -5;
                            var1_1 = var3_13;
                        } else {
                            var2_14 = 0;
                            var1_1 = var3_13;
                        }
                        block44: while (true) {
                            var11_22 = var1_1;
                            var10_21 = var1_1;
                            var6_17 = var1_1;
                            var5_16 = var1_1;
                            var4_15 = var1_1;
                            var7_18 = var1_1;
                            var3_13 = var1_1;
                            var8_19 = var1_1;
                            var9_20 = var1_1;
                            switch (this.a) {
                                default: {
                                    return -2;
                                }
                                case 23: {
                                    try {
                                        var1_1 = this.g(2, var1_1, var2_14);
                                        var12_23 = this.d;
                                    }
                                    catch (Return var14_3) {
                                        return var14_3.q;
                                    }
                                    var3_13 = (int)var12_23;
                                    this.j = var3_13 & 65535;
                                    if ((var3_13 & 255) != 8) {
                                        this.i.i = "unknown compression method";
                                        this.a = 13;
                                        continue block44;
                                    }
                                    if ((57344 & var3_13) != 0) {
                                        this.i.i = "unknown header flags set";
                                        this.a = 13;
                                        continue block44;
                                    }
                                    if ((var3_13 & 512) != 0) {
                                        this.a(2, var12_23);
                                    }
                                    this.a = 16;
                                    var11_22 = var1_1;
                                }
                                case 16: {
                                    try {
                                        var10_21 = this.g(4, var11_22, var2_14);
                                        var14_2 = this.m;
                                        if (var14_2 != null) {
                                            var14_2.d(this.d);
                                        }
                                        if ((this.j & 512) != 0) {
                                            this.a(4, this.d);
                                        }
                                        this.a = 17;
                                    }
                                    catch (Return var14_10) {
                                        return var14_10.q;
                                    }
                                }
                                case 17: {
                                    try {
                                        var6_17 = this.g(2, var10_21, var2_14);
                                        var14_2 = this.m;
                                        if (var14_2 != null) {
                                            var12_23 = this.d;
                                        }
                                        ** GOTO lbl68
                                    }
                                    catch (Return var14_9) {
                                        return var14_9.q;
                                    }
                                    var14_2.d0 = (int)var12_23 & 255;
                                    var14_2.e0 = (int)var12_23 >> 8 & 255;
lbl68:
                                    // 2 sources

                                    if ((this.j & 512) != 0) {
                                        this.a(2, this.d);
                                    }
                                    this.a = 18;
                                }
                                case 18: {
                                    if ((this.j & 1024) == 0) ** GOTO lbl87
                                    try {
                                        var1_1 = this.g(2, var6_17, var2_14);
                                        var14_2 = this.m;
                                        if (var14_2 != null) {
                                        }
                                        ** GOTO lbl82
                                    }
                                    catch (Return var14_4) {
                                        return var14_4.q;
                                    }
                                    var14_2.f0 = new byte[(int)this.d & 65535];
lbl82:
                                    // 2 sources

                                    var5_16 = var1_1;
                                    if ((this.j & 512) != 0) {
                                        this.a(2, this.d);
                                        var5_16 = var1_1;
                                    }
                                    ** GOTO lbl92
lbl87:
                                    // 1 sources

                                    var14_2 = this.m;
                                    var5_16 = var6_17;
                                    if (var14_2 != null) {
                                        var14_2.f0 = null;
                                        var5_16 = var6_17;
                                    }
lbl92:
                                    // 4 sources

                                    this.a = 19;
                                }
                                case 19: {
                                    if ((this.j & 1024) == 0) ** GOTO lbl111
                                    try {
                                        var4_15 = var1_1 = this.f(var5_16, var2_14);
                                        if (this.m == null) ** GOTO lbl116
                                        var15_24 = this.n.toByteArray();
                                        this.n = null;
                                        var3_13 = ((Object)var15_24).length;
                                        var14_2 = this.m.f0;
                                        if (var3_13 != ((Object)var14_2).length) ** GOTO lbl108
                                        System.arraycopy(var15_24, 0, var14_2, 0, ((Object)var15_24).length);
                                        var4_15 = var1_1;
                                        ** GOTO lbl116
                                    }
                                    catch (Return var14_5) {
                                        return var14_5.q;
                                    }
lbl108:
                                    // 1 sources

                                    this.i.i = "bad extra field length";
                                    this.a = 13;
                                    continue block44;
lbl111:
                                    // 1 sources

                                    var14_2 = this.m;
                                    var4_15 = var5_16;
                                    if (var14_2 != null) {
                                        var14_2.f0 = null;
                                        var4_15 = var5_16;
                                    }
lbl116:
                                    // 5 sources

                                    this.a = 20;
                                }
                                case 20: {
                                    if ((this.j & 2048) != 0) {
                                        try {
                                            var7_18 = this.h(var4_15, var2_14);
                                            var14_2 = this.m;
                                            if (var14_2 != null) {
                                                var14_2.g0 = this.n.toByteArray();
                                            }
                                        }
                                        catch (Return var14_6) {
                                            return var14_6.q;
                                        }
                                        this.n = null;
                                    } else {
                                        var14_2 = this.m;
                                        var7_18 = var4_15;
                                        if (var14_2 != null) {
                                            var14_2.g0 = null;
                                            var7_18 = var4_15;
                                        }
                                    }
                                    this.a = 21;
                                }
                                case 21: {
                                    if ((this.j & 4096) != 0) {
                                        try {
                                            var3_13 = this.h(var7_18, var2_14);
                                            var14_2 = this.m;
                                            if (var14_2 != null) {
                                                var14_2.h0 = this.n.toByteArray();
                                            }
                                        }
                                        catch (Return var14_7) {
                                            return var14_7.q;
                                        }
                                        this.n = null;
                                    } else {
                                        var14_2 = this.m;
                                        var3_13 = var7_18;
                                        if (var14_2 != null) {
                                            var14_2.h0 = null;
                                            var3_13 = var7_18;
                                        }
                                    }
                                    this.a = 22;
                                }
                                case 22: {
                                    var1_1 = var3_13;
                                    if ((this.j & 512) == 0) ** GOTO lbl172
                                    try {
                                        var3_13 = this.g(2, var3_13, var2_14);
                                        var14_2 = this.m;
                                        if (var14_2 != null) {
                                        }
                                        ** GOTO lbl165
                                    }
                                    catch (Return var14_8) {
                                        return var14_8.q;
                                    }
                                    var14_2.i0 = (int)(this.d & 65535L);
lbl165:
                                    // 2 sources

                                    var1_1 = var3_13;
                                    if (this.d != (this.i.m.getValue() & 65535L)) {
                                        this.a = 13;
                                        this.i.i = "header crc mismatch";
                                        this.e = 5;
                                        var1_1 = var3_13;
                                        continue block44;
                                    }
lbl172:
                                    // 3 sources

                                    this.i.m = new CRC32();
                                    this.a = 7;
                                    continue block44;
                                }
                                case 15: {
                                    ** GOTO lbl321
                                }
                                case 14: {
                                    if (this.f == 0) {
                                        this.a = 7;
                                        continue block44;
                                    }
                                    try {
                                        var1_1 = this.g(2, var1_1, var2_14);
                                        var3_13 = this.f;
                                        if ((var3_13 == 4 || (var3_13 & 2) != 0) && this.d == 35615L) {
                                            if (var3_13 == 4) {
                                                this.f = 2;
                                            }
                                            this.i.m = new CRC32();
                                            this.a(2, this.d);
                                            if (this.m == null) {
                                                this.m = new GZIPHeader();
                                            }
                                            this.a = 23;
                                            continue block44;
                                        }
                                        if ((var3_13 & 2) != 0) {
                                            this.a = 13;
                                            this.i.i = "incorrect header check";
                                            continue block44;
                                        }
                                        this.j = 0;
                                        var12_23 = this.d;
                                    }
                                    catch (Return var14_11) {
                                        return var14_11.q;
                                    }
                                    var5_16 = (int)var12_23;
                                    this.b = var6_17 = var5_16 & 255;
                                    var4_15 = (int)(var12_23 >> 8);
                                    if (((var3_13 & 1) == 0 || ((var6_17 << 8) + (var4_15 & 255)) % 31 != 0) && (var5_16 & 15) != 8) {
                                        if (var3_13 == 4) {
                                            var14_2 = this.i;
                                            var14_2.b -= 2;
                                            var14_2.c += 2;
                                            var14_2.d -= 2L;
                                            this.f = 0;
                                            this.a = 7;
                                            continue block44;
                                        }
                                        this.a = 13;
                                        this.i.i = "incorrect header check";
                                        continue block44;
                                    }
                                    if ((var5_16 & 15) != 8) {
                                        this.a = 13;
                                        this.i.i = "unknown compression method";
                                        continue block44;
                                    }
                                    if (var3_13 == 4) {
                                        this.f = 1;
                                    }
                                    if ((var6_17 >> 4) + 8 > this.g) {
                                        this.a = 13;
                                        this.i.i = "invalid window size";
                                        continue block44;
                                    }
                                    this.i.m = new Adler32();
                                    if ((var4_15 & 32) == 0) {
                                        this.a = 7;
                                        continue block44;
                                    }
                                    this.a = 2;
                                    break block44;
                                }
                                case 13: {
                                    return -3;
                                }
                                case 12: {
                                    return 1;
                                }
                                case 9: {
                                    ** GOTO lbl272
                                }
                                case 8: {
                                    ** GOTO lbl260
                                }
                                case 7: {
                                    var1_1 = this.h.c(var1_1);
                                    if (var1_1 == -3) {
                                        this.a = 13;
                                        this.e = 0;
                                        continue block44;
                                    }
                                    var3_13 = var1_1;
                                    if (var1_1 == 0) {
                                        var3_13 = var2_14;
                                    }
                                    if (var3_13 != 1) {
                                        return var3_13;
                                    }
                                    this.c = this.i.m.getValue();
                                    this.h.d();
                                    if (this.f == 0) {
                                        this.a = 12;
                                        var1_1 = var2_14;
                                        continue block44;
                                    }
                                    this.a = 8;
                                    var1_1 = var2_14;
lbl260:
                                    // 2 sources

                                    var14_2 = this.i;
                                    var3_13 = var14_2.c;
                                    if (var3_13 == 0) {
                                        return var1_1;
                                    }
                                    var14_2.c = var3_13 - 1;
                                    ++var14_2.d;
                                    var15_24 = var14_2.a;
                                    var1_1 = var14_2.b;
                                    var14_2.b = var1_1 + 1;
                                    this.d = (long)((var15_24[var1_1] & 255) << 24) & 0xFF000000L;
                                    this.a = 9;
                                    var1_1 = var2_14;
lbl272:
                                    // 2 sources

                                    var15_24 = this.i;
                                    var3_13 = var15_24.c;
                                    if (var3_13 == 0) {
                                        return var1_1;
                                    }
                                    var15_24.c = var3_13 - 1;
                                    ++var15_24.d;
                                    var12_23 = this.d;
                                    var14_2 = var15_24.a;
                                    var1_1 = var15_24.b;
                                    var15_24.b = var1_1 + 1;
                                    this.d = var12_23 + ((long)((var14_2[var1_1] & 255) << 16) & 0xFF0000L);
                                    this.a = 10;
                                    var8_19 = var2_14;
                                }
                                case 10: {
                                    var15_24 = this.i;
                                    var1_1 = var15_24.c;
                                    if (var1_1 == 0) {
                                        return var8_19;
                                    }
                                    var15_24.c = var1_1 - 1;
                                    ++var15_24.d;
                                    var12_23 = this.d;
                                    var14_2 = var15_24.a;
                                    var1_1 = var15_24.b;
                                    var15_24.b = var1_1 + 1;
                                    this.d = var12_23 + ((long)((var14_2[var1_1] & 255) << 8) & 65280L);
                                    this.a = 11;
                                    var9_20 = var2_14;
                                }
                                case 11: {
                                    var14_2 = this.i;
                                    var1_1 = var14_2.c;
                                    if (var1_1 == 0) {
                                        return var9_20;
                                    }
                                    var14_2.c = var1_1 - 1;
                                    ++var14_2.d;
                                    var12_23 = this.d;
                                    var15_24 = var14_2.a;
                                    var1_1 = var14_2.b;
                                    var14_2.b = var1_1 + 1;
                                    this.d = var12_23 += (long)var15_24[var1_1] & 255L;
                                    var3_13 = this.j;
                                    if (var3_13 != 0) {
                                        this.d = ((var12_23 & -16777216L) >> 24 | (var12_23 & 0xFF0000L) >> 8 | (var12_23 & 65280L) << 8 | (var12_23 & 65535L) << 24) & 0xFFFFFFFFL;
                                    }
                                    if ((var1_1 = (int)this.c) != (int)(var12_23 = this.d)) {
                                        var14_2.i = "incorrect data check";
                                    } else if (var3_13 != 0 && (var14_2 = this.m) != null) {
                                        var14_2.j0 = var12_23;
                                    }
                                    this.a = 15;
                                    var1_1 = var2_14;
lbl321:
                                    // 2 sources

                                    if (this.f != 0 && this.j != 0) {
                                        try {
                                            var1_1 = this.g(4, var1_1, var2_14);
                                            var14_2 = this.i.i;
                                            if (var14_2 != null && var14_2.equals("incorrect data check")) {
                                                this.a = 13;
                                                this.e = 5;
                                                continue block44;
                                            }
                                            var12_23 = this.d;
                                            var14_2 = this.i;
                                            if (var12_23 != (var14_2.h & 0xFFFFFFFFL)) {
                                                var14_2.i = "incorrect length check";
                                                this.a = 13;
                                                continue block44;
                                            }
                                            var14_2.i = null;
                                        }
                                        catch (Return var14_12) {
                                            return var14_12.q;
                                        }
                                    } else {
                                        var14_2 = this.i.i;
                                        if (var14_2 != null && var14_2.equals("incorrect data check")) {
                                            this.a = 13;
                                            this.e = 5;
                                            continue block44;
                                        }
                                    }
                                    this.a = 12;
                                    return 1;
                                }
                                case 6: {
                                    this.a = 13;
                                    this.i.i = "need dictionary";
                                    this.e = 0;
                                    return -2;
                                }
                                case 5: {
                                    var2_14 = var1_1;
                                    break block100;
                                }
                                case 4: {
                                    break block101;
                                }
                                case 3: {
                                    break block102;
                                }
                                case 2: 
                            }
                            break;
                        }
                        var15_24 = this.i;
                        var3_13 = var15_24.c;
                        if (var3_13 == 0) {
                            return var1_1;
                        }
                        var15_24.c = var3_13 - 1;
                        ++var15_24.d;
                        var14_2 = var15_24.a;
                        var1_1 = var15_24.b;
                        var15_24.b = var1_1 + 1;
                        this.d = (long)((var14_2[var1_1] & 255) << 24) & 0xFF000000L;
                        this.a = 3;
                        var1_1 = var2_14;
                    }
                    var14_2 = this.i;
                    var3_13 = var14_2.c;
                    if (var3_13 == 0) {
                        return var1_1;
                    }
                    var14_2.c = var3_13 - 1;
                    ++var14_2.d;
                    var12_23 = this.d;
                    var15_24 = var14_2.a;
                    var1_1 = var14_2.b;
                    var14_2.b = var1_1 + 1;
                    this.d = var12_23 + ((long)((var15_24[var1_1] & 255) << 16) & 0xFF0000L);
                    this.a = 4;
                    var1_1 = var2_14;
                }
                var15_24 = this.i;
                var3_13 = var15_24.c;
                if (var3_13 == 0) {
                    return var1_1;
                }
                var15_24.c = var3_13 - 1;
                ++var15_24.d;
                var12_23 = this.d;
                var14_2 = var15_24.a;
                var1_1 = var15_24.b;
                var15_24.b = var1_1 + 1;
                this.d = var12_23 + ((long)((var14_2[var1_1] & 255) << 8) & 65280L);
                this.a = 5;
            }
            var15_24 = this.i;
            var1_1 = var15_24.c;
            if (var1_1 == 0) {
                return var2_14;
            }
            var15_24.c = var1_1 - 1;
            ++var15_24.d;
            var12_23 = this.d;
            var14_2 = var15_24.a;
            var1_1 = var15_24.b;
            var15_24.b = var1_1 + 1;
            this.d = var12_23 += (long)var14_2[var1_1] & 255L;
            var15_24.m.c(var12_23);
            this.a = 6;
            return 2;
        }
        if (var1_1 != 4) return -2;
        if (this.a != 14) return -2;
        return 0;
    }

    int c() {
        InfBlocks infBlocks = this.h;
        if (infBlocks != null) {
            infBlocks.a();
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    int d(int n8) {
        int n9;
        block5: {
            block7: {
                block8: {
                    block6: {
                        block4: {
                            this.i.i = null;
                            this.h = null;
                            this.f = 0;
                            if (n8 >= 0) break block4;
                            n9 = -n8;
                            break block5;
                        }
                        if ((0x40000000 & n8) == 0) break block6;
                        this.f = 4;
                        n9 = 0xBFFFFFFF & n8;
                        if (n9 >= 48) break block5;
                        break block7;
                    }
                    if ((n8 & 0xFFFFFFE0) == 0) break block8;
                    this.f = 4;
                    break block7;
                }
                this.f = (n8 >> 4) + 1;
                n9 = n8;
                if (n8 >= 48) break block5;
            }
            n9 = n8 & 0xF;
        }
        if (n9 >= 8 && n9 <= 15) {
            this.g = n9;
            this.h = new InfBlocks(this.i, 1 << n9);
            this.e();
            return 0;
        }
        this.c();
        return -2;
    }

    int e() {
        ZStream zStream = this.i;
        if (zStream == null) {
            return -2;
        }
        zStream.h = 0L;
        zStream.d = 0L;
        zStream.i = null;
        this.a = 14;
        this.k = -1;
        this.h.d();
        return 0;
    }

    static class Return
    extends Exception {
        int q;

        Return(int n8) {
            this.q = n8;
        }
    }
}

