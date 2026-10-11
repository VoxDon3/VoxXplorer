/*
 * Decompiled with CFR 0.152.
 */
package ax.Sc;

import ax.Sc.f;
import ax.Sc.i;
import ax.Sc.j;
import ax.Sc.l;
import ax.Sc.p;
import ax.Sc.q;
import ax.Sc.r;
import ax.Vc.a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Function;
import java.util.function.Predicate;

public class s {
    private static final i[] e = new i[0];
    private List<String> a;
    private ListIterator<String> b;
    private final j c;
    private final boolean d;

    s(j j8, f f8) {
        LinkedList<String> linkedList = new LinkedList<String>();
        this.a = linkedList;
        this.b = linkedList.listIterator();
        this.c = j8;
        if (f8 != null) {
            this.d = f8.h();
            return;
        }
        this.d = false;
    }

    public static /* synthetic */ boolean a(l l8, i i8) {
        return l8.a(i8);
    }

    public static /* synthetic */ i b(s s8, String string) {
        i i8 = s8.c.c(string);
        if (i8 == null && s8.d) {
            return new i(string);
        }
        return i8;
    }

    private void h(InputStream object, String object2) throws IOException {
        Throwable throwable2;
        block6: {
            object2 = new BufferedReader(new InputStreamReader((InputStream)object, ax.Vc.a.a((String)object2)));
            object = this.c.a((BufferedReader)object2);
            while (object != null) {
                try {
                    this.a.add((String)object);
                    object = this.c.a((BufferedReader)object2);
                }
                catch (Throwable throwable2) {
                    break block6;
                }
            }
            ((BufferedReader)object2).close();
            return;
        }
        try {
            ((BufferedReader)object2).close();
        }
        catch (Throwable throwable3) {
            throwable2.addSuppressed(throwable3);
        }
        throw throwable2;
    }

    public List<i> c(l l8) {
        return (List)j.Collection._EL.stream(this.a).map((Function)new q(this)).filter((Predicate)new r(l8)).collect(j.Collectors.toList());
    }

    public i[] d() throws IOException {
        return this.e(p.b);
    }

    public i[] e(l l8) throws IOException {
        return this.c(l8).toArray(e);
    }

    public i[] f(int n8) {
        LinkedList<i> linkedList = new LinkedList<i>();
        while (n8 > 0 && this.b.hasNext()) {
            i i8;
            String string = this.b.next();
            i i9 = i8 = this.c.c(string);
            if (i8 == null) {
                i9 = i8;
                if (this.d) {
                    i9 = new i(string);
                }
            }
            linkedList.add(i9);
            --n8;
        }
        return linkedList.toArray(e);
    }

    public boolean g() {
        return this.b.hasNext();
    }

    public void i(InputStream inputStream, String string) throws IOException {
        this.a = new LinkedList<String>();
        this.h(inputStream, string);
        this.c.b(this.a);
        this.j();
    }

    public void j() {
        this.b = this.a.listIterator();
    }
}

