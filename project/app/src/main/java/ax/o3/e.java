/*
 * Decompiled with CFR 0.152.
 */
package ax.o3;

import ax.c3.K;
import com.alphainventor.filemanager.file.n;

public class e {
    private static e d;
    private K a;
    private String b;
    private long c;

    public static e b() {
        if (d == null) {
            d = new e();
        }
        return d;
    }

    private boolean e() {
        return this.b == null;
    }

    private boolean f(K object, String string) {
        return object == this.a && (object = this.b) != null && ((String)object).equals(string);
    }

    public void a() {
        this.a = null;
        this.b = null;
        this.c = 0L;
    }

    public long c(K k8, String string) {
        if (this.f(k8, string)) {
            return this.c;
        }
        return 0L;
    }

    public long d(n n8) {
        return this.c(n8.R(), n8.E());
    }

    public void g(K k8, String string, long l8) {
        if (this.f(k8, string)) {
            if (l8 > this.c) {
                this.c = l8;
            }
            return;
        }
        this.a = k8;
        this.b = string;
        this.c = l8;
    }

    public void h(n n8, long l8) {
        this.g(n8.R(), n8.E(), l8);
    }

    public void i(K k8, String string, long l8) {
        if (this.f(k8, string)) {
            if (l8 > this.c) {
                this.c = l8;
                return;
            }
        } else if (this.e()) {
            this.g(k8, string, l8);
        }
    }

    public void j(n n8, long l8) {
        this.i(n8.R(), n8.E(), l8);
    }
}

