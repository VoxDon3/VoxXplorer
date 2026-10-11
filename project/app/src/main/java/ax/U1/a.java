/*
 * Decompiled with CFR 0.152.
 */
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
import ax.S0.G;
import ax.S0.d0;
import ax.S0.l;
import ax.S0.u;
import ax.r7.z;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

public final class a
implements t {
    private final G a = new G();
    private final boolean b;
    private final int c;
    private final int d;
    private final String e;
    private final float f;
    private final int g;

    public a(List<byte[]> object) {
        int n8 = object.size();
        String string = "sans-serif";
        boolean bl = false;
        if (n8 == 1 && (object.get(0).length == 48 || object.get(0).length == 53)) {
            int n9;
            byte[] byArray = object.get(0);
            this.c = byArray[24];
            this.d = (byArray[26] & 0xFF) << 24 | (byArray[27] & 0xFF) << 16 | (byArray[28] & 0xFF) << 8 | byArray[29] & 0xFF;
            object = string;
            if ("Serif".equals(d0.I(byArray, 43, byArray.length - 43))) {
                object = "serif";
            }
            this.e = object;
            this.g = n9 = byArray[25] * 20;
            if ((byArray[0] & 0x20) != 0) {
                bl = true;
            }
            this.b = bl;
            if (bl) {
                n8 = byArray[10];
                this.f = d0.o((float)(byArray[11] & 0xFF | (n8 & 0xFF) << 8) / (float)n9, 0.0f, 0.95f);
                return;
            }
            this.f = 0.85f;
            return;
        }
        this.c = 0;
        this.d = -1;
        this.e = "sans-serif";
        this.b = false;
        this.f = 0.85f;
        this.g = -1;
    }

    private void e(G object, SpannableStringBuilder spannableStringBuilder) {
        boolean bl = ((G)object).a() >= 12;
        ax.S0.a.a(bl);
        int n8 = ((G)object).U();
        int n9 = ((G)object).U();
        ((G)object).c0(2);
        int n10 = ((G)object).M();
        ((G)object).c0(1);
        int n11 = ((G)object).v();
        int n12 = n9;
        if (n9 > spannableStringBuilder.length()) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Truncating styl end (");
            ((StringBuilder)object).append(n9);
            ((StringBuilder)object).append(") to cueText.length() (");
            ((StringBuilder)object).append(spannableStringBuilder.length());
            ((StringBuilder)object).append(").");
            u.h("Tx3gParser", ((StringBuilder)object).toString());
            n12 = spannableStringBuilder.length();
        }
        if (n8 >= n12) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Ignoring styl with start (");
            ((StringBuilder)object).append(n8);
            ((StringBuilder)object).append(") >= end (");
            ((StringBuilder)object).append(n12);
            ((StringBuilder)object).append(").");
            u.h("Tx3gParser", ((StringBuilder)object).toString());
            return;
        }
        ax.U1.a.g(spannableStringBuilder, n10, this.c, n8, n12, 0);
        ax.U1.a.f(spannableStringBuilder, n11, this.d, n8, n12, 0);
    }

    private static void f(SpannableStringBuilder spannableStringBuilder, int n8, int n9, int n10, int n11, int n12) {
        if (n8 != n9) {
            spannableStringBuilder.setSpan((Object)new ForegroundColorSpan(n8 >>> 8 | (n8 & 0xFF) << 24), n10, n11, n12 | 0x21);
        }
    }

    private static void g(SpannableStringBuilder spannableStringBuilder, int n8, int n9, int n10, int n11, int n12) {
        if (n8 != n9) {
            int n13 = n12 | 0x21;
            int n14 = 1;
            n9 = (n8 & 1) != 0 ? 1 : 0;
            n12 = (n8 & 2) != 0 ? 1 : 0;
            if (n9 != 0) {
                if (n12 != 0) {
                    spannableStringBuilder.setSpan((Object)new StyleSpan(3), n10, n11, n13);
                } else {
                    spannableStringBuilder.setSpan((Object)new StyleSpan(1), n10, n11, n13);
                }
            } else if (n12 != 0) {
                spannableStringBuilder.setSpan((Object)new StyleSpan(2), n10, n11, n13);
            }
            n8 = (n8 & 4) != 0 ? n14 : 0;
            if (n8 != 0) {
                spannableStringBuilder.setSpan((Object)new UnderlineSpan(), n10, n11, n13);
            }
            if (n8 == 0 && n9 == 0 && n12 == 0) {
                spannableStringBuilder.setSpan((Object)new StyleSpan(0), n10, n11, n13);
            }
        }
    }

    private static void h(SpannableStringBuilder spannableStringBuilder, String string, int n8, int n9) {
        if (string != "sans-serif") {
            spannableStringBuilder.setSpan((Object)new TypefaceSpan(string), n8, n9, 16711713);
        }
    }

    private static String i(G g8) {
        boolean bl = g8.a() >= 2;
        ax.S0.a.a(bl);
        int n8 = g8.U();
        if (n8 == 0) {
            return "";
        }
        int n9 = g8.g();
        Charset charset = g8.W();
        int n10 = g8.g();
        if (charset == null) {
            charset = StandardCharsets.UTF_8;
        }
        return g8.K(n8 - (n10 - n9), charset);
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
    public void c(byte[] object, int n8, int n9, t.b b8, l<e> l8) {
        this.a.Z((byte[])object, n9 + n8);
        this.a.b0(n8);
        object = ax.U1.a.i(this.a);
        if (((String)object).isEmpty()) {
            l8.accept(new e(z.<ax.R0.a>z(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        object = new SpannableStringBuilder((CharSequence)object);
        ax.U1.a.g((SpannableStringBuilder)object, this.c, 0, 0, object.length(), 0xFF0000);
        ax.U1.a.f((SpannableStringBuilder)object, this.d, -1, 0, object.length(), 0xFF0000);
        ax.U1.a.h((SpannableStringBuilder)object, this.e, 0, object.length());
        float f8 = this.f;
        while (this.a.a() >= 8) {
            float f9;
            n9 = this.a.g();
            int n10 = this.a.v();
            n8 = this.a.v();
            boolean bl = true;
            boolean bl2 = true;
            if (n8 == 1937013100) {
                bl = this.a.a() >= 2 ? bl2 : false;
                ax.S0.a.a(bl);
                int n11 = this.a.U();
                n8 = 0;
                while (true) {
                    f9 = f8;
                    if (n8 < n11) {
                        this.e(this.a, (SpannableStringBuilder)object);
                        ++n8;
                        continue;
                    }
                    break;
                }
            } else {
                f9 = f8;
                if (n8 == 1952608120) {
                    f9 = f8;
                    if (this.b) {
                        if (this.a.a() < 2) {
                            bl = false;
                        }
                        ax.S0.a.a(bl);
                        f9 = d0.o((float)this.a.U() / (float)this.g, 0.0f, 0.95f);
                    }
                }
            }
            this.a.b0(n9 + n10);
            f8 = f9;
        }
        l8.accept(new e(z.A(new a.b().o((CharSequence)object).h(f8, 0).i(0).a()), -9223372036854775807L, -9223372036854775807L));
    }

    @Override
    public int d() {
        return 2;
    }
}

