package ax.P0;

import java.io.IOException;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class E extends IOException {
    public final int c0;
    public final boolean q;

    protected E(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.q = z;
        this.c0 = i;
    }

    public static E a(String str, Throwable th) {
        return new E(str, th, true, 1);
    }

    public static E b(String str, Throwable th) {
        return new E(str, th, true, 0);
    }

    public static E c(String str, Throwable th) {
        return new E(str, th, true, 4);
    }

    public static E d(String str) {
        return new E(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        if (message != null) {
            str = message + " ";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str);
        sb.append("{contentIsMalformed=");
        sb.append(this.q);
        sb.append(", dataType=");
        sb.append(this.c0);
        sb.append("}");
        return sb.toString();
    }
}
