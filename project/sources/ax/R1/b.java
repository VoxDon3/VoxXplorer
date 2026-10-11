package ax.R1;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import ax.N1.e;
import ax.N1.k;
import ax.N1.s;
import ax.N1.t;
import ax.R0.a;
import ax.R1.c;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.S0.G;
import ax.S0.InterfaceC0979l;
import ax.S0.d0;
import ax.q7.C2876c;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class b implements t {
    private static final Pattern g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean a;
    private final a b;
    private Map<String, c> d;
    private float e = -3.4028235E38f;
    private float f = -3.4028235E38f;
    private final G c = new G();

    public b(List<byte[]> list) {
        if (list == null || list.isEmpty()) {
            this.a = false;
            this.b = null;
            return;
        }
        this.a = true;
        String H = d0.H(list.get(0));
        C0968a.a(H.startsWith("Format:"));
        this.b = (a) C0968a.e(a.a(H));
        k(new G(list.get(1)), StandardCharsets.UTF_8);
    }

    private static int e(long j, List<Long> list, List<List<ax.R0.a>> list2) {
        int i;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (list.get(size).longValue() == j) {
                return size;
            }
            if (list.get(size).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList(list2.get(i - 1)));
        return i;
    }

    private static float f(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static ax.R0.a g(String str, int i, c cVar, c.b bVar, float f, float f2) {
        SpannableString spannableString = new SpannableString(str);
        a.b t = new a.b().o(spannableString).t(i);
        if (cVar != null) {
            if (cVar.c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.c.intValue()), 0, spannableString.length(), 33);
            }
            if (cVar.j == 3 && cVar.d != null) {
                spannableString.setSpan(new BackgroundColorSpan(cVar.d.intValue()), 0, spannableString.length(), 33);
            }
            float f3 = cVar.e;
            if (f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                t.q(f3 / f2, 1);
            }
            boolean z = cVar.f;
            if (z && cVar.g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (cVar.h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (cVar.i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i2 = bVar.a;
        if (i2 == -1) {
            i2 = cVar != null ? cVar.b : -1;
        }
        t.p(q(i2)).l(p(i2)).i(o(i2));
        PointF pointF = bVar.b;
        if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
            t.k(f(t.d()));
            t.h(f(t.c()), 0);
        } else {
            t.k(pointF.x / f);
            t.h(bVar.b.y / f2, 0);
        }
        return t.a();
    }

    private Charset h(G g2) {
        Charset W = g2.W();
        return W != null ? W : StandardCharsets.UTF_8;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i(java.lang.String r17, ax.R1.a r18, java.util.List<java.util.List<ax.R0.a>> r19, java.util.List<java.lang.Long> r20) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.R1.b.i(java.lang.String, ax.R1.a, java.util.List, java.util.List):void");
    }

    private void j(G g2, List<List<ax.R0.a>> list, List<Long> list2, Charset charset) {
        a aVar = this.a ? this.b : null;
        while (true) {
            String y = g2.y(charset);
            if (y == null) {
                return;
            }
            if (y.startsWith("Format:")) {
                aVar = a.a(y);
            } else if (y.startsWith("Dialogue:")) {
                if (aVar == null) {
                    C0987u.h("SsaParser", "Skipping dialogue line before complete format: " + y);
                } else {
                    i(y, aVar, list, list2);
                }
            }
        }
    }

    private void k(G g2, Charset charset) {
        while (true) {
            String y = g2.y(charset);
            if (y == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(y)) {
                l(g2, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(y)) {
                this.d = m(g2, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(y)) {
                C0987u.f("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(y)) {
                return;
            }
        }
    }

    private void l(G g2, Charset charset) {
        while (true) {
            String y = g2.y(charset);
            if (y == null) {
                return;
            }
            if (g2.a() != 0 && g2.l(charset) == 91) {
                return;
            }
            String[] split = y.split(":");
            if (split.length == 2) {
                String e = C2876c.e(split[0].trim());
                e.getClass();
                if (e.equals("playresx")) {
                    this.e = Float.parseFloat(split[1].trim());
                } else if (e.equals("playresy")) {
                    try {
                        this.f = Float.parseFloat(split[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static Map<String, c> m(G g2, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVar = null;
        while (true) {
            String y = g2.y(charset);
            if (y == null || (g2.a() != 0 && g2.l(charset) == 91)) {
                break;
            }
            if (y.startsWith("Format:")) {
                aVar = c.a.a(y);
            } else if (y.startsWith("Style:")) {
                if (aVar == null) {
                    C0987u.h("SsaParser", "Skipping 'Style:' line before 'Format:' line: " + y);
                } else {
                    c b = c.b(y, aVar);
                    if (b != null) {
                        linkedHashMap.put(b.a, b);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long n(String str) {
        Matcher matcher = g.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) d0.i(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) d0.i(matcher.group(2))) * 60000000) + (Long.parseLong((String) d0.i(matcher.group(3))) * 1000000) + (Long.parseLong((String) d0.i(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    private static int o(int i) {
        switch (i) {
            case SubsamplingScaleImageView.ORIENTATION_USE_EXIF /* -1 */:
                break;
            case 0:
            default:
                C0987u.h("SsaParser", "Unknown alignment: " + i);
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private static int p(int i) {
        switch (i) {
            case SubsamplingScaleImageView.ORIENTATION_USE_EXIF /* -1 */:
                break;
            case 0:
            default:
                C0987u.h("SsaParser", "Unknown alignment: " + i);
                break;
            case 1:
            case 4:
            case 7:
                break;
            case 2:
            case 5:
            case 8:
                break;
            case 3:
            case 6:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private static Layout.Alignment q(int i) {
        switch (i) {
            case SubsamplingScaleImageView.ORIENTATION_USE_EXIF /* -1 */:
                return null;
            case 0:
            default:
                C0987u.h("SsaParser", "Unknown alignment: " + i);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
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
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.c.Z(bArr, i + i2);
        this.c.b0(i);
        Charset h = h(this.c);
        if (!this.a) {
            k(this.c, h);
        }
        j(this.c, arrayList, arrayList2, h);
        ArrayList arrayList3 = (bVar.a == -9223372036854775807L || !bVar.b) ? null : new ArrayList();
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            List<ax.R0.a> list = arrayList.get(i4);
            if (!list.isEmpty() || i4 == 0) {
                if (i4 == arrayList.size() - 1) {
                    throw new IllegalStateException();
                }
                long longValue = arrayList2.get(i4).longValue();
                long longValue2 = arrayList2.get(i4 + 1).longValue();
                e eVar = new e(list, longValue, longValue2 - longValue);
                long j = bVar.a;
                if (j == -9223372036854775807L || longValue2 >= j) {
                    interfaceC0979l.accept(eVar);
                } else if (arrayList3 != null) {
                    arrayList3.add(eVar);
                }
            }
        }
        if (arrayList3 != null) {
            int size = arrayList3.size();
            while (i3 < size) {
                Object obj = arrayList3.get(i3);
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
