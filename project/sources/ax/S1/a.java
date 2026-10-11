package ax.S1;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import ax.N1.e;
import ax.N1.k;
import ax.N1.s;
import ax.N1.t;
import ax.R0.a;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.S0.G;
import ax.S0.InterfaceC0979l;
import ax.r7.AbstractC2991z;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class a implements t {
    private static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    private static final Pattern e = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder a = new StringBuilder();
    private final ArrayList<String> b = new ArrayList<>();
    private final G c = new G();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private ax.R0.a e(Spanned spanned, String str) {
        char c;
        char c2;
        a.b o = new a.b().o(spanned);
        if (str == null) {
            return o.a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1 || c == 2) {
            o.l(0);
        } else if (c == 3 || c == 4 || c == 5) {
            o.l(2);
        } else {
            o.l(1);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0 || c2 == 1 || c2 == 2) {
            o.i(2);
        } else if (c2 == 3 || c2 == 4 || c2 == 5) {
            o.i(0);
        } else {
            o.i(1);
        }
        return o.k(g(o.d())).h(g(o.c()), 0).a();
    }

    private Charset f(G g) {
        Charset W = g.W();
        return W != null ? W : StandardCharsets.UTF_8;
    }

    public static float g(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long h(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = (group != null ? Long.parseLong(group) * 3600000 : 0L) + (Long.parseLong((String) C0968a.e(matcher.group(i + 2))) * 60000) + (Long.parseLong((String) C0968a.e(matcher.group(i + 3))) * 1000);
        String group2 = matcher.group(i + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    private String i(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb = new StringBuilder(trim);
        Matcher matcher = e.matcher(trim);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i;
            int length = group.length();
            sb.replace(start, start + length, HttpUrl.FRAGMENT_ENCODE_SET);
            i += length;
        }
        return sb.toString();
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
        int i3;
        long j;
        String y;
        String str;
        this.c.Z(bArr, i + i2);
        this.c.b0(i);
        Charset f = f(this.c);
        long j2 = -9223372036854775807L;
        ArrayList arrayList = (bVar.a == -9223372036854775807L || !bVar.b) ? null : new ArrayList();
        while (true) {
            String y2 = this.c.y(f);
            i3 = 0;
            if (y2 == null) {
                break;
            }
            if (!y2.isEmpty()) {
                try {
                    Integer.parseInt(y2);
                    y = this.c.y(f);
                } catch (NumberFormatException unused) {
                    j = j2;
                    C0987u.h("SubripParser", "Skipping invalid index: " + y2);
                }
                if (y == null) {
                    C0987u.h("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = d.matcher(y);
                if (matcher.matches()) {
                    long h = h(matcher, 1);
                    long h2 = h(matcher, 6);
                    this.a.setLength(0);
                    this.b.clear();
                    String y3 = this.c.y(f);
                    while (!TextUtils.isEmpty(y3)) {
                        if (this.a.length() > 0) {
                            this.a.append("<br>");
                        }
                        this.a.append(i(y3, this.b));
                        y3 = this.c.y(f);
                    }
                    Spanned fromHtml = Html.fromHtml(this.a.toString());
                    while (true) {
                        if (i3 >= this.b.size()) {
                            str = null;
                            break;
                        }
                        str = this.b.get(i3);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    j = j2;
                    long j3 = bVar.a;
                    if (j3 == j || h2 >= j3) {
                        interfaceC0979l.accept(new e(AbstractC2991z.A(e(fromHtml, str)), h, h2 - h));
                    } else if (arrayList != null) {
                        arrayList.add(new e(AbstractC2991z.A(e(fromHtml, str)), h, h2 - h));
                    }
                } else {
                    j = j2;
                    C0987u.h("SubripParser", "Skipping invalid timing: " + y);
                }
                j2 = j;
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                interfaceC0979l.accept((e) obj);
            }
        }
    }

    @Override // ax.N1.t
    public int d() {
        return 1;
    }
}
