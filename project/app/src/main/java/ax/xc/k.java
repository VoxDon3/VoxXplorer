/*
 * Decompiled with CFR 0.152.
 */
package ax.xc;

import ax.Gb.l;
import ax.xc.C;
import ax.xc.D;
import ax.xc.e;
import java.io.IOException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class k
implements C,
AutoCloseable {
    private final C delegate;

    public k(C c8) {
        l.f(c8, "delegate");
        this.delegate = c8;
    }

    public final C -deprecated_delegate() {
        return this.delegate;
    }

    @Override
    public void close() throws IOException {
        this.delegate.close();
    }

    public final C delegate() {
        return this.delegate;
    }

    @Override
    public long read(e e8, long l8) throws IOException {
        l.f(e8, "sink");
        return this.delegate.read(e8, l8);
    }

    @Override
    public D timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append('(');
        stringBuilder.append(this.delegate);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

