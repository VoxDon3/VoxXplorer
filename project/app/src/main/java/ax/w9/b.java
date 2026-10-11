/*
 * Decompiled with CFR 0.152.
 */
package ax.w9;

import ax.C8.c;
import ax.Z8.a;
import ax.w9.d;
import ax.w9.e;
import ax.w9.f;
import ax.y8.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class b
extends f {
    private List<ax.E8.e> c = new ArrayList<ax.E8.e>();
    protected byte[] d;

    public b() {
        super(0, "NegTokenInit");
    }

    private void e(List<ax.C8.b> list) {
        byte[] byArray = this.d;
        if (byArray != null && byArray.length > 0) {
            list.add(new ax.D8.c(ax.C8.c.d(2).c(), new ax.F8.b(this.d), true));
        }
    }

    private void f(List<ax.C8.b> list) {
        if (this.c.size() > 0) {
            ArrayList<ax.C8.b> arrayList = new ArrayList<ax.C8.b>(this.c);
            list.add(new ax.D8.c(ax.C8.c.d(0).c(), new ax.D8.a(arrayList), true));
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private b i(ax.Z8.a<?> object) throws e {
        Throwable throwable222;
        a a8;
        block11: {
            Object object2;
            block9: {
                block10: {
                    object2 = new ax.B8.a();
                    a8 = new a((ax.z8.a)object2, ((ax.Z8.a)object).b());
                    {
                        catch (IOException iOException) {
                            throw new e("Could not read NegTokenInit from buffer", iOException);
                        }
                    }
                    object = (ax.D8.c)a8.g();
                    if (((ax.C8.b)object).e().g() != ax.C8.d.d0) break block9;
                    object2 = ((ax.D8.c)object).q(ax.C8.c.n);
                    if (!((object = ((ax.D8.a)object2).l(0)) instanceof ax.E8.e)) break block10;
                    this.a(((ax.D8.a)object2).l(1));
                    ((InputStream)a8).close();
                    return this;
                }
                try {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Expected to find the SPNEGO OID (");
                    ((StringBuilder)object2).append(ax.w9.d.a);
                    ((StringBuilder)object2).append("), not: ");
                    ((StringBuilder)object2).append(object);
                    e e8 = new e(((StringBuilder)object2).toString());
                    throw e8;
                }
                catch (Throwable throwable222) {}
                break block11;
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Incorrect GSS-API ASN.1 token received, expected to find an [APPLICATION 0], not: ");
            ((StringBuilder)object2).append(object);
            e e9 = new e(((StringBuilder)object2).toString());
            throw e9;
        }
        try {
            ((InputStream)a8).close();
            throw throwable222;
        }
        catch (Throwable throwable3) {
            throwable222.addSuppressed(throwable3);
            throw throwable222;
        }
    }

    @Override
    protected void b(ax.D8.c c8) throws e {
        block8: {
            block7: {
                if (c8.p().toString().contains("not_defined_in_RFC4178@please_ignore")) break block7;
                int n8 = c8.r();
                if (n8 == 0) break block8;
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 3) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Unknown Object Tag ");
                            stringBuilder.append(c8.r());
                            stringBuilder.append(" encountered.");
                            throw new e(stringBuilder.toString());
                        }
                    } else {
                        this.k(c8.p());
                    }
                }
            }
            return;
        }
        this.l(c8.p());
    }

    @Override
    public void c(ax.Z8.a<?> a8) throws e {
        try {
            ArrayList<ax.C8.b> arrayList = new ArrayList<ax.C8.b>();
            this.f(arrayList);
            this.e(arrayList);
            ax.D8.a a9 = new ax.D8.a(arrayList);
            this.d(a8, a9);
            return;
        }
        catch (IOException iOException) {
            throw new e("Unable to write NegTokenInit", iOException);
        }
    }

    public void g(ax.E8.e e8) {
        this.c.add(e8);
    }

    public List<ax.E8.e> h() {
        return this.c;
    }

    public b j(byte[] byArray) throws e {
        return this.i(new a.c(byArray, ax.Z8.b.b));
    }

    void k(ax.C8.b<?> b8) throws e {
        if (b8 instanceof ax.F8.b) {
            this.d = ((ax.F8.b)b8).i();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected the MechToken (OCTET_STRING) contents, not: ");
        stringBuilder.append(b8);
        throw new e(stringBuilder.toString());
    }

    void l(ax.C8.b<?> b8) throws e {
        if (b8 instanceof ax.D8.a) {
            Object object = ((ax.D8.a)b8).iterator();
            while (object.hasNext()) {
                b8 = object.next();
                if (b8 instanceof ax.E8.e) {
                    this.c.add((ax.E8.e)b8);
                    continue;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Expected a MechType (OBJECT IDENTIFIER) as contents of the MechTypeList, not: ");
                ((StringBuilder)object).append(b8);
                throw new e(((StringBuilder)object).toString());
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected the MechTypeList (SEQUENCE) contents, not: ");
        stringBuilder.append(b8);
        throw new e(stringBuilder.toString());
    }

    public void m(byte[] byArray) {
        this.d = byArray;
    }
}

