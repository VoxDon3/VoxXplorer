package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import ax.Y.u;
import ax.b0.C1446g;
import ax.w0.C3322b;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class n {
    private final C3322b a;
    private final char[] b;
    private final a c = new a(1024);
    private final Typeface d;

    static class a {
        private final SparseArray<a> a;
        private o b;

        private a() {
            this(1);
        }

        a a(int i) {
            SparseArray<a> sparseArray = this.a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i);
        }

        final o b() {
            return this.b;
        }

        void c(o oVar, int i, int i2) {
            a a = a(oVar.b(i));
            if (a == null) {
                a = new a();
                this.a.put(oVar.b(i), a);
            }
            if (i2 > i) {
                a.c(oVar, i + 1, i2);
            } else {
                a.b = oVar;
            }
        }

        a(int i) {
            this.a = new SparseArray<>(i);
        }
    }

    private n(Typeface typeface, C3322b c3322b) {
        this.d = typeface;
        this.a = c3322b;
        this.b = new char[c3322b.k() * 2];
        a(c3322b);
    }

    private void a(C3322b c3322b) {
        int k = c3322b.k();
        for (int i = 0; i < k; i++) {
            o oVar = new o(this, i);
            Character.toChars(oVar.f(), this.b, i * 2);
            h(oVar);
        }
    }

    public static n b(Typeface typeface, ByteBuffer byteBuffer) throws IOException {
        try {
            u.a("EmojiCompat.MetadataRepo.create");
            return new n(typeface, m.b(byteBuffer));
        } finally {
            u.b();
        }
    }

    public char[] c() {
        return this.b;
    }

    public C3322b d() {
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

    void h(o oVar) {
        C1446g.h(oVar, "emoji metadata cannot be null");
        C1446g.b(oVar.c() > 0, "invalid metadata codepoint length");
        this.c.c(oVar, 0, oVar.c() - 1);
    }
}
