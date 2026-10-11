package ax.U1;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import ax.N1.e;
import ax.N1.k;
import ax.N1.s;
import ax.N1.t;
import ax.R0.a;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.S0.G;
import ax.S0.InterfaceC0979l;
import ax.S0.d0;
import ax.r7.AbstractC2991z;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class a implements t {
    private final G a = new G();
    private final boolean b;
    private final int c;
    private final int d;
    private final String e;
    private final float f;
    private final int g;

    public a(List<byte[]> list) {
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.c = 0;
            this.d = -1;
            this.e = "sans-serif";
            this.b = false;
            this.f = 0.85f;
            this.g = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.c = bArr[24];
        this.d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.e = "Serif".equals(d0.I(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.g = i;
        boolean z = (bArr[0] & 32) != 0;
        this.b = z;
        if (z) {
            this.f = d0.o(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.f = 0.85f;
        }
    }

    private void e(G g, SpannableStringBuilder spannableStringBuilder) {
        C0968a.a(g.a() >= 12);
        int U = g.U();
        int U2 = g.U();
        g.c0(2);
        int M = g.M();
        g.c0(1);
        int v = g.v();
        if (U2 > spannableStringBuilder.length()) {
            C0987u.h("Tx3gParser", "Truncating styl end (" + U2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            U2 = spannableStringBuilder.length();
        }
        int i = U2;
        if (U < i) {
            g(spannableStringBuilder, M, this.c, U, i, 0);
            f(spannableStringBuilder, v, this.d, U, i, 0);
            return;
        }
        C0987u.h("Tx3gParser", "Ignoring styl with start (" + U + ") >= end (" + i + ").");
    }

    private static void f(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    private static void g(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    private static void h(SpannableStringBuilder spannableStringBuilder, String str, int i, int i2) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, 16711713);
        }
    }

    private static String i(G g) {
        C0968a.a(g.a() >= 2);
        int U = g.U();
        if (U == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int g2 = g.g();
        Charset W = g.W();
        int g3 = U - (g.g() - g2);
        if (W == null) {
            W = StandardCharsets.UTF_8;
        }
        return g.K(g3, W);
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
    public void c(byte[] bArr, int i, int i2, t.b bVar, InterfaceC0979l<e> interfaceC0979l) {
        this.a.Z(bArr, i2 + i);
        this.a.b0(i);
        String i3 = i(this.a);
        if (i3.isEmpty()) {
            interfaceC0979l.accept(new e(AbstractC2991z.z(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i3);
        g(spannableStringBuilder, this.c, 0, 0, spannableStringBuilder.length(), 16711680);
        f(spannableStringBuilder, this.d, -1, 0, spannableStringBuilder.length(), 16711680);
        h(spannableStringBuilder, this.e, 0, spannableStringBuilder.length());
        float f = this.f;
        while (this.a.a() >= 8) {
            int g = this.a.g();
            int v = this.a.v();
            int v2 = this.a.v();
            if (v2 == 1937013100) {
                C0968a.a(this.a.a() >= 2);
                int U = this.a.U();
                for (int i4 = 0; i4 < U; i4++) {
                    e(this.a, spannableStringBuilder);
                }
            } else if (v2 == 1952608120 && this.b) {
                C0968a.a(this.a.a() >= 2);
                f = d0.o(this.a.U() / this.g, 0.0f, 0.95f);
            }
            this.a.b0(g + v);
        }
        interfaceC0979l.accept(new e(AbstractC2991z.A(new a.b().o(spannableStringBuilder).h(f, 0).i(0).a()), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // ax.N1.t
    public int d() {
        return 2;
    }
}
