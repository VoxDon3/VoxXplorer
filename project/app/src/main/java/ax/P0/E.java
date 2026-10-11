/*
 * Decompiled with CFR 0.152.
 */
package ax.P0;

import java.io.IOException;

public class E
extends IOException {
    public final int c0;
    public final boolean q;

    protected E(String string, Throwable throwable, boolean bl, int n8) {
        super(string, throwable);
        this.q = bl;
        this.c0 = n8;
    }

    public static E a(String string, Throwable throwable) {
        return new E(string, throwable, true, 1);
    }

    public static E b(String string, Throwable throwable) {
        return new E(string, throwable, true, 0);
    }

    public static E c(String string, Throwable throwable) {
        return new E(string, throwable, true, 4);
    }

    public static E d(String string) {
        return new E(string, null, false, 1);
    }

    @Override
    public String getMessage() {
        CharSequence charSequence;
        String string = super.getMessage();
        StringBuilder stringBuilder = new StringBuilder();
        if (string != null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append(" ");
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = "";
        }
        stringBuilder.append((String)charSequence);
        stringBuilder.append("{contentIsMalformed=");
        stringBuilder.append(this.q);
        stringBuilder.append(", dataType=");
        stringBuilder.append(this.c0);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

