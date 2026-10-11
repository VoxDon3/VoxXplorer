/*
 * Decompiled with CFR 0.152.
 */
package ax.T;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

public final class d {
    private static void a(ArrayList<b> arrayList, char c8, float[] fArray) {
        arrayList.add(new b(c8, fArray));
    }

    public static boolean b(b[] bArray, b[] bArray2) {
        if (bArray != null && bArray2 != null) {
            if (bArray.length != bArray2.length) {
                return false;
            }
            for (int i8 = 0; i8 < bArray.length; ++i8) {
                if (bArray[i8].a == bArray2[i8].a && bArray[i8].b.length == bArray2[i8].b.length) {
                    continue;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    static float[] c(float[] fArray, int n8, int n9) {
        if (n8 <= n9) {
            int n10 = fArray.length;
            if (n8 >= 0 && n8 <= n10) {
                n10 = Math.min(n9 -= n8, n10 - n8);
                float[] fArray2 = new float[n9];
                System.arraycopy(fArray, n8, fArray2, 0, n10);
                return fArray2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static b[] d(String string) {
        ArrayList<b> arrayList = new ArrayList<b>();
        int n8 = 1;
        int n9 = 0;
        while (n8 < string.length()) {
            String string2 = string.substring(n9, n8 = d.i(string, n8)).trim();
            if (!string2.isEmpty()) {
                float[] fArray = d.h(string2);
                d.a(arrayList, string2.charAt(0), fArray);
            }
            n9 = n8++;
        }
        if (n8 - n9 == 1 && n9 < string.length()) {
            d.a(arrayList, string.charAt(n9), new float[0]);
        }
        return arrayList.toArray(new b[0]);
    }

    public static Path e(String string) {
        Path path = new Path();
        Object object = d.d(string);
        try {
            b.i((b[])object, path);
            return path;
        }
        catch (RuntimeException runtimeException) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Error in parsing ");
            ((StringBuilder)object).append(string);
            throw new RuntimeException(((StringBuilder)object).toString(), runtimeException);
        }
    }

    public static b[] f(b[] bArray) {
        b[] bArray2 = new b[bArray.length];
        for (int i8 = 0; i8 < bArray.length; ++i8) {
            bArray2[i8] = new b(bArray[i8]);
        }
        return bArray2;
    }

    /*
     * Unable to fully structure code
     */
    private static void g(String var0, int var1_1, a var2_2) {
        var2_2.b = false;
        var3_4 = false;
        var6_5 = false;
        var4_6 = false;
        for (var5_3 = var1_1; var5_3 < var0.length(); ++var5_3) {
            block8: {
                block7: {
                    var7_7 = var0.charAt(var5_3);
                    if (var7_7 == ' ') ** GOTO lbl-1000
                    if (var7_7 == 'E' || var7_7 == 'e') break block7;
                    switch (var7_7) {
                        default: {
                            break;
                        }
                        case '.': {
                            if (var6_5) ** GOTO lbl17
                            var3_4 = false;
                            var6_5 = true;
                            break block8;
lbl17:
                            // 1 sources

                            var2_2.b = true;
                        }
lbl18:
                        // 3 sources

                        case ',': lbl-1000:
                        // 2 sources

                        {
                            var3_4 = false;
                            var4_6 = true;
                            break block8;
                        }
                        case '-': {
                            if (var5_3 == var1_1 || var3_4) break;
                            var2_2.b = true;
                            ** GOTO lbl18
                        }
                    }
                    var3_4 = false;
                    break block8;
                }
                var3_4 = true;
            }
            if (var4_6) break;
        }
        var2_2.a = var5_3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static float[] h(String string) {
        int n8;
        int n9;
        int n10;
        a a8;
        float[] fArray;
        block7: {
            if (string.charAt(0) == 'z') return new float[0];
            if (string.charAt(0) == 'Z') {
                return new float[0];
            }
            try {
                fArray = new float[string.length()];
                a8 = new a();
                n10 = string.length();
                n9 = 1;
                n8 = 0;
                break block7;
            }
            catch (NumberFormatException numberFormatException) {}
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("error in parsing \"");
            stringBuilder.append(string);
            stringBuilder.append("\"");
            throw new RuntimeException(stringBuilder.toString(), numberFormatException);
        }
        while (n9 < n10) {
            d.g(string, n9, a8);
            int n11 = a8.a;
            int n12 = n8;
            if (n9 < n11) {
                fArray[n8] = Float.parseFloat(string.substring(n9, n11));
                n12 = n8 + 1;
            }
            if (a8.b) {
                n9 = n11;
                n8 = n12;
                continue;
            }
            n9 = n11 + 1;
            n8 = n12;
        }
        return d.c(fArray, 0, n8);
    }

    private static int i(String string, int n8) {
        char c8;
        while (n8 < string.length() && (((c8 = string.charAt(n8)) - 65) * (c8 - 90) > 0 && (c8 - 97) * (c8 - 122) > 0 || c8 == 'e' || c8 == 'E')) {
            ++n8;
        }
        return n8;
    }

    public static void j(b[] bArray, Path path) {
        float[] fArray = new float[6];
        int n8 = bArray.length;
        char c8 = 'm';
        for (int i8 = 0; i8 < n8; ++i8) {
            b b8 = bArray[i8];
            b.e(path, fArray, c8, b8.a, b8.b);
            c8 = b8.a;
        }
    }

    public static void k(b[] bArray, b[] bArray2) {
        for (int i8 = 0; i8 < bArray2.length; ++i8) {
            b.b(bArray[i8], bArray2[i8].a);
            for (int i9 = 0; i9 < bArray2[i8].b.length; ++i9) {
                ((b)bArray[i8]).b[i9] = bArray2[i8].b[i9];
            }
        }
    }

    private static class a {
        int a;
        boolean b;

        a() {
        }
    }

    public static class b {
        private char a;
        private final float[] b;

        b(char c8, float[] fArray) {
            this.a = c8;
            this.b = fArray;
        }

        b(b object) {
            this.a = ((b)object).a;
            object = ((b)object).b;
            this.b = d.c((float[])object, 0, ((Object)object).length);
        }

        static /* synthetic */ char b(b b8, char c8) {
            b8.a = c8;
            return c8;
        }

        /*
         * Handled duff style switch with additional control
         * Enabled aggressive block sorting
         */
        private static void e(Path path, float[] fArray, char n8, char c8, float[] fArray2) {
            int n9;
            float f8 = fArray[0];
            float f9 = fArray[1];
            float f10 = fArray[2];
            float f11 = fArray[3];
            float f12 = fArray[4];
            float f13 = fArray[5];
            float f14 = f8;
            float f15 = f9;
            float f16 = f10;
            float f17 = f11;
            char c9 = '\u0000';
            block8: do {
                switch (c9 == '\u0000' ? c8 : c9) {
                    default: {
                        f17 = f11;
                        f16 = f10;
                        f15 = f9;
                        f14 = f8;
                        c9 = 'L';
                        continue block8;
                    }
                    case 'Z': 
                    case 'z': {
                        path.close();
                        path.moveTo(f12, f13);
                        f16 = f14 = f12;
                        f17 = f15 = f13;
                    }
                    case 'L': 
                    case 'M': 
                    case 'T': 
                    case 'l': 
                    case 'm': 
                    case 't': {
                        n9 = 2;
                        break;
                    }
                    case 'Q': 
                    case 'S': 
                    case 'q': 
                    case 's': {
                        n9 = 4;
                        f14 = f8;
                        f15 = f9;
                        f16 = f10;
                        f17 = f11;
                        break;
                    }
                    case 'H': 
                    case 'V': 
                    case 'h': 
                    case 'v': {
                        n9 = 1;
                        f14 = f8;
                        f15 = f9;
                        f16 = f10;
                        f17 = f11;
                        break;
                    }
                    case 'C': 
                    case 'c': {
                        n9 = 6;
                        f14 = f8;
                        f15 = f9;
                        f16 = f10;
                        f17 = f11;
                        break;
                    }
                    case 'A': 
                    case 'a': {
                        n9 = 7;
                        f17 = f11;
                        f16 = f10;
                        f15 = f9;
                        f14 = f8;
                    }
                }
                break;
            } while (true);
            int n10 = 0;
            int n11 = n8;
            n8 = n10;
            while (true) {
                block41: {
                    boolean bl;
                    boolean bl2;
                    block24: {
                        int n12;
                        int n13;
                        block25: {
                            block26: {
                                block50: {
                                    block27: {
                                        block28: {
                                            block29: {
                                                block30: {
                                                    block31: {
                                                        block42: {
                                                            block32: {
                                                                block45: {
                                                                    block33: {
                                                                        block52: {
                                                                            block34: {
                                                                                block44: {
                                                                                    block51: {
                                                                                        block35: {
                                                                                            block49: {
                                                                                                block48: {
                                                                                                    block36: {
                                                                                                        block47: {
                                                                                                            block46: {
                                                                                                                block37: {
                                                                                                                    block38: {
                                                                                                                        block43: {
                                                                                                                            block39: {
                                                                                                                                block40: {
                                                                                                                                    if (n8 >= fArray2.length) {
                                                                                                                                        fArray[0] = f14;
                                                                                                                                        fArray[1] = f15;
                                                                                                                                        fArray[2] = f16;
                                                                                                                                        fArray[3] = f17;
                                                                                                                                        fArray[4] = f12;
                                                                                                                                        fArray[5] = f13;
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    if (c8 == 'A') break block24;
                                                                                                                                    if (c8 == 'C') break block25;
                                                                                                                                    if (c8 == 'H') break block26;
                                                                                                                                    if (c8 == 'Q') break block27;
                                                                                                                                    if (c8 == 'V') break block28;
                                                                                                                                    if (c8 == 'a') break block29;
                                                                                                                                    if (c8 == 'c') break block30;
                                                                                                                                    if (c8 == 'h') break block31;
                                                                                                                                    if (c8 == 'q') break block32;
                                                                                                                                    if (c8 == 'v') break block33;
                                                                                                                                    if (c8 == 'L') break block34;
                                                                                                                                    if (c8 == 'M') break block35;
                                                                                                                                    if (c8 == 'S') break block36;
                                                                                                                                    if (c8 == 'T') break block37;
                                                                                                                                    if (c8 == 'l') break block38;
                                                                                                                                    if (c8 == 'm') break block39;
                                                                                                                                    if (c8 == 's') break block40;
                                                                                                                                    if (c8 == 't') {
                                                                                                                                        if (n11 != 113 && n11 != 116 && n11 != 81 && n11 != 84) {
                                                                                                                                            f17 = 0.0f;
                                                                                                                                            f16 = 0.0f;
                                                                                                                                        } else {
                                                                                                                                            f16 = f14 - f16;
                                                                                                                                            f17 = f15 - f17;
                                                                                                                                        }
                                                                                                                                        f11 = fArray2[n8];
                                                                                                                                        n11 = n8 + 1;
                                                                                                                                        path.rQuadTo(f16, f17, f11, fArray2[n11]);
                                                                                                                                        f8 = f14 + fArray2[n8];
                                                                                                                                        f11 = f15 + fArray2[n11];
                                                                                                                                        f17 += f15;
                                                                                                                                        f16 += f14;
                                                                                                                                        f14 = f8;
                                                                                                                                        f15 = f11;
                                                                                                                                    }
                                                                                                                                    break block41;
                                                                                                                                }
                                                                                                                                if (n11 != 99 && n11 != 115 && n11 != 67 && n11 != 83) {
                                                                                                                                    f17 = 0.0f;
                                                                                                                                    f16 = 0.0f;
                                                                                                                                } else {
                                                                                                                                    f17 = f15 - f17;
                                                                                                                                    f11 = f14 - f16;
                                                                                                                                    f16 = f17;
                                                                                                                                    f17 = f11;
                                                                                                                                }
                                                                                                                                f11 = fArray2[n8];
                                                                                                                                n10 = n8 + 1;
                                                                                                                                f8 = fArray2[n10];
                                                                                                                                n11 = n8 + 2;
                                                                                                                                f9 = fArray2[n11];
                                                                                                                                n13 = n8 + 3;
                                                                                                                                path.rCubicTo(f17, f16, f11, f8, f9, fArray2[n13]);
                                                                                                                                f17 = fArray2[n8] + f14;
                                                                                                                                f16 = fArray2[n10] + f15;
                                                                                                                                f14 += fArray2[n11];
                                                                                                                                f11 = fArray2[n13];
                                                                                                                                break block42;
                                                                                                                            }
                                                                                                                            f11 = fArray2[n8];
                                                                                                                            f14 += f11;
                                                                                                                            f8 = fArray2[n8 + 1];
                                                                                                                            f15 += f8;
                                                                                                                            if (n8 <= 0) break block43;
                                                                                                                            path.rLineTo(f11, f8);
                                                                                                                            break block41;
                                                                                                                        }
                                                                                                                        path.rMoveTo(f11, f8);
                                                                                                                        f12 = f14;
                                                                                                                        break block44;
                                                                                                                    }
                                                                                                                    f11 = fArray2[n8];
                                                                                                                    n11 = n8 + 1;
                                                                                                                    path.rLineTo(f11, fArray2[n11]);
                                                                                                                    f14 += fArray2[n8];
                                                                                                                    f11 = fArray2[n11];
                                                                                                                    break block45;
                                                                                                                }
                                                                                                                if (n11 == 113 || n11 == 116 || n11 == 81) break block46;
                                                                                                                f8 = f14;
                                                                                                                f11 = f15;
                                                                                                                if (n11 != 84) break block47;
                                                                                                            }
                                                                                                            f8 = f14 * 2.0f - f16;
                                                                                                            f11 = f15 * 2.0f - f17;
                                                                                                        }
                                                                                                        f14 = fArray2[n8];
                                                                                                        n11 = n8 + 1;
                                                                                                        path.quadTo(f8, f11, f14, fArray2[n11]);
                                                                                                        f14 = fArray2[n8];
                                                                                                        f15 = fArray2[n11];
                                                                                                        f16 = f8;
                                                                                                        f17 = f11;
                                                                                                        break block41;
                                                                                                    }
                                                                                                    if (n11 == 99 || n11 == 115 || n11 == 67) break block48;
                                                                                                    f11 = f14;
                                                                                                    f8 = f15;
                                                                                                    if (n11 != 83) break block49;
                                                                                                }
                                                                                                f11 = f14 * 2.0f - f16;
                                                                                                f8 = f15 * 2.0f - f17;
                                                                                            }
                                                                                            f16 = fArray2[n8];
                                                                                            n13 = n8 + 1;
                                                                                            f15 = fArray2[n13];
                                                                                            n11 = n8 + 2;
                                                                                            f14 = fArray2[n11];
                                                                                            n10 = n8 + 3;
                                                                                            path.cubicTo(f11, f8, f16, f15, f14, fArray2[n10]);
                                                                                            f17 = fArray2[n8];
                                                                                            f16 = fArray2[n13];
                                                                                            f14 = fArray2[n11];
                                                                                            f15 = fArray2[n10];
                                                                                            break block50;
                                                                                        }
                                                                                        f11 = fArray2[n8];
                                                                                        f15 = fArray2[n8 + 1];
                                                                                        if (n8 <= 0) break block51;
                                                                                        path.lineTo(f11, f15);
                                                                                        f14 = f15;
                                                                                        f15 = f11;
                                                                                        break block52;
                                                                                    }
                                                                                    path.moveTo(f11, f15);
                                                                                    f12 = f14 = f11;
                                                                                }
                                                                                f13 = f15;
                                                                                break block41;
                                                                            }
                                                                            f14 = fArray2[n8];
                                                                            n11 = n8 + 1;
                                                                            path.lineTo(f14, fArray2[n11]);
                                                                            f15 = fArray2[n8];
                                                                            f14 = fArray2[n11];
                                                                        }
                                                                        f11 = f15;
                                                                        f15 = f14;
                                                                        f14 = f11;
                                                                        break block41;
                                                                    }
                                                                    path.rLineTo(0.0f, fArray2[n8]);
                                                                    f11 = fArray2[n8];
                                                                }
                                                                f15 += f11;
                                                                break block41;
                                                            }
                                                            f17 = fArray2[n8];
                                                            n13 = n8 + 1;
                                                            f16 = fArray2[n13];
                                                            n11 = n8 + 2;
                                                            f11 = fArray2[n11];
                                                            n10 = n8 + 3;
                                                            path.rQuadTo(f17, f16, f11, fArray2[n10]);
                                                            f17 = fArray2[n8] + f14;
                                                            f16 = fArray2[n13] + f15;
                                                            f14 += fArray2[n11];
                                                            f11 = fArray2[n10];
                                                        }
                                                        f11 = f15 + f11;
                                                        f15 = f16;
                                                        f16 = f17;
                                                        f17 = f15;
                                                        f15 = f11;
                                                        break block41;
                                                    }
                                                    path.rLineTo(fArray2[n8], 0.0f);
                                                    f14 += fArray2[n8];
                                                    break block41;
                                                }
                                                f9 = fArray2[n8];
                                                f8 = fArray2[n8 + 1];
                                                n10 = n8 + 2;
                                                f16 = fArray2[n10];
                                                n11 = n8 + 3;
                                                f11 = fArray2[n11];
                                                n12 = n8 + 4;
                                                f17 = fArray2[n12];
                                                n13 = n8 + 5;
                                                path.rCubicTo(f9, f8, f16, f11, f17, fArray2[n13]);
                                                f16 = fArray2[n10];
                                                f17 = fArray2[n11];
                                                f8 = f14 + fArray2[n12];
                                                f11 = f15 + fArray2[n13];
                                                f16 += f14;
                                                f17 += f15;
                                                f14 = f8;
                                                f15 = f11;
                                                break block41;
                                            }
                                            n10 = n8 + 5;
                                            f16 = fArray2[n10];
                                            n11 = n8 + 6;
                                            f8 = fArray2[n11];
                                            f17 = fArray2[n8];
                                            f9 = fArray2[n8 + 1];
                                            f11 = fArray2[n8 + 2];
                                            bl2 = fArray2[n8 + 3] != 0.0f;
                                            bl = fArray2[n8 + 4] != 0.0f;
                                            ax.T.d$b.g(path, f14, f15, f16 + f14, f8 + f15, f17, f9, f11, bl2, bl);
                                            f16 = f14 += fArray2[n10];
                                            f17 = f15 += fArray2[n11];
                                            break block41;
                                        }
                                        path.lineTo(f14, fArray2[n8]);
                                        f15 = fArray2[n8];
                                        break block41;
                                    }
                                    f15 = fArray2[n8];
                                    n10 = n8 + 1;
                                    f16 = fArray2[n10];
                                    n11 = n8 + 2;
                                    f14 = fArray2[n11];
                                    n13 = n8 + 3;
                                    path.quadTo(f15, f16, f14, fArray2[n13]);
                                    f17 = fArray2[n8];
                                    f16 = fArray2[n10];
                                    f14 = fArray2[n11];
                                    f15 = fArray2[n13];
                                }
                                f11 = f17;
                                f17 = f16;
                                f16 = f11;
                                break block41;
                            }
                            path.lineTo(fArray2[n8], f15);
                            f14 = fArray2[n8];
                            break block41;
                        }
                        f14 = fArray2[n8];
                        f15 = fArray2[n8 + 1];
                        n11 = n8 + 2;
                        f17 = fArray2[n11];
                        n10 = n8 + 3;
                        f11 = fArray2[n10];
                        n13 = n8 + 4;
                        f16 = fArray2[n13];
                        n12 = n8 + 5;
                        path.cubicTo(f14, f15, f17, f11, f16, fArray2[n12]);
                        f14 = fArray2[n13];
                        f15 = fArray2[n12];
                        f16 = fArray2[n11];
                        f17 = fArray2[n10];
                        break block41;
                    }
                    n11 = n8 + 5;
                    f9 = fArray2[n11];
                    n10 = n8 + 6;
                    f16 = fArray2[n10];
                    f8 = fArray2[n8];
                    f17 = fArray2[n8 + 1];
                    f11 = fArray2[n8 + 2];
                    bl2 = fArray2[n8 + 3] != 0.0f;
                    bl = fArray2[n8 + 4] != 0.0f;
                    ax.T.d$b.g(path, f14, f15, f9, f16, f8, f17, f11, bl2, bl);
                    f16 = fArray2[n11];
                    f17 = fArray2[n10];
                    f14 = f16;
                    f15 = f17;
                }
                n8 += n9;
                n11 = c8;
            }
        }

        private static void f(Path path, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
            int n8 = (int)Math.ceil(Math.abs(d16 * 4.0 / Math.PI));
            double d17 = Math.cos(d14);
            double d18 = Math.sin(d14);
            d14 = Math.cos(d15);
            double d19 = Math.sin(d15);
            double d20 = -d10;
            double d21 = d20 * d17;
            double d22 = d11 * d18;
            double d23 = d20 * d18;
            double d24 = d11 * d17;
            double d25 = d16 / (double)n8;
            d16 = d19 * d23 + d14 * d24;
            d14 = d21 * d19 - d22 * d14;
            d20 = d15;
            d19 = d13;
            d11 = d23;
            d15 = d12;
            d12 = d25;
            d13 = d18;
            for (int i8 = 0; i8 < n8; ++i8) {
                d25 = d20 + d12;
                double d26 = Math.sin(d25);
                double d27 = Math.cos(d25);
                double d28 = d8 + d10 * d17 * d27 - d22 * d26;
                d23 = d9 + d10 * d13 * d27 + d24 * d26;
                d18 = d21 * d26 - d22 * d27;
                d26 = d26 * d11 + d27 * d24;
                d27 = d25 - d20;
                d20 = Math.tan(d27 / 2.0);
                d20 = Math.sin(d27) * (Math.sqrt(d20 * 3.0 * d20 + 4.0) - 1.0) / 3.0;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float)(d15 + d14 * d20), (float)(d19 + d16 * d20), (float)(d28 - d20 * d18), (float)(d23 - d20 * d26), (float)d28, (float)d23);
                d15 = d28;
                d20 = d25;
                d16 = d26;
                d19 = d23;
                d14 = d18;
            }
        }

        private static void g(Path path, float f8, float f9, float f10, float f11, float f12, float f13, float f14, boolean bl, boolean bl2) {
            double d8 = Math.toRadians(f14);
            double d9 = Math.cos(d8);
            double d10 = Math.sin(d8);
            double d11 = f8;
            double d12 = f9;
            double d13 = f12;
            double d14 = (d11 * d9 + d12 * d10) / d13;
            double d15 = -f8;
            double d16 = f13;
            double d17 = (d15 * d10 + d12 * d9) / d16;
            double d18 = f10;
            d15 = f11;
            double d19 = (d18 * d9 + d15 * d10) / d13;
            double d20 = ((double)(-f10) * d10 + d15 * d9) / d16;
            double d21 = d14 - d19;
            double d22 = d17 - d20;
            d18 = (d14 + d19) / 2.0;
            d15 = (d17 + d20) / 2.0;
            double d23 = d21 * d21 + d22 * d22;
            if (d23 == 0.0) {
                Log.w((String)"PathParser", (String)" Points are coincident");
                return;
            }
            double d24 = 1.0 / d23 - 0.25;
            if (d24 < 0.0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Points are too far apart ");
                stringBuilder.append(d23);
                Log.w((String)"PathParser", (String)stringBuilder.toString());
                float f15 = (float)(Math.sqrt(d23) / 1.99999);
                ax.T.d$b.g(path, f8, f9, f10, f11, f12 * f15, f15 * f13, f14, bl, bl2);
                return;
            }
            d23 = Math.sqrt(d24);
            d21 *= d23;
            d22 = d23 * d22;
            if (bl == bl2) {
                d18 -= d22;
                d15 += d21;
            } else {
                d18 += d22;
                d15 -= d21;
            }
            d21 = Math.atan2(d17 - d15, d14 - d18);
            d17 = Math.atan2(d20 - d15, d19 - d18) - d21;
            double d25 = d17 - 0.0;
            double d26 = d25 == 0.0 ? 0 : (d25 > 0.0 ? 1 : -1);
            bl = d26 >= 0;
            d14 = d17;
            if (bl2 != bl) {
                d14 = d26 > 0 ? d17 - Math.PI * 2 : d17 + Math.PI * 2;
            }
            ax.T.d$b.f(path, (d18 *= d13) * d9 - (d15 *= d16) * d10, d18 * d10 + d15 * d9, d13, d16, d11, d12, d8, d21, d14);
        }

        @Deprecated
        public static void i(b[] bArray, Path path) {
            d.j(bArray, path);
        }

        public void h(b b8, b b9, float f8) {
            float[] fArray;
            this.a = b8.a;
            for (int i8 = 0; i8 < (fArray = b8.b).length; ++i8) {
                this.b[i8] = fArray[i8] * (1.0f - f8) + b9.b[i8] * f8;
            }
        }
    }
}

