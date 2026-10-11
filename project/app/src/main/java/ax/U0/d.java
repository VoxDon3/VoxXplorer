/*
 * Decompiled with CFR 0.152.
 */
package ax.U0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import ax.S0.d0;
import ax.T.l;
import ax.U0.b;
import ax.U0.h;
import ax.U0.k;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

public final class d
extends b {
    private final ContentResolver e;
    private Uri f;
    private AssetFileDescriptor g;
    private FileInputStream h;
    private long i;
    private boolean j;

    public d(Context context) {
        super(false);
        this.e = context.getContentResolver();
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
            var6_5 = this.i;
            if (var6_5 == 0L) {
                return -1;
            }
            if (var6_5 == -1L) ** GOTO lbl10
            var4_6 = var3_4;
            try {
                var3_4 = (int)Math.min(var6_5, var4_6);
lbl10:
                // 2 sources

                var2_3 = d0.i(this.h).read(var1_1, var2_3, var3_4);
                if (var2_3 == -1) {
                    return -1;
                }
                var4_6 = this.i;
                if (var4_6 == -1L) break block5;
            }
            catch (IOException var1_2) {
                throw new a(var1_2, 2000);
            }
            this.i = var4_6 - (long)var2_3;
        }
        this.q(var2_3);
        return var2_3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void close() throws a {
        Throwable throwable422222;
        block21: {
            Throwable throwable2222222;
            IOException iOException322222;
            block20: {
                Throwable throwable3222222;
                Object object;
                block19: {
                    block18: {
                        this.f = null;
                        object = this.h;
                        if (object != null) {
                            ((FileInputStream)object).close();
                        }
                        this.h = null;
                        object = this.g;
                        if (object != null) {
                            object.close();
                        }
                        this.g = null;
                        if (this.j) {
                            this.j = false;
                            this.r();
                        }
                        return;
                        catch (Throwable throwable3222222) {
                            break block18;
                        }
                        catch (IOException iOException2) {}
                        {
                            a a8 = new a(iOException2, 2000);
                            throw a8;
                        }
                    }
                    this.h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.g = null;
                        if (!this.j) break block19;
                        this.j = false;
                        this.r();
                    }
                    catch (Throwable throwable422222) {
                        break block21;
                    }
                    catch (IOException iOException322222) {}
                }
                throw throwable3222222;
                catch (Throwable throwable2222222) {
                    break block20;
                }
                catch (IOException iOException4) {}
                {
                    object = new a(iOException4, 2000);
                    throw object;
                }
            }
            this.g = null;
            if (this.j) {
                this.j = false;
                this.r();
            }
            throw throwable2222222;
            {
                a a9 = new a(iOException322222, 2000);
                throw a9;
            }
        }
        this.g = null;
        if (this.j) {
            this.j = false;
            this.r();
        }
        throw throwable422222;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public long f(k object) throws a {
        IOException iOException2;
        Object object2;
        Object object3;
        int n8;
        block14: {
            block15: {
                block17: {
                    long l8;
                    block18: {
                        n8 = 2000;
                        object3 = ((k)object).a.normalizeScheme();
                        this.f = object3;
                        this.s((k)object);
                        if (j.Objects.equals((Object)object3.getScheme(), (Object)"content")) {
                            object2 = new Bundle();
                            object2.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                            object2 = this.e.openTypedAssetFileDescriptor((Uri)object3, "*/*", (Bundle)object2);
                        } else {
                            object2 = this.e.openAssetFileDescriptor((Uri)object3, "r");
                        }
                        this.g = object2;
                        if (object2 == null) break block14;
                        l8 = object2.getLength();
                        object3 = new FileInputStream(object2.getFileDescriptor());
                        this.h = object3;
                        long l9 = l8 - -1L;
                        long l10 = l9 == 0L ? 0 : (l9 < 0L ? -1 : 1);
                        if (l10 != false && ((k)object).g > l8) {
                            object = new a(null, 2008);
                            throw object;
                        }
                        long l11 = object2.getStartOffset();
                        if ((l11 = ((FileInputStream)object3).skip(((k)object).g + l11) - l11) != ((k)object).g) break block15;
                        if (l10 == false) {
                            object2 = l.a((FileInputStream)object3);
                            l8 = ((FileChannel)object2).size();
                            if (l8 == 0L) {
                                this.i = -1L;
                            } else {
                                this.i = l8 -= ((FileChannel)object2).position();
                                if (l8 < 0L) {
                                    object = new a(null, 2008);
                                    throw object;
                                }
                            }
                        } else {
                            this.i = l8 -= l11;
                            if (l8 < 0L) break block17;
                        }
                        l8 = ((k)object).h;
                        if (l8 == -1L) break block18;
                        l11 = this.i;
                        if (l11 != -1L) {
                            l8 = Math.min(l11, l8);
                        }
                        this.i = l8;
                    }
                    this.j = true;
                    this.t((k)object);
                    l8 = ((k)object).h;
                    if (l8 == -1L) return this.i;
                    return l8;
                }
                try {
                    object = new a(null, 2008);
                    throw object;
                }
                catch (IOException iOException2) {
                }
                catch (a a8) {
                    throw a8;
                }
            }
            object = new a(null, 2008);
            throw object;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not open file descriptor for: ");
        stringBuilder.append(object3);
        object = new IOException(stringBuilder.toString());
        object2 = new a((IOException)object, 2000);
        throw object2;
        if (!(iOException2 instanceof FileNotFoundException)) throw new a(iOException2, n8);
        n8 = 2005;
        throw new a(iOException2, n8);
    }

    public static class a
    extends h {
        public a(IOException iOException, int n8) {
            super(iOException, n8);
        }
    }
}

