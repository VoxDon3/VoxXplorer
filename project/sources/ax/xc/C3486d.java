package ax.xc;

/* renamed from: ax.xc.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3486d implements InterfaceC3482A, AutoCloseable {
    @Override // ax.xc.InterfaceC3482A
    public D timeout() {
        return D.NONE;
    }

    @Override // ax.xc.InterfaceC3482A
    public void write(C3487e c3487e, long j) {
        ax.Gb.l.f(c3487e, "source");
        c3487e.skip(j);
    }

    @Override // ax.xc.InterfaceC3482A, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    @Override // ax.xc.InterfaceC3482A, java.io.Flushable
    public void flush() {
    }
}
