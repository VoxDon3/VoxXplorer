package ax.d7;

import ax.m7.v;
import java.io.IOException;

/* renamed from: ax.d7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1944b extends IOException {
    public C1944b(ax.D5.a aVar) {
        initCause((Throwable) v.d(aVar));
    }

    @Override // java.lang.Throwable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ax.D5.a getCause() {
        return (ax.D5.a) super.getCause();
    }
}
