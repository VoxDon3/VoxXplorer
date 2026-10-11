/*
 * Decompiled with CFR 0.152.
 */
package ax.e9;

import ax.Ad.d;
import ax.Ad.e;
import ax.d9.b;
import ax.d9.f;
import ax.vd.k;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.GCMParameterSpec;

public class a {
    private static final Map<String, ax.Y8.d<ax.d9.a>> a;

    static {
        HashMap<String, ax.Y8.d<ax.d9.a>> hashMap = new HashMap<String, ax.Y8.d<ax.d9.a>>();
        a = hashMap;
        hashMap.put("AES/CCM/NoPadding", new ax.Y8.d<ax.d9.a>(){

            public ax.d9.a b() {
                return new c(this, new d(new ax.xd.a())){
                    final a b;
                    {
                        this.b = a8;
                        super(a9);
                    }

                    @Override
                    protected ax.vd.d a(byte[] byArray, GCMParameterSpec gCMParameterSpec) {
                        return new ax.Dd.a(new ax.Dd.k(byArray), gCMParameterSpec.getTLen(), gCMParameterSpec.getIV());
                    }
                };
            }
        });
        hashMap.put("AES/GCM/NoPadding", new ax.Y8.d<ax.d9.a>(){

            public ax.d9.a b() {
                return new c(this, new e(new ax.xd.a())){
                    final b b;
                    {
                        this.b = b8;
                        super(a8);
                    }

                    @Override
                    protected ax.vd.d a(byte[] byArray, GCMParameterSpec gCMParameterSpec) {
                        return new ax.Dd.a(new ax.Dd.k(byArray), gCMParameterSpec.getTLen(), gCMParameterSpec.getIV());
                    }
                };
            }
        });
    }

    public static ax.d9.a a(String string) {
        ax.Y8.d<ax.d9.a> d8 = a.get(string);
        if (d8 != null) {
            return d8.a();
        }
        d8 = new StringBuilder();
        ((StringBuilder)((Object)d8)).append("Unknown AEADCipher ");
        ((StringBuilder)((Object)d8)).append(string);
        throw new IllegalArgumentException(((StringBuilder)((Object)d8)).toString());
    }

    private static abstract class c
    implements ax.d9.a {
        private ax.Ad.a a;

        c(ax.Ad.a a8) {
            this.a = a8;
        }

        protected abstract ax.vd.d a(byte[] var1, GCMParameterSpec var2);

        @Override
        public byte[] b(byte[] byArray, int n8, int n9) throws f {
            byte[] byArray2 = new byte[this.a.h(n9)];
            this.a.g(byArray, n8, n9, byArray2, 0);
            return byArray2;
        }

        @Override
        public byte[] e(byte[] byArray, int n8, int n9) throws f {
            byte[] byArray2 = new byte[this.a.i(n9)];
            n8 = this.a.g(byArray, n8, n9, byArray2, 0);
            try {
                this.a.c(byArray2, n8);
                return byArray2;
            }
            catch (k k8) {
                throw new f(k8);
            }
        }

        @Override
        public void f(byte[] byArray, int n8, int n9) throws f {
            this.a.j(byArray, n8, n9);
        }

        @Override
        public void g(b.a a8, byte[] byArray, GCMParameterSpec gCMParameterSpec) throws f {
            ax.Ad.a a9 = this.a;
            boolean bl = a8 == b.a.q;
            a9.e(bl, this.a(byArray, gCMParameterSpec));
        }
    }
}

