/*
 * Decompiled with CFR 0.152.
 */
package ax.t8;

import ax.r8.i;
import ax.r8.j;
import ax.r8.k;
import ax.r8.m;
import ax.r8.r;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

public final class l {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static i a(JsonReader object) throws m {
        boolean bl;
        block8: {
            try {
                try {
                    ((JsonReader)object).peek();
                    bl = false;
                }
                catch (EOFException eOFException) {
                    bl = true;
                    break block8;
                }
                try {
                    return TypeAdapters.V.c((JsonReader)object);
                }
                catch (EOFException eOFException) {
                }
            }
            catch (NumberFormatException numberFormatException) {
                throw new r(numberFormatException);
            }
            catch (IOException iOException) {
                throw new j(iOException);
            }
            catch (MalformedJsonException malformedJsonException) {
                throw new r(malformedJsonException);
            }
        }
        if (!bl) void var0_6;
        throw new r((Throwable)var0_6);
        return k.q;
    }

    public static void b(i i8, JsonWriter jsonWriter) throws IOException {
        TypeAdapters.V.e(jsonWriter, i8);
    }

    public static Writer c(Appendable appendable) {
        if (appendable instanceof Writer) {
            return (Writer)appendable;
        }
        return new a(appendable);
    }

    private static final class ax.t8.l$a
    extends Writer
    implements AutoCloseable {
        private final a c0 = new a();
        private final Appendable q;

        ax.t8.l$a(Appendable appendable) {
            this.q = appendable;
        }

        @Override
        public void close() {
        }

        @Override
        public void flush() {
        }

        @Override
        public void write(int n8) throws IOException {
            this.q.append((char)n8);
        }

        @Override
        public void write(char[] cArray, int n8, int n9) throws IOException {
            a a8 = this.c0;
            a8.q = cArray;
            this.q.append(a8, n8, n9 + n8);
        }

        static class a
        implements CharSequence {
            char[] q;

            a() {
            }

            @Override
            public char charAt(int n8) {
                return this.q[n8];
            }

            @Override
            public int length() {
                return this.q.length;
            }

            @Override
            public CharSequence subSequence(int n8, int n9) {
                return new String(this.q, n8, n9 - n8);
            }
        }
    }
}

