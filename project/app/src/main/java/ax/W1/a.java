/*
 * Decompiled with CFR 0.152.
 */
package ax.W1;

import android.text.SpannedString;
import ax.N1.k;
import ax.N1.s;
import ax.N1.t;
import ax.R0.a;
import ax.S0.G;
import ax.S0.d0;
import ax.S0.l;
import ax.W1.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a
implements t {
    private final G a = new G();

    private static ax.R0.a e(G object, int n8) {
        SpannedString spannedString = null;
        a.b b8 = null;
        while (n8 > 0) {
            boolean bl = n8 >= 8;
            ax.S0.a.b(bl, "Incomplete vtt cue box header found.");
            int n9 = ((G)object).v();
            int n10 = ((G)object).v();
            String string = d0.I(((G)object).f(), ((G)object).g(), n9 -= 8);
            ((G)object).c0(n9);
            n9 = n8 - 8 - n9;
            if (n10 == 1937011815) {
                b8 = e.p(string);
                n8 = n9;
                continue;
            }
            n8 = n9;
            if (n10 != 1885436268) continue;
            spannedString = e.r(null, string.trim(), Collections.EMPTY_LIST);
            n8 = n9;
        }
        object = spannedString;
        if (spannedString == null) {
            object = "";
        }
        if (b8 != null) {
            return b8.o((CharSequence)object).a();
        }
        return e.m((CharSequence)object);
    }

    @Override
    public /* synthetic */ void a() {
        s.b(this);
    }

    @Override
    public /* synthetic */ k b(byte[] byArray, int n8, int n9) {
        return s.a(this, byArray, n8, n9);
    }

    @Override
    public void c(byte[] object, int n8, int n9, t.b b8, l<ax.N1.e> l8) {
        this.a.Z((byte[])object, n9 + n8);
        this.a.b0(n8);
        object = new ArrayList();
        while (this.a.a() > 0) {
            boolean bl = this.a.a() >= 8;
            ax.S0.a.b(bl, "Incomplete Mp4Webvtt Top Level box header found.");
            n8 = this.a.v();
            if (this.a.v() == 1987343459) {
                object.add(ax.W1.a.e(this.a, n8 - 8));
                continue;
            }
            this.a.c0(n8 - 8);
        }
        l8.accept(new ax.N1.e((List<ax.R0.a>)object, -9223372036854775807L, -9223372036854775807L));
    }

    @Override
    public int d() {
        return 2;
    }
}

