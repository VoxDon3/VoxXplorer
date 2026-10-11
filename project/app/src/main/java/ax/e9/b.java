/*
 * Decompiled with CFR 0.152.
 */
package ax.e9;

import ax.Dd.e;
import ax.d9.b;
import ax.d9.f;
import ax.vd.k;
import ax.vd.t;
import java.util.HashMap;
import java.util.Map;

public class b {
    private static final Map<String, ax.Y8.d<ax.d9.b>> a;

    static {
        HashMap<String, ax.Y8.d<ax.d9.b>> hashMap = new HashMap<String, ax.Y8.d<ax.d9.b>>();
        a = hashMap;
        hashMap.put("DES/ECB/NoPadding", new ax.Y8.d<ax.d9.b>(){

            public ax.d9.b b() {
                return new c(this, new ax.vd.b(new ax.xd.c())){
                    final a b;
                    {
                        this.b = a8;
                        super(b8);
                    }

                    @Override
                    protected ax.vd.d d(byte[] byArray) {
                        return new e(byArray);
                    }
                };
            }
        });
        hashMap.put("RC4", new ax.Y8.d<ax.d9.b>(){

            public ax.d9.b b() {
                return new d(this, new ax.xd.d()){
                    final b b;
                    {
                        this.b = b8;
                        super(t8);
                    }

                    @Override
                    protected ax.vd.d d(byte[] byArray) {
                        return new ax.Dd.k(byArray);
                    }
                };
            }
        });
    }

    public static ax.d9.b a(String string) {
        ax.Y8.d<ax.d9.b> d8 = a.get(string);
        if (d8 != null) {
            return d8.a();
        }
        d8 = new StringBuilder();
        ((StringBuilder)((Object)d8)).append("Unknown Cipher ");
        ((StringBuilder)((Object)d8)).append(string);
        throw new IllegalArgumentException(((StringBuilder)((Object)d8)).toString());
    }

    private static abstract class c
    implements ax.d9.b {
        private ax.vd.b a;

        c(ax.vd.b b8) {
            this.a = b8;
        }

        @Override
        public int a(byte[] byArray, int n8, int n9, byte[] byArray2, int n10) {
            return this.a.e(byArray, n8, n9, byArray2, n10);
        }

        @Override
        public void b(b.a a8, byte[] byArray) {
            ax.vd.b b8 = this.a;
            boolean bl = a8 == b.a.q;
            b8.d(bl, this.d(byArray));
        }

        @Override
        public int c(byte[] byArray, int n8) throws f {
            try {
                n8 = this.a.a(byArray, n8);
                return n8;
            }
            catch (k k8) {
                throw new f(k8);
            }
        }

        protected abstract ax.vd.d d(byte[] var1);
    }

    private static abstract class d
    implements ax.d9.b {
        private t a;

        d(t t8) {
            this.a = t8;
        }

        @Override
        public int a(byte[] byArray, int n8, int n9, byte[] byArray2, int n10) {
            return this.a.g(byArray, n8, n9, byArray2, n10);
        }

        @Override
        public void b(b.a a8, byte[] byArray) {
            t t8 = this.a;
            boolean bl = a8 == b.a.q;
            t8.e(bl, this.d(byArray));
        }

        @Override
        public int c(byte[] byArray, int n8) {
            this.a.a();
            return 0;
        }

        protected abstract ax.vd.d d(byte[] var1);
    }
}

