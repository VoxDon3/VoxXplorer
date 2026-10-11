/*
 * Decompiled with CFR 0.152.
 */
package ax.e1;

import android.content.Context;
import ax.P0.D;
import ax.P0.E;
import ax.P0.v;
import ax.S0.d0;
import ax.V0.i;
import ax.V0.j;
import ax.Y0.V;
import ax.e1.b;
import ax.e1.d;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class a
extends j<i, d, ax.e1.c>
implements ax.e1.b {
    private final Context o;
    private final int p;

    private a(Context context, b b8, int n8) {
        super(new i[1], (androidx.media3.decoder.a[])new d[1]);
        this.o = context;
        this.p = n8;
    }

    protected ax.e1.c A(Throwable throwable) {
        return new ax.e1.c("Unexpected decode error", throwable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected ax.e1.c B(i i8, d d8, boolean bl) {
        int n8;
        ByteBuffer byteBuffer;
        block8: {
            block9: {
                byteBuffer = ax.S0.a.e(i8.e0);
                ax.S0.a.g(byteBuffer.hasArray());
                bl = byteBuffer.arrayOffset() == 0;
                ax.S0.a.a(bl);
                try {
                    n8 = this.p;
                    if (n8 != -1) break block8;
                    Object object = this.o;
                    if (object == null) break block9;
                    object = d0.V(object);
                    int n9 = object.x;
                    int n10 = object.y;
                    object = i8.c0;
                    int n11 = n10;
                    int n12 = n9;
                    if (object != null) {
                        n12 = object.N;
                        n8 = n9;
                        if (n12 != -1) {
                            n8 = n9 * n12;
                        }
                        n9 = object.O;
                        n11 = n10;
                        n12 = n8;
                        if (n9 != -1) {
                            n11 = n10 * n9;
                            n12 = n8;
                        }
                    }
                    n8 = Math.max(n12, n11) * 2 - 1;
                    break block8;
                }
                catch (IOException iOException) {
                    return new ax.e1.c(iOException);
                }
                catch (E e8) {
                    return new ax.e1.c("Could not decode image data with BitmapFactory.", e8);
                }
            }
            n8 = 4096;
        }
        d8.f0 = ax.U0.c.a(byteBuffer.array(), byteBuffer.remaining(), null, n8);
        d8.c0 = i8.g0;
        return null;
    }

    @Override
    public String getName() {
        return "BitmapFactoryImageDecoder";
    }

    @Override
    protected i j() {
        return new i(1);
    }

    protected d z() {
        return new d(this){
            final a g0;
            {
                this.g0 = a8;
            }

            @Override
            public void B() {
                this.g0.u(this);
            }
        };
    }

    @Deprecated
    public static interface b {
    }

    public static final class c
    implements b.a {
        private final Context a;
        private int b;

        public c(Context context) {
            this(context, null);
        }

        private c(Context context, b b8) {
            this.a = context;
            this.b = -1;
        }

        @Override
        public int b(v v8) {
            String string = v8.o;
            if (string != null && D.q(string)) {
                if (d0.J0(v8.o)) {
                    return V.a(4);
                }
                return V.a(1);
            }
            return V.a(0);
        }

        public a c() {
            return new a(this.a, null, this.b);
        }
    }
}

