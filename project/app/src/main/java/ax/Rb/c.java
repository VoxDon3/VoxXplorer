/*
 * Decompiled with CFR 0.152.
 */
package ax.Rb;

import android.os.Handler;
import android.os.Looper;
import ax.Gb.g;
import ax.Gb.l;
import ax.Qb.T;
import ax.Qb.Y;
import ax.Qb.w0;
import ax.Rb.d;
import ax.wb.i;
import java.util.concurrent.CancellationException;

public final class c
extends d
implements T {
    private volatile c _immediate;
    private final Handler d0;
    private final String e0;
    private final boolean f0;
    private final c g0;

    public c(Handler handler, String string) {
        this(handler, string, false);
    }

    public /* synthetic */ c(Handler handler, String string, int n8, g g8) {
        if ((n8 & 2) != 0) {
            string = null;
        }
        this(handler, string);
    }

    private c(Handler handler, String string, boolean bl) {
        c c8;
        c c9 = null;
        super((g)null);
        this.d0 = handler;
        this.e0 = string;
        this.f0 = bl;
        if (bl) {
            c9 = this;
        }
        c9 = c8 = (this._immediate = c9);
        if (c8 == null) {
            this._immediate = c9 = new c(handler, string, true);
        }
        this.g0 = c9;
    }

    private final void b1(i i8, Runnable runnable2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The task was rejected, the handler underlying the dispatcher '");
        stringBuilder.append(this);
        stringBuilder.append("' was closed");
        w0.c(i8, new CancellationException(stringBuilder.toString()));
        Y.b().b(i8, runnable2);
    }

    @Override
    public void b(i i8, Runnable runnable2) {
        if (!this.d0.post(runnable2)) {
            this.b1(i8, runnable2);
        }
    }

    public c c1() {
        return this.g0;
    }

    public boolean equals(Object object) {
        return object instanceof c && ((c)object).d0 == this.d0;
    }

    @Override
    public boolean f(i i8) {
        return !this.f0 || !l.a(Looper.myLooper(), this.d0.getLooper());
        {
        }
    }

    public int hashCode() {
        return System.identityHashCode(this.d0);
    }

    @Override
    public String toString() {
        String string = this.a1();
        CharSequence charSequence = string;
        if (string == null) {
            charSequence = this.e0;
            string = charSequence;
            if (charSequence == null) {
                string = this.d0.toString();
            }
            charSequence = string;
            if (this.f0) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(string);
                ((StringBuilder)charSequence).append(".immediate");
                charSequence = ((StringBuilder)charSequence).toString();
            }
        }
        return charSequence;
    }
}

