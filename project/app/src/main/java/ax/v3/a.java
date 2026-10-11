/*
 * Decompiled with CFR 0.152.
 */
package ax.v3;

import android.content.Context;
import android.os.Bundle;
import ax.Q2.c;
import ax.t3.j;
import ax.t3.k;
import com.google.firebase.analytics.FirebaseAnalytics;

public class a {
    private FirebaseAnalytics a;

    public void a(boolean bl) {
        FirebaseAnalytics firebaseAnalytics = this.a;
        if (firebaseAnalytics != null) {
            firebaseAnalytics.b(bl);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(Context object) {
        if (c.a()) {
            return;
        }
        if (this.a != null) return;
        try {
            boolean bl = j.n((Context)object);
            this.a = object = FirebaseAnalytics.getInstance((Context)object);
            ((FirebaseAnalytics)object).c("navigation_type", k.l());
            this.a.c("user_group", k.r());
            this.a(bl);
            if (!bl) return;
            FirebaseAnalytics firebaseAnalytics = this.a;
            object = new Bundle();
            firebaseAnalytics.a("INIT_EVENT", (Bundle)object);
            return;
        }
        catch (IllegalArgumentException | IllegalStateException | NoClassDefFoundError | NullPointerException | SecurityException throwable) {
            return;
        }
    }

    public void c(String string, Bundle bundle) {
        FirebaseAnalytics firebaseAnalytics = this.a;
        if (firebaseAnalytics != null) {
            firebaseAnalytics.a(string, bundle);
        }
    }
}

