/*
 * Decompiled with CFR 0.152.
 */
package ax.S1;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import ax.N1.e;
import ax.N1.k;
import ax.N1.s;
import ax.N1.t;
import ax.R0.a;
import ax.S0.G;
import ax.S0.l;
import ax.S0.u;
import ax.r7.z;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a
implements t {
    private static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    private static final Pattern e = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder a = new StringBuilder();
    private final ArrayList<String> b = new ArrayList();
    private final G c = new G();

    private ax.R0.a e(Spanned object, String string) {
        int n8;
        block32: {
            block31: {
                object = new a.b().o((CharSequence)object);
                if (string == null) {
                    return ((a.b)object).a();
                }
                switch (string.hashCode()) {
                    default: {
                        break;
                    }
                    case -685620462: {
                        if (!string.equals("{\\an9}")) break;
                        n8 = 5;
                        break block31;
                    }
                    case -685620493: {
                        if (!string.equals("{\\an8}")) break;
                        n8 = 8;
                        break block31;
                    }
                    case -685620524: {
                        if (!string.equals("{\\an7}")) break;
                        n8 = 2;
                        break block31;
                    }
                    case -685620555: {
                        if (!string.equals("{\\an6}")) break;
                        n8 = 4;
                        break block31;
                    }
                    case -685620586: {
                        if (!string.equals("{\\an5}")) break;
                        n8 = 7;
                        break block31;
                    }
                    case -685620617: {
                        if (!string.equals("{\\an4}")) break;
                        n8 = 1;
                        break block31;
                    }
                    case -685620648: {
                        if (!string.equals("{\\an3}")) break;
                        n8 = 3;
                        break block31;
                    }
                    case -685620679: {
                        if (!string.equals("{\\an2}")) break;
                        n8 = 6;
                        break block31;
                    }
                    case -685620710: {
                        if (!string.equals("{\\an1}")) break;
                        n8 = 0;
                        break block31;
                    }
                }
                n8 = -1;
            }
            if (n8 != 0 && n8 != 1 && n8 != 2) {
                if (n8 != 3 && n8 != 4 && n8 != 5) {
                    ((a.b)object).l(1);
                } else {
                    ((a.b)object).l(2);
                }
            } else {
                ((a.b)object).l(0);
            }
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case -685620462: {
                    if (!string.equals("{\\an9}")) break;
                    n8 = 5;
                    break block32;
                }
                case -685620493: {
                    if (!string.equals("{\\an8}")) break;
                    n8 = 4;
                    break block32;
                }
                case -685620524: {
                    if (!string.equals("{\\an7}")) break;
                    n8 = 3;
                    break block32;
                }
                case -685620555: {
                    if (!string.equals("{\\an6}")) break;
                    n8 = 8;
                    break block32;
                }
                case -685620586: {
                    if (!string.equals("{\\an5}")) break;
                    n8 = 7;
                    break block32;
                }
                case -685620617: {
                    if (!string.equals("{\\an4}")) break;
                    n8 = 6;
                    break block32;
                }
                case -685620648: {
                    if (!string.equals("{\\an3}")) break;
                    n8 = 2;
                    break block32;
                }
                case -685620679: {
                    if (!string.equals("{\\an2}")) break;
                    n8 = 1;
                    break block32;
                }
                case -685620710: {
                    if (!string.equals("{\\an1}")) break;
                    n8 = 0;
                    break block32;
                }
            }
            n8 = -1;
        }
        if (n8 != 0 && n8 != 1 && n8 != 2) {
            if (n8 != 3 && n8 != 4 && n8 != 5) {
                ((a.b)object).i(1);
            } else {
                ((a.b)object).i(0);
            }
        } else {
            ((a.b)object).i(2);
        }
        return ((a.b)object).k(ax.S1.a.g(((a.b)object).d())).h(ax.S1.a.g(((a.b)object).c()), 0).a();
    }

    private Charset f(G object) {
        if ((object = ((G)object).W()) != null) {
            return object;
        }
        return StandardCharsets.UTF_8;
    }

    public static float g(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 == 2) {
                    return 0.92f;
                }
                throw new IllegalArgumentException();
            }
            return 0.5f;
        }
        return 0.08f;
    }

    private static long h(Matcher object, int n8) {
        String string = ((Matcher)object).group(n8 + 1);
        long l8 = string != null ? Long.parseLong(string) * 3600000L : 0L;
        long l9 = l8 + Long.parseLong(ax.S0.a.e(((Matcher)object).group(n8 + 2))) * 60000L + Long.parseLong(ax.S0.a.e(((Matcher)object).group(n8 + 3))) * 1000L;
        object = ((Matcher)object).group(n8 + 4);
        l8 = l9;
        if (object != null) {
            l8 = l9 + Long.parseLong((String)object);
        }
        return l8 * 1000L;
    }

    private String i(String charSequence, ArrayList<String> arrayList) {
        Object object = ((String)charSequence).trim();
        charSequence = new StringBuilder((String)object);
        object = e.matcher((CharSequence)object);
        int n8 = 0;
        while (((Matcher)object).find()) {
            String string = ((Matcher)object).group();
            arrayList.add(string);
            int n9 = ((Matcher)object).start() - n8;
            int n10 = string.length();
            ((StringBuilder)charSequence).replace(n9, n9 + n10, "");
            n8 += n10;
        }
        return ((StringBuilder)charSequence).toString();
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
        this.c.Z((byte[])object, n8 + n9);
        this.c.b0(n8);
        Charset charset = this.f(this.c);
        long l9 = b8.a;
        long l10 = -9223372036854775807L;
        object = l9 != -9223372036854775807L && b8.b ? (Object)new ArrayList() : null;
        while (true) {
            Object object2;
            String string = this.c.y(charset);
            n8 = 0;
            n9 = 0;
            if (string == null) break;
            if (string.isEmpty()) continue;
            try {
                Integer.parseInt(string);
            }
            catch (NumberFormatException numberFormatException) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Skipping invalid index: ");
                ((StringBuilder)object2).append(string);
                u.h("SubripParser", ((StringBuilder)object2).toString());
                continue;
            }
            string = this.c.y(charset);
            if (string == null) {
                u.h("SubripParser", "Unexpected end");
                break;
            }
            object2 = d.matcher(string);
            if (((Matcher)object2).matches()) {
                long l11;
                long l12;
                block12: {
                    l12 = ax.S1.a.h((Matcher)object2, 1);
                    l11 = ax.S1.a.h((Matcher)object2, 6);
                    this.a.setLength(0);
                    this.b.clear();
                    string = this.c.y(charset);
                    while (!TextUtils.isEmpty((CharSequence)string)) {
                        if (this.a.length() > 0) {
                            this.a.append("<br>");
                        }
                        this.a.append(this.i(string, this.b));
                        string = this.c.y(charset);
                    }
                    object2 = Html.fromHtml((String)this.a.toString());
                    for (n8 = n9; n8 < this.b.size(); ++n8) {
                        string = this.b.get(n8);
                        if (!string.matches("\\{\\\\an[1-9]\\}")) {
                            continue;
                        }
                        break block12;
                    }
                    string = null;
                }
                l9 = b8.a;
                if (l9 != l10 && l11 < l9) {
                    if (object == null) continue;
                    object.add(new e(z.A(this.e((Spanned)object2, string)), l12, l11 - l12));
                    continue;
                }
                l8.accept(new e(z.A(this.e((Spanned)object2, string)), l12, l11 - l12));
                continue;
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Skipping invalid timing: ");
            ((StringBuilder)object2).append(string);
            u.h("SubripParser", ((StringBuilder)object2).toString());
            continue;
            break;
        }
        if (object != null) {
            n9 = ((ArrayList)object).size();
            while (n8 < n9) {
                b8 = ((ArrayList)object).get(n8);
                ++n8;
                l8.accept((e)((Object)b8));
            }
        }
    }

    @Override
    public int d() {
        return 1;
    }
}

