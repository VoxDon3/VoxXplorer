/*
 * Decompiled with CFR 0.152.
 */
package ax.E1;

import ax.E1.c;
import ax.E1.d;
import ax.E1.e;
import ax.E1.f;
import ax.E1.g;
import ax.E1.i;
import ax.E1.l;
import ax.E1.m;
import ax.E1.n;
import ax.E1.o;
import ax.P0.C;
import ax.P0.D;
import ax.S0.F;
import ax.S0.G;
import ax.S0.d0;
import ax.S0.u;
import ax.r7.z;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class h
extends ax.z1.c {
    public static final a b = new g();
    private final a a;

    public h() {
        this(null);
    }

    public h(a a8) {
        this.a = a8;
    }

    private static int A(G g8, int n8) {
        int n9;
        int n10;
        byte[] byArray = g8.f();
        int n11 = n10 = g8.g();
        while ((n9 = n11 + 1) < n10 + n8) {
            int n12 = n8;
            if ((byArray[n11] & 0xFF) == 255) {
                n12 = n8;
                if (byArray[n9] == 0) {
                    System.arraycopy(byArray, n11 + 2, byArray, n9, n8 - (n11 - n10) - 2);
                    n12 = n8 - 1;
                }
            }
            n11 = n9;
            n8 = n12;
        }
        return n8;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean B(G g8, int n8, int n9, boolean bl) {
        Throwable throwable2;
        int n10;
        block14: {
            n10 = g8.g();
            while (true) {
                long l8;
                int n11;
                int n12;
                int n13;
                block17: {
                    block16: {
                        block18: {
                            int n14;
                            block15: {
                                long l9;
                                block13: {
                                    block12: {
                                        try {
                                            n13 = g8.a();
                                            n14 = 1;
                                            if (n13 < n9) break;
                                            if (n8 < 3) break block12;
                                            n13 = g8.v();
                                            l9 = g8.O();
                                            n12 = g8.U();
                                            break block13;
                                        }
                                        catch (Throwable throwable2) {
                                            break block14;
                                        }
                                    }
                                    n13 = g8.P();
                                    n11 = g8.P();
                                    l9 = n11;
                                    n12 = 0;
                                }
                                if (n13 == 0 && l9 == 0L && n12 == 0) {
                                    g8.b0(n10);
                                    return true;
                                }
                                l8 = l9;
                                if (n8 == 4) {
                                    l8 = l9;
                                    if (!bl) {
                                        if ((0x808080L & l9) != 0L) {
                                            g8.b0(n10);
                                            return false;
                                        }
                                        l8 = (l9 >> 24 & 0xFFL) << 21 | (l9 & 0xFFL | (l9 >> 8 & 0xFFL) << 7 | (l9 >> 16 & 0xFFL) << 14);
                                    }
                                }
                                if (n8 != 4) break block15;
                                n11 = (n12 & 0x40) != 0 ? 1 : 0;
                                n13 = n11;
                                if ((n12 & 1) == 0) break block16;
                                n13 = n11;
                                n11 = n14;
                                break block17;
                            }
                            if (n8 != 3) break block18;
                            n11 = (n12 & 0x20) != 0 ? 1 : 0;
                            n13 = n11;
                            if ((n12 & 0x80) == 0) break block16;
                            n13 = n11;
                            n11 = n14;
                            break block17;
                        }
                        n13 = 0;
                    }
                    n11 = 0;
                }
                n12 = n13;
                if (n11 != 0) {
                    n12 = n13 + 4;
                }
                if (l8 < (long)n12) {
                    g8.b0(n10);
                    return false;
                }
                n13 = g8.a();
                if ((long)n13 < l8) {
                    g8.b0(n10);
                    return false;
                }
                n13 = (int)l8;
                {
                    g8.c0(n13);
                    continue;
                }
                break;
            }
            g8.b0(n10);
            return true;
        }
        g8.b0(n10);
        throw throwable2;
    }

    public static /* synthetic */ boolean c(int n8, int n9, int n10, int n11, int n12) {
        return false;
    }

    private static byte[] d(byte[] byArray, int n8, int n9) {
        if (n9 <= n8) {
            return d0.f;
        }
        return Arrays.copyOfRange(byArray, n8, n9);
    }

    private static ax.E1.a f(G object, int n8, int n9) {
        int n10 = ((G)object).M();
        Charset charset = h.w(n10);
        int n11 = n8 - 1;
        byte[] byArray = new byte[n11];
        ((G)object).q(byArray, 0, n11);
        if (n9 == 2) {
            object = new StringBuilder();
            ((StringBuilder)object).append("image/");
            ((StringBuilder)object).append(ax.q7.c.e(new String(byArray, 0, 3, StandardCharsets.ISO_8859_1)));
            String string = ((StringBuilder)object).toString();
            object = string;
            if ("image/jpg".equals(string)) {
                object = "image/jpeg";
            }
            n8 = 2;
        } else {
            n8 = h.z(byArray, 0);
            object = ax.q7.c.e(new String(byArray, 0, n8, StandardCharsets.ISO_8859_1));
            if (((String)object).indexOf(47) == -1) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("image/");
                stringBuilder.append((String)object);
                object = stringBuilder.toString();
            }
        }
        n9 = byArray[n8 + 1];
        int n12 = h.y(byArray, n8 += 2, n10);
        return new ax.E1.a((String)object, new String(byArray, n8, n12 - n8, charset), n9 & 0xFF, h.d(byArray, n12 + h.v(n10), n11));
    }

    private static ax.E1.b g(G g8, int n8, String string) {
        byte[] byArray = new byte[n8];
        g8.q(byArray, 0, n8);
        return new ax.E1.b(string, byArray);
    }

    private static c h(G g8, int n8, int n9, boolean bl, int n10, a a8) {
        long l8;
        int n11 = g8.g();
        int n12 = h.z(g8.f(), n11);
        String string = new String(g8.f(), n11, n12 - n11, StandardCharsets.ISO_8859_1);
        g8.b0(n12 + 1);
        n12 = g8.v();
        int n13 = g8.v();
        long l9 = l8 = g8.O();
        if (l8 == 0xFFFFFFFFL) {
            l9 = -1L;
        }
        if ((l8 = g8.O()) == 0xFFFFFFFFL) {
            l8 = -1L;
        }
        ArrayList<i> arrayList = new ArrayList<i>();
        while (g8.g() < n11 + n8) {
            i i8 = h.k(n9, g8, bl, n10, a8);
            if (i8 == null) continue;
            arrayList.add(i8);
        }
        return new c(string, n12, n13, l9, l8, arrayList.toArray(new i[0]));
    }

    private static d i(G g8, int n8, int n9, boolean bl, int n10, a a8) {
        int n11 = g8.g();
        int n12 = h.z(g8.f(), n11);
        String string = new String(g8.f(), n11, n12 - n11, StandardCharsets.ISO_8859_1);
        g8.b0(n12 + 1);
        n12 = g8.M();
        boolean bl2 = (n12 & 2) != 0;
        boolean bl3 = (n12 & 1) != 0;
        int n13 = g8.M();
        String[] stringArray = new String[n13];
        for (n12 = 0; n12 < n13; ++n12) {
            int n14 = g8.g();
            int n15 = h.z(g8.f(), n14);
            stringArray[n12] = new String(g8.f(), n14, n15 - n14, StandardCharsets.ISO_8859_1);
            g8.b0(n15 + 1);
        }
        ArrayList<i> arrayList = new ArrayList<i>();
        while (g8.g() < n11 + n8) {
            i i8 = h.k(n9, g8, bl, n10, a8);
            if (i8 == null) continue;
            arrayList.add(i8);
        }
        return new d(string, bl2, bl3, stringArray, arrayList.toArray(new i[0]));
    }

    private static e j(G object, int n8) {
        if (n8 < 4) {
            return null;
        }
        int n9 = ((G)object).M();
        Charset charset = h.w(n9);
        Object object2 = new byte[3];
        ((G)object).q((byte[])object2, 0, 3);
        object2 = new String((byte[])object2, 0, 3);
        byte[] byArray = new byte[n8 -= 4];
        ((G)object).q(byArray, 0, n8);
        n8 = h.y(byArray, 0, n9);
        object = new String(byArray, 0, n8, charset);
        return new e((String)object2, (String)object, h.p(byArray, n8 += h.v(n9), h.y(byArray, n8, n9), charset));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    private static i k(int var0, G var1_1, boolean var2_2, int var3_3, a var4_4) {
        block43: {
            block44: {
                block40: {
                    block39: {
                        block38: {
                            block41: {
                                block42: {
                                    var16_17 = var1_1.M();
                                    var14_18 = var1_1.M();
                                    var15_19 = var1_1.M();
                                    var9_20 = 0;
                                    var8_21 = 0;
                                    var10_22 = var0 >= 3 ? var1_1.M() : 0;
                                    if (var0 == 4) {
                                        var5_24 = var6_23 = var1_1.Q();
                                        if (!var2_2) {
                                            var5_24 = (var6_23 >> 24 & 255) << 21 | (var6_23 & 255 | (var6_23 >> 8 & 255) << 7 | (var6_23 >> 16 & 255) << 14);
                                        }
lbl11:
                                        // 5 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    if (var0 != 3) break block42;
                                    var5_24 = var1_1.Q();
                                    ** GOTO lbl11
                                }
                                var5_24 = var1_1.P();
                                ** while (true)
                                var11_25 = var5_24;
                                var12_26 = var0 >= 3 ? var1_1.U() : 0;
                                if (var16_17 == 0 && var14_18 == 0 && var15_19 == 0 && var10_22 == 0 && var11_25 == 0 && var12_26 == 0) {
                                    var1_1.b0(var1_1.j());
                                    return null;
                                }
                                var17_27 = var1_1.g() + var11_25;
                                if (var17_27 > var1_1.j()) {
                                    u.h("Id3Decoder", "Frame size exceeds remaining tag data");
                                    var1_1.b0(var1_1.j());
                                    return null;
                                }
                                if (var4_4 != null && !var4_4.a(var0, var16_17, var14_18, var15_19, var10_22)) {
                                    var1_1.b0(var17_27);
                                    return null;
                                }
                                if (var0 == 3) {
                                    var5_24 = (var12_26 & 128) != 0 ? 1 : 0;
                                    var6_23 = (var12_26 & 64) != 0 ? 1 : 0;
                                    var7_28 = (var12_26 & 32) != 0 ? 1 : 0;
                                    var8_21 = var5_24;
lbl37:
                                    // 2 sources

                                    while (true) {
                                        var13_29 = 0;
                                        var9_20 = var8_21;
                                        var8_21 = var5_24;
                                        var12_26 = var7_28;
                                        var7_28 = var13_29;
                                        break;
                                    }
                                } else if (var0 == 4) {
                                    var6_23 = (var12_26 & 64) != 0 ? 1 : 0;
                                    var7_28 = (var12_26 & 8) != 0 ? 1 : 0;
                                    var8_21 = (var12_26 & 4) != 0 ? 1 : 0;
                                    var5_24 = (var12_26 & 2) != 0 ? 1 : 0;
                                    if ((var12_26 & 1) != 0) {
                                        var9_20 = 1;
                                    }
                                    var12_26 = var9_20;
                                    var9_20 = var7_28;
                                    var7_28 = var8_21;
                                    var8_21 = var12_26;
                                    var12_26 = var6_23;
                                    var6_23 = var7_28;
                                    var7_28 = var5_24;
                                } else {
                                    var5_24 = 0;
                                    var7_28 = 0;
                                    var6_23 = 0;
                                    ** continue;
                                }
                                if (var9_20 != 0 || var6_23 != 0) break block43;
                                var5_24 = var11_25;
                                if (var12_26 != 0) {
                                    var5_24 = var11_25 - 1;
                                    var1_1.c0(1);
                                }
                                var6_23 = var5_24;
                                if (var8_21 != 0) {
                                    var6_23 = var5_24 - 4;
                                    var1_1.c0(4);
                                }
                                var5_24 = var6_23;
                                if (var7_28 != 0) {
                                    var5_24 = h.A((G)var1_1, var6_23);
                                }
                                if (var16_17 != 84 || var14_18 != 88 || var15_19 != 88 || var0 != 2 && var10_22 != 88) ** GOTO lbl86
                                var4_4 = h.s((G)var1_1, var5_24);
                                break block38;
                                catch (Throwable var4_5) {
                                    break block39;
                                }
                                catch (Exception var4_6) {
                                    break block40;
                                }
                                catch (OutOfMemoryError var4_7) {
                                    break block40;
                                }
lbl86:
                                // 1 sources

                                if (var16_17 == 84) {
                                    var4_4 = h.q((G)var1_1, var5_24, h.x(var0, var16_17, var14_18, var15_19, var10_22));
                                    break block38;
                                }
                                if (var16_17 == 87 && var14_18 == 88 && var15_19 == 88 && (var0 == 2 || var10_22 == 88)) {
                                    var4_4 = h.u((G)var1_1, var5_24);
                                    break block38;
                                }
                                if (var16_17 == 87) {
                                    var4_4 = h.t((G)var1_1, var5_24, h.x(var0, var16_17, var14_18, var15_19, var10_22));
                                    break block38;
                                }
                                if (var16_17 == 80 && var14_18 == 82 && var15_19 == 73 && var10_22 == 86) {
                                    var4_4 = h.o((G)var1_1, var5_24);
                                    break block38;
                                }
                                if (var16_17 == 71 && var14_18 == 69 && var15_19 == 79 && (var10_22 == 66 || var0 == 2)) {
                                    var4_4 = h.l((G)var1_1, var5_24);
                                    break block38;
                                }
                                if (!(var0 == 2 ? var16_17 == 80 && var14_18 == 73 && var15_19 == 67 : var16_17 == 65 && var14_18 == 80 && var15_19 == 73 && var10_22 == 67)) ** GOTO lbl109
                                var4_4 = h.f((G)var1_1, var5_24, var0);
                                break block38;
                                catch (Exception var4_8) {
                                    break block40;
                                }
                                catch (OutOfMemoryError var4_9) {
                                    break block40;
                                }
lbl109:
                                // 1 sources

                                if (var16_17 == 67 && var14_18 == 79 && var15_19 == 77 && (var10_22 == 77 || var0 == 2)) {
                                    var4_4 = h.j((G)var1_1, var5_24);
                                    break block38;
                                }
                                if (var16_17 != 67 || var14_18 != 72 || var15_19 != 65 || var10_22 != 80) break block41;
                                try {
                                    var4_4 = h.h((G)var1_1, var5_24, var0, var2_2, var3_3, (a)var4_4);
                                    break block38;
                                }
                                catch (Throwable var4_10) {
                                    break block39;
                                }
                                catch (Exception var4_11) {
                                    break block40;
                                }
                                catch (OutOfMemoryError var4_12) {
                                    break block40;
                                }
                            }
                            if (var16_17 != 67 || var14_18 != 84 || var15_19 != 79 || var10_22 != 67) ** GOTO lbl133
                            var4_4 = h.i((G)var1_1, var5_24, var0, var2_2, var3_3, (a)var4_4);
                            break block38;
                            catch (Throwable var4_13) {
                                break block39;
                            }
                            catch (Exception var4_14) {
                                break block40;
                            }
                            catch (OutOfMemoryError var4_15) {
                                break block40;
                            }
lbl133:
                            // 1 sources

                            var4_4 = var16_17 == 77 && var14_18 == 76 && var15_19 == 76 && var10_22 == 84 ? h.n((G)var1_1, var5_24) : h.g((G)var1_1, var5_24, h.x(var0, var16_17, var14_18, var15_19, var10_22));
                        }
                        var1_1.b0(var17_27);
                        var1_1 = var4_4;
                        var4_4 = null;
                        break block44;
                    }
                    var1_1.b0(var17_27);
                    throw var4_16;
                }
                var1_1.b0(var17_27);
                var1_1 = null;
            }
            if (var1_1 == null) {
                var18_30 = new StringBuilder();
                var18_30.append("Failed to decode frame: id=");
                var18_30.append(h.x(var0, var16_17, var14_18, var15_19, var10_22));
                var18_30.append(", frameSize=");
                var18_30.append(var5_24);
                u.i("Id3Decoder", var18_30.toString(), (Throwable)var4_4);
            }
            return var1_1;
        }
        u.h("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
        var1_1.b0(var17_27);
        return null;
    }

    private static f l(G object, int n8) {
        int n9 = ((G)object).M();
        Charset charset = h.w(n9);
        byte[] byArray = new byte[--n8];
        ((G)object).q(byArray, 0, n8);
        int n10 = h.z(byArray, 0);
        object = D.t(new String(byArray, 0, n10, StandardCharsets.ISO_8859_1));
        int n11 = n10 + 1;
        n10 = h.y(byArray, n11, n9);
        String string = h.p(byArray, n11, n10, charset);
        n11 = n10 + h.v(n9);
        n10 = h.y(byArray, n11, n9);
        return new f((String)object, string, h.p(byArray, n11, n10, charset), h.d(byArray, n10 + h.v(n9), n8));
    }

    private static b m(G object) {
        int n8;
        block15: {
            int n9;
            int n10;
            boolean bl;
            block13: {
                int n11;
                block14: {
                    block12: {
                        bl = false;
                        if (((G)object).a() < 10) {
                            u.h("Id3Decoder", "Data too short to be an ID3 tag");
                            return null;
                        }
                        n10 = ((G)object).P();
                        if (n10 != 0x494433) {
                            object = new StringBuilder();
                            ((StringBuilder)object).append("Unexpected first three bytes of ID3 tag header: 0x");
                            ((StringBuilder)object).append(String.format("%06X", n10));
                            u.h("Id3Decoder", ((StringBuilder)object).toString());
                            return null;
                        }
                        n8 = ((G)object).M();
                        ((G)object).c0(1);
                        n9 = ((G)object).M();
                        n11 = ((G)object).L();
                        if (n8 != 2) break block12;
                        n10 = n11;
                        if ((n9 & 0x40) != 0) {
                            u.h("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                            return null;
                        }
                        break block13;
                    }
                    if (n8 != 3) break block14;
                    n10 = n11;
                    if ((n9 & 0x40) != 0) {
                        n10 = ((G)object).v();
                        ((G)object).c0(n10);
                        n10 = n11 - (n10 + 4);
                    }
                    break block13;
                }
                if (n8 != 4) break block15;
                int n12 = n11;
                if ((n9 & 0x40) != 0) {
                    n10 = ((G)object).L();
                    ((G)object).c0(n10 - 4);
                    n12 = n11 - n10;
                }
                n10 = n12;
                if ((n9 & 0x10) != 0) {
                    n10 = n12 - 10;
                }
            }
            boolean bl2 = bl;
            if (n8 < 4) {
                bl2 = bl;
                if ((n9 & 0x80) != 0) {
                    bl2 = true;
                }
            }
            return new b(n8, bl2, n10);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Skipped ID3 tag with unsupported majorVersion=");
        ((StringBuilder)object).append(n8);
        u.h("Id3Decoder", ((StringBuilder)object).toString());
        return null;
    }

    private static l n(G object, int n8) {
        int n9 = ((G)object).U();
        int n10 = ((G)object).P();
        int n11 = ((G)object).P();
        int n12 = ((G)object).M();
        int n13 = ((G)object).M();
        F f8 = new F();
        f8.m((G)object);
        int n14 = (n8 - 10) * 8 / (n12 + n13);
        int[] nArray = new int[n14];
        object = new int[n14];
        for (n8 = 0; n8 < n14; ++n8) {
            int n15 = f8.h(n12);
            int n16 = f8.h(n13);
            nArray[n8] = n15;
            object[n8] = n16;
        }
        return new l(n9, n10, n11, nArray, (int[])object);
    }

    private static m o(G g8, int n8) {
        byte[] byArray = new byte[n8];
        g8.q(byArray, 0, n8);
        int n9 = h.z(byArray, 0);
        return new m(new String(byArray, 0, n9, StandardCharsets.ISO_8859_1), h.d(byArray, n9 + 1, n8));
    }

    private static String p(byte[] byArray, int n8, int n9, Charset charset) {
        if (n9 > n8 && n9 <= byArray.length) {
            return new String(byArray, n8, n9 - n8, charset);
        }
        return "";
    }

    private static n q(G g8, int n8, String string) {
        if (n8 < 1) {
            return null;
        }
        int n9 = g8.M();
        byte[] byArray = new byte[--n8];
        g8.q(byArray, 0, n8);
        return new n(string, null, h.r(byArray, n9, 0));
    }

    private static z<String> r(byte[] object, int n8, int n9) {
        if (n9 >= ((byte[])object).length) {
            return z.A("");
        }
        Object object2 = z.r();
        int n10 = h.y(object, n9, n8);
        while (n9 < n10) {
            ((z.a)object2).h(new String((byte[])object, n9, n10 - n9, h.w(n8)));
            n9 = h.v(n8) + n10;
            n10 = h.y(object, n9, n8);
        }
        object2 = ((z.a)object2).k();
        object = object2;
        if (((AbstractCollection)object2).isEmpty()) {
            object = z.A("");
        }
        return object;
    }

    private static n s(G g8, int n8) {
        if (n8 < 1) {
            return null;
        }
        int n9 = g8.M();
        byte[] byArray = new byte[--n8];
        g8.q(byArray, 0, n8);
        n8 = h.y(byArray, 0, n9);
        return new n("TXXX", new String(byArray, 0, n8, h.w(n9)), h.r(byArray, n9, n8 + h.v(n9)));
    }

    private static o t(G g8, int n8, String string) {
        byte[] byArray = new byte[n8];
        g8.q(byArray, 0, n8);
        return new o(string, null, new String(byArray, 0, h.z(byArray, 0), StandardCharsets.ISO_8859_1));
    }

    private static o u(G object, int n8) {
        if (n8 < 1) {
            return null;
        }
        int n9 = ((G)object).M();
        byte[] byArray = new byte[--n8];
        ((G)object).q(byArray, 0, n8);
        n8 = h.y(byArray, 0, n9);
        object = new String(byArray, 0, n8, h.w(n9));
        return new o("WXXX", (String)object, h.p(byArray, n8 += h.v(n9), h.z(byArray, n8), StandardCharsets.ISO_8859_1));
    }

    private static int v(int n8) {
        if (n8 != 0 && n8 != 3) {
            return 2;
        }
        return 1;
    }

    private static Charset w(int n8) {
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return StandardCharsets.ISO_8859_1;
                }
                return StandardCharsets.UTF_8;
            }
            return StandardCharsets.UTF_16BE;
        }
        return StandardCharsets.UTF_16;
    }

    private static String x(int n8, int n9, int n10, int n11, int n12) {
        if (n8 == 2) {
            return String.format(Locale.US, "%c%c%c", n9, n10, n11);
        }
        return String.format(Locale.US, "%c%c%c%c", n9, n10, n11, n12);
    }

    private static int y(byte[] byArray, int n8, int n9) {
        int n10 = h.z(byArray, n8);
        if (n9 != 0) {
            int n11 = n10;
            if (n9 != 3) {
                while (n11 < byArray.length - 1) {
                    if ((n11 - n8) % 2 == 0 && byArray[n11 + 1] == 0) {
                        return n11;
                    }
                    n11 = h.z(byArray, n11 + 1);
                }
                return byArray.length;
            }
        }
        return n10;
    }

    private static int z(byte[] byArray, int n8) {
        while (n8 < byArray.length) {
            if (byArray[n8] == 0) {
                return n8;
            }
            ++n8;
        }
        return byArray.length;
    }

    @Override
    protected C b(ax.z1.b b8, ByteBuffer byteBuffer) {
        return this.e(byteBuffer.array(), byteBuffer.limit());
    }

    public C e(byte[] object, int n8) {
        Serializable serializable = new ArrayList();
        G g8 = new G((byte[])object, n8);
        if ((object = (Object)h.m(g8)) == null) {
            return null;
        }
        int n9 = g8.g();
        n8 = ((b)object).a == 2 ? 6 : 10;
        int n10 = ((b)object).c;
        if (((b)object).b) {
            n10 = h.A(g8, ((b)object).c);
        }
        g8.a0(n9 + n10);
        n10 = ((b)object).a;
        boolean bl = false;
        if (!h.B(g8, n10, n8, false)) {
            if (((b)object).a == 4 && h.B(g8, 4, n8, true)) {
                bl = true;
            } else {
                serializable = new StringBuilder();
                ((StringBuilder)serializable).append("Failed to validate ID3 tag with majorVersion=");
                ((StringBuilder)serializable).append(((b)object).a);
                u.h("Id3Decoder", ((StringBuilder)serializable).toString());
                return null;
            }
        }
        while (g8.a() >= n8) {
            i i8 = h.k(((b)object).a, g8, bl, n8, this.a);
            if (i8 == null) continue;
            serializable.add(i8);
        }
        return new C((List<? extends C.a>)((Object)serializable));
    }

    public static interface a {
        public boolean a(int var1, int var2, int var3, int var4, int var5);
    }

    private static final class b {
        private final int a;
        private final boolean b;
        private final int c;

        public b(int n8, boolean bl, int n9) {
            this.a = n8;
            this.b = bl;
            this.c = n9;
        }
    }
}

