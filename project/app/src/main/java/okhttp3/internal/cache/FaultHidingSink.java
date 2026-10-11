/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.cache;

import ax.Gb.l;
import ax.sb.t;
import ax.xc.A;
import ax.xc.e;
import ax.xc.j;
import java.io.IOException;

public class FaultHidingSink
extends j {
    private boolean hasErrors;
    private final ax.Fb.l<IOException, t> onException;

    public FaultHidingSink(A a8, ax.Fb.l<? super IOException, t> l8) {
        l.f(a8, "delegate");
        l.f(l8, "onException");
        super(a8);
        this.onException = l8;
    }

    @Override
    public void close() {
        if (!this.hasErrors) {
            try {
                super.close();
                return;
            }
            catch (IOException iOException) {
                this.hasErrors = true;
                this.onException.invoke(iOException);
            }
        }
    }

    @Override
    public void flush() {
        if (!this.hasErrors) {
            try {
                super.flush();
                return;
            }
            catch (IOException iOException) {
                this.hasErrors = true;
                this.onException.invoke(iOException);
            }
        }
    }

    public final ax.Fb.l<IOException, t> getOnException() {
        return this.onException;
    }

    @Override
    public void write(e e8, long l8) {
        l.f(e8, "source");
        if (this.hasErrors) {
            e8.skip(l8);
            return;
        }
        try {
            super.write(e8, l8);
            return;
        }
        catch (IOException iOException) {
            this.hasErrors = true;
            this.onException.invoke(iOException);
            return;
        }
    }
}

