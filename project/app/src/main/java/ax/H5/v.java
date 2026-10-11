/*
 * Decompiled with CFR 0.152.
 */
package ax.H5;

import android.content.Context;
import android.os.Binder;
import ax.H5.c;
import ax.H5.p;
import ax.H5.q;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.a;
import com.google.android.gms.auth.api.signin.b;

public final class v
extends q {
    private final Context e;

    public v(Context context) {
        this.e = context;
    }

    private final void w() {
        if (ax.R5.p.a(this.e, Binder.getCallingUid())) {
            return;
        }
        int n8 = Binder.getCallingUid();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Calling UID ");
        stringBuilder.append(n8);
        stringBuilder.append(" is not Google Play services.");
        throw new SecurityException(stringBuilder.toString());
    }

    @Override
    public final void L() {
        this.w();
        p.a(this.e).b();
    }

    @Override
    public final void i0() {
        this.w();
        c c8 = c.b(this.e);
        GoogleSignInAccount googleSignInAccount = c8.c();
        Object object = GoogleSignInOptions.m0;
        if (googleSignInAccount != null) {
            object = c8.d();
        }
        object = a.a(this.e, (GoogleSignInOptions)object);
        if (googleSignInAccount != null) {
            ((b)object).s();
            return;
        }
        ((b)object).t();
    }
}

