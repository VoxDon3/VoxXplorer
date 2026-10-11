/*
 * Decompiled with CFR 0.152.
 */
package ax.e9;

import ax.Dd.j;
import ax.Y8.d;
import ax.vd.g;
import ax.vd.h;
import java.util.HashMap;
import java.util.Map;

public class c {
    private static final Map<String, d<ax.d9.c>> a;

    static {
        HashMap<String, d<ax.d9.c>> hashMap = new HashMap<String, d<ax.d9.c>>();
        a = hashMap;
        hashMap.put("KDF/Counter/HMACSHA256", new d<ax.d9.c>(){

            public ax.d9.c b() {
                return new b(this, new ax.yd.b(new ax.zd.c(new ax.wd.g()))){
                    final a b;
                    {
                        this.b = a8;
                        super(g8);
                    }

                    @Override
                    protected h c(ax.f9.b b8) {
                        if (b8 instanceof ax.f9.a) {
                            b8 = (ax.f9.a)b8;
                            return new j(((ax.f9.a)b8).c(), ((ax.f9.a)b8).b(), ((ax.f9.a)b8).a());
                        }
                        throw new IllegalArgumentException("Parameters should be a CounterDerivationParameters");
                    }
                };
            }
        });
    }

    public static ax.d9.c a(String string) {
        d<ax.d9.c> d8 = a.get(string);
        if (d8 != null) {
            return d8.a();
        }
        d8 = new StringBuilder();
        ((StringBuilder)((Object)d8)).append("Unknown DerivationFunction ");
        ((StringBuilder)((Object)d8)).append(string);
        throw new IllegalArgumentException(((StringBuilder)((Object)d8)).toString());
    }

    static abstract class b
    implements ax.d9.c {
        private final g a;

        public b(g g8) {
            this.a = g8;
        }

        @Override
        public int a(byte[] byArray, int n8, int n9) {
            return this.a.a(byArray, n8, n9);
        }

        @Override
        public void b(ax.f9.b b8) {
            this.a.b(this.c(b8));
        }

        protected abstract h c(ax.f9.b var1);
    }
}

