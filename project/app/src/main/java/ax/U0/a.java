/*
 * Decompiled with CFR 0.152.
 */
package ax.U0;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import ax.S0.d0;
import ax.U0.b;
import ax.U0.h;
import ax.U0.k;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class a
extends b {
    private final AssetManager e;
    private Uri f;
    private InputStream g;
    private long h;
    private boolean i;

    public a(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override
    public Uri b() {
        return this.f;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public int c(byte[] var1_1, int var2_3, int var3_4) throws a {
        block5: {
            if (var3_4 == 0) {
                return 0;
            }
            var4_5 = this.h;
            if (var4_5 == 0L) {
                return -1;
            }
            if (var4_5 == -1L) ** GOTO lbl10
            var6_6 = var3_4;
            try {
                var3_4 = (int)Math.min(var4_5, var6_6);
lbl10:
                // 2 sources

                var2_3 = d0.i(this.g).read(var1_1, var2_3, var3_4);
                if (var2_3 == -1) {
                    return -1;
                }
                var4_5 = this.h;
                if (var4_5 == -1L) break block5;
            }
            catch (IOException var1_2) {
                throw new a(var1_2, 2000);
            }
            this.h = var4_5 - (long)var2_3;
        }
        this.q(var2_3);
        return var2_3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void close() throws a {
        Throwable throwable2;
        block7: {
            this.f = null;
            try {
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.g = null;
                if (this.i) {
                    this.i = false;
                    this.r();
                }
                return;
            }
            catch (Throwable throwable2) {
                break block7;
            }
            catch (IOException iOException) {}
            {
                a a8 = new a(iOException, 2000);
                throw a8;
            }
        }
        this.g = null;
        if (this.i) {
            this.i = false;
            this.r();
        }
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public long f(k object) throws a {
        int n8;
        IOException iOException2;
        block12: {
            Object object2;
            block11: {
                String string;
                block10: {
                    try {
                        object2 = ((k)object).a;
                        this.f = object2;
                        string = ax.S0.a.e(object2.getPath());
                        if (!string.startsWith("/android_asset/")) break block10;
                        object2 = string.substring(15);
                        break block11;
                    }
                    catch (IOException iOException2) {
                        break block12;
                    }
                    catch (a a8) {
                        throw a8;
                    }
                }
                object2 = string;
                if (string.startsWith("/")) {
                    object2 = string.substring(1);
                }
            }
            this.s((k)object);
            object2 = this.e.open((String)object2, 1);
            this.g = object2;
            if (((InputStream)object2).skip(((k)object).g) >= ((k)object).g) {
                long l8 = ((k)object).h;
                if (l8 != -1L) {
                    this.h = l8;
                } else {
                    this.h = l8 = (long)this.g.available();
                    if (l8 == Integer.MAX_VALUE) {
                        this.h = -1L;
                    }
                }
                this.i = true;
                this.t((k)object);
                return this.h;
            }
            object = new a(null, 2008);
            throw object;
        }
        if (iOException2 instanceof FileNotFoundException) {
            n8 = 2005;
            throw new a(iOException2, n8);
        }
        n8 = 2000;
        throw new a(iOException2, n8);
    }

    public static final class a
    extends h {
        public a(Throwable throwable, int n8) {
            super(throwable, n8);
        }
    }
}

