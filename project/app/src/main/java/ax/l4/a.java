/*
 * Decompiled with CFR 0.152.
 */
package ax.l4;

import android.util.Log;
import ax.l4.b;
import java.util.ArrayList;
import java.util.List;

public final class a {
    private static final g<Object> a = new g<Object>(){

        @Override
        public void a(Object object) {
        }
    };

    private static <T extends f> ax.b0.d<T> a(ax.b0.d<T> d8, d<T> d9) {
        return ax.l4.a.b(d8, d9, ax.l4.a.<T>c());
    }

    private static <T> ax.b0.d<T> b(ax.b0.d<T> d8, d<T> d9, g<T> g8) {
        return new e<T>(d8, d9, g8);
    }

    private static <T> g<T> c() {
        return a;
    }

    public static <T extends f> ax.b0.d<T> d(int n8, d<T> d8) {
        return ax.l4.a.a(new ax.b0.e(n8), d8);
    }

    public static <T extends f> ax.b0.d<T> e(int n8, d<T> d8) {
        return ax.l4.a.a(new ax.b0.f(n8), d8);
    }

    public static <T> ax.b0.d<List<T>> f() {
        return ax.l4.a.g(20);
    }

    public static <T> ax.b0.d<List<T>> g(int n8) {
        return ax.l4.a.b(new ax.b0.f(n8), new d<List<T>>(){

            public List<T> b() {
                return new ArrayList();
            }
        }, new g<List<T>>(){

            public void b(List<T> list) {
                list.clear();
            }
        });
    }

    public static interface d<T> {
        public T a();
    }

    private static final class e<T>
    implements ax.b0.d<T> {
        private final d<T> a;
        private final g<T> b;
        private final ax.b0.d<T> c;

        e(ax.b0.d<T> d8, d<T> d9, g<T> g8) {
            this.c = d8;
            this.a = d9;
            this.b = g8;
        }

        @Override
        public boolean a(T t8) {
            if (t8 instanceof f) {
                ((f)t8).l().b(true);
            }
            this.b.a(t8);
            return this.c.a(t8);
        }

        @Override
        public T b() {
            T t8;
            Object object = t8 = this.c.b();
            if (t8 == null) {
                object = t8 = this.a.a();
                if (Log.isLoggable((String)"FactoryPools", (int)2)) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Created new ");
                    ((StringBuilder)object).append(t8.getClass());
                    Log.v((String)"FactoryPools", (String)((StringBuilder)object).toString());
                    object = t8;
                }
            }
            if (object instanceof f) {
                ((f)object).l().b(false);
            }
            return object;
        }
    }

    public static interface f {
        public b l();
    }

    public static interface g<T> {
        public void a(T var1);
    }
}

