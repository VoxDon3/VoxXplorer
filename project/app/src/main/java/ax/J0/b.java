/*
 * Decompiled with CFR 0.152.
 */
package ax.J0;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import ax.G0.h;
import ax.G0.l;
import ax.G0.m;
import ax.G0.t;
import ax.J0.a;
import ax.K0.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

class b
extends ax.J0.a {
    static boolean c = false;
    private final h a;
    private final c b;

    b(h h8, r r8) {
        this.a = h8;
        this.b = ax.J0.b$c.h(r8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private <D> ax.K0.c<D> h(int n8, Bundle object, a.a<D> object2, ax.K0.c<D> c8) {
        Throwable throwable2;
        block6: {
            block5: {
                ax.K0.c<D> c9;
                try {
                    this.b.n();
                    c9 = object2.w(n8, (Bundle)object);
                    if (c9 == null) break block5;
                    if (c9.getClass().isMemberClass() && !Modifier.isStatic(c9.getClass().getModifiers())) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Object returned from onCreateLoader must not be a non-static inner member class: ");
                        ((StringBuilder)object2).append(c9);
                        object = new IllegalArgumentException(((StringBuilder)object2).toString());
                        throw object;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                a<D> a8 = new a<D>(n8, (Bundle)object, c9, c8);
                if (c) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("  Created new loader ");
                    ((StringBuilder)object).append(a8);
                    Log.v((String)"LoaderManager", (String)((StringBuilder)object).toString());
                }
                this.b.l(n8, a8);
                this.b.g();
                return a8.s(this.a, (a.a<D>)object2);
            }
            object = new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            throw object;
        }
        this.b.g();
        throw throwable2;
    }

    @Override
    public void a(int n8) {
        if (!this.b.j()) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                Object object;
                if (c) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("destroyLoader in ");
                    ((StringBuilder)object).append(this);
                    ((StringBuilder)object).append(" of ");
                    ((StringBuilder)object).append(n8);
                    Log.v((String)"LoaderManager", (String)((StringBuilder)object).toString());
                }
                if ((object = this.b.i(n8)) != null) {
                    ((a)object).o(true);
                    this.b.m(n8);
                }
                return;
            }
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override
    @Deprecated
    public void b(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] stringArray) {
        this.b.f(string, fileDescriptor, printWriter, stringArray);
    }

    @Override
    public <D> ax.K0.c<D> d(int n8) {
        if (!this.b.j()) {
            a a8 = this.b.i(n8);
            if (a8 != null) {
                return a8.q();
            }
            return null;
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override
    public <D> ax.K0.c<D> e(int n8, Bundle object, a.a<D> a8) {
        if (!this.b.j()) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                a<D> a9 = this.b.i(n8);
                if (c) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("initLoader in ");
                    stringBuilder.append(this);
                    stringBuilder.append(": args=");
                    stringBuilder.append(object);
                    Log.v((String)"LoaderManager", (String)stringBuilder.toString());
                }
                if (a9 == null) {
                    return this.h(n8, (Bundle)object, a8, null);
                }
                if (c) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("  Re-using existing loader ");
                    ((StringBuilder)object).append(a9);
                    Log.v((String)"LoaderManager", (String)((StringBuilder)object).toString());
                }
                return a9.s(this.a, a8);
            }
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override
    public void f() {
        this.b.k();
    }

    @Override
    public <D> ax.K0.c<D> g(int n8, Bundle bundle, a.a<D> a8) {
        if (!this.b.j()) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                ax.K0.c c8;
                if (c) {
                    c8 = new StringBuilder();
                    ((StringBuilder)((Object)c8)).append("restartLoader in ");
                    ((StringBuilder)((Object)c8)).append(this);
                    ((StringBuilder)((Object)c8)).append(": args=");
                    ((StringBuilder)((Object)c8)).append(bundle);
                    Log.v((String)"LoaderManager", (String)((StringBuilder)((Object)c8)).toString());
                }
                c8 = (c8 = this.b.i(n8)) != null ? ((a)((Object)c8)).o(false) : null;
                return this.h(n8, bundle, a8, c8);
            }
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("LoaderManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        Class<?> clazz = this.a.getClass();
        stringBuilder.append(clazz.getSimpleName());
        stringBuilder.append("{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(clazz)));
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    public static class a<D>
    extends l<D>
    implements c.b<D> {
        private final int l;
        private final Bundle m;
        private final ax.K0.c<D> n;
        private h o;
        private b<D> p;
        private ax.K0.c<D> q;

        a(int n8, Bundle bundle, ax.K0.c<D> c8, ax.K0.c<D> c9) {
            this.l = n8;
            this.m = bundle;
            this.n = c8;
            this.q = c9;
            c8.v(n8, this);
        }

        @Override
        public void a(ax.K0.c<D> object, D d8) {
            if (c) {
                object = new StringBuilder();
                ((StringBuilder)object).append("onLoadComplete: ");
                ((StringBuilder)object).append(this);
                Log.v((String)"LoaderManager", (String)((StringBuilder)object).toString());
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.n(d8);
                return;
            }
            if (c) {
                Log.w((String)"LoaderManager", (String)"onLoadComplete was incorrectly called on a background thread");
            }
            this.l(d8);
        }

        @Override
        protected void j() {
            if (c) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("  Starting: ");
                stringBuilder.append(this);
                Log.v((String)"LoaderManager", (String)stringBuilder.toString());
            }
            this.n.y();
        }

        @Override
        protected void k() {
            if (c) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("  Stopping: ");
                stringBuilder.append(this);
                Log.v((String)"LoaderManager", (String)stringBuilder.toString());
            }
            this.n.z();
        }

        @Override
        public void m(m<? super D> m8) {
            super.m(m8);
            this.o = null;
            this.p = null;
        }

        @Override
        public void n(D object) {
            super.n(object);
            object = this.q;
            if (object != null) {
                ((ax.K0.c)object).w();
                this.q = null;
            }
        }

        ax.K0.c<D> o(boolean bl) {
            Object object;
            if (c) {
                object = new StringBuilder();
                ((StringBuilder)object).append("  Destroying: ");
                ((StringBuilder)object).append(this);
                Log.v((String)"LoaderManager", (String)((StringBuilder)object).toString());
            }
            this.n.d();
            this.n.c();
            object = this.p;
            if (object != null) {
                this.m((m<? super D>)object);
                if (bl) {
                    ((b)object).d();
                }
            }
            this.n.B(this);
            if (object != null && !((b)object).c() || bl) {
                this.n.w();
                return this.q;
            }
            return this.n;
        }

        public void p(String string, FileDescriptor object, PrintWriter printWriter, String[] object2) {
            printWriter.print(string);
            printWriter.print("mId=");
            printWriter.print(this.l);
            printWriter.print(" mArgs=");
            printWriter.println(this.m);
            printWriter.print(string);
            printWriter.print("mLoader=");
            printWriter.println(this.n);
            ax.K0.c<D> c8 = this.n;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("  ");
            c8.i(stringBuilder.toString(), (FileDescriptor)object, printWriter, (String[])object2);
            if (this.p != null) {
                printWriter.print(string);
                printWriter.print("mCallbacks=");
                printWriter.println(this.p);
                object2 = this.p;
                object = new StringBuilder();
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append("  ");
                ((b)object2).b(((StringBuilder)object).toString(), printWriter);
            }
            printWriter.print(string);
            printWriter.print("mData=");
            printWriter.println(this.q().f(this.f()));
            printWriter.print(string);
            printWriter.print("mStarted=");
            printWriter.println(this.g());
        }

        ax.K0.c<D> q() {
            return this.n;
        }

        void r() {
            h h8 = this.o;
            b<D> b8 = this.p;
            if (h8 != null && b8 != null) {
                super.m(b8);
                this.h(h8, b8);
            }
        }

        ax.K0.c<D> s(h h8, a.a<D> object) {
            b<D> b8 = new b<D>(this.n, object);
            this.h(h8, b8);
            object = this.p;
            if (object != null) {
                this.m((m<? super D>)object);
            }
            this.o = h8;
            this.p = b8;
            return this.n;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append("LoaderInfo{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" #");
            stringBuilder.append(this.l);
            stringBuilder.append(" : ");
            Class<?> clazz = this.n.getClass();
            stringBuilder.append(clazz.getSimpleName());
            stringBuilder.append("{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(clazz)));
            stringBuilder.append("}}");
            return stringBuilder.toString();
        }
    }

    static class b<D>
    implements m<D> {
        private final ax.K0.c<D> a;
        private final a.a<D> b;
        private boolean c = false;

        b(ax.K0.c<D> c8, a.a<D> a8) {
            this.a = c8;
            this.b = a8;
        }

        @Override
        public void a(D d8) {
            if (c) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("  onLoadFinished in ");
                stringBuilder.append(this.a);
                stringBuilder.append(": ");
                stringBuilder.append(this.a.f(d8));
                Log.v((String)"LoaderManager", (String)stringBuilder.toString());
            }
            this.c = true;
            this.b.v(this.a, d8);
        }

        public void b(String string, PrintWriter printWriter) {
            printWriter.print(string);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.c);
        }

        boolean c() {
            return this.c;
        }

        void d() {
            if (this.c) {
                if (c) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("  Resetting: ");
                    stringBuilder.append(this.a);
                    Log.v((String)"LoaderManager", (String)stringBuilder.toString());
                }
                this.b.p(this.a);
            }
        }

        public String toString() {
            return this.b.toString();
        }
    }

    static class c
    extends p {
        private static final q.b f = new q.b(){

            @Override
            public <T extends p> T a(Class<T> clazz) {
                return (T)new c();
            }

            public /* synthetic */ p b(Class clazz, ax.I0.a a8) {
                return t.b(this, clazz, a8);
            }
        };
        private ax.B.l<a> d = new ax.B.l();
        private boolean e = false;

        c() {
        }

        static c h(r r8) {
            return new q(r8, f).a(c.class);
        }

        @Override
        protected void d() {
            super.d();
            int n8 = this.d.m();
            for (int i8 = 0; i8 < n8; ++i8) {
                this.d.n(i8).o(true);
            }
            this.d.c();
        }

        public void f(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] stringArray) {
            if (this.d.m() > 0) {
                printWriter.print(string);
                printWriter.println("Loaders:");
                CharSequence charSequence = new StringBuilder();
                charSequence.append(string);
                charSequence.append("    ");
                charSequence = charSequence.toString();
                for (int i8 = 0; i8 < this.d.m(); ++i8) {
                    a a8 = this.d.n(i8);
                    printWriter.print(string);
                    printWriter.print("  #");
                    printWriter.print(this.d.j(i8));
                    printWriter.print(": ");
                    printWriter.println(a8.toString());
                    a8.p((String)charSequence, fileDescriptor, printWriter, stringArray);
                }
            }
        }

        void g() {
            this.e = false;
        }

        <D> a<D> i(int n8) {
            return this.d.f(n8);
        }

        boolean j() {
            return this.e;
        }

        void k() {
            int n8 = this.d.m();
            for (int i8 = 0; i8 < n8; ++i8) {
                this.d.n(i8).r();
            }
        }

        void l(int n8, a a8) {
            this.d.k(n8, a8);
        }

        void m(int n8) {
            this.d.l(n8);
        }

        void n() {
            this.e = true;
        }
    }
}

