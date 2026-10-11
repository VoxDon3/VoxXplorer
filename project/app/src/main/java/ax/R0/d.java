/*
 * Decompiled with CFR 0.152.
 */
package ax.R0;

import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import ax.R0.e;
import ax.R0.g;
import ax.R0.i;
import ax.R0.j;
import ax.S0.a;
import ax.S0.d0;
import java.util.ArrayList;

final class d {
    private static final String a = d0.G0(0);
    private static final String b = d0.G0(1);
    private static final String c = d0.G0(2);
    private static final String d = d0.G0(3);
    private static final String e = d0.G0(4);

    public static ArrayList<Bundle> a(Spanned spanned) {
        ArrayList<Bundle> arrayList = new ArrayList<Bundle>();
        int n8 = spanned.length();
        int n9 = 0;
        for (g g8 : (g[])spanned.getSpans(0, n8, g.class)) {
            arrayList.add(ax.R0.d.b(spanned, g8, 1, g8.b()));
        }
        for (i i8 : (i[])spanned.getSpans(0, spanned.length(), i.class)) {
            arrayList.add(ax.R0.d.b(spanned, i8, 2, i8.b()));
        }
        e[] eArray = (e[])spanned.getSpans(0, spanned.length(), e.class);
        int n10 = eArray.length;
        for (n8 = 0; n8 < n10; ++n8) {
            arrayList.add(ax.R0.d.b(spanned, eArray[n8], 3, null));
        }
        j[] jArray = (j[])spanned.getSpans(0, spanned.length(), j.class);
        n10 = jArray.length;
        for (n8 = n9; n8 < n10; ++n8) {
            j j8 = jArray[n8];
            arrayList.add(ax.R0.d.b(spanned, j8, 4, j8.b()));
        }
        return arrayList;
    }

    private static Bundle b(Spanned spanned, Object object, int n8, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(a, spanned.getSpanStart(object));
        bundle2.putInt(b, spanned.getSpanEnd(object));
        bundle2.putInt(c, spanned.getSpanFlags(object));
        bundle2.putInt(d, n8);
        if (bundle != null) {
            bundle2.putBundle(e, bundle);
        }
        return bundle2;
    }

    public static void c(Bundle bundle, Spannable spannable) {
        int n8 = bundle.getInt(a);
        int n9 = bundle.getInt(b);
        int n10 = bundle.getInt(c);
        int n11 = bundle.getInt(d, -1);
        bundle = bundle.getBundle(e);
        if (n11 != 1) {
            if (n11 != 2) {
                if (n11 != 3) {
                    if (n11 != 4) {
                        return;
                    }
                    spannable.setSpan((Object)j.a(ax.S0.a.e(bundle)), n8, n9, n10);
                    return;
                }
                spannable.setSpan((Object)new e(), n8, n9, n10);
                return;
            }
            spannable.setSpan((Object)i.a(ax.S0.a.e(bundle)), n8, n9, n10);
            return;
        }
        spannable.setSpan((Object)g.a(ax.S0.a.e(bundle)), n8, n9, n10);
    }
}

