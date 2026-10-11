/*
 * Decompiled with CFR 0.152.
 */
package ax.Z2;

import com.alphainventor.filemanager.file.n;
import java.io.Serializable;

public class p
implements Serializable {
    public long c0 = -1L;
    public long d0 = -1L;
    public long e0 = -1L;
    public String f0 = null;
    public int g0 = -1;
    public int h0 = -1;
    public int i0 = -1;
    public String j0;
    public String k0;
    public String l0;
    public long q = -1L;

    public boolean a() {
        if (this.q < 0L && this.c0 < 0L && this.d0 < 0L && this.e0 < 0L) {
            return this.f0 == null;
        }
        return false;
    }

    public boolean b() {
        return this.d0 >= 0L || this.e0 >= 0L;
        {
        }
    }

    public boolean c() {
        return this.q >= 0L || this.c0 >= 0L;
        {
        }
    }

    public boolean d() {
        return this.f0 != null;
    }

    public boolean e(n object) {
        long l8;
        long l9;
        if (this.c()) {
            l9 = object.q();
            l8 = this.q;
            if (l8 >= 0L && l9 < l8) {
                return false;
            }
            l8 = this.c0;
            if (l8 >= 0L && l9 > l8) {
                return false;
            }
        }
        if (this.b()) {
            if (object.isDirectory()) {
                return false;
            }
            l9 = object.p();
            l8 = this.d0;
            if (l8 >= 0L && l9 < l8) {
                return false;
            }
            l8 = this.e0;
            if (l8 >= 0L && l9 > l8) {
                return false;
            }
        }
        if (this.d()) {
            if (object.isDirectory()) {
                return false;
            }
            object = ((n)object).A();
            String string = this.f0;
            if (string != null && !string.equals(object)) {
                return false;
            }
        }
        return true;
    }

    public void f(p p8) {
        this.q = p8.q;
        this.c0 = p8.c0;
        this.d0 = p8.d0;
        this.e0 = p8.e0;
        this.f0 = p8.f0;
        this.g0 = p8.g0;
        this.h0 = p8.h0;
        this.i0 = p8.i0;
        this.j0 = p8.j0;
        this.k0 = p8.k0;
        this.l0 = p8.l0;
    }
}

