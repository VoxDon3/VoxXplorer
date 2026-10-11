/*
 * Decompiled with CFR 0.152.
 */
package ax.e9;

import ax.Dd.k;
import ax.vd.l;
import ax.wd.f;
import ax.wd.g;
import ax.xd.a;
import ax.zd.b;
import ax.zd.c;
import java.util.HashMap;
import java.util.Map;

public class d
implements ax.d9.d {
    private static Map<String, ax.Y8.d<l>> b;
    private final l a;

    static {
        HashMap<String, ax.Y8.d<l>> hashMap = new HashMap<String, ax.Y8.d<l>>();
        b = hashMap;
        hashMap.put("HMACSHA256", new ax.Y8.d<l>(){

            public l b() {
                return new c(new g());
            }
        });
        b.put("HMACMD5", new ax.Y8.d<l>(){

            public l b() {
                return new c(new f());
            }
        });
        b.put("AESCMAC", new ax.Y8.d<l>(){

            public l b() {
                return new b(new a());
            }
        });
    }

    d(String string) {
        this.a = this.c(string).a();
    }

    private ax.Y8.d<l> c(String string) {
        ax.Y8.d<l> d8 = b.get(string.toUpperCase());
        if (d8 != null) {
            return d8;
        }
        d8 = new StringBuilder();
        ((StringBuilder)((Object)d8)).append("No Mac defined for ");
        ((StringBuilder)((Object)d8)).append(string);
        throw new IllegalArgumentException(((StringBuilder)((Object)d8)).toString());
    }

    @Override
    public void a(byte[] byArray) {
        this.a.e(new k(byArray));
    }

    @Override
    public void b(byte[] byArray, int n8, int n9) {
        this.a.b(byArray, n8, n9);
    }

    @Override
    public void d(byte by) {
        this.a.d(by);
    }

    @Override
    public void f(byte[] byArray) {
        this.a.b(byArray, 0, byArray.length);
    }

    @Override
    public byte[] g() {
        byte[] byArray = new byte[this.a.a()];
        this.a.c(byArray, 0);
        return byArray;
    }
}

