/*
 * Decompiled with CFR 0.152.
 */
package ax.m1;

import ax.m1.q;
import ax.m1.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class s {
    private static final Comparator<b> h = new q();
    private static final Comparator<b> i = new r();
    private final int a;
    private final ArrayList<b> b;
    private final b[] c;
    private int d;
    private int e;
    private int f;
    private int g;

    public s(int n8) {
        this.a = n8;
        this.c = new b[5];
        this.b = new ArrayList();
        this.d = -1;
    }

    public static /* synthetic */ int a(b b8, b b9) {
        return Float.compare(b8.c, b9.c);
    }

    public static /* synthetic */ int b(b b8, b b9) {
        return b8.a - b9.a;
    }

    private void d() {
        if (this.d != 1) {
            Collections.sort(this.b, h);
            this.d = 1;
        }
    }

    private void e() {
        if (this.d != 0) {
            Collections.sort(this.b, i);
            this.d = 0;
        }
    }

    public void c(int n8, float f8) {
        Object object;
        this.d();
        int n9 = this.g;
        if (n9 > 0) {
            object = this.c;
            this.g = --n9;
            object = object[n9];
        } else {
            object = new b();
        }
        n9 = this.e;
        this.e = n9 + 1;
        object.a = n9;
        object.b = n8;
        object.c = f8;
        this.b.add((b)object);
        this.f += n8;
        while ((n8 = this.f) > (n9 = this.a)) {
            n8 -= n9;
            b b8 = this.b.get(0);
            n9 = b8.b;
            if (n9 <= n8) {
                this.f -= n9;
                this.b.remove(0);
                n8 = this.g;
                if (n8 >= 5) continue;
                object = this.c;
                this.g = n8 + 1;
                object[n8] = b8;
                continue;
            }
            b8.b = n9 - n8;
            this.f -= n8;
        }
    }

    public float f(float f8) {
        Object object;
        this.e();
        float f9 = this.f;
        int n8 = 0;
        for (int i8 = 0; i8 < this.b.size(); ++i8) {
            object = this.b.get(i8);
            if (!((float)(n8 += ((b)object).b) >= f8 * f9)) continue;
            return ((b)object).c;
        }
        if (this.b.isEmpty()) {
            return Float.NaN;
        }
        object = this.b;
        return ((b)((ArrayList)object).get((int)(((ArrayList)object).size() - 1))).c;
    }

    public void g() {
        this.b.clear();
        this.d = -1;
        this.e = 0;
        this.f = 0;
    }

    private static class b {
        public int a;
        public int b;
        public float c;

        private b() {
        }
    }
}

