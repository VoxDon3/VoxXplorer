package ax.ke;

import ax.ke.InterfaceC2431c;
import ax.ke.j;
import j$.util.Objects;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import okhttp3.Request;

/* loaded from: classes3.dex */
final class j extends InterfaceC2431c.a {
    private final Executor a;

    class a implements InterfaceC2431c<Object, InterfaceC2430b<?>> {
        final /* synthetic */ Type a;
        final /* synthetic */ Executor b;

        a(Type type, Executor executor) {
            this.a = type;
            this.b = executor;
        }

        @Override // ax.ke.InterfaceC2431c
        public Type b() {
            return this.a;
        }

        @Override // ax.ke.InterfaceC2431c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC2430b<Object> a(InterfaceC2430b<Object> interfaceC2430b) {
            Executor executor = this.b;
            return executor == null ? interfaceC2430b : new b(executor, interfaceC2430b);
        }
    }

    static final class b<T> implements InterfaceC2430b<T> {
        final InterfaceC2430b<T> c0;
        final Executor q;

        class a implements InterfaceC2432d<T> {
            final /* synthetic */ InterfaceC2432d a;

            a(InterfaceC2432d interfaceC2432d) {
                this.a = interfaceC2432d;
            }

            public static /* synthetic */ void d(a aVar, InterfaceC2432d interfaceC2432d, D d) {
                if (b.this.c0.isCanceled()) {
                    interfaceC2432d.b(b.this, new IOException("Canceled"));
                } else {
                    interfaceC2432d.a(b.this, d);
                }
            }

            @Override // ax.ke.InterfaceC2432d
            public void a(InterfaceC2430b<T> interfaceC2430b, final D<T> d) {
                Executor executor = b.this.q;
                final InterfaceC2432d interfaceC2432d = this.a;
                executor.execute(new Runnable() { // from class: ax.ke.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.b.a.d(j.b.a.this, interfaceC2432d, d);
                    }
                });
            }

            @Override // ax.ke.InterfaceC2432d
            public void b(InterfaceC2430b<T> interfaceC2430b, final Throwable th) {
                Executor executor = b.this.q;
                final InterfaceC2432d interfaceC2432d = this.a;
                executor.execute(new Runnable() { // from class: ax.ke.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC2432d.b(j.b.this, th);
                    }
                });
            }
        }

        b(Executor executor, InterfaceC2430b<T> interfaceC2430b) {
            this.q = executor;
            this.c0 = interfaceC2430b;
        }

        @Override // ax.ke.InterfaceC2430b
        public void cancel() {
            this.c0.cancel();
        }

        @Override // ax.ke.InterfaceC2430b
        public D<T> execute() throws IOException {
            return this.c0.execute();
        }

        @Override // ax.ke.InterfaceC2430b
        public boolean isCanceled() {
            return this.c0.isCanceled();
        }

        @Override // ax.ke.InterfaceC2430b
        public Request request() {
            return this.c0.request();
        }

        @Override // ax.ke.InterfaceC2430b
        public void u(InterfaceC2432d<T> interfaceC2432d) {
            Objects.requireNonNull(interfaceC2432d, "callback == null");
            this.c0.u(new a(interfaceC2432d));
        }

        @Override // ax.ke.InterfaceC2430b
        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public InterfaceC2430b<T> m0clone() {
            return new b(this.q, this.c0.m0clone());
        }
    }

    j(Executor executor) {
        this.a = executor;
    }

    @Override // ax.ke.InterfaceC2431c.a
    public InterfaceC2431c<?, ?> a(Type type, Annotation[] annotationArr, E e) {
        if (InterfaceC2431c.a.c(type) != InterfaceC2430b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(I.g(0, (ParameterizedType) type), I.l(annotationArr, G.class) ? null : this.a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
