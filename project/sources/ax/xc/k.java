package ax.xc;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class k implements C, AutoCloseable {
    private final C delegate;

    public k(C c) {
        ax.Gb.l.f(c, "delegate");
        this.delegate = c;
    }

    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final C m3deprecated_delegate() {
        return this.delegate;
    }

    @Override // ax.xc.C, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final C delegate() {
        return this.delegate;
    }

    @Override // ax.xc.C
    public long read(C3487e c3487e, long j) throws IOException {
        ax.Gb.l.f(c3487e, "sink");
        return this.delegate.read(c3487e, j);
    }

    @Override // ax.xc.C
    public D timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
