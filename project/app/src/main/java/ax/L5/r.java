/*
 * Decompiled with CFR 0.152.
 */
package ax.L5;

import android.os.Looper;
import ax.K5.a;
import ax.K5.f;
import ax.K5.l;
import ax.L5.o;
import com.google.android.gms.common.api.internal.b;

public final class r
extends o {
    private final f c;

    public r(f f8) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.c = f8;
    }

    @Override
    public final <A extends a.b, T extends b<? extends l, A>> T a(T t8) {
        return this.c.h(t8);
    }

    @Override
    public final Looper c() {
        return this.c.m();
    }
}

