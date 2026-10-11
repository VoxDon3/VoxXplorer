/*
 * Decompiled with CFR 0.152.
 */
package ax.P4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.Pair;
import ax.P4.h;
import java.util.HashMap;

public final class a {
    private static final String b = ax.S4.b.f(a.class);
    private static int c = 0;
    private static final a d = new a();
    private Pair<String, Bitmap[]> a;

    private a() {
        if (c == 0) {
            c = Math.min((int)Runtime.getRuntime().maxMemory() / 32, 0x100000);
        }
        this.a = Pair.create((Object)"", null);
    }

    static /* synthetic */ Pair c(a a8, Pair pair) {
        a8.a = pair;
        return pair;
    }

    static /* synthetic */ int d() {
        return c;
    }

    static /* synthetic */ Bitmap e(Bitmap bitmap, int n8, int n9) {
        return ax.P4.a.l(bitmap, n8, n9);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Bitmap[] h(String object) {
        Pair<String, Bitmap[]> pair = this.a;
        synchronized (pair) {
            try {
                if (!((String)this.a.first).equals(object)) return null;
                object = this.a.second;
                if (object == null) return null;
                return object;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static a i() {
        return d;
    }

    public static int k(int n8, int n9, Bitmap.Config config, int n10) {
        int n11 = 1;
        if (n10 == 0) {
            return 1;
        }
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        int n12 = 4;
        if (config != config2 && config == Bitmap.Config.RGB_565) {
            n12 = 2;
        }
        n8 = n8 * n9 * n12;
        n9 = n11;
        while (n8 > n10) {
            n8 /= 4;
            n9 *= 2;
        }
        return n9;
    }

    private static Bitmap l(Bitmap bitmap, int n8, int n9) {
        double d8 = Math.min((double)n8 / (double)bitmap.getWidth(), (double)n9 / (double)bitmap.getHeight());
        return Bitmap.createScaledBitmap((Bitmap)bitmap, (int)((int)((double)bitmap.getWidth() * d8)), (int)((int)((double)bitmap.getHeight() * d8)), (boolean)false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void f(Context object, String string, a a8) {
        if (string != null && c != 0) {
            Pair<String, Bitmap[]> pair = this.a;
            // MONITORENTER : pair
            if (((String)this.a.first).equals(string) && this.a.second != null) {
                ax.S4.b.a(b, "getOrFetch: album art is in cache, using it", string);
                object = this.a.second;
                a8.c(string, ((Bitmap[])object)[0], ((Bitmap[])object)[2], ((Bitmap[])object)[1]);
                // MONITOREXIT : pair
                return;
            }
            this.a = Pair.create((Object)string, null);
            // MONITOREXIT : pair
            ax.S4.b.a(b, "getOrFetch: starting asynctask to fetch ", string);
            new b(this, (Context)object, string, a8).g(ax.c5.b.h0, new Void[0]);
            return;
        }
        a8.b(string, new IllegalArgumentException("got null bitmaps"));
    }

    public Bitmap g(String bitmapArray) {
        if ((bitmapArray = this.h((String)bitmapArray)) != null) {
            return bitmapArray[0];
        }
        return null;
    }

    public Bitmap j(String bitmapArray) {
        if ((bitmapArray = this.h((String)bitmapArray)) != null) {
            return bitmapArray[2];
        }
        return null;
    }

    public static abstract class a {
        public void a() {
        }

        public void b(String string, Exception exception) {
            String string2 = b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AlbumArtFetchListener: error while downloading ");
            stringBuilder.append(string);
            ax.S4.b.b(string2, exception, stringBuilder.toString());
        }

        public abstract void c(String var1, Bitmap var2, Bitmap var3, Bitmap var4);
    }

    private class b
    extends ax.c5.b<Void, Void, Bitmap[]> {
        private final Context l0;
        private final String m0;
        private final a n0;
        private boolean o0;
        final a p0;

        b(a a8, Context context, String string, a a9) {
            this.p0 = a8;
            this.l0 = context;
            this.m0 = string;
            this.n0 = a9;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private Bitmap[] s() {
            Pair pair = this.p0.a;
            synchronized (pair) {
                Throwable throwable2;
                block4: {
                    Bitmap[] bitmapArray;
                    try {
                        if (!((String)((a)this.p0).a.first).equals(this.m0)) return null;
                        Bitmap bitmap = BitmapFactory.decodeResource((Resources)this.l0.getResources(), (int)h.b);
                        Bitmap bitmap2 = BitmapFactory.decodeResource((Resources)this.l0.getResources(), (int)h.a);
                        bitmapArray = new Bitmap[]{bitmap, bitmap2, bitmap2};
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                    ax.P4.a.c(this.p0, Pair.create((Object)this.m0, (Object)bitmapArray));
                    return bitmapArray;
                }
                throw throwable2;
            }
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected Bitmap[] r(Void[] var1_1) {
            block34: {
                block35: {
                    block29: {
                        block33: {
                            block30: {
                                var1_1 = ax.P4.a.b(this.p0);
                                synchronized (var1_1) {
                                    var4_5 = ((String)ax.P4.a.b((a)this.p0).first).equals(this.m0);
                                    var7_6 = null;
                                    if (!var4_5) {
                                        this.o0 = true;
                                        return null;
                                    }
                                    if (ax.P4.a.b((a)this.p0).second != null) {
                                        return (Bitmap[])ax.P4.a.b((a)this.p0).second;
                                    }
                                }
                                var8_14 = new MediaMetadataRetriever();
                                var1_1 = Uri.parse((String)this.m0);
                                if (ax.Q4.b.l((Uri)var1_1)) {
                                    var8_14.setDataSource(this.l0, (Uri)var1_1);
                                } else {
                                    var1_1 = this.m0;
                                    var5_9 /* !! */  = new HashMap();
                                    var8_14.setDataSource((String)var1_1, var5_9 /* !! */ );
                                }
                                var1_1 = (Bitmap[])var8_14.getEmbeddedPicture();
                                if (var1_1 == null) break block29;
                                var5_9 /* !! */  = new BitmapFactory.Options();
                                var5_9 /* !! */ .inJustDecodeBounds = true;
                                BitmapFactory.decodeByteArray((byte[])var1_1, (int)0, (int)var1_1.length, (BitmapFactory.Options)var5_9 /* !! */ );
                                var5_9 /* !! */ .inJustDecodeBounds = false;
                                var2_15 = var5_9 /* !! */ .outWidth;
                                var3_16 = var5_9 /* !! */ .outHeight;
                                var6_17 /* !! */  = Bitmap.Config.RGB_565;
                                var5_9 /* !! */ .inSampleSize = ax.P4.a.k(var2_15, var3_16, (Bitmap.Config)var6_17 /* !! */ , ax.P4.a.d());
                                var5_9 /* !! */ .inPreferredConfig = var6_17 /* !! */ ;
                                var5_9 /* !! */  = BitmapFactory.decodeByteArray((byte[])var1_1, (int)0, (int)var1_1.length, (BitmapFactory.Options)var5_9 /* !! */ );
                                if (var5_9 /* !! */  != null) break block30;
                                var1_1 = this.s();
                                var8_14.release();
                                return var1_1;
                            }
                            var1_1 = var5_9 /* !! */ ;
                            if (var5_9 /* !! */ .getConfig() == null) {
                                var6_17 /* !! */  = var5_9 /* !! */ .copy((Bitmap.Config)var6_17 /* !! */ , false);
                                var1_1 = var5_9 /* !! */ ;
                                if (var6_17 /* !! */  != null) {
                                    var5_9 /* !! */ .recycle();
                                    var1_1 = var6_17 /* !! */ ;
                                }
                            }
                            if (var1_1.getWidth() <= 0 || var1_1.getHeight() <= 0) ** GOTO lbl69
                            var5_9 /* !! */  = var1_1.getWidth() > 192 && var1_1.getHeight() > 192 ? ax.P4.a.e((Bitmap)var1_1, 192, 192) : var1_1;
                            var6_17 /* !! */  = var1_1.getWidth() > 384 && var1_1.getHeight() > 384 ? ax.P4.a.e((Bitmap)var1_1, 384, 384) : var1_1;
                            var9_18 = ax.P4.a.b(this.p0);
                            ** synchronized (var9_18)
lbl-1000:
                            // 1 sources

                            {
                                block32: {
                                    block31: {
                                        try {
                                            if (!((String)ax.P4.a.b((a)this.p0).first).equals(this.m0)) break block31;
                                            var7_6 = new Bitmap[]{var1_1, var5_9 /* !! */ , var6_17 /* !! */ };
                                            ax.P4.a.c(this.p0, Pair.create((Object)this.m0, (Object)var7_6));
                                            var1_1 = var7_6;
                                            break block32;
                                        }
                                        catch (Throwable var1_3) {
                                            break block33;
                                        }
                                    }
                                    this.o0 = true;
                                    var1_1 = var7_6;
                                }
                                break block35;
                            }
                        }
                        throw var1_3;
lbl69:
                        // 1 sources

                        var1_1 = this.s();
                        var8_14.release();
                        return var1_1;
                    }
                    var1_1 = this.s();
                    catch (AssertionError | Exception var5_10) {
                        return var1_1;
                    }
                    catch (AssertionError | Exception var5_11) {
                        return var1_1;
                    }
                    {
                        catch (Throwable var5_7) {}
                        throw var5_7;
                    }
                    {
                        catch (Throwable var1_2) {
                            break block34;
                        }
                        catch (Exception var1_4) {}
                        {
                            var1_1 = this.s();
                        }
                    }
                }
                var8_14.release();
                return var1_1;
            }
            try {
                var8_14.release();
            }
            catch (AssertionError | Exception var5_13) {
                throw var1_2;
            }
            throw var1_2;
            catch (AssertionError | Exception var5_12) {
                return var1_1;
            }
        }

        protected void t(Bitmap[] bitmapArray) {
            if (bitmapArray == null) {
                if (this.o0) {
                    this.n0.a();
                    return;
                }
                this.n0.b(this.m0, new IllegalArgumentException("got null bitmaps"));
                return;
            }
            this.n0.c(this.m0, bitmapArray[0], bitmapArray[2], bitmapArray[1]);
        }
    }
}

