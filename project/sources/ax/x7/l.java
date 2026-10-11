package ax.x7;

import ax.M5.C0821p;

/* loaded from: classes3.dex */
public class l extends Exception {
    @Deprecated
    protected l() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str) {
        super(str);
        C0821p.g(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, Throwable th) {
        super(str, th);
        C0821p.g(str, "Detail message must not be empty");
    }
}
