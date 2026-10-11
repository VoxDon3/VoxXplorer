package ax.y2;

import android.graphics.Rect;
import ax.Gb.g;
import ax.Gb.l;

/* renamed from: ax.y2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3502a {
    public static final C0501a e = new C0501a(null);
    private static final C3502a f = new C3502a(0, 0, 0, 0);
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    /* renamed from: ax.y2.a$a, reason: collision with other inner class name */
    public static final class C0501a {
        public /* synthetic */ C0501a(g gVar) {
            this();
        }

        private C0501a() {
        }
    }

    public C3502a(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (i > i3) {
            throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i + ", right: " + i3).toString());
        }
        if (i2 <= i4) {
            return;
        }
        throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i2 + ", bottom: " + i4).toString());
    }

    public final Rect a() {
        return new Rect(this.a, this.b, this.c, this.d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l.a(C3502a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        l.d(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        C3502a c3502a = (C3502a) obj;
        return this.a == c3502a.a && this.b == c3502a.b && this.c == c3502a.c && this.d == c3502a.d;
    }

    public int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public String toString() {
        return C3502a.class.getSimpleName() + " { [" + this.a + ',' + this.b + ',' + this.c + ',' + this.d + "] }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3502a(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        l.f(rect, "rect");
    }
}
