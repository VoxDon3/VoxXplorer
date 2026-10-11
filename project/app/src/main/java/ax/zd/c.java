/*
 * Decompiled with CFR 0.152.
 */
package ax.zd;

import ax.Dd.k;
import ax.Nd.d;
import ax.Nd.f;
import ax.vd.i;
import ax.vd.j;
import ax.vd.l;
import java.util.Hashtable;

public class c
implements l {
    private static Hashtable h;
    private i a;
    private int b;
    private int c;
    private f d;
    private f e;
    private byte[] f;
    private byte[] g;

    static {
        Hashtable<String, Integer> hashtable;
        h = hashtable = new Hashtable<String, Integer>();
        hashtable.put("GOST3411", ax.Nd.d.d(32));
        h.put("MD2", ax.Nd.d.d(16));
        h.put("MD4", ax.Nd.d.d(64));
        h.put("MD5", ax.Nd.d.d(64));
        h.put("RIPEMD128", ax.Nd.d.d(64));
        h.put("RIPEMD160", ax.Nd.d.d(64));
        h.put("SHA-1", ax.Nd.d.d(64));
        h.put("SHA-224", ax.Nd.d.d(64));
        h.put("SHA-256", ax.Nd.d.d(64));
        h.put("SHA-384", ax.Nd.d.d(128));
        h.put("SHA-512", ax.Nd.d.d(128));
        h.put("Tiger", ax.Nd.d.d(64));
        h.put("Whirlpool", ax.Nd.d.d(64));
    }

    public c(i i8) {
        this(i8, ax.zd.c.f(i8));
    }

    private c(i i8, int n8) {
        int n9;
        this.a = i8;
        this.b = n9 = i8.i();
        this.c = n8;
        this.f = new byte[n8];
        this.g = new byte[n8 + n9];
    }

    private static int f(i i8) {
        if (i8 instanceof j) {
            return ((j)i8).h();
        }
        Comparable<Integer> comparable = (Integer)h.get(i8.f());
        if (comparable != null) {
            return (Integer)comparable;
        }
        comparable = new StringBuilder();
        ((StringBuilder)comparable).append("unknown digest passed: ");
        ((StringBuilder)comparable).append(i8.f());
        throw new IllegalArgumentException(((StringBuilder)comparable).toString());
    }

    private static void g(byte[] byArray, int n8, byte by) {
        for (int i8 = 0; i8 < n8; ++i8) {
            byArray[i8] = (byte)(byArray[i8] ^ by);
        }
    }

    @Override
    public int a() {
        return this.b;
    }

    @Override
    public void b(byte[] byArray, int n8, int n9) {
        this.a.b(byArray, n8, n9);
    }

    @Override
    public int c(byte[] object, int n8) {
        this.a.c(this.g, this.c);
        Object object2 = this.e;
        if (object2 != null) {
            ((f)((Object)this.a)).j((f)object2);
            object2 = this.a;
            object2.b(this.g, this.c, object2.i());
        } else {
            object2 = this.a;
            byte[] byArray = this.g;
            object2.b(byArray, 0, byArray.length);
        }
        int n9 = this.a.c((byte[])object, n8);
        for (n8 = this.c; n8 < ((byte[])(object = this.g)).length; ++n8) {
            object[n8] = 0;
        }
        object = this.d;
        if (object != null) {
            ((f)((Object)this.a)).j((f)object);
            return n9;
        }
        object2 = this.a;
        object = this.f;
        object2.b((byte[])object, 0, ((byte[])object).length);
        return n9;
    }

    @Override
    public void d(byte by) {
        this.a.d(by);
    }

    @Override
    public void e(ax.vd.d object) {
        this.a.a();
        object = ((k)object).a();
        int n8 = ((Object)object).length;
        if (n8 > this.c) {
            this.a.b((byte[])object, 0, n8);
            this.a.c(this.f, 0);
            n8 = this.b;
        } else {
            System.arraycopy(object, 0, this.f, 0, n8);
        }
        while (n8 < ((Object)(object = (Object)this.f)).length) {
            object[n8] = false;
            ++n8;
        }
        System.arraycopy(object, 0, this.g, 0, this.c);
        ax.zd.c.g(this.f, this.c, (byte)54);
        ax.zd.c.g(this.g, this.c, (byte)92);
        object = this.a;
        if (object instanceof f) {
            this.e = object = ((f)object).g();
            ((i)object).b(this.g, 0, this.c);
        }
        object = this.a;
        byte[] byArray = this.f;
        object.b(byArray, 0, byArray.length);
        object = this.a;
        if (object instanceof f) {
            this.d = ((f)object).g();
        }
    }
}

