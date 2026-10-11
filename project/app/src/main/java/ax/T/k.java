/*
 * Decompiled with CFR 0.152.
 */
package ax.T;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import ax.S.e;
import ax.T.m;
import ax.Z.k;
import java.io.File;
import java.io.InputStream;

class k {
    @SuppressLint(value={"BanConcurrentHashMap"})
    private j.ConcurrentHashMap<Long, e.c> a = new j.ConcurrentHashMap();

    k() {
    }

    private static <T> T e(T[] TArray, int n8, b<T> b8) {
        int n9 = (n8 & 1) == 0 ? 400 : 700;
        boolean bl = (n8 & 2) != 0;
        return k.f(TArray, n9, bl, b8);
    }

    private static <T> T f(T[] TArray, int n8, boolean bl, b<T> b8) {
        int n9 = TArray.length;
        T t8 = null;
        int n10 = Integer.MAX_VALUE;
        for (int i8 = 0; i8 < n9; ++i8) {
            int n11;
            block4: {
                int n12;
                T t9;
                block3: {
                    t9 = TArray[i8];
                    n12 = Math.abs(b8.a(t9) - n8);
                    n11 = b8.b(t9) == bl ? 0 : 1;
                    n12 = n12 * 2 + n11;
                    if (t8 == null) break block3;
                    n11 = n10;
                    if (n10 <= n12) break block4;
                }
                t8 = t9;
                n11 = n12;
            }
            n10 = n11;
        }
        return t8;
    }

    public Typeface a(Context context, e.c c8, Resources resources, int n8) {
        throw null;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, k.b[] bArray, int n8) {
        throw null;
    }

    protected Typeface c(Context object, InputStream inputStream) {
        block6: {
            if ((object = m.e((Context)object)) == null) {
                return null;
            }
            boolean bl = m.d((File)object, inputStream);
            if (bl) break block6;
            ((File)object).delete();
            return null;
        }
        try {
            inputStream = Typeface.createFromFile((String)((File)object).getPath());
            return inputStream;
        }
        catch (Throwable throwable) {
            throw throwable;
        }
        catch (RuntimeException runtimeException) {
            return null;
        }
        finally {
            ((File)object).delete();
        }
    }

    public Typeface d(Context object, Resources resources, int n8, String string, int n9) {
        block6: {
            if ((object = m.e((Context)object)) == null) {
                return null;
            }
            boolean bl = m.c((File)object, resources, n8);
            if (bl) break block6;
            ((File)object).delete();
            return null;
        }
        try {
            resources = Typeface.createFromFile((String)((File)object).getPath());
            return resources;
        }
        catch (Throwable throwable) {
            throw throwable;
        }
        catch (RuntimeException runtimeException) {
            return null;
        }
        finally {
            ((File)object).delete();
        }
    }

    protected k.b g(k.b[] bArray, int n8) {
        return k.e(bArray, n8, new b<k.b>(this){
            final k a;
            {
                this.a = k8;
            }

            public int c(k.b b8) {
                return b8.e();
            }

            public boolean d(k.b b8) {
                return b8.f();
            }
        });
    }

    private static interface b<T> {
        public int a(T var1);

        public boolean b(T var1);
    }
}

