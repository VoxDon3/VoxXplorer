package ax.b6;

import android.util.Log;

/* renamed from: ax.b6.c3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1526c3 extends Y2<Boolean> {
    C1526c3(C1571h3 c1571h3, String str, Boolean bool, boolean z) {
        super(c1571h3, str, bool);
    }

    @Override // ax.b6.Y2
    final /* synthetic */ Boolean h(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (C1693w2.c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (C1693w2.d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + super.k() + ": " + String.valueOf(obj));
        return null;
    }
}
