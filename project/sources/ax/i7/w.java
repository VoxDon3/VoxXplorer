package ax.i7;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class w {
    static final Logger a = Logger.getLogger(w.class.getName());
    private static final String[] b;

    static {
        String[] strArr = {"DELETE", "GET", "POST", "PUT"};
        b = strArr;
        Arrays.sort(strArr);
    }

    p a() {
        return new p(this, null);
    }

    protected abstract z b(String str, String str2) throws IOException;

    public final q c() {
        return d(null);
    }

    public final q d(r rVar) {
        return new q(this, rVar);
    }

    public boolean e() {
        return false;
    }

    public boolean f(String str) throws IOException {
        return Arrays.binarySearch(b, str) >= 0;
    }
}
