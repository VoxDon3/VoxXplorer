/*
 * Decompiled with CFR 0.152.
 */
package ax.U0;

import java.io.IOException;

public class h
extends IOException {
    public final int q;

    public h(int n8) {
        this.q = n8;
    }

    public h(String string, int n8) {
        super(string);
        this.q = n8;
    }

    public h(String string, Throwable throwable, int n8) {
        super(string, throwable);
        this.q = n8;
    }

    public h(Throwable throwable, int n8) {
        super(throwable);
        this.q = n8;
    }

    public static boolean a(IOException throwable) {
        while (throwable != null) {
            if (throwable instanceof h && ((h)throwable).q == 2008) {
                return true;
            }
            throwable = throwable.getCause();
        }
        return false;
    }
}

