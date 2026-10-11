/*
 * Decompiled with CFR 0.152.
 */
package ax.C3;

import android.util.Log;
import ax.C3.c;
import java.io.InputStream;

public class a {
    /*
     * Enabled aggressive block sorting
     */
    public static int a(InputStream object, long l8) {
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        block17: {
            block16: {
                if (object == null) {
                    return 0;
                }
                if (a.b((c)(object = new c((InputStream)object, 16, false)), l8, 1)) {
                    if (((c)object).c(0) != -1) return 0;
                    if (((c)object).c(1) != -40) return 0;
                }
                n12 = 0;
                while (true) {
                    n11 = n12;
                    if (!a.b((c)object, l8, n12 + 3)) return 0;
                    n11 = n10 = n12 + 1;
                    if ((((c)object).c(n12) & 0xFF) != 255) return 0;
                    n9 = ((c)object).c(n10) & 0xFF;
                    if (n9 == 255) {
                        n11 = n10;
                    } else {
                        n11 = n10 = n12 + 2;
                        if (n9 != 216) {
                            if (n9 == 1) {
                                n11 = n10;
                            } else {
                                if (n9 == 217 || n9 == 218) break block16;
                                n8 = a.c((c)object, n10, 2, false);
                                if (n8 < 2 || !a.b((c)object, l8, (n11 = n10 + n8) - 1)) break;
                                if (n9 == 225 && n8 >= 8 && a.c((c)object, n12 + 4, 4, false) == 1165519206 && a.c((c)object, n12 + 8, 2, false) == 0) break block17;
                                ((c)object).a(n11 - 4);
                            }
                        }
                    }
                    n12 = n11;
                }
                Log.e((String)"CameraExif", (String)"Invalid length");
                return 0;
            }
            ((c)object).a(n12 - 2);
            n11 = n10;
            return 0;
        }
        n10 = n8 - 8;
        ((c)object).a(n12 + 6);
        n11 = n12 + 10;
        n12 = n10;
        if (n12 <= 8) return 0;
        n10 = a.c((c)object, n11, 4, false);
        if (n10 != 1229531648 && n10 != 1296891946) {
            Log.e((String)"CameraExif", (String)"Invalid byte order");
            return 0;
        }
        boolean bl = n10 == 1229531648;
        if ((n10 = a.c((c)object, n11 + 4, 4, bl) + 2) >= 10 && n10 <= n12) {
            n9 = n11 + n10;
            n10 = n12 - n10;
            ((c)object).a(n9 - 4);
            n11 = a.c((c)object, n9 - 2, 2, bl);
            n12 = n9;
            while (n11 > 0) {
                if (n10 < 12) return 0;
                if (a.c((c)object, n12, 2, bl) == 274) {
                    n11 = a.c((c)object, n12 + 8, 2, bl);
                    if (n11 == 1) {
                        return 0;
                    }
                    if (n11 == 3) {
                        return 180;
                    }
                    if (n11 == 6) {
                        return 90;
                    }
                    if (n11 == 8) return 270;
                    Log.i((String)"CameraExif", (String)"Unsupported orientation");
                    return 0;
                }
                n10 -= 12;
                ((c)object).a(n12 + 8);
                n12 += 12;
                --n11;
            }
            return 0;
        }
        Log.e((String)"CameraExif", (String)"Invalid offset");
        return 0;
    }

    private static boolean b(c c8, long l8, int n8) {
        if (l8 >= 0L) {
            return (long)n8 < l8;
        }
        return c8.d(n8);
    }

    private static int c(c c8, int n8, int n9, boolean bl) {
        int n10;
        if (bl) {
            n8 += n9 - 1;
            n10 = -1;
        } else {
            n10 = 1;
        }
        int n11 = 0;
        while (n9 > 0) {
            n11 = c8.c(n8) & 0xFF | n11 << 8;
            n8 += n10;
            --n9;
        }
        return n11;
    }
}

