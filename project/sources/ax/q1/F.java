package ax.q1;

import ax.P0.C;
import ax.S0.d0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class F {
    private static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    private boolean b(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt((String) d0.i(matcher.group(1)), 16);
            int parseInt2 = Integer.parseInt((String) d0.i(matcher.group(2)), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.a = parseInt;
            this.b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean a() {
        return (this.a == -1 || this.b == -1) ? false : true;
    }

    public boolean c(ax.P0.C c2) {
        for (int i = 0; i < c2.e(); i++) {
            C.a d = c2.d(i);
            if (d instanceof ax.E1.e) {
                ax.E1.e eVar = (ax.E1.e) d;
                if ("iTunSMPB".equals(eVar.c) && b(eVar.d)) {
                    return true;
                }
            } else if (d instanceof ax.E1.k) {
                ax.E1.k kVar = (ax.E1.k) d;
                if ("com.apple.iTunes".equals(kVar.b) && "iTunSMPB".equals(kVar.c) && b(kVar.d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
