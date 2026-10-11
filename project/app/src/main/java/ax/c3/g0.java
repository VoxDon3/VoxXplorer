/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import ax.Q2.f;
import ax.Z2.o;
import ax.g3.k;
import com.alphainventor.filemanager.file.T;
import java.util.Map;

public abstract class g0
extends T {
    @Override
    public void g(int n8, String string) {
        k k8 = new k(this){
            final g0 a;
            {
                this.a = g02;
            }

            @Override
            public void a(f f8, String string, int n8, String string2, String string3) {
            }

            @Override
            public void b(f f8) {
            }

            @Override
            public void c(f f8, int n8) {
            }

            @Override
            public void d(f f8, int n8, Map<String, Object> map) {
            }
        };
        o o8 = this.k(n8);
        o8.q(string);
        this.l(n8, o8, k8, false);
    }

    public abstract o k(int var1);

    public abstract void l(int var1, o var2, k var3, boolean var4);
}

