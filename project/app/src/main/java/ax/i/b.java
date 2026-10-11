/*
 * Decompiled with CFR 0.152.
 */
package ax.i;

import android.window.BackEvent;
import ax.Gb.g;
import ax.Gb.l;

public final class b {
    public static final a e = new a(null);
    private final float a;
    private final float b;
    private final float c;
    private final int d;

    public b(float f8, float f9, float f10, int n8) {
        this.a = f8;
        this.b = f9;
        this.c = f10;
        this.d = n8;
    }

    public b(BackEvent backEvent) {
        l.f(backEvent, "backEvent");
        ax.i.a a8 = ax.i.a.a;
        this(a8.d(backEvent), a8.e(backEvent), a8.b(backEvent), a8.c(backEvent));
    }

    public final float a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BackEventCompat{touchX=");
        stringBuilder.append(this.a);
        stringBuilder.append(", touchY=");
        stringBuilder.append(this.b);
        stringBuilder.append(", progress=");
        stringBuilder.append(this.c);
        stringBuilder.append(", swipeEdge=");
        stringBuilder.append(this.d);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }
}

