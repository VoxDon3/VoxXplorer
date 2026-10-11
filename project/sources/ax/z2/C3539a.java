package ax.z2;

import android.graphics.Rect;
import ax.Gb.l;
import ax.y2.C3502a;

/* renamed from: ax.z2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3539a {
    private final C3502a a;
    private final float b;

    public C3539a(C3502a c3502a, float f) {
        l.f(c3502a, "_bounds");
        this.a = c3502a;
        this.b = f;
    }

    public final Rect a() {
        return this.a.a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l.a(C3539a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        l.d(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        C3539a c3539a = (C3539a) obj;
        return l.a(this.a, c3539a.a) && this.b == c3539a.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Float.floatToIntBits(this.b);
    }

    public String toString() {
        return "WindowMetrics(_bounds=" + this.a + ", density=" + this.b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3539a(Rect rect, float f) {
        this(new C3502a(rect), f);
        l.f(rect, "bounds");
    }
}
