/*
 * Decompiled with CFR 0.152.
 */
package ax.xc;

import ax.Gb.l;
import ax.xc.C;
import ax.xc.D;
import ax.xc.e;
import ax.xc.p;
import ax.xc.x;
import ax.xc.y;
import java.io.IOException;
import java.io.InputStream;

class o
implements C,
AutoCloseable {
    private final D c0;
    private final InputStream q;

    public o(InputStream inputStream, D d8) {
        l.f(inputStream, "input");
        l.f(d8, "timeout");
        this.q = inputStream;
        this.c0 = d8;
    }

    @Override
    public void close() {
        this.q.close();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public long read(e object, long l8) {
        AssertionError assertionError2;
        block5: {
            l.f(object, "sink");
            long l9 = l8 - 0L;
            long l10 = l9 == 0L ? 0 : (l9 < 0L ? -1 : 1);
            if (l10 == false) {
                return 0L;
            }
            if (l10 < 0) {
                object = new StringBuilder();
                ((StringBuilder)object).append("byteCount < 0: ");
                ((StringBuilder)object).append(l8);
                throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
            }
            try {
                this.c0.throwIfReached();
                x x8 = ((e)object).e1(1);
                l10 = (int)Math.min(l8, (long)(8192 - x8.c));
                l10 = this.q.read(x8.a, x8.c, (int)l10);
                if (l10 == -1) {
                    if (x8.b != x8.c) return -1L;
                    ((e)object).q = x8.b();
                    y.b(x8);
                    return -1L;
                }
            }
            catch (AssertionError assertionError2) {
                break block5;
            }
            x8.c += l10;
            l8 = ((e)object).size();
            long l11 = l10;
            ((e)object).b1(l8 + l11);
            return l11;
        }
        if (!p.e(assertionError2)) throw assertionError2;
        throw new IOException((Throwable)((Object)assertionError2));
    }

    @Override
    public D timeout() {
        return this.c0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("source(");
        stringBuilder.append(this.q);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

