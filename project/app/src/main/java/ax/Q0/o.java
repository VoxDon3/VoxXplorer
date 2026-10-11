/*
 * Decompiled with CFR 0.152.
 */
package ax.Q0;

import ax.P0.v;
import ax.S0.d0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public interface o {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public void a();

    public ByteBuffer b();

    public boolean c();

    public void d(ByteBuffer var1);

    public boolean e();

    public void f();

    public void flush();

    public a g(a var1) throws b;

    public static final class a {
        public static final a e = new a(-1, -1, -1);
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public a(int n8, int n9, int n10) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
            n8 = d0.L0(n10) ? d0.m0(n10, n9) : -1;
            this.d = n8;
        }

        public a(v v8) {
            this(v8.H, v8.G, v8.I);
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof a)) {
                return false;
            }
            object = (a)object;
            return this.a == ((a)object).a && this.b == ((a)object).b && this.c == ((a)object).c;
        }

        public int hashCode() {
            return j.Objects.hash((Object[])new Object[]{this.a, this.b, this.c});
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AudioFormat[sampleRate=");
            stringBuilder.append(this.a);
            stringBuilder.append(", channelCount=");
            stringBuilder.append(this.b);
            stringBuilder.append(", encoding=");
            stringBuilder.append(this.c);
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
    }

    public static final class b
    extends Exception {
        public final a q;

        public b(a a8) {
            this("Unhandled input format:", a8);
        }

        public b(String string, a a8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(" ");
            stringBuilder.append(a8);
            super(stringBuilder.toString());
            this.q = a8;
        }
    }
}

