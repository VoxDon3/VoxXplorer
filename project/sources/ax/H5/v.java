package ax.H5;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: classes3.dex */
public final class v extends q {
    private final Context e;

    public v(Context context) {
        this.e = context;
    }

    private final void w() {
        if (ax.R5.p.a(this.e, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException("Calling UID " + Binder.getCallingUid() + " is not Google Play services.");
    }

    @Override // ax.H5.r
    public final void L() {
        w();
        p.a(this.e).b();
    }

    @Override // ax.H5.r
    public final void i0() {
        w();
        c b = c.b(this.e);
        GoogleSignInAccount c = b.c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.m0;
        if (c != null) {
            googleSignInOptions = b.d();
        }
        com.google.android.gms.auth.api.signin.b a = com.google.android.gms.auth.api.signin.a.a(this.e, googleSignInOptions);
        if (c != null) {
            a.s();
        } else {
            a.t();
        }
    }
}
