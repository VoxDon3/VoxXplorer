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

/* loaded from: classes.dex */
class b extends ax.J0.a {
    static boolean c = false;
    private final h a;
    private final c b;

    public static class a<D> extends l<D> implements c.b<D> {
        private final int l;
        private final Bundle m;
        private final ax.K0.c<D> n;
        private h o;
        private C0096b<D> p;
        private ax.K0.c<D> q;

        a(int i, Bundle bundle, ax.K0.c<D> cVar, ax.K0.c<D> cVar2) {
            this.l = i;
            this.m = bundle;
            this.n = cVar;
            this.q = cVar2;
            cVar.v(i, this);
        }

        @Override // ax.K0.c.b
        public void a(ax.K0.c<D> cVar, D d) {
            if (b.c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                n(d);
                return;
            }
            if (b.c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            l(d);
        }

        @Override // androidx.lifecycle.LiveData
        protected void j() {
            if (b.c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.n.y();
        }

        @Override // androidx.lifecycle.LiveData
        protected void k() {
            if (b.c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.n.z();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void m(m<? super D> mVar) {
            super.m(mVar);
            this.o = null;
            this.p = null;
        }

        @Override // ax.G0.l, androidx.lifecycle.LiveData
        public void n(D d) {
            super.n(d);
            ax.K0.c<D> cVar = this.q;
            if (cVar != null) {
                cVar.w();
                this.q = null;
            }
        }

        ax.K0.c<D> o(boolean z) {
            if (b.c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.n.d();
            this.n.c();
            C0096b<D> c0096b = this.p;
            if (c0096b != null) {
                m(c0096b);
                if (z) {
                    c0096b.d();
                }
            }
            this.n.B(this);
            if ((c0096b == null || c0096b.c()) && !z) {
                return this.n;
            }
            this.n.w();
            return this.q;
        }

        public void p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.l);
            printWriter.print(" mArgs=");
            printWriter.println(this.m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.n);
            this.n.i(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.p);
                this.p.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(q().f(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(g());
        }

        ax.K0.c<D> q() {
            return this.n;
        }

        void r() {
            h hVar = this.o;
            C0096b<D> c0096b = this.p;
            if (hVar == null || c0096b == null) {
                return;
            }
            super.m(c0096b);
            h(hVar, c0096b);
        }

        ax.K0.c<D> s(h hVar, a.InterfaceC0095a<D> interfaceC0095a) {
            C0096b<D> c0096b = new C0096b<>(this.n, interfaceC0095a);
            h(hVar, c0096b);
            C0096b<D> c0096b2 = this.p;
            if (c0096b2 != null) {
                m(c0096b2);
            }
            this.o = hVar;
            this.p = c0096b;
            return this.n;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.l);
            sb.append(" : ");
            Class<?> cls = this.n.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(cls)));
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: ax.J0.b$b, reason: collision with other inner class name */
    static class C0096b<D> implements m<D> {
        private final ax.K0.c<D> a;
        private final a.InterfaceC0095a<D> b;
        private boolean c = false;

        C0096b(ax.K0.c<D> cVar, a.InterfaceC0095a<D> interfaceC0095a) {
            this.a = cVar;
            this.b = interfaceC0095a;
        }

        @Override // ax.G0.m
        public void a(D d) {
            if (b.c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.a + ": " + this.a.f(d));
            }
            this.c = true;
            this.b.v(this.a, d);
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.c);
        }

        boolean c() {
            return this.c;
        }

        void d() {
            if (this.c) {
                if (b.c) {
                    Log.v("LoaderManager", "  Resetting: " + this.a);
                }
                this.b.p(this.a);
            }
        }

        public String toString() {
            return this.b.toString();
        }
    }

    static class c extends p {
        private static final q.b f = new a();
        private ax.B.l<a> d = new ax.B.l<>();
        private boolean e = false;

        static class a implements q.b {
            a() {
            }

            @Override // androidx.lifecycle.q.b
            public <T extends p> T a(Class<T> cls) {
                return new c();
            }

            @Override // androidx.lifecycle.q.b
            public /* synthetic */ p b(Class cls, ax.I0.a aVar) {
                return t.b(this, cls, aVar);
            }
        }

        c() {
        }

        static c h(r rVar) {
            return (c) new q(rVar, f).a(c.class);
        }

        @Override // androidx.lifecycle.p
        protected void d() {
            super.d();
            int m = this.d.m();
            for (int i = 0; i < m; i++) {
                this.d.n(i).o(true);
            }
            this.d.c();
        }

        public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.d.m() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.d.m(); i++) {
                    a n = this.d.n(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.d.j(i));
                    printWriter.print(": ");
                    printWriter.println(n.toString());
                    n.p(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void g() {
            this.e = false;
        }

        <D> a<D> i(int i) {
            return this.d.f(i);
        }

        boolean j() {
            return this.e;
        }

        void k() {
            int m = this.d.m();
            for (int i = 0; i < m; i++) {
                this.d.n(i).r();
            }
        }

        void l(int i, a aVar) {
            this.d.k(i, aVar);
        }

        void m(int i) {
            this.d.l(i);
        }

        void n() {
            this.e = true;
        }
    }

    b(h hVar, r rVar) {
        this.a = hVar;
        this.b = c.h(rVar);
    }

    private <D> ax.K0.c<D> h(int i, Bundle bundle, a.InterfaceC0095a<D> interfaceC0095a, ax.K0.c<D> cVar) {
        try {
            this.b.n();
            ax.K0.c<D> w = interfaceC0095a.w(i, bundle);
            if (w == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (w.getClass().isMemberClass() && !Modifier.isStatic(w.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + w);
            }
            a aVar = new a(i, bundle, w, cVar);
            if (c) {
                Log.v("LoaderManager", "  Created new loader " + aVar);
            }
            this.b.l(i, aVar);
            this.b.g();
            return aVar.s(this.a, interfaceC0095a);
        } catch (Throwable th) {
            this.b.g();
            throw th;
        }
    }

    @Override // ax.J0.a
    public void a(int i) {
        if (this.b.j()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        if (c) {
            Log.v("LoaderManager", "destroyLoader in " + this + " of " + i);
        }
        a i2 = this.b.i(i);
        if (i2 != null) {
            i2.o(true);
            this.b.m(i);
        }
    }

    @Override // ax.J0.a
    @Deprecated
    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.b.f(str, fileDescriptor, printWriter, strArr);
    }

    @Override // ax.J0.a
    public <D> ax.K0.c<D> d(int i) {
        if (this.b.j()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        a<D> i2 = this.b.i(i);
        if (i2 != null) {
            return i2.q();
        }
        return null;
    }

    @Override // ax.J0.a
    public <D> ax.K0.c<D> e(int i, Bundle bundle, a.InterfaceC0095a<D> interfaceC0095a) {
        if (this.b.j()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a<D> i2 = this.b.i(i);
        if (c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (i2 == null) {
            return h(i, bundle, interfaceC0095a, null);
        }
        if (c) {
            Log.v("LoaderManager", "  Re-using existing loader " + i2);
        }
        return i2.s(this.a, interfaceC0095a);
    }

    @Override // ax.J0.a
    public void f() {
        this.b.k();
    }

    @Override // ax.J0.a
    public <D> ax.K0.c<D> g(int i, Bundle bundle, a.InterfaceC0095a<D> interfaceC0095a) {
        if (this.b.j()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
        if (c) {
            Log.v("LoaderManager", "restartLoader in " + this + ": args=" + bundle);
        }
        a<D> i2 = this.b.i(i);
        return h(i, bundle, interfaceC0095a, i2 != null ? i2.o(false) : null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Class<?> cls = this.a.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
