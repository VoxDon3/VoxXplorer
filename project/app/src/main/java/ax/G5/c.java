/*
 * Decompiled with CFR 0.152.
 */
package ax.G5;

import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

public final class c
implements Comparator {
    public static final c q = new c();

    private /* synthetic */ c() {
    }

    public final int compare(Object object, Object object2) {
        object = (Scope)object;
        object2 = (Scope)object2;
        Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
        return ((Scope)object).k().compareTo(((Scope)object2).k());
    }
}

