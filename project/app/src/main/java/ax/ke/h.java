/*
 * Decompiled with CFR 0.152.
 */
package ax.ke;

import ax.ke.D;
import ax.ke.E;
import ax.ke.c;
import ax.ke.d;
import ax.ke.e;
import ax.ke.f;
import ax.ke.g;
import ax.ke.m;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
final class h
extends c.a {
    static final c.a a = new h();

    h() {
    }

    @Override
    public ax.ke.c<?, ?> a(Type type, Annotation[] annotationArray, E e8) {
        if (c.a.c(type) != e.a()) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            if (c.a.c(type = c.a.b(0, (ParameterizedType)type)) != D.class) {
                return new a(type);
            }
            if (type instanceof ParameterizedType) {
                return new c(c.a.b(0, (ParameterizedType)type));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }

    @IgnoreJRERequirement
    private static final class ax.ke.h$a<R>
    implements ax.ke.c<R, CompletableFuture<R>> {
        private final Type a;

        ax.ke.h$a(Type type) {
            this.a = type;
        }

        @Override
        public Type b() {
            return this.a;
        }

        public CompletableFuture<R> c(ax.ke.b<R> b8) {
            b b9 = new b(b8);
            b8.u(new a(this, b9));
            return b9;
        }

        @IgnoreJRERequirement
        private class a
        implements d<R> {
            private final CompletableFuture<R> a;
            final ax.ke.h$a b;

            public a(ax.ke.h$a a8, CompletableFuture<R> completableFuture) {
                this.b = a8;
                this.a = completableFuture;
            }

            @Override
            public void a(ax.ke.b<R> b8, D<R> d8) {
                if (d8.e()) {
                    g.a(this.a, d8.a());
                    return;
                }
                f.a(this.a, new m(d8));
            }

            @Override
            public void b(ax.ke.b<R> b8, Throwable throwable) {
                f.a(this.a, throwable);
            }
        }
    }

    @IgnoreJRERequirement
    private static final class b<T>
    extends CompletableFuture<T> {
        private final ax.ke.b<?> q;

        b(ax.ke.b<?> b8) {
            this.q = b8;
        }

        @Override
        public boolean cancel(boolean bl) {
            if (bl) {
                this.q.cancel();
            }
            return super.cancel(bl);
        }
    }

    @IgnoreJRERequirement
    private static final class c<R>
    implements ax.ke.c<R, CompletableFuture<D<R>>> {
        private final Type a;

        c(Type type) {
            this.a = type;
        }

        @Override
        public Type b() {
            return this.a;
        }

        public CompletableFuture<D<R>> c(ax.ke.b<R> b8) {
            b b9 = new b(b8);
            b8.u(new a(this, b9));
            return b9;
        }

        @IgnoreJRERequirement
        private class a
        implements d<R> {
            private final CompletableFuture<D<R>> a;
            final c b;

            public a(c c8, CompletableFuture<D<R>> completableFuture) {
                this.b = c8;
                this.a = completableFuture;
            }

            @Override
            public void a(ax.ke.b<R> b8, D<R> d8) {
                g.a(this.a, d8);
            }

            @Override
            public void b(ax.ke.b<R> b8, Throwable throwable) {
                f.a(this.a, throwable);
            }
        }
    }
}

