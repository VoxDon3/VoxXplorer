package com.dropbox.core.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import ax.Gb.g;
import ax.Gb.l;
import ax.p4.C2774k;
import ax.p4.m;
import ax.p4.q;
import ax.p4.z;
import ax.u4.C3206a;
import ax.w4.C3346f;
import com.dropbox.core.android.AuthActivity;
import java.util.Arrays;
import java.util.Collection;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class a {
    public static final C0544a a = new C0544a(null);

    /* renamed from: com.dropbox.core.android.a$a, reason: collision with other inner class name */
    public static final class C0544a {
        public /* synthetic */ C0544a(g gVar) {
            this();
        }

        private final void b(Context context, String str, String str2, String[] strArr, String str3, String str4, z zVar, m mVar, C2774k c2774k, Collection<String> collection, q qVar) {
            String str5;
            AuthActivity.b bVar = AuthActivity.c;
            l.c(str);
            if (bVar.c(context, str, true)) {
                if (strArr != null) {
                    str5 = str2;
                    if (Arrays.asList(Arrays.copyOf(strArr, strArr.length)).contains(str5)) {
                        throw new IllegalArgumentException("desiredUid cannot be present in alreadyAuthedUids");
                    }
                } else {
                    str5 = str2;
                }
                Intent f = bVar.f(context, str, str5, strArr, str3, str4, "1", zVar, mVar, c2774k, collection != null ? C3346f.e(collection, " ") : null, qVar);
                if (!(context instanceof Activity)) {
                    f.addFlags(268435456);
                }
                context.startActivity(f);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void f(C0544a c0544a, Context context, String str, m mVar, Collection collection, int i, Object obj) {
            if ((i & 8) != 0) {
                collection = null;
            }
            c0544a.e(context, str, mVar, collection);
        }

        public final C3206a a() {
            Intent intent = AuthActivity.g;
            if (intent == null) {
                return null;
            }
            String stringExtra = intent.getStringExtra("ACCESS_TOKEN");
            String stringExtra2 = intent.getStringExtra("ACCESS_SECRET");
            String stringExtra3 = intent.getStringExtra("UID");
            if (stringExtra == null || l.a(HttpUrl.FRAGMENT_ENCODE_SET, stringExtra) || stringExtra2 == null || l.a(HttpUrl.FRAGMENT_ENCODE_SET, stringExtra2) || stringExtra3 == null || l.a(HttpUrl.FRAGMENT_ENCODE_SET, stringExtra3)) {
                return null;
            }
            String stringExtra4 = intent.getStringExtra("CONSUMER_KEY");
            String stringExtra5 = intent.getStringExtra("REFRESH_TOKEN");
            long longExtra = intent.getLongExtra("EXPIRES_AT", -1L);
            return new C3206a(stringExtra2, longExtra >= 0 ? Long.valueOf(longExtra) : null, stringExtra5, stringExtra4);
        }

        public final void c(Context context, String str, m mVar) {
            l.f(context, "context");
            f(this, context, str, mVar, null, 8, null);
        }

        public final void d(Context context, String str, m mVar, C2774k c2774k, Collection<String> collection) {
            l.f(context, "context");
            if (mVar == null) {
                throw new IllegalArgumentException("Invalid Dbx requestConfig for PKCE flow.");
            }
            b(context, str, null, null, null, null, z.OFFLINE, mVar, c2774k, collection, null);
        }

        public final void e(Context context, String str, m mVar, Collection<String> collection) {
            l.f(context, "context");
            d(context, str, mVar, null, collection);
        }

        private C0544a() {
        }
    }

    public static final C3206a a() {
        return a.a();
    }

    public static final void b(Context context, String str, m mVar) {
        a.c(context, str, mVar);
    }
}
