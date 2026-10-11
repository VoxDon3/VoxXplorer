package ax.f7;

import ax.i7.q;
import ax.i7.r;
import ax.i7.w;
import ax.m7.v;

/* renamed from: ax.f7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2079a {
    private final q a;
    private final w b;
    private boolean c = false;
    private int d = 33554432;
    private EnumC0310a e = EnumC0310a.NOT_STARTED;
    private long f = -1;

    /* renamed from: ax.f7.a$a, reason: collision with other inner class name */
    public enum EnumC0310a {
        NOT_STARTED,
        MEDIA_IN_PROGRESS,
        MEDIA_COMPLETE
    }

    public C2079a(w wVar, r rVar) {
        this.b = (w) v.d(wVar);
        this.a = rVar == null ? wVar.c() : wVar.d(rVar);
    }
}
