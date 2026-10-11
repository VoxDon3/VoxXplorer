package ax.W5;

import android.util.Log;

/* loaded from: classes3.dex */
final class H extends O {
    H(K k, String str, Boolean bool, boolean z) {
        super(k, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ax.W5.O
    final /* synthetic */ Object a(Object obj) {
        if (C1045l.c.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (C1045l.d.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + this.b + ": " + ((String) obj));
        return null;
    }
}
