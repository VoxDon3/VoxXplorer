/*
 * Decompiled with CFR 0.152.
 */
package ax.Xd;

import ax.Xd.d;
import ax.Yd.b;

public final class c {
    public static boolean a(d object, b b8) {
        int n8 = b8.h();
        if (n8 != 0) {
            if (n8 != 10) {
                if (n8 != 20) {
                    if (n8 != 30) {
                        if (n8 == 40) {
                            return object.j();
                        }
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Level [");
                        ((StringBuilder)object).append((Object)b8);
                        ((StringBuilder)object).append("] not recognized.");
                        throw new IllegalArgumentException(((StringBuilder)object).toString());
                    }
                    return object.c();
                }
                return object.l();
            }
            return object.e();
        }
        return object.o();
    }
}

