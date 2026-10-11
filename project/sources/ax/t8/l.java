package ax.t8;

import ax.r8.AbstractC3000i;
import ax.r8.C3001j;
import ax.r8.C3002k;
import ax.r8.C3004m;
import ax.r8.C3009r;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* loaded from: classes3.dex */
public final class l {
    public static AbstractC3000i a(JsonReader jsonReader) throws C3004m {
        boolean z;
        try {
            try {
                jsonReader.peek();
                z = false;
            } catch (EOFException e) {
                e = e;
                z = true;
            }
            try {
                return TypeAdapters.V.c(jsonReader);
            } catch (EOFException e2) {
                e = e2;
                if (z) {
                    return C3002k.q;
                }
                throw new C3009r(e);
            }
        } catch (MalformedJsonException e3) {
            throw new C3009r(e3);
        } catch (IOException e4) {
            throw new C3001j(e4);
        } catch (NumberFormatException e5) {
            throw new C3009r(e5);
        }
    }

    public static void b(AbstractC3000i abstractC3000i, JsonWriter jsonWriter) throws IOException {
        TypeAdapters.V.e(jsonWriter, abstractC3000i);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }

    private static final class a extends Writer implements AutoCloseable {
        private final C0463a c0 = new C0463a();
        private final Appendable q;

        /* renamed from: ax.t8.l$a$a, reason: collision with other inner class name */
        static class C0463a implements CharSequence {
            char[] q;

            C0463a() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i) {
                return this.q[i];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.q.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i, int i2) {
                return new String(this.q, i, i2 - i);
            }
        }

        a(Appendable appendable) {
            this.q = appendable;
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) throws IOException {
            C0463a c0463a = this.c0;
            c0463a.q = cArr;
            this.q.append(c0463a, i, i2 + i);
        }

        @Override // java.io.Writer
        public void write(int i) throws IOException {
            this.q.append((char) i);
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }
    }
}
