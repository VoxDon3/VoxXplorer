package ax.c0;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ax.c0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1802z {
    private final Runnable a;
    private final CopyOnWriteArrayList<InterfaceC1752B> b = new CopyOnWriteArrayList<>();
    private final Map<InterfaceC1752B, a> c = new HashMap();

    /* renamed from: ax.c0.z$a */
    private static class a {
        final androidx.lifecycle.d a;
        private androidx.lifecycle.f b;

        a(androidx.lifecycle.d dVar, androidx.lifecycle.f fVar) {
            this.a = dVar;
            this.b = fVar;
            dVar.a(fVar);
        }

        void a() {
            this.a.c(this.b);
            this.b = null;
        }
    }

    public C1802z(Runnable runnable) {
        this.a = runnable;
    }

    public static /* synthetic */ void a(C1802z c1802z, d.b bVar, InterfaceC1752B interfaceC1752B, ax.G0.h hVar, d.a aVar) {
        c1802z.getClass();
        if (aVar == d.a.l(bVar)) {
            c1802z.c(interfaceC1752B);
            return;
        }
        if (aVar == d.a.ON_DESTROY) {
            c1802z.j(interfaceC1752B);
        } else if (aVar == d.a.h(bVar)) {
            c1802z.b.remove(interfaceC1752B);
            c1802z.a.run();
        }
    }

    public static /* synthetic */ void b(C1802z c1802z, InterfaceC1752B interfaceC1752B, ax.G0.h hVar, d.a aVar) {
        c1802z.getClass();
        if (aVar == d.a.ON_DESTROY) {
            c1802z.j(interfaceC1752B);
        }
    }

    public void c(InterfaceC1752B interfaceC1752B) {
        this.b.add(interfaceC1752B);
        this.a.run();
    }

    public void d(final InterfaceC1752B interfaceC1752B, ax.G0.h hVar) {
        c(interfaceC1752B);
        androidx.lifecycle.d lifecycle = hVar.getLifecycle();
        a remove = this.c.remove(interfaceC1752B);
        if (remove != null) {
            remove.a();
        }
        this.c.put(interfaceC1752B, new a(lifecycle, new androidx.lifecycle.f() { // from class: ax.c0.y
            @Override // androidx.lifecycle.f
            public final void b(ax.G0.h hVar2, d.a aVar) {
                C1802z.b(C1802z.this, interfaceC1752B, hVar2, aVar);
            }
        }));
    }

    @SuppressLint({"LambdaLast"})
    public void e(final InterfaceC1752B interfaceC1752B, ax.G0.h hVar, final d.b bVar) {
        androidx.lifecycle.d lifecycle = hVar.getLifecycle();
        a remove = this.c.remove(interfaceC1752B);
        if (remove != null) {
            remove.a();
        }
        this.c.put(interfaceC1752B, new a(lifecycle, new androidx.lifecycle.f() { // from class: ax.c0.x
            @Override // androidx.lifecycle.f
            public final void b(ax.G0.h hVar2, d.a aVar) {
                C1802z.a(C1802z.this, bVar, interfaceC1752B, hVar2, aVar);
            }
        }));
    }

    public void f(Menu menu, MenuInflater menuInflater) {
        Iterator<InterfaceC1752B> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().c(menu, menuInflater);
        }
    }

    public void g(Menu menu) {
        Iterator<InterfaceC1752B> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public boolean h(MenuItem menuItem) {
        Iterator<InterfaceC1752B> it = this.b.iterator();
        while (it.hasNext()) {
            if (it.next().a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void i(Menu menu) {
        Iterator<InterfaceC1752B> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().d(menu);
        }
    }

    public void j(InterfaceC1752B interfaceC1752B) {
        this.b.remove(interfaceC1752B);
        a remove = this.c.remove(interfaceC1752B);
        if (remove != null) {
            remove.a();
        }
        this.a.run();
    }
}
