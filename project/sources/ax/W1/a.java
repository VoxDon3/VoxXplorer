package ax.W1;

import ax.N1.k;
import ax.N1.s;
import ax.N1.t;
import ax.R0.a;
import ax.S0.C0968a;
import ax.S0.G;
import ax.S0.InterfaceC0979l;
import ax.S0.d0;
import java.util.ArrayList;
import java.util.Collections;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class a implements t {
    private final G a = new G();

    private static ax.R0.a e(G g, int i) {
        CharSequence charSequence = null;
        a.b bVar = null;
        while (i > 0) {
            C0968a.b(i >= 8, "Incomplete vtt cue box header found.");
            int v = g.v();
            int v2 = g.v();
            int i2 = v - 8;
            String I = d0.I(g.f(), g.g(), i2);
            g.c0(i2);
            i = (i - 8) - i2;
            if (v2 == 1937011815) {
                bVar = e.p(I);
            } else if (v2 == 1885436268) {
                charSequence = e.r(null, I.trim(), Collections.EMPTY_LIST);
            }
        }
        if (charSequence == null) {
            charSequence = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return bVar != null ? bVar.o(charSequence).a() : e.m(charSequence);
    }

    @Override // ax.N1.t
    public /* synthetic */ void a() {
        s.b(this);
    }

    @Override // ax.N1.t
    public /* synthetic */ k b(byte[] bArr, int i, int i2) {
        return s.a(this, bArr, i, i2);
    }

    @Override // ax.N1.t
    public void c(byte[] bArr, int i, int i2, t.b bVar, InterfaceC0979l<ax.N1.e> interfaceC0979l) {
        this.a.Z(bArr, i2 + i);
        this.a.b0(i);
        ArrayList arrayList = new ArrayList();
        while (this.a.a() > 0) {
            C0968a.b(this.a.a() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int v = this.a.v();
            if (this.a.v() == 1987343459) {
                arrayList.add(e(this.a, v - 8));
            } else {
                this.a.c0(v - 8);
            }
        }
        interfaceC0979l.accept(new ax.N1.e(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // ax.N1.t
    public int d() {
        return 2;
    }
}
