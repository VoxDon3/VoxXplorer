/*
 * Decompiled with CFR 0.152.
 */
package ax.o2;

import android.annotation.SuppressLint;
import ax.Gb.g;
import ax.Gb.l;
import ax.o2.i;
import ax.o2.j;

public final class a
implements j {
    public static final a d0 = new a(null);
    private final Object[] c0;
    private final String q;

    public a(String string) {
        l.f(string, "query");
        this(string, null);
    }

    public a(String string, Object[] objectArray) {
        l.f(string, "query");
        this.q = string;
        this.c0 = objectArray;
    }

    @Override
    public void a(i i8) {
        l.f(i8, "statement");
        d0.b(i8, this.c0);
    }

    @Override
    public String b() {
        return this.q;
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        private final void a(i object, int n8, Object object2) {
            if (object2 == null) {
                object.t0(n8);
                return;
            }
            if (object2 instanceof byte[]) {
                object.e0(n8, (byte[])object2);
                return;
            }
            if (object2 instanceof Float) {
                object.N(n8, ((Number)object2).floatValue());
                return;
            }
            if (object2 instanceof Double) {
                object.N(n8, ((Number)object2).doubleValue());
                return;
            }
            if (object2 instanceof Long) {
                object.X(n8, ((Number)object2).longValue());
                return;
            }
            if (object2 instanceof Integer) {
                object.X(n8, ((Number)object2).intValue());
                return;
            }
            if (object2 instanceof Short) {
                object.X(n8, ((Number)object2).shortValue());
                return;
            }
            if (object2 instanceof Byte) {
                object.X(n8, ((Number)object2).byteValue());
                return;
            }
            if (object2 instanceof String) {
                object.D(n8, (String)object2);
                return;
            }
            if (object2 instanceof Boolean) {
                long l8 = (Boolean)object2 != false ? 1L : 0L;
                object.X(n8, l8);
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Cannot bind ");
            ((StringBuilder)object).append(object2);
            ((StringBuilder)object).append(" at index ");
            ((StringBuilder)object).append(n8);
            ((StringBuilder)object).append(" Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }

        @SuppressLint(value={"SyntheticAccessor"})
        public final void b(i i8, Object[] objectArray) {
            l.f(i8, "statement");
            if (objectArray != null) {
                int n8 = objectArray.length;
                int n9 = 0;
                while (n9 < n8) {
                    Object object = objectArray[n9];
                    this.a(i8, ++n9, object);
                }
            }
        }
    }
}

