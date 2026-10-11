/*
 * Decompiled with CFR 0.152.
 */
package ax.s9;

import ax.K8.a;
import ax.N8.y;
import ax.Q8.i;
import ax.Q8.t;
import ax.R8.s;
import ax.s9.b;
import ax.s9.c;
import ax.s9.e;
import ax.s9.l;
import ax.s9.n;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Future;

public class d
extends b {
    private static final n i0 = new n(){

        @Override
        public boolean a(long l8) {
            return l8 == a.c0.getValue() || l8 == a.p0.getValue();
            {
            }
        }
    };
    private final l h0;

    d(i i8, c c8, ax.k9.e e8) {
        super(i8, c8, e8);
        this.h0 = new l(c8, i8, e8.h());
    }

    public OutputStream F0(boolean bl) {
        l l8 = this.h0;
        long l9 = bl ? this.u(y.class).a() : 0L;
        return l8.a(l9);
    }

    public int L0(byte[] byArray, long l8, int n8, int n9) {
        Object object = ((c)this.c0).A(this.d0, l8, n9);
        if (((t)((ax.h9.d)object).c()).m() == a.q0.getValue()) {
            return -1;
        }
        object = ((s)object).n();
        n9 = Math.min(n9, ((Object)object).length);
        System.arraycopy(object, 0, byArray, n8, n9);
        return n9;
    }

    Future<s> M0(long l8, int n8) {
        return ((c)this.c0).F(this.d0, l8, n8);
    }

    public long T0(byte[] byArray, long l8, int n8, int n9) {
        return this.h0.c(byArray, l8, n8, n9);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("File{fileId=");
        stringBuilder.append(this.d0);
        stringBuilder.append(", fileName='");
        stringBuilder.append(this.e0.h());
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public InputStream u0(long l8, ax.i9.b b8, long l9) {
        return new e(this, ((c)this.c0).d(), ((c)this.c0).e(), l8, b8, l9);
    }
}

