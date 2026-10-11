package ax.n0;

import java.io.IOException;

/* renamed from: ax.n0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2567a extends IOException {
    public /* synthetic */ C2567a(String str, Throwable th, int i, ax.Gb.g gVar) {
        this(str, (i & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2567a(String str, Throwable th) {
        super(str, th);
        ax.Gb.l.f(str, "message");
    }
}
