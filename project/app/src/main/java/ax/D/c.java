/*
 * Decompiled with CFR 0.152.
 */
package ax.D;

import ax.v7.e;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class c {
    public static <T> e<T> a(c<T> object) {
        d d8;
        block3: {
            a a8 = new a();
            d8 = new d(a8);
            a8.b = d8;
            a8.a = object.getClass();
            object = object.a(a8);
            if (object == null) break block3;
            try {
                a8.a = object;
                return d8;
            }
            catch (Exception exception) {
                d8.c(exception);
            }
        }
        return d8;
    }

    public static final class a<T> {
        Object a;
        d<T> b;
        private ax.D.d<Void> c = ax.D.d.G();
        private boolean d;

        a() {
        }

        private void d() {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        void a() {
            this.a = null;
            this.b = null;
            this.c.C(null);
        }

        public boolean b(T t8) {
            boolean bl = true;
            this.d = true;
            d<T> d8 = this.b;
            if (d8 == null || !d8.b(t8)) {
                bl = false;
            }
            if (bl) {
                this.d();
            }
            return bl;
        }

        public boolean c() {
            boolean bl = true;
            this.d = true;
            d<T> d8 = this.b;
            if (d8 == null || !d8.a(true)) {
                bl = false;
            }
            if (bl) {
                this.d();
            }
            return bl;
        }

        public boolean e(Throwable throwable) {
            boolean bl = true;
            this.d = true;
            d<T> d8 = this.b;
            if (d8 == null || !d8.c(throwable)) {
                bl = false;
            }
            if (bl) {
                this.d();
            }
            return bl;
        }

        protected void finalize() {
            Object object;
            d<T> d8 = this.b;
            if (d8 != null && !d8.isDone()) {
                object = new StringBuilder();
                ((StringBuilder)object).append("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
                ((StringBuilder)object).append(this.a);
                d8.c(new b(((StringBuilder)object).toString()));
            }
            if (!this.d && (object = this.c) != null) {
                ((ax.D.d)object).C(null);
            }
        }
    }

    static final class b
    extends Throwable {
        b(String string) {
            super(string);
        }

        /*
         * Enabled aggressive block sorting
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        @Override
        public Throwable fillInStackTrace() {
            // MONITORENTER : this
            // MONITOREXIT : this
            return this;
        }
    }

    public static interface c<T> {
        public Object a(a<T> var1) throws Exception;
    }

    private static final class d<T>
    implements e<T> {
        private final ax.D.a<T> c0 = new ax.D.a<T>(this){
            final d i0;
            {
                this.i0 = d8;
            }

            @Override
            protected String x() {
                a a8 = (a)this.i0.q.get();
                if (a8 == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("tag=[");
                stringBuilder.append(a8.a);
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
        };
        final WeakReference<a<T>> q;

        d(a<T> a8) {
            this.q = new WeakReference<a<a<T>>>(a8);
        }

        boolean a(boolean bl) {
            return this.c0.cancel(bl);
        }

        boolean b(T t8) {
            return this.c0.C(t8);
        }

        boolean c(Throwable throwable) {
            return this.c0.D(throwable);
        }

        @Override
        public boolean cancel(boolean bl) {
            a a8 = (a)this.q.get();
            if ((bl = this.c0.cancel(bl)) && a8 != null) {
                a8.a();
            }
            return bl;
        }

        @Override
        public T get() throws InterruptedException, ExecutionException {
            return this.c0.get();
        }

        @Override
        public T get(long l8, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return this.c0.get(l8, timeUnit);
        }

        @Override
        public void h(Runnable runnable2, Executor executor) {
            this.c0.h(runnable2, executor);
        }

        @Override
        public boolean isCancelled() {
            return this.c0.isCancelled();
        }

        @Override
        public boolean isDone() {
            return this.c0.isDone();
        }

        public String toString() {
            return this.c0.toString();
        }
    }
}

