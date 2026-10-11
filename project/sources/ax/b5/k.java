package ax.b5;

import java.io.Serializable;

/* loaded from: classes.dex */
public class k implements Serializable {
    private final char c0;
    private final char d0;
    private final char q;

    public k() {
        this(':', ',', ',');
    }

    public static k a() {
        return new k();
    }

    public char b() {
        return this.d0;
    }

    public char c() {
        return this.c0;
    }

    public char d() {
        return this.q;
    }

    public k(char c, char c2, char c3) {
        this.q = c;
        this.c0 = c2;
        this.d0 = c3;
    }
}
