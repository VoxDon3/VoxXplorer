package j$.util;

import java.util.RandomAccess;

/* renamed from: j$.util.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3813i extends C3811g implements RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    @Override // j$.util.C3811g, java.util.List
    public final java.util.List subList(int i, int i2) {
        C3813i c3813i;
        synchronized (this.b) {
            c3813i = new C3813i(this.c.subList(i, i2), this.b);
        }
        return c3813i;
    }

    private Object writeReplace() {
        return new C3811g(this.c);
    }
}
