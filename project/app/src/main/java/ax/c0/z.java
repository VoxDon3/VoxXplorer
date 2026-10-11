/*
 * Decompiled with CFR 0.152.
 */
package ax.c0;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import ax.G0.h;
import ax.c0.B;
import ax.c0.x;
import ax.c0.y;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class z {
    private final Runnable a;
    private final CopyOnWriteArrayList<B> b = new CopyOnWriteArrayList();
    private final Map<B, a> c = new HashMap<B, a>();

    public z(Runnable runnable2) {
        this.a = runnable2;
    }

    public static /* synthetic */ void a(z z8, d.b b8, B b9, h h8, d.a a8) {
        z8.getClass();
        if (a8 == d.a.l(b8)) {
            z8.c(b9);
            return;
        }
        if (a8 == d.a.ON_DESTROY) {
            z8.j(b9);
            return;
        }
        if (a8 == d.a.h(b8)) {
            z8.b.remove(b9);
            z8.a.run();
        }
    }

    public static /* synthetic */ void b(z z8, B b8, h h8, d.a a8) {
        z8.getClass();
        if (a8 == d.a.ON_DESTROY) {
            z8.j(b8);
        }
    }

    public void c(B b8) {
        this.b.add(b8);
        this.a.run();
    }

    public void d(B b8, h object) {
        this.c(b8);
        object = object.getLifecycle();
        Object object2 = this.c.remove(b8);
        if (object2 != null) {
            ((a)object2).a();
        }
        object2 = new y(this, b8);
        this.c.put(b8, new a((d)object, (f)object2));
    }

    @SuppressLint(value={"LambdaLast"})
    public void e(B b8, h object, d.b object2) {
        object = object.getLifecycle();
        a a8 = this.c.remove(b8);
        if (a8 != null) {
            a8.a();
        }
        object2 = new x(this, (d.b)((Object)object2), b8);
        this.c.put(b8, new a((d)object, (f)object2));
    }

    public void f(Menu menu, MenuInflater menuInflater) {
        Iterator<B> iterator = this.b.iterator();
        while (iterator.hasNext()) {
            iterator.next().c(menu, menuInflater);
        }
    }

    public void g(Menu menu) {
        Iterator<B> iterator = this.b.iterator();
        while (iterator.hasNext()) {
            iterator.next().b(menu);
        }
    }

    public boolean h(MenuItem menuItem) {
        Iterator<B> iterator = this.b.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().a(menuItem)) continue;
            return true;
        }
        return false;
    }

    public void i(Menu menu) {
        Iterator<B> iterator = this.b.iterator();
        while (iterator.hasNext()) {
            iterator.next().d(menu);
        }
    }

    public void j(B object) {
        this.b.remove(object);
        object = this.c.remove(object);
        if (object != null) {
            ((a)object).a();
        }
        this.a.run();
    }

    private static class a {
        final d a;
        private f b;

        a(d d8, f f8) {
            this.a = d8;
            this.b = f8;
            d8.a(f8);
        }

        void a() {
            this.a.c(this.b);
            this.b = null;
        }
    }
}

