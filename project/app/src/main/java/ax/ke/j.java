/*
 * Decompiled with CFR 0.152.
 */
package ax.ke;

import ax.ke.D;
import ax.ke.E;
import ax.ke.G;
import ax.ke.I;
import ax.ke.c;
import ax.ke.d;
import ax.ke.k;
import ax.ke.l;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import okhttp3.Request;

final class j
extends c.a {
    private final Executor a;

    j(Executor executor) {
        this.a = executor;
    }

    @Override
    public c<?, ?> a(Type object, Annotation[] annotationArray, E e8) {
        Type type = c.a.c((Type)object);
        e8 = null;
        if (type != ax.ke.b.class) {
            return null;
        }
        if (object instanceof ParameterizedType) {
            type = I.g(0, (ParameterizedType)object);
            object = I.l(annotationArray, G.class) ? e8 : this.a;
            return new c<Object, ax.ke.b<?>>(){
                final Type a;
                final Executor b;
                final j c;
                {
                    this.c = j8;
                    this.a = type;
                    this.b = executor;
                }

                @Override
                public Type b() {
                    return this.a;
                }

                public ax.ke.b<Object> c(ax.ke.b<Object> b8) {
                    Executor executor = this.b;
                    if (executor == null) {
                        return b8;
                    }
                    return new b<Object>(executor, b8);
                }
            };
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }

    static final class b<T>
    implements ax.ke.b<T> {
        final ax.ke.b<T> c0;
        final Executor q;

        b(Executor executor, ax.ke.b<T> b8) {
            this.q = executor;
            this.c0 = b8;
        }

        @Override
        public void cancel() {
            this.c0.cancel();
        }

        @Override
        public ax.ke.b<T> clone() {
            return new b<T>(this.q, this.c0.clone());
        }

        @Override
        public D<T> execute() throws IOException {
            return this.c0.execute();
        }

        @Override
        public boolean isCanceled() {
            return this.c0.isCanceled();
        }

        @Override
        public Request request() {
            return this.c0.request();
        }

        @Override
        public void u(d<T> d8) {
            j.Objects.requireNonNull(d8, (String)"callback == null");
            this.c0.u(new d<T>(){
                final d a;
                final b b;
                {
                    this.b = b8;
                    this.a = d8;
                }

                public static /* synthetic */ void c(a a8, d d8, Throwable throwable) {
                    d8.b(a8.b, throwable);
                }

                public static /* synthetic */ void d(a a8, d d8, D d9) {
                    if (a8.b.c0.isCanceled()) {
                        d8.b(a8.b, new IOException("Canceled"));
                        return;
                    }
                    d8.a(a8.b, d9);
                }

                @Override
                public void a(ax.ke.b<T> b8, D<T> d8) {
                    this.b.q.execute(new k(this, this.a, d8));
                }

                @Override
                public void b(ax.ke.b<T> b8, Throwable throwable) {
                    this.b.q.execute(new l(this, this.a, throwable));
                }
            });
        }
    }
}

