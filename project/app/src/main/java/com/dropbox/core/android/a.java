/*
 * Decompiled with CFR 0.152.
 */
package com.dropbox.core.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import ax.Gb.g;
import ax.Gb.l;
import ax.p4.k;
import ax.p4.m;
import ax.p4.q;
import ax.p4.z;
import ax.w4.f;
import com.dropbox.core.android.AuthActivity;
import java.util.Arrays;
import java.util.Collection;

public final class a {
    public static final a a = new a(null);

    public static final ax.u4.a a() {
        return a.a();
    }

    public static final void b(Context context, String string, m m8) {
        a.c(context, string, m8);
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        private final void b(Context context, String string, String string2, String[] stringArray, String string3, String string4, z z8, m m8, k k8, Collection<String> object, q q8) {
            AuthActivity.b b8 = AuthActivity.c;
            l.c(string);
            if (!b8.c(context, string, true)) {
                return;
            }
            if (stringArray != null && Arrays.asList(Arrays.copyOf(stringArray, stringArray.length)).contains(string2)) {
                throw new IllegalArgumentException("desiredUid cannot be present in alreadyAuthedUids");
            }
            object = object != null ? f.e(object, " ") : null;
            string = b8.f(context, string, string2, stringArray, string3, string4, "1", z8, m8, k8, (String)object, q8);
            if (!(context instanceof Activity)) {
                string.addFlags(0x10000000);
            }
            context.startActivity((Intent)string);
        }

        public static /* synthetic */ void f(a a8, Context context, String string, m m8, Collection collection, int n8, Object object) {
            if ((n8 & 8) != 0) {
                collection = null;
            }
            a8.e(context, string, m8, collection);
        }

        public final ax.u4.a a() {
            Intent intent = AuthActivity.g;
            Long l8 = null;
            if (intent == null) {
                return null;
            }
            String string = intent.getStringExtra("ACCESS_TOKEN");
            String string2 = intent.getStringExtra("ACCESS_SECRET");
            String string3 = intent.getStringExtra("UID");
            if (!(string == null || l.a("", string) || string2 == null || l.a("", string2) || string3 == null || l.a("", string3))) {
                string = intent.getStringExtra("CONSUMER_KEY");
                string3 = intent.getStringExtra("REFRESH_TOKEN");
                long l9 = intent.getLongExtra("EXPIRES_AT", -1L);
                if (l9 >= 0L) {
                    l8 = l9;
                }
                return new ax.u4.a(string2, l8, string3, string);
            }
            return null;
        }

        public final void c(Context context, String string, m m8) {
            l.f(context, "context");
            com.dropbox.core.android.a$a.f(this, context, string, m8, null, 8, null);
        }

        public final void d(Context context, String string, m m8, k k8, Collection<String> collection) {
            l.f(context, "context");
            if (m8 != null) {
                this.b(context, string, null, null, null, null, z.d0, m8, k8, collection, null);
                return;
            }
            throw new IllegalArgumentException("Invalid Dbx requestConfig for PKCE flow.");
        }

        public final void e(Context context, String string, m m8, Collection<String> collection) {
            l.f(context, "context");
            this.d(context, string, m8, null, collection);
        }
    }
}

