/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.D;
import ax.Wc.I;
import ax.Wc.J;
import ax.Wc.K;
import ax.Wc.t0;
import java.io.IOException;

abstract class O
extends K {
    final I b;

    O(Class clazz, int n8) {
        super(clazz);
        this.b = I.a(0, n8);
    }

    final A a(A a8) {
        if (this.a.isInstance(a8)) {
            return a8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("unexpected object: ");
        stringBuilder.append(a8.getClass().getName());
        throw new IllegalStateException(stringBuilder.toString());
    }

    final A b(byte[] byArray) throws IOException {
        return this.a(A.z(byArray));
    }

    A c(D d8) {
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }

    A d(t0 t02) {
        throw new IllegalStateException("unexpected implicit primitive encoding");
    }

    final A e(J j8, boolean bl) {
        if (128 == j8.K()) {
            return this.a(j8.G(bl, this));
        }
        throw new IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }
}

