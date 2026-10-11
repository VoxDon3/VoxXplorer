package ax.H5;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: classes3.dex */
public final class p {
    private static p d;
    final c a;
    GoogleSignInAccount b;
    GoogleSignInOptions c;

    private p(Context context) {
        c b = c.b(context);
        this.a = b;
        this.b = b.c();
        this.c = b.d();
    }

    public static synchronized p a(Context context) {
        p d2;
        synchronized (p.class) {
            d2 = d(context.getApplicationContext());
        }
        return d2;
    }

    private static synchronized p d(Context context) {
        synchronized (p.class) {
            p pVar = d;
            if (pVar != null) {
                return pVar;
            }
            p pVar2 = new p(context);
            d = pVar2;
            return pVar2;
        }
    }

    public final synchronized void b() {
        this.a.a();
        this.b = null;
        this.c = null;
    }

    public final synchronized void c(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.a.f(googleSignInAccount, googleSignInOptions);
        this.b = googleSignInAccount;
        this.c = googleSignInOptions;
    }
}
