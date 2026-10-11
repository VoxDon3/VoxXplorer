package ax.b6;

import android.util.Log;

/* renamed from: ax.b6.f3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1553f3 extends Y2<Double> {
    C1553f3(C1571h3 c1571h3, String str, Double d, boolean z) {
        super(c1571h3, str, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // ax.b6.Y2
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final Double h(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid double value for " + super.k() + ": " + String.valueOf(obj));
        return null;
    }
}
