/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import ax.Gb.g;
import ax.Gb.l;
import ax.Ob.h;
import ax.n8.J;
import ax.n8.z;
import ax.x7.m;
import java.util.Locale;
import java.util.UUID;

public final class c {
    public static final b f = new b(null);
    private final J a;
    private final ax.Fb.a<UUID> b;
    private final String c;
    private int d;
    private z e;

    public c(J j8, ax.Fb.a<UUID> a8) {
        l.f(j8, "timeProvider");
        l.f(a8, "uuidGenerator");
        this.a = j8;
        this.b = a8;
        this.c = this.b();
        this.d = -1;
    }

    public /* synthetic */ c(J j8, ax.Fb.a a8, int n8, g g8) {
        if ((n8 & 2) != 0) {
            a8 = com.google.firebase.sessions.c$a.k0;
        }
        this(j8, a8);
    }

    private final String b() {
        String string = this.b.invoke().toString();
        l.e(string, "uuidGenerator().toString()");
        string = h.D(string, "-", "", false, 4, null).toLowerCase(Locale.ROOT);
        l.e(string, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return string;
    }

    public final z a() {
        int n8;
        this.d = n8 = this.d + 1;
        String string = n8 == 0 ? this.c : this.b();
        this.e = new z(string, this.c, this.d, this.a.a());
        return this.c();
    }

    public final z c() {
        z z8 = this.e;
        if (z8 != null) {
            return z8;
        }
        l.t("currentSession");
        return null;
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g g8) {
            this();
        }

        public final c a() {
            c c8 = m.a(ax.x7.c.a).j(c.class);
            l.e(c8, "Firebase.app[SessionGenerator::class.java]");
            return c8;
        }
    }
}

