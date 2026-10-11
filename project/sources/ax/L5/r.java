package ax.L5;

import android.os.Looper;
import ax.K5.a;
import com.google.android.gms.common.api.internal.AbstractC3608b;

/* loaded from: classes3.dex */
public final class r extends o {
    private final ax.K5.f c;

    public r(ax.K5.f fVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.c = fVar;
    }

    @Override // ax.K5.g
    public final <A extends a.b, T extends AbstractC3608b<? extends ax.K5.l, A>> T a(T t) {
        return (T) this.c.h(t);
    }

    @Override // ax.K5.g
    public final Looper c() {
        return this.c.m();
    }
}
