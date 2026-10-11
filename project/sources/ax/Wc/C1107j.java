package ax.Wc;

import java.io.IOException;

/* renamed from: ax.Wc.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1107j extends IOException {
    private Throwable q;

    C1107j(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.q;
    }

    C1107j(String str, Throwable th) {
        super(str);
        this.q = th;
    }
}
