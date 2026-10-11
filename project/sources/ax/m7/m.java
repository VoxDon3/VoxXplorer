package ax.m7;

import ax.q7.C2880g;

/* loaded from: classes3.dex */
public final class m {
    private final C2880g a;

    private m(C2880g c2880g) {
        this.a = c2880g;
    }

    public static m b(char c) {
        return new m(C2880g.f(c));
    }

    public final String a(Iterable<?> iterable) {
        return this.a.d(iterable);
    }
}
