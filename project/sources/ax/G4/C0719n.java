package ax.G4;

import ax.p4.C2772i;
import ax.p4.C2773j;
import ax.x4.AbstractC3432c;

/* renamed from: ax.G4.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0719n extends AbstractC3432c<C0730t> {
    private final C0703f c;
    private final String d;
    private String e;

    C0719n(C0703f c0703f, String str) {
        if (c0703f == null) {
            throw new NullPointerException("_client");
        }
        this.c = c0703f;
        this.d = str;
        this.e = null;
    }

    public C2772i<C0730t> c() throws C0723p, C2773j {
        return this.c.g(new C0717m(this.d, this.e), a());
    }
}
