package ax.W5;

import android.util.Log;

/* loaded from: classes3.dex */
final class G extends O {
    G(K k, String str, Long l, boolean z) {
        super(k, str, l, true, null);
    }

    @Override // ax.W5.O
    final /* synthetic */ Object a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid long value for " + this.b + ": " + ((String) obj));
            return null;
        }
    }
}
