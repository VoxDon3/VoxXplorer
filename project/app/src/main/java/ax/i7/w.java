/*
 * Decompiled with CFR 0.152.
 */
package ax.i7;

import ax.i7.p;
import ax.i7.q;
import ax.i7.r;
import ax.i7.z;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

public abstract class w {
    static final Logger a = Logger.getLogger(w.class.getName());
    private static final String[] b;

    static {
        Object[] objectArray = new String[]{"DELETE", "GET", "POST", "PUT"};
        b = objectArray;
        Arrays.sort(objectArray);
    }

    p a() {
        return new p(this, null);
    }

    protected abstract z b(String var1, String var2) throws IOException;

    public final q c() {
        return this.d(null);
    }

    public final q d(r r8) {
        return new q(this, r8);
    }

    public boolean e() {
        return false;
    }

    public boolean f(String string) throws IOException {
        return Arrays.binarySearch(b, string) >= 0;
    }
}

