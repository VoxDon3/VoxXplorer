package ax.oa;

import ax.sa.EnumC3068a;
import java.io.IOException;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class f extends IOException {
    private final EnumC3068a c0;
    private final int q;

    public f(String str, int i) {
        super(a(str, i));
        this.q = i;
        this.c0 = EnumC3068a.h(i);
    }

    private static String a(String str, int i) {
        EnumC3068a h = EnumC3068a.h(i);
        return String.format("%s returned error code: 0x%08X %s", str, Integer.valueOf(i), h == null ? HttpUrl.FRAGMENT_ENCODE_SET : String.format("(%s)", h));
    }
}
