/*
 * Decompiled with CFR 0.152.
 */
package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.emoji2.text.m;
import androidx.emoji2.text.o;
import ax.Y.u;
import ax.b0.g;
import ax.w0.b;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class n {
    private final b a;
    private final char[] b;
    private final a c;
    private final Typeface d;

    private n(Typeface typeface, b b8) {
        this.d = typeface;
        this.a = b8;
        this.c = new a(1024);
        this.b = new char[b8.k() * 2];
        this.a(b8);
    }

    private void a(b object) {
        int n8 = ((b)object).k();
        for (int i8 = 0; i8 < n8; ++i8) {
            object = new o(this, i8);
            Character.toChars(((o)object).f(), this.b, i8 * 2);
            this.h((o)object);
        }
    }

    public static n b(Typeface object, ByteBuffer byteBuffer) throws IOException {
        try {
            u.a("EmojiCompat.MetadataRepo.create");
            object = new n((Typeface)object, m.b(byteBuffer));
            return object;
        }
        finally {
            u.b();
        }
    }

    public char[] c() {
        return this.b;
    }

    public b d() {
        return this.a;
    }

    int e() {
        return this.a.l();
    }

    a f() {
        return this.c;
    }

    Typeface g() {
        return this.d;
    }

    void h(o o8) {
        g.h(o8, "emoji metadata cannot be null");
        boolean bl = o8.c() > 0;
        g.b(bl, "invalid metadata codepoint length");
        this.c.c(o8, 0, o8.c() - 1);
    }

    static class a {
        private final SparseArray<a> a;
        private o b;

        private a() {
            this(1);
        }

        a(int n8) {
            this.a = new SparseArray(n8);
        }

        a a(int n8) {
            SparseArray<a> sparseArray = this.a;
            if (sparseArray == null) {
                return null;
            }
            return (a)sparseArray.get(n8);
        }

        final o b() {
            return this.b;
        }

        void c(o o8, int n8, int n9) {
            a a8;
            a a9 = a8 = this.a(o8.b(n8));
            if (a8 == null) {
                a9 = new a();
                this.a.put(o8.b(n8), (Object)a9);
            }
            if (n9 > n8) {
                a9.c(o8, n8 + 1, n9);
                return;
            }
            a9.b = o8;
        }
    }
}

