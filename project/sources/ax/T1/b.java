package ax.T1;

import android.text.TextUtils;
import ax.q7.C2876c;
import ax.r7.AbstractC2964C;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class b {
    private static final Pattern d = Pattern.compile("\\s+");
    private static final AbstractC2964C<String> e = AbstractC2964C.A("auto", "none");
    private static final AbstractC2964C<String> f = AbstractC2964C.B("dot", "sesame", "circle");
    private static final AbstractC2964C<String> g = AbstractC2964C.A("filled", "open");
    private static final AbstractC2964C<String> h = AbstractC2964C.B("after", "before", "outside");
    public final int a;
    public final int b;
    public final int c;

    private b(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        String e2 = C2876c.e(str.trim());
        if (e2.isEmpty()) {
            return null;
        }
        return b(AbstractC2964C.u(TextUtils.split(e2, d)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ed, code lost:
    
        if (r9.equals("dot") != false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static ax.T1.b b(ax.r7.AbstractC2964C<java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.T1.b.b(ax.r7.C):ax.T1.b");
    }
}
