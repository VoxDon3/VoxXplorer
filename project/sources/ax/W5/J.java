package ax.W5;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes3.dex */
final class J extends O {
    final /* synthetic */ m2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J(K k, String str, Object obj, boolean z, m2 m2Var) {
        super(k, "getTokenRefactor__blocked_packages", obj, true, null);
        this.l = m2Var;
    }

    @Override // ax.W5.O
    final Object a(Object obj) {
        try {
            return g2.r(Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            Log.e("PhenotypeFlag", "Invalid byte[] value for " + this.b + ": " + ((String) obj));
            return null;
        }
    }
}
