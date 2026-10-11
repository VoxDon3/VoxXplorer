package ax.K1;

import ax.P0.C0912v;
import ax.P0.D;
import j$.util.Objects;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class k {
    public static String a(C0912v c0912v) {
        String str = c0912v.o;
        return D.s(str) ? "video/mp4" : D.o(str) ? "audio/mp4" : D.q(str) ? Objects.equals(str, "image/heic") ? "image/heif" : Objects.equals(str, "image/avif") ? "image/avif" : "application/mp4" : "application/mp4";
    }

    public static String b(List<w> list) {
        Iterator<w> it = list.iterator();
        boolean z = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = it.next().a.g.o;
            if (D.s(str2)) {
                return "video/mp4";
            }
            if (D.o(str2)) {
                z = true;
            } else if (D.q(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z ? "audio/mp4" : str != null ? str : "application/mp4";
    }
}
