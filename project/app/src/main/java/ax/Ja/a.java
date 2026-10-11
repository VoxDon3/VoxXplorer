/*
 * Decompiled with CFR 0.152.
 */
package ax.Ja;

public class a
extends Exception {
    private int c0;
    private String q;

    public a(String string) {
        super(string);
    }

    public a(String string, int n8, String string2) {
        super(string);
        this.c0 = n8;
        this.q = string2;
    }

    public a(Throwable throwable) {
        super(throwable);
    }

    public a(Throwable throwable, int n8, String string) {
        super(throwable);
        this.c0 = n8;
        this.q = string;
    }

    public String a() {
        return this.q;
    }

    public int b() {
        return this.c0;
    }

    @Override
    public String getMessage() {
        return String.format("%s (%d %s)", super.getMessage(), this.c0, this.a());
    }
}

