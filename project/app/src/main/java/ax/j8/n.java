/*
 * Decompiled with CFR 0.152.
 */
package ax.j8;

import ax.i8.l;
import ax.j8.k;

public class n
implements l {
    private final String a;
    private final int b;

    n(String string, int n8) {
        this.a = string;
        this.b = n8;
    }

    private String e() {
        return this.d().trim();
    }

    private void f() {
        if (this.a != null) {
            return;
        }
        throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
    }

    @Override
    public int a() {
        return this.b;
    }

    @Override
    public long b() {
        if (this.b == 0) {
            return 0L;
        }
        String string = this.e();
        try {
            long l8 = Long.valueOf(string);
            return l8;
        }
        catch (NumberFormatException numberFormatException) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", string, "long"), numberFormatException);
        }
    }

    @Override
    public boolean c() throws IllegalArgumentException {
        if (this.b == 0) {
            return false;
        }
        String string = this.e();
        if (k.f.matcher(string).matches()) {
            return true;
        }
        if (k.g.matcher(string).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", string, "boolean"));
    }

    public String d() {
        if (this.b == 0) {
            return "";
        }
        this.f();
        return this.a;
    }
}

