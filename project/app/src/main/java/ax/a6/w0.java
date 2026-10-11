/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import ax.a6.B0;
import ax.a6.y0;

public final class w0
implements y0 {
    private B0 a;

    public static void b(B0 b02, B0 b03) {
        b02 = (w0)b02;
        if (((w0)b02).a == null) {
            ((w0)b02).a = b03;
            return;
        }
        throw new IllegalStateException();
    }

    @Override
    public final Object a() {
        B0 b02 = this.a;
        if (b02 != null) {
            return b02.a();
        }
        throw new IllegalStateException();
    }
}

