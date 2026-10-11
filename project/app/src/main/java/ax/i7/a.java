/*
 * Decompiled with CFR 0.152.
 */
package ax.i7;

import ax.i7.i;
import ax.i7.o;
import ax.m7.l;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public abstract class a
implements i {
    private o a;
    private long b;

    protected a(o o8) {
        this.b = -1L;
        this.a = o8;
    }

    protected a(String object) {
        object = object == null ? null : new o((String)object);
        this((o)object);
    }

    public static long e(i i8) throws IOException {
        if (!i8.c()) {
            return -1L;
        }
        return l.a(i8);
    }

    @Override
    public String a() {
        o o8 = this.a;
        if (o8 == null) {
            return null;
        }
        return o8.a();
    }

    @Override
    public boolean c() {
        return true;
    }

    protected long d() throws IOException {
        return ax.i7.a.e(this);
    }

    protected final Charset f() {
        o o8 = this.a;
        if (o8 != null && o8.e() != null) {
            return this.a.e();
        }
        return StandardCharsets.ISO_8859_1;
    }

    public final o g() {
        return this.a;
    }

    @Override
    public long getLength() throws IOException {
        if (this.b == -1L) {
            this.b = this.d();
        }
        return this.b;
    }
}

