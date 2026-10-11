package ax.L5;

import ax.K5.a;
import ax.K5.a.d;
import ax.M5.C0819n;

/* renamed from: ax.L5.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0790b<O extends a.d> {
    private final int a;
    private final ax.K5.a b;
    private final a.d c;
    private final String d;

    private C0790b(ax.K5.a aVar, a.d dVar, String str) {
        this.b = aVar;
        this.c = dVar;
        this.d = str;
        this.a = C0819n.c(aVar, dVar, str);
    }

    public static <O extends a.d> C0790b<O> a(ax.K5.a<O> aVar, O o, String str) {
        return new C0790b<>(aVar, o, str);
    }

    public final String b() {
        return this.b.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0790b)) {
            return false;
        }
        C0790b c0790b = (C0790b) obj;
        return C0819n.b(this.b, c0790b.b) && C0819n.b(this.c, c0790b.c) && C0819n.b(this.d, c0790b.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
