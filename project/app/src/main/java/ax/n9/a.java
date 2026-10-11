/*
 * Decompiled with CFR 0.152.
 */
package ax.n9;

import ax.n9.b;

public class a
implements b {
    private String a;
    private int b;

    public a(String string, int n8) {
        this.a = string;
        this.b = n8;
    }

    public String a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (a)object;
            if (this.b != ((a)object).b) {
                return false;
            }
            return this.a.equals(((a)object).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() * 31 + this.b;
    }
}

