package ax.ke;

import ax.ke.InterfaceC2431c;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
/* renamed from: ax.ke.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2436h extends InterfaceC2431c.a {
    static final InterfaceC2431c.a a = new C2436h();

    @IgnoreJRERequirement
    /* renamed from: ax.ke.h$a */
    private static final class a<R> implements InterfaceC2431c<R, CompletableFuture<R>> {
        private final Type a;

        @IgnoreJRERequirement
        /* renamed from: ax.ke.h$a$a, reason: collision with other inner class name */
        private class C0355a implements InterfaceC2432d<R> {
            private final CompletableFuture<R> a;

            public C0355a(CompletableFuture<R> completableFuture) {
                this.a = completableFuture;
            }

            @Override // ax.ke.InterfaceC2432d
            public void a(InterfaceC2430b<R> interfaceC2430b, D<R> d) {
                if (d.e()) {
                    this.a.complete(d.a());
                } else {
                    this.a.completeExceptionally(new m(d));
                }
            }

            @Override // ax.ke.InterfaceC2432d
            public void b(InterfaceC2430b<R> interfaceC2430b, Throwable th) {
                this.a.completeExceptionally(th);
            }
        }

        a(Type type) {
            this.a = type;
        }

        @Override // ax.ke.InterfaceC2431c
        public Type b() {
            return this.a;
        }

        @Override // ax.ke.InterfaceC2431c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<R> a(InterfaceC2430b<R> interfaceC2430b) {
            b bVar = new b(interfaceC2430b);
            interfaceC2430b.u(new C0355a(bVar));
            return bVar;
        }
    }

    @IgnoreJRERequirement
    /* renamed from: ax.ke.h$b */
    private static final class b<T> extends CompletableFuture<T> {
        private final InterfaceC2430b<?> q;

        b(InterfaceC2430b<?> interfaceC2430b) {
            this.q = interfaceC2430b;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z) {
            if (z) {
                this.q.cancel();
            }
            return super.cancel(z);
        }
    }

    @IgnoreJRERequirement
    /* renamed from: ax.ke.h$c */
    private static final class c<R> implements InterfaceC2431c<R, CompletableFuture<D<R>>> {
        private final Type a;

        @IgnoreJRERequirement
        /* renamed from: ax.ke.h$c$a */
        private class a implements InterfaceC2432d<R> {
            private final CompletableFuture<D<R>> a;

            public a(CompletableFuture<D<R>> completableFuture) {
                this.a = completableFuture;
            }

            @Override // ax.ke.InterfaceC2432d
            public void a(InterfaceC2430b<R> interfaceC2430b, D<R> d) {
                this.a.complete(d);
            }

            @Override // ax.ke.InterfaceC2432d
            public void b(InterfaceC2430b<R> interfaceC2430b, Throwable th) {
                this.a.completeExceptionally(th);
            }
        }

        c(Type type) {
            this.a = type;
        }

        @Override // ax.ke.InterfaceC2431c
        public Type b() {
            return this.a;
        }

        @Override // ax.ke.InterfaceC2431c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<D<R>> a(InterfaceC2430b<R> interfaceC2430b) {
            b bVar = new b(interfaceC2430b);
            interfaceC2430b.u(new a(bVar));
            return bVar;
        }
    }

    C2436h() {
    }

    @Override // ax.ke.InterfaceC2431c.a
    public InterfaceC2431c<?, ?> a(Type type, Annotation[] annotationArr, E e) {
        if (InterfaceC2431c.a.c(type) != C2433e.a()) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type b2 = InterfaceC2431c.a.b(0, (ParameterizedType) type);
        if (InterfaceC2431c.a.c(b2) != D.class) {
            return new a(b2);
        }
        if (b2 instanceof ParameterizedType) {
            return new c(InterfaceC2431c.a.b(0, (ParameterizedType) b2));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
