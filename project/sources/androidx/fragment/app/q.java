package androidx.fragment.app;

import android.os.Bundle;

/* loaded from: classes.dex */
public class q {
    public static void a(Object obj) {
        p pVar;
        Bundle bundle;
        if (!(obj instanceof p) || (bundle = (pVar = (p) obj).n0) == null) {
            return;
        }
        bundle.clear();
        ax.Q2.d.c("FRAGMENT_TRANSACTION_TOO_LARGE", new Exception("FRAGMENT_TRANSACTION_TOO_LARGE : " + pVar.q));
    }
}
