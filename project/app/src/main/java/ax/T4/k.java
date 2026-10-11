/*
 * Decompiled with CFR 0.152.
 */
package ax.T4;

import ax.T4.c;
import ax.T4.h;

public class k
extends c {
    protected h q;

    protected k(String string) {
        super(string);
    }

    protected k(String string, h h8) {
        this(string, h8, null);
    }

    protected k(String string, h h8, Throwable throwable) {
        super(string, throwable);
        this.q = h8;
    }

    public h a() {
        return this.q;
    }

    protected String b() {
        return null;
    }

    @Override
    public String getMessage() {
        String string;
        String string2 = string = super.getMessage();
        if (string == null) {
            string2 = "N/A";
        }
        h h8 = this.a();
        string = this.b();
        if (h8 == null && string == null) {
            return string2;
        }
        StringBuilder stringBuilder = new StringBuilder(100);
        stringBuilder.append(string2);
        if (string != null) {
            stringBuilder.append(string);
        }
        if (h8 != null) {
            stringBuilder.append('\n');
            stringBuilder.append(" at ");
            stringBuilder.append(h8.toString());
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getName());
        stringBuilder.append(": ");
        stringBuilder.append(this.getMessage());
        return stringBuilder.toString();
    }
}

