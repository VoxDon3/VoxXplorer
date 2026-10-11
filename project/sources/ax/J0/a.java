package ax.J0;

import android.os.Bundle;
import ax.G0.h;
import ax.G0.v;
import ax.K0.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: ax.J0.a$a, reason: collision with other inner class name */
    public interface InterfaceC0095a<D> {
        void p(c<D> cVar);

        void v(c<D> cVar, D d);

        c<D> w(int i, Bundle bundle);
    }

    public static <T extends h & v> a c(T t) {
        return new b(t, t.getViewModelStore());
    }

    public abstract void a(int i);

    @Deprecated
    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> c<D> d(int i);

    public abstract <D> c<D> e(int i, Bundle bundle, InterfaceC0095a<D> interfaceC0095a);

    public abstract void f();

    public abstract <D> c<D> g(int i, Bundle bundle, InterfaceC0095a<D> interfaceC0095a);
}
