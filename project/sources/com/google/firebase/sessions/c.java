package com.google.firebase.sessions;

import ax.Gb.g;
import ax.Gb.j;
import ax.Gb.l;
import ax.Ob.h;
import ax.n8.C2623z;
import ax.n8.InterfaceC2596J;
import ax.x7.C3468c;
import ax.x7.m;
import java.util.Locale;
import java.util.UUID;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class c {
    public static final b f = new b(null);
    private final InterfaceC2596J a;
    private final ax.Fb.a<UUID> b;
    private final String c;
    private int d;
    private C2623z e;

    /* synthetic */ class a extends j implements ax.Fb.a<UUID> {
        public static final a k0 = new a();

        a() {
            super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
        }

        @Override // ax.Fb.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    public static final class b {
        public /* synthetic */ b(g gVar) {
            this();
        }

        public final c a() {
            Object j = m.a(C3468c.a).j(c.class);
            l.e(j, "Firebase.app[SessionGenerator::class.java]");
            return (c) j;
        }

        private b() {
        }
    }

    public c(InterfaceC2596J interfaceC2596J, ax.Fb.a<UUID> aVar) {
        l.f(interfaceC2596J, "timeProvider");
        l.f(aVar, "uuidGenerator");
        this.a = interfaceC2596J;
        this.b = aVar;
        this.c = b();
        this.d = -1;
    }

    private final String b() {
        String uuid = this.b.invoke().toString();
        l.e(uuid, "uuidGenerator().toString()");
        String lowerCase = h.D(uuid, "-", HttpUrl.FRAGMENT_ENCODE_SET, false, 4, null).toLowerCase(Locale.ROOT);
        l.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final C2623z a() {
        int i = this.d + 1;
        this.d = i;
        this.e = new C2623z(i == 0 ? this.c : b(), this.c, this.d, this.a.a());
        return c();
    }

    public final C2623z c() {
        C2623z c2623z = this.e;
        if (c2623z != null) {
            return c2623z;
        }
        l.t("currentSession");
        return null;
    }

    public /* synthetic */ c(InterfaceC2596J interfaceC2596J, ax.Fb.a aVar, int i, g gVar) {
        this(interfaceC2596J, (i & 2) != 0 ? a.k0 : aVar);
    }
}
