/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import ax.M5.p;
import ax.b6.W0;
import ax.f6.y;
import ax.j6.m;
import com.google.firebase.installations.c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics b;
    private final W0 a;

    private FirebaseAnalytics(W0 w02) {
        p.l(w02);
        this.a = w02;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Keep
    public static FirebaseAnalytics getInstance(Context object) {
        if (b != null) return b;
        synchronized (FirebaseAnalytics.class) {
            try {
                FirebaseAnalytics firebaseAnalytics;
                if (b != null) return b;
                object = W0.e(object);
                b = firebaseAnalytics = new FirebaseAnalytics((W0)object);
                return b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Keep
    public static y getScionFrontendApiImplementation(Context object, Bundle bundle) {
        if ((object = W0.f(object, null, null, null, bundle)) == null) {
            return null;
        }
        return new com.google.firebase.analytics.a((W0)object);
    }

    public final void a(String string, Bundle bundle) {
        this.a.s(string, bundle);
    }

    public final void b(boolean bl) {
        this.a.q(bl);
    }

    public final void c(String string, String string2) {
        this.a.B(string, string2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Keep
    public final String getFirebaseInstanceId() {
        try {
            return m.b(c.q().a(), 30000L, TimeUnit.MILLISECONDS);
        }
        catch (InterruptedException interruptedException) {
            throw new IllegalStateException(interruptedException);
        }
        catch (ExecutionException executionException) {
            throw new IllegalStateException(executionException.getCause());
        }
        catch (TimeoutException timeoutException) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Deprecated
    @Keep
    public final void setCurrentScreen(Activity activity, String string, String string2) {
        this.a.j(activity, string, string2);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        private static final a[] d0;
        public static final /* enum */ a q;

        static {
            a a8;
            a a9;
            q = a9 = new a();
            c0 = a8 = new a();
            d0 = new a[]{a9, a8};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])d0.clone();
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b c0;
        public static final /* enum */ b d0;
        public static final /* enum */ b e0;
        private static final b[] f0;
        public static final /* enum */ b q;

        static {
            b b8;
            b b9;
            b b10;
            b b11;
            q = b11 = new b();
            c0 = b10 = new b();
            d0 = b9 = new b();
            e0 = b8 = new b();
            f0 = new b[]{b11, b10, b9, b8};
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])f0.clone();
        }
    }
}

