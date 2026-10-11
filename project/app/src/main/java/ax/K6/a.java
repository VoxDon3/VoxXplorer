/*
 * Decompiled with CFR 0.152.
 */
package ax.K6;

import android.graphics.Typeface;
import ax.K6.g;

public final class a
extends g {
    private final Typeface a;
    private final a b;
    private boolean c;

    public a(a a8, Typeface typeface) {
        this.a = typeface;
        this.b = a8;
    }

    private void d(Typeface typeface) {
        if (!this.c) {
            this.b.a(typeface);
        }
    }

    @Override
    public void a(int n8) {
        this.d(this.a);
    }

    @Override
    public void b(Typeface typeface, boolean bl) {
        this.d(typeface);
    }

    public void c() {
        this.c = true;
    }

    public static interface a {
        public void a(Typeface var1);
    }
}

