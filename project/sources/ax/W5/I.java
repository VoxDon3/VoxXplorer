package ax.W5;

import android.util.Log;

/* loaded from: classes3.dex */
final class I extends O {
    I(K k, String str, Double d, boolean z) {
        super(k, str, d, true, null);
    }

    @Override // ax.W5.O
    final /* synthetic */ Object a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid double value for " + this.b + ": " + ((String) obj));
            return null;
        }
    }
}
