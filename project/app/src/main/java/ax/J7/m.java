/*
 * Decompiled with CFR 0.152.
 */
package ax.J7;

import ax.G7.g;
import ax.J7.l;
import ax.J7.x;
import ax.o8.b;

public class m
implements b {
    private final x a;
    private final l b;

    public m(x x8, ax.O7.g g8) {
        this.a = x8;
        this.b = new l(g8);
    }

    @Override
    public boolean a() {
        return this.a.d();
    }

    @Override
    public b.a b() {
        return b.a.q;
    }

    @Override
    public void c(b.b b8) {
        g g8 = g.f();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("App Quality Sessions session changed: ");
        stringBuilder.append(b8);
        g8.b(stringBuilder.toString());
        this.b.f(b8.a());
    }

    public String d(String string) {
        return this.b.c(string);
    }

    public void e(String string) {
        this.b.g(string);
    }
}

