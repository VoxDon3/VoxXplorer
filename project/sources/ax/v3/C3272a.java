package ax.v3;

import android.content.Context;
import android.os.Bundle;
import ax.Q2.c;
import ax.t3.j;
import ax.t3.k;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: ax.v3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3272a {
    private FirebaseAnalytics a;

    public void a(boolean z) {
        FirebaseAnalytics firebaseAnalytics = this.a;
        if (firebaseAnalytics != null) {
            firebaseAnalytics.b(z);
        }
    }

    public void b(Context context) {
        if (!c.a() && this.a == null) {
            try {
                boolean n = j.n(context);
                FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
                this.a = firebaseAnalytics;
                firebaseAnalytics.c("navigation_type", k.l());
                this.a.c("user_group", k.r());
                a(n);
                if (n) {
                    this.a.a("INIT_EVENT", new Bundle());
                }
            } catch (IllegalArgumentException | IllegalStateException | NoClassDefFoundError | NullPointerException | SecurityException unused) {
            }
        }
    }

    public void c(String str, Bundle bundle) {
        FirebaseAnalytics firebaseAnalytics = this.a;
        if (firebaseAnalytics != null) {
            firebaseAnalytics.a(str, bundle);
        }
    }
}
