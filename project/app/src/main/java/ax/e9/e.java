/*
 * Decompiled with CFR 0.152.
 */
package ax.e9;

import ax.Y8.d;
import ax.vd.i;
import ax.wd.f;
import ax.wd.g;
import ax.wd.h;
import java.util.HashMap;
import java.util.Map;

public class e
implements ax.d9.e {
    private static Map<String, d<i>> b;
    private final i a;

    static {
        HashMap<String, d<i>> hashMap = new HashMap<String, d<i>>();
        b = hashMap;
        hashMap.put("SHA-512", new d<i>(){

            public i b() {
                return new h();
            }
        });
        b.put("SHA256", new d<i>(){

            public i b() {
                return new g();
            }
        });
        b.put("MD4", new d<i>(){

            public i b() {
                return new ax.wd.e();
            }
        });
        b.put("MD5", new d<i>(){

            public i b() {
                return new f();
            }
        });
    }

    e(String string) {
        this.a = this.g(string);
    }

    private i g(String string) {
        d<i> d8 = b.get(string);
        if (d8 != null) {
            return d8.a();
        }
        d8 = new StringBuilder();
        ((StringBuilder)((Object)d8)).append("No MessageDigest ");
        ((StringBuilder)((Object)d8)).append(string);
        ((StringBuilder)((Object)d8)).append(" defined in BouncyCastle");
        throw new IllegalArgumentException(((StringBuilder)((Object)d8)).toString());
    }

    @Override
    public void a() {
        this.a.a();
    }

    @Override
    public void b(byte[] byArray, int n8, int n9) {
        this.a.b(byArray, n8, n9);
    }

    @Override
    public byte[] c() {
        byte[] byArray = new byte[this.a.i()];
        this.a.c(byArray, 0);
        return byArray;
    }

    @Override
    public void d(byte by) {
        this.a.d(by);
    }

    @Override
    public int e() {
        return this.a.i();
    }

    @Override
    public void f(byte[] byArray) {
        this.a.b(byArray, 0, byArray.length);
    }
}

