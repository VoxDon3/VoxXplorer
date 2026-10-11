package ax.K5;

import ax.J5.C0744e;

/* loaded from: classes3.dex */
public final class n extends UnsupportedOperationException {
    private final C0744e q;

    public n(C0744e c0744e) {
        this.q = c0744e;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.q));
    }
}
