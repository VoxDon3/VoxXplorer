/*
 * Decompiled with CFR 0.152.
 */
package ax.H5;

import android.content.Context;
import ax.H5.c;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public final class p {
    private static p d;
    final c a;
    GoogleSignInAccount b;
    GoogleSignInOptions c;

    private p(Context object) {
        object = ax.H5.c.b((Context)object);
        this.a = object;
        this.b = ((c)object).c();
        this.c = ((c)object).d();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static p a(Context object) {
        synchronized (p.class) {
            return p.d(object.getApplicationContext());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static p d(Context context) {
        synchronized (p.class) {
            p p8 = d;
            if (p8 != null) {
                return p8;
            }
            d = p8 = new p(context);
            return p8;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        synchronized (this) {
            this.a.a();
            this.b = null;
            this.c = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        synchronized (this) {
            this.a.f(googleSignInAccount, googleSignInOptions);
            this.b = googleSignInAccount;
            this.c = googleSignInOptions;
            return;
        }
    }
}

