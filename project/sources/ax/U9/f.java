package ax.U9;

import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class f extends RuntimeException {
    private final String c0;
    private final String q;

    public f(String str) {
        super(str);
        this.q = HttpUrl.FRAGMENT_ENCODE_SET;
        this.c0 = HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public f(String str, Throwable th) {
        super(str, th);
        this.q = HttpUrl.FRAGMENT_ENCODE_SET;
        this.c0 = HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public f(String str, String str2, String str3) {
        super(str2);
        if (str != null) {
            this.q = str;
            this.c0 = str3;
            return;
        }
        throw new AssertionError();
    }
}
