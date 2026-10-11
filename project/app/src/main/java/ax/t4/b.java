/*
 * Decompiled with CFR 0.152.
 */
package ax.t4;

import ax.T4.e;
import ax.T4.h;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.t4.a;
import ax.w4.d;
import java.io.IOException;
import java.io.InputStream;

public abstract class b<T> {
    public static final b<Long> a = new b<Long>(){

        public Long m(j j8) throws IOException, a {
            return ax.t4.b.j(j8);
        }
    };
    public static final b<Long> b = new b<Long>(){

        public Long m(j j8) throws IOException, a {
            long l8 = j8.q();
            j8.H();
            return l8;
        }
    };
    public static final b<Integer> c = new b<Integer>(){

        public Integer m(j j8) throws IOException, a {
            int n8 = j8.p();
            j8.H();
            return n8;
        }
    };
    public static final b<Long> d = new b<Long>(){

        public Long m(j j8) throws IOException, a {
            return ax.t4.b.j(j8);
        }
    };
    public static final b<Long> e = new b<Long>(){

        public Long m(j j8) throws IOException, a {
            long l8 = ax.t4.b.j(j8);
            if (l8 < 0x100000000L) {
                return l8;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("expecting a 32-bit unsigned integer, got: ");
            stringBuilder.append(l8);
            throw new a(stringBuilder.toString(), j8.v());
        }
    };
    public static final b<Double> f = new b<Double>(){

        public Double m(j j8) throws IOException, a {
            double d8 = j8.m();
            j8.H();
            return d8;
        }
    };
    public static final b<Float> g = new b<Float>(){

        public Float m(j j8) throws IOException, a {
            float f8 = j8.o();
            j8.H();
            return Float.valueOf(f8);
        }
    };
    public static final b<String> h = new b<String>(){

        public String m(j j8) throws IOException, a {
            try {
                String string = j8.u();
                j8.H();
                return string;
            }
            catch (i i8) {
                throw ax.t4.a.b(i8);
            }
        }
    };
    public static final b<byte[]> i = new b<byte[]>(){

        public byte[] m(j j8) throws IOException, a {
            try {
                byte[] byArray = j8.c();
                j8.H();
                return byArray;
            }
            catch (i i8) {
                throw ax.t4.a.b(i8);
            }
        }
    };
    public static final b<Boolean> j = new b<Boolean>(){

        public Boolean m(j j8) throws IOException, a {
            return ax.t4.b.e(j8);
        }
    };
    public static final b<Object> k = new b<Object>(){

        @Override
        public Object d(j j8) throws IOException, a {
            ax.t4.b.k(j8);
            return null;
        }
    };
    static final e l = new e();

    public static void a(j j8) throws IOException, a {
        if (j8.j() == m.m0) {
            ax.t4.b.c(j8);
            return;
        }
        throw new a("expecting the end of an object (\"}\")", j8.v());
    }

    public static h b(j j8) throws IOException, a {
        if (j8.j() == m.l0) {
            h h8 = j8.v();
            ax.t4.b.c(j8);
            return h8;
        }
        throw new a("expecting the start of an object (\"{\")", j8.v());
    }

    public static m c(j object) throws IOException, a {
        try {
            object = object.H();
            return object;
        }
        catch (i i8) {
            throw ax.t4.a.b(i8);
        }
    }

    public static boolean e(j j8) throws IOException, a {
        try {
            boolean bl = j8.e();
            j8.H();
            return bl;
        }
        catch (i i8) {
            throw ax.t4.a.b(i8);
        }
    }

    public static long j(j j8) throws IOException, a {
        long l8;
        block4: {
            try {
                l8 = j8.q();
                if (l8 < 0L) break block4;
            }
            catch (i i8) {
                throw ax.t4.a.b(i8);
            }
            j8.H();
            return l8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("expecting a non-negative number, got: ");
        stringBuilder.append(l8);
        a a8 = new a(stringBuilder.toString(), j8.v());
        throw a8;
    }

    public static void k(j j8) throws IOException, a {
        try {
            j8.L();
            j8.H();
            return;
        }
        catch (i i8) {
            throw ax.t4.a.b(i8);
        }
    }

    public abstract T d(j var1) throws IOException, a;

    public final T f(j j8, String string, Object object) throws IOException, a {
        if (object == null) {
            return this.d(j8);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("duplicate field \"");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append("\"");
        throw new a(((StringBuilder)object).toString(), j8.v());
    }

    public T g(j j8) throws IOException, a {
        j8.H();
        Object object = this.d(j8);
        if (j8.j() == null) {
            this.l(object);
            return (T)object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("The JSON library should ensure there's no tokens after the main value: ");
        ((StringBuilder)object).append((Object)j8.j());
        ((StringBuilder)object).append("@");
        ((StringBuilder)object).append(j8.f());
        throw new AssertionError((Object)((StringBuilder)object).toString());
    }

    public T h(InputStream inputStream) throws IOException, a {
        try {
            inputStream = this.g(l.s(inputStream));
        }
        catch (i i8) {
            throw ax.t4.a.b(i8);
        }
        return (T)inputStream;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public T i(String object) throws a {
        T t8;
        object = l.u((String)object);
        try {
            t8 = this.g((j)object);
        }
        catch (Throwable throwable) {
            ((j)object).close();
            throw throwable;
        }
        try {
            ((j)object).close();
            return t8;
        }
        catch (IOException iOException) {
            throw ax.w4.d.a("IOException reading from String", iOException);
        }
        catch (i i8) {
            throw ax.t4.a.b(i8);
        }
    }

    public void l(T t8) {
    }
}

