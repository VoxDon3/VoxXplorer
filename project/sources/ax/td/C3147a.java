package ax.td;

import java.io.IOException;

/* renamed from: ax.td.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3147a extends IOException {
    private Throwable q;

    public C3147a(String str, Throwable th) {
        super(str);
        this.q = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.q;
    }
}
