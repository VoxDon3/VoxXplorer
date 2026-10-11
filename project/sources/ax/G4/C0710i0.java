package ax.G4;

import ax.G4.C0708h0;
import ax.p4.C2773j;

/* renamed from: ax.G4.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0710i0 {
    private final C0703f a;
    private final C0708h0.a b;

    C0710i0(C0703f c0703f, C0708h0.a aVar) {
        if (c0703f == null) {
            throw new NullPointerException("_client");
        }
        this.a = c0703f;
        if (aVar == null) {
            throw new NullPointerException("_builder");
        }
        this.b = aVar;
    }

    public C0712j0 a() throws C0696b0, C2773j {
        return this.a.s(this.b.a());
    }

    public C0710i0 b(C0704f0 c0704f0) {
        this.b.b(c0704f0);
        return this;
    }
}
