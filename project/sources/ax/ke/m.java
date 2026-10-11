package ax.ke;

import j$.util.Objects;

/* loaded from: classes3.dex */
public class m extends RuntimeException {
    private final String c0;
    private final transient D<?> d0;
    private final int q;

    public m(D<?> d) {
        super(a(d));
        this.q = d.b();
        this.c0 = d.f();
        this.d0 = d;
    }

    private static String a(D<?> d) {
        Objects.requireNonNull(d, "response == null");
        return "HTTP " + d.b() + " " + d.f();
    }
}
