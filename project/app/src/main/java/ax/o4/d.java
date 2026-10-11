/*
 * Decompiled with CFR 0.152.
 */
package ax.o4;

class d {
    private static final float[] b = new float[]{1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 9.9999998E10f, 1.0E12f, 9.9999998E12f, 1.0E14f, 9.9999999E14f, 1.00000003E16f, 9.9999998E16f, 9.9999998E17f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};
    private static final float[] c = new float[]{1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};
    private int a;

    d() {
    }

    int a() {
        return this.a;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    float b(String var1_1, int var2_2, int var3_3) {
        block35: {
            block37: {
                block36: {
                    block29: {
                        block33: {
                            block34: {
                                block31: {
                                    block32: {
                                        block30: {
                                            block27: {
                                                block28: {
                                                    block25: {
                                                        block26: {
                                                            this.a = var2_2;
                                                            if (var2_2 >= var3_3) {
                                                                return NaNf;
                                                            }
                                                            if ((var2_2 = (int)var1_1.charAt(var2_2)) == 43) break block25;
                                                            if (var2_2 == 45) break block26;
                                                            var9_4 = 0;
                                                            break block27;
                                                        }
                                                        var2_2 = 1;
                                                        break block28;
                                                    }
                                                    var2_2 = 0;
                                                }
                                                ++this.a;
                                                var9_4 = var2_2;
                                            }
                                            var13_5 = this.a;
                                            var15_6 = 0L;
                                            var7_7 = 0;
                                            var2_2 = 0;
                                            var11_8 = 0;
                                            var12_9 = 0;
                                            var10_10 = 0;
                                            while ((var8_11 = ++this.a) < var3_3) {
                                                var14_12 = var1_1.charAt(var8_11);
                                                if (var14_12 == '0') {
                                                    if (var7_7 == 0) {
                                                        ++var11_8;
                                                        continue;
                                                    }
                                                    ++var2_2;
                                                    continue;
                                                }
                                                if (var14_12 >= '1' && var14_12 <= '9') {
                                                } else {
                                                    if (var14_12 != '.' || var12_9 != 0) break;
                                                    var10_10 = this.a - var13_5;
                                                    var12_9 = 1;
                                                    continue;
                                                }
                                                for (var8_11 = var2_2; var8_11 > 0; var15_6 *= 10L, --var8_11) {
                                                    if (var15_6 <= 0xCCCCCCCCCCCCCCCL) continue;
                                                    return NaNf;
                                                }
                                                if (var15_6 > 0xCCCCCCCCCCCCCCCL) {
                                                    return NaNf;
                                                }
                                                var17_13 = var15_6 * 10L + (long)(var14_12 - 48);
                                                var7_7 = var7_7 + var2_2 + 1;
                                                var15_6 = var17_13;
                                                var2_2 = var8_11;
                                                if (var17_13 >= 0L) continue;
                                                return NaNf;
                                            }
                                            if (var12_9 != 0 && this.a == var10_10 + 1) {
                                                return NaNf;
                                            }
                                            var8_11 = var7_7;
                                            if (var7_7 == 0) {
                                                if (var11_8 == 0) {
                                                    return NaNf;
                                                }
                                                var8_11 = 1;
                                            }
                                            var7_7 = var2_2;
                                            if (var12_9 != 0) {
                                                var7_7 = var10_10 - var11_8 - var8_11;
                                            }
                                            var10_10 = this.a;
                                            var2_2 = var7_7;
                                            if (var10_10 >= var3_3) break block29;
                                            if ((var10_10 = (int)var1_1.charAt(var10_10)) == 69) break block30;
                                            var2_2 = var7_7;
                                            if (var10_10 != 101) break block29;
                                        }
                                        this.a = var2_2 = this.a + 1;
                                        if (var2_2 == var3_3) {
                                            return NaNf;
                                        }
                                        if ((var2_2 = (int)var1_1.charAt(var2_2)) == 43) break block31;
                                        if (var2_2 == 45) break block32;
                                        switch (var2_2) {
                                            default: {
                                                --this.a;
                                                var10_10 = 0;
                                                var11_8 = 1;
                                                ** break;
                                            }
                                            case 48: 
                                            case 49: 
                                            case 50: 
                                            case 51: 
                                            case 52: 
                                            case 53: 
                                            case 54: 
                                            case 55: 
                                            case 56: 
                                            case 57: 
                                        }
                                        var2_2 = 0;
                                        break block33;
                                    }
                                    var2_2 = 1;
                                    break block34;
                                }
                                var2_2 = 0;
                            }
                            ++this.a;
                        }
                        var11_8 = 0;
                        var10_10 = var2_2;
                        ** break;
lbl91:
                        // 2 sources

                        var2_2 = var7_7;
                        if (var11_8 == 0) {
                            var11_8 = this.a;
                            var2_2 = 0;
                            while ((var12_9 = this.a) < var3_3 && (var12_9 = (int)var1_1.charAt(var12_9)) >= 48 && var12_9 <= 57) {
                                if ((long)var2_2 > 0xCCCCCCCCCCCCCCCL) {
                                    return NaNf;
                                }
                                var2_2 = var2_2 * 10 + (var12_9 - 48);
                                ++this.a;
                            }
                            if (this.a == var11_8) {
                                return NaNf;
                            }
                            var2_2 = var10_10 != 0 ? var7_7 - var2_2 : var7_7 + var2_2;
                        }
                    }
                    if ((var3_3 = var8_11 + var2_2) > 39) return NaNf;
                    if (var3_3 < -44) {
                        return NaNf;
                    }
                    var5_15 = var4_14 = (float)var15_6;
                    if (var15_6 == 0L) break block35;
                    if (var2_2 <= 0) break block36;
                    var5_15 = d.b[var2_2];
                    break block37;
                }
                var5_15 = var4_14;
                if (var2_2 >= 0) break block35;
                var5_15 = var4_14;
                var3_3 = var2_2;
                if (var2_2 < -38) {
                    var5_15 = (float)((double)var4_14 * 1.0E-20);
                    var3_3 = var2_2 + 20;
                }
                var6_16 = d.c[-var3_3];
                var4_14 = var5_15;
                var5_15 = var6_16;
            }
            var5_15 = var4_14 * var5_15;
        }
        var4_14 = var5_15;
        if (var9_4 == 0) return var4_14;
        return -var5_15;
    }
}

