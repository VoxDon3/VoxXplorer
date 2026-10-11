/*
 * Decompiled with CFR 0.152.
 */
package androidx.core.graphics.drawable;

import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.a;

public class IconCompatParcelizer {
    public static IconCompat read(a a8) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = a8.p(iconCompat.a, 1);
        iconCompat.c = a8.j(iconCompat.c, 2);
        iconCompat.d = a8.r(iconCompat.d, 3);
        iconCompat.e = a8.p(iconCompat.e, 4);
        iconCompat.f = a8.p(iconCompat.f, 5);
        iconCompat.g = a8.r(iconCompat.g, 6);
        iconCompat.i = a8.t(iconCompat.i, 7);
        iconCompat.j = a8.t(iconCompat.j, 8);
        iconCompat.u();
        return iconCompat;
    }

    public static void write(IconCompat object, a a8) {
        Object object2;
        a8.x(true, true);
        ((IconCompat)object).v(a8.f());
        int n8 = ((IconCompat)object).a;
        if (-1 != n8) {
            a8.F(n8, 1);
        }
        if ((object2 = ((IconCompat)object).c) != null) {
            a8.B((byte[])object2, 2);
        }
        if ((object2 = (Object)((IconCompat)object).d) != null) {
            a8.H((Parcelable)object2, 3);
        }
        if ((n8 = ((IconCompat)object).e) != 0) {
            a8.F(n8, 4);
        }
        if ((n8 = ((IconCompat)object).f) != 0) {
            a8.F(n8, 5);
        }
        if ((object2 = (Object)((IconCompat)object).g) != null) {
            a8.H((Parcelable)object2, 6);
        }
        if ((object2 = (Object)((IconCompat)object).i) != null) {
            a8.J((String)object2, 7);
        }
        if ((object = ((IconCompat)object).j) != null) {
            a8.J((String)object, 8);
        }
    }
}

