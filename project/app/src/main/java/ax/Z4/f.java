/*
 * Decompiled with CFR 0.152.
 */
package ax.Z4;

import ax.T4.g;
import ax.T4.k;
import ax.T4.l;
import ax.Z4.b;

public class f
extends l {
    protected final f d;
    protected b e;
    protected f f;
    protected String g;
    protected Object h;
    protected boolean i;

    protected f(int n8, f f8, b b8) {
        this.a = n8;
        this.d = f8;
        this.e = b8;
        this.b = -1;
    }

    private final void i(b object, String string) throws k {
        if (((b)object).c(string)) {
            object = ((b)object).b();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Duplicate field '");
            stringBuilder.append(string);
            stringBuilder.append("'");
            string = stringBuilder.toString();
            object = object instanceof g ? (g)object : null;
            throw new ax.T4.f(string, (g)object);
        }
    }

    public static f m(b b8) {
        return new f(0, null, b8);
    }

    @Override
    public final String b() {
        return this.g;
    }

    public f j() {
        this.h = null;
        return this.d;
    }

    public f k() {
        Object object = this.f;
        if (object == null) {
            object = this.e;
            object = object == null ? null : ((b)object).a();
            this.f = object = new f(1, this, (b)object);
            return object;
        }
        return ((f)object).n(1);
    }

    public f l() {
        Object object = this.f;
        if (object == null) {
            object = this.e;
            object = object == null ? null : ((b)object).a();
            this.f = object = new f(2, this, (b)object);
            return object;
        }
        return ((f)object).n(2);
    }

    public f n(int n8) {
        this.a = n8;
        this.b = -1;
        this.g = null;
        this.i = false;
        this.h = null;
        b b8 = this.e;
        if (b8 != null) {
            b8.d();
        }
        return this;
    }

    public int o(String string) throws k {
        if (this.a == 2 && !this.i) {
            this.i = true;
            this.g = string;
            b b8 = this.e;
            if (b8 != null) {
                this.i(b8, string);
            }
            if (this.b < 0) {
                return 0;
            }
            return 1;
        }
        return 4;
    }

    public int p() {
        int n8 = this.a;
        if (n8 == 2) {
            if (!this.i) {
                return 5;
            }
            this.i = false;
            ++this.b;
            return 2;
        }
        if (n8 == 1) {
            n8 = this.b;
            this.b = n8 + 1;
            if (n8 < 0) {
                return 0;
            }
            return 1;
        }
        this.b = n8 = this.b + 1;
        if (n8 == 0) {
            return 0;
        }
        return 3;
    }
}

