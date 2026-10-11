package ax.W5;

import android.content.Context;

/* renamed from: ax.W5.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1054o extends M {
    private final Context a;
    private final W b;

    C1054o(Context context, W w) {
        this.a = context;
        this.b = w;
    }

    @Override // ax.W5.M
    final Context a() {
        return this.a;
    }

    @Override // ax.W5.M
    final W b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof M) {
            M m = (M) obj;
            if (this.a.equals(m.a()) && this.b.equals(m.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "FlagsContext{context=" + this.a.toString() + ", hermeticFileOverrides=" + this.b.toString() + "}";
    }
}
