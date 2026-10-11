package ax.Wc;

import java.io.IOException;

/* loaded from: classes3.dex */
abstract class O extends K {
    final I b;

    O(Class cls, int i) {
        super(cls);
        this.b = I.a(0, i);
    }

    final A a(A a) {
        if (this.a.isInstance(a)) {
            return a;
        }
        throw new IllegalStateException("unexpected object: " + a.getClass().getName());
    }

    final A b(byte[] bArr) throws IOException {
        return a(A.z(bArr));
    }

    A c(D d) {
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }

    A d(C1127t0 c1127t0) {
        throw new IllegalStateException("unexpected implicit primitive encoding");
    }

    final A e(J j, boolean z) {
        if (128 == j.K()) {
            return a(j.G(z, this));
        }
        throw new IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }
}
