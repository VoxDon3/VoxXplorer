package okhttp3.internal.cache;

import ax.Fb.l;
import ax.sb.t;
import ax.xc.C3487e;
import ax.xc.InterfaceC3482A;
import ax.xc.j;
import java.io.IOException;

/* loaded from: classes3.dex */
public class FaultHidingSink extends j {
    private boolean hasErrors;
    private final l<IOException, t> onException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaultHidingSink(InterfaceC3482A interfaceC3482A, l<? super IOException, t> lVar) {
        super(interfaceC3482A);
        ax.Gb.l.f(interfaceC3482A, "delegate");
        ax.Gb.l.f(lVar, "onException");
        this.onException = lVar;
    }

    @Override // ax.xc.j, ax.xc.InterfaceC3482A, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    @Override // ax.xc.j, ax.xc.InterfaceC3482A, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    public final l<IOException, t> getOnException() {
        return this.onException;
    }

    @Override // ax.xc.j, ax.xc.InterfaceC3482A
    public void write(C3487e c3487e, long j) {
        ax.Gb.l.f(c3487e, "source");
        if (this.hasErrors) {
            c3487e.skip(j);
            return;
        }
        try {
            super.write(c3487e, j);
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }
}
