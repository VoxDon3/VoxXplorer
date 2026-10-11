/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import ax.Gb.l;
import ax.x7.c;
import ax.x7.m;

public interface a {
    public static final a a = com.google.firebase.sessions.a$a.a;

    public String a();

    public void b(String var1);

    public static final class a {
        static final a a = new a();

        private a() {
        }

        public final a a() {
            a a8 = m.a(c.a).j(a.class);
            l.e(a8, "Firebase.app[SessionDatastore::class.java]");
            return a8;
        }
    }
}

