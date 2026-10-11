package ax.b6;

import android.util.Log;

/* renamed from: ax.b6.d3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1535d3 extends Y2<Long> {
    C1535d3(C1571h3 c1571h3, String str, Long l, boolean z) {
        super(c1571h3, str, l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // ax.b6.Y2
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final Long h(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid long value for " + super.k() + ": " + String.valueOf(obj));
        return null;
    }
}
