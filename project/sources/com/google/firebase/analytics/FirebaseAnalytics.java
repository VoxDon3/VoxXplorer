package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import ax.M5.C0821p;
import ax.b6.W0;
import ax.f6.InterfaceC2077y;
import ax.j6.m;
import com.google.firebase.installations.c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics b;
    private final W0 a;

    public enum a {
        GRANTED,
        DENIED
    }

    public enum b {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    private FirebaseAnalytics(W0 w0) {
        C0821p.l(w0);
        this.a = w0;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (b == null) {
                        b = new FirebaseAnalytics(W0.e(context));
                    }
                } finally {
                }
            }
        }
        return b;
    }

    @Keep
    public static InterfaceC2077y getScionFrontendApiImplementation(Context context, Bundle bundle) {
        W0 f = W0.f(context, null, null, null, bundle);
        if (f == null) {
            return null;
        }
        return new com.google.firebase.analytics.a(f);
    }

    public final void a(String str, Bundle bundle) {
        this.a.s(str, bundle);
    }

    public final void b(boolean z) {
        this.a.q(Boolean.valueOf(z));
    }

    public final void c(String str, String str2) {
        this.a.B(str, str2);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        try {
            return (String) m.b(c.q().a(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.a.j(activity, str, str2);
    }
}
