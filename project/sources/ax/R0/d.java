package ax.R0;

import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import ax.S0.C0968a;
import ax.S0.d0;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class d {
    private static final String a = d0.G0(0);
    private static final String b = d0.G0(1);
    private static final String c = d0.G0(2);
    private static final String d = d0.G0(3);
    private static final String e = d0.G0(4);

    public static ArrayList<Bundle> a(Spanned spanned) {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
            arrayList.add(b(spanned, gVar, 1, gVar.b()));
        }
        for (i iVar : (i[]) spanned.getSpans(0, spanned.length(), i.class)) {
            arrayList.add(b(spanned, iVar, 2, iVar.b()));
        }
        for (e eVar : (e[]) spanned.getSpans(0, spanned.length(), e.class)) {
            arrayList.add(b(spanned, eVar, 3, null));
        }
        for (j jVar : (j[]) spanned.getSpans(0, spanned.length(), j.class)) {
            arrayList.add(b(spanned, jVar, 4, jVar.b()));
        }
        return arrayList;
    }

    private static Bundle b(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(a, spanned.getSpanStart(obj));
        bundle2.putInt(b, spanned.getSpanEnd(obj));
        bundle2.putInt(c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i);
        if (bundle != null) {
            bundle2.putBundle(e, bundle);
        }
        return bundle2;
    }

    public static void c(Bundle bundle, Spannable spannable) {
        int i = bundle.getInt(a);
        int i2 = bundle.getInt(b);
        int i3 = bundle.getInt(c);
        int i4 = bundle.getInt(d, -1);
        Bundle bundle2 = bundle.getBundle(e);
        if (i4 == 1) {
            spannable.setSpan(g.a((Bundle) C0968a.e(bundle2)), i, i2, i3);
            return;
        }
        if (i4 == 2) {
            spannable.setSpan(i.a((Bundle) C0968a.e(bundle2)), i, i2, i3);
        } else if (i4 == 3) {
            spannable.setSpan(new e(), i, i2, i3);
        } else {
            if (i4 != 4) {
                return;
            }
            spannable.setSpan(j.a((Bundle) C0968a.e(bundle2)), i, i2, i3);
        }
    }
}
