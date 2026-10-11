/*
 * Decompiled with CFR 0.152.
 */
package ax.z2;

import android.graphics.Rect;
import ax.Gb.l;

public final class a {
    private final ax.y2.a a;
    private final float b;

    public a(Rect rect, float f8) {
        l.f(rect, "bounds");
        this(new ax.y2.a(rect), f8);
    }

    public a(ax.y2.a a8, float f8) {
        l.f(a8, "_bounds");
        this.a = a8;
        this.b = f8;
    }

    public final Rect a() {
        return this.a.a();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        Class<?> clazz = object != null ? object.getClass() : null;
        if (!l.a(a.class, clazz)) {
            return false;
        }
        l.d(object, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        object = (a)object;
        if (!l.a(this.a, ((a)object).a)) {
            return false;
        }
        return this.b == ((a)object).b;
    }

    public int hashCode() {
        return this.a.hashCode() * 31 + Float.floatToIntBits(this.b);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("WindowMetrics(_bounds=");
        stringBuilder.append(this.a);
        stringBuilder.append(", density=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

