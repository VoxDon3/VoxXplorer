package ax.xc;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class j implements InterfaceC3482A, AutoCloseable {
    private final InterfaceC3482A delegate;

    public j(InterfaceC3482A interfaceC3482A) {
        ax.Gb.l.f(interfaceC3482A, "delegate");
        this.delegate = interfaceC3482A;
    }

    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final InterfaceC3482A m2deprecated_delegate() {
        return this.delegate;
    }

    @Override // ax.xc.InterfaceC3482A, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws IOException {
        this.delegate.close();
    }

    public final InterfaceC3482A delegate() {
        return this.delegate;
    }

    @Override // ax.xc.InterfaceC3482A, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // ax.xc.InterfaceC3482A
    public D timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // ax.xc.InterfaceC3482A
    public void write(C3487e c3487e, long j) throws IOException {
        ax.Gb.l.f(c3487e, "source");
        this.delegate.write(c3487e, j);
    }
}
