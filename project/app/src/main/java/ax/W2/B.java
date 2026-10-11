/*
 * Decompiled with CFR 0.152.
 */
package ax.W2;

import ax.W2.C;
import ax.W2.h;
import ax.W2.j;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.o;
import java.io.File;

public class B
extends h {
    private o d;
    private o e;
    private File f;
    private n g;

    public static B l() {
        return new B();
    }

    @Override
    protected j b() {
        return new C(this.f(), this.d, this.f, this.e, this.g);
    }

    public void k(o o8, File file, o o9, n n8, h.a a8) {
        this.d = o8;
        this.f = file;
        this.e = o9;
        this.g = n8;
        this.i(a8);
        this.j(h.c.c0);
    }
}

