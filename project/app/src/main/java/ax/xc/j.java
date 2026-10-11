/*
 * Decompiled with CFR 0.152.
 */
package ax.xc;

import ax.Gb.l;
import ax.xc.A;
import ax.xc.D;
import ax.xc.e;
import java.io.IOException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class j
implements A,
AutoCloseable {
    private final A delegate;

    public j(A a8) {
        l.f(a8, "delegate");
        this.delegate = a8;
    }

    public final A -deprecated_delegate() {
        return this.delegate;
    }

    @Override
    public void close() throws IOException {
        this.delegate.close();
    }

    public final A delegate() {
        return this.delegate;
    }

    @Override
    public void flush() throws IOException {
        this.delegate.flush();
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

    @Override
    public void write(e e8, long l8) throws IOException {
        l.f(e8, "source");
        this.delegate.write(e8, l8);
    }
}

