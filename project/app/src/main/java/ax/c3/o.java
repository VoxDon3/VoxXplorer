/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import ax.b3.j;
import ax.c3.k;
import ax.u3.B;
import ax.u3.b;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.y;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.Serializable;

public class o {
    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String a(k object) {
        BitmapFactory.Options options;
        block24: {
            RuntimeException var3_10;
            block23: {
                block25: {
                    block26: {
                        BitmapFactory.Options options2;
                        block22: {
                            block21: {
                                options2 = null;
                                options = null;
                                try {
                                    boolean bl = ((k)object).k0();
                                    if (!bl) break block21;
                                    ParcelFileDescriptor parcelFileDescriptor = ((k)object).e0(true);
                                    options = parcelFileDescriptor;
                                    break block22;
                                }
                                catch (Throwable throwable) {
                                    object = options;
                                    break block23;
                                }
                                catch (Exception exception) {
                                    options = options2;
                                    break block24;
                                }
                                catch (j j8) {}
                            }
                            options = null;
                        }
                        options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        if (options != null) {
                            BitmapFactory.decodeFileDescriptor((FileDescriptor)options.getFileDescriptor(), null, (BitmapFactory.Options)options2);
                        } else {
                            if (!(object instanceof y)) break block25;
                            BitmapFactory.decodeFile((String)((n)object).E(), (BitmapFactory.Options)options2);
                        }
                        if (options2.outWidth < 0 || options2.outHeight < 0) break block26;
                        object = new StringBuilder();
                        ((StringBuilder)object).append(options2.outWidth);
                        ((StringBuilder)object).append(" x ");
                        ((StringBuilder)object).append(options2.outHeight);
                        object = ((StringBuilder)object).toString();
                        if (options == null) return object;
                        try {
                            options.close();
                            return object;
                        }
                        catch (Exception exception) {
                            return object;
                        }
                    }
                    if (options == null) return "";
                    try {
                        options.close();
                        return "";
                    }
                    catch (Exception exception) {
                        return "";
                    }
                }
                try {
                    b.f();
                    if (options == null) return "";
                }
                catch (Throwable throwable) {
                    object = options;
                    break block23;
                }
                catch (Exception exception) {
                    break block24;
                }
                try {
                    options.close();
                    return "";
                }
                catch (Exception exception) {
                    return "";
                }
            }
            if (object == null) throw var3_10;
            try {
                object.close();
            }
            catch (Exception exception) {
                throw var3_10;
            }
            throw var3_10;
        }
        if (options == null) return "";
        try {
            options.close();
            return "";
        }
        catch (Exception exception) {
            return "";
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String b(k object) {
        Throwable throwable;
        Throwable throwable2;
        block43: {
            block37: {
                block39: {
                    RuntimeException var3_23;
                    block38: {
                        MediaMetadataRetriever mediaMetadataRetriever;
                        Throwable throwable3;
                        Serializable serializable;
                        block42: {
                            block41: {
                                block40: {
                                    block36: {
                                        Throwable throwable4 = null;
                                        serializable = null;
                                        throwable3 = null;
                                        throwable2 = null;
                                        Throwable throwable5 = null;
                                        mediaMetadataRetriever = new MediaMetadataRetriever();
                                        throwable = throwable5;
                                        throwable3 = throwable4;
                                        try {
                                            boolean bl = ((k)object).k0();
                                            throwable2 = serializable;
                                            if (!bl) break block36;
                                            throwable = throwable5;
                                            throwable3 = throwable4;
                                            throwable2 = ((k)object).e0(true);
                                            break block36;
                                        }
                                        catch (Throwable throwable6) {
                                            throwable2 = throwable;
                                            object = mediaMetadataRetriever;
                                            throwable = throwable6;
                                            break block37;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throwable2 = throwable3;
                                            object = mediaMetadataRetriever;
                                            break block38;
                                        }
                                        catch (j j8) {
                                            throwable2 = serializable;
                                        }
                                    }
                                    if (throwable2 == null) break block40;
                                    throwable = throwable2;
                                    throwable3 = throwable2;
                                    mediaMetadataRetriever.setDataSource(throwable2.getFileDescriptor());
                                    break block41;
                                }
                                throwable = throwable2;
                                throwable3 = throwable2;
                                if (!(object instanceof y)) break block42;
                                throwable = throwable2;
                                throwable3 = throwable2;
                                mediaMetadataRetriever.setDataSource(((n)object).E());
                            }
                            throwable = throwable2;
                            throwable3 = throwable2;
                            object = mediaMetadataRetriever.extractMetadata(9);
                            if (object == null) {
                                try {
                                    mediaMetadataRetriever.release();
                                }
                                catch (Exception exception) {
                                    // empty catch block
                                }
                                if (throwable2 == null) return "--:--";
                                throwable2.close();
                                return "--:--";
                            }
                            throwable = throwable2;
                            throwable3 = throwable2;
                            {
                                object = B.n(Long.parseLong((String)object));
                            }
                            try {
                                mediaMetadataRetriever.release();
                            }
                            catch (Exception exception) {
                                // empty catch block
                            }
                            if (throwable2 == null) return object;
                            try {
                                throwable2.close();
                                return object;
                            }
                            catch (IOException iOException) {
                                return object;
                            }
                        }
                        throwable = throwable2;
                        throwable3 = throwable2;
                        {
                            throwable = throwable2;
                            throwable3 = throwable2;
                            serializable = new StringBuilder();
                            throwable = throwable2;
                            throwable3 = throwable2;
                            ((StringBuilder)serializable).append("loc:");
                            throwable = throwable2;
                            throwable3 = throwable2;
                            ((StringBuilder)serializable).append(((n)object).P().I());
                            throwable = throwable2;
                            throwable3 = throwable2;
                            b.g(((StringBuilder)serializable).toString());
                        }
                        try {
                            mediaMetadataRetriever.release();
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                        if (throwable2 == null) return "--:--";
                        try {
                            throwable2.close();
                            return "--:--";
                        }
                        catch (IOException iOException) {
                            return "--:--";
                        }
                        catch (Throwable throwable7) {
                            throwable3 = null;
                            object = throwable2;
                            throwable2 = throwable3;
                            break block37;
                        }
                        catch (RuntimeException runtimeException) {
                            throwable2 = null;
                            object = throwable3;
                        }
                    }
                    var3_23.printStackTrace();
                    if (object == null) break block39;
                    try {
                        object.release();
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                if (throwable2 == null) return "";
                try {
                    throwable2.close();
                    return "";
                }
                catch (IOException iOException) {
                    return "";
                }
                catch (Throwable throwable8) {
                    // empty catch block
                }
            }
            if (object != null) {
                try {
                    object.release();
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            if (throwable2 == null) throw throwable;
            try {}
            catch (IOException iOException) {
                throw throwable;
            }
            break block43;
            catch (IOException iOException) {
                return "--:--";
            }
        }
        throwable2.close();
        throw throwable;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String c(k object) {
        RuntimeException var5_16;
        ParcelFileDescriptor parcelFileDescriptor;
        block43: {
            block37: {
                block39: {
                    RuntimeException var6_26;
                    block38: {
                        ParcelFileDescriptor parcelFileDescriptor2;
                        MediaMetadataRetriever mediaMetadataRetriever;
                        ParcelFileDescriptor parcelFileDescriptor3;
                        Object object2;
                        block42: {
                            block41: {
                                block40: {
                                    block36: {
                                        ParcelFileDescriptor parcelFileDescriptor4 = null;
                                        object2 = null;
                                        parcelFileDescriptor3 = null;
                                        parcelFileDescriptor = null;
                                        ParcelFileDescriptor parcelFileDescriptor5 = null;
                                        mediaMetadataRetriever = new MediaMetadataRetriever();
                                        parcelFileDescriptor2 = parcelFileDescriptor5;
                                        parcelFileDescriptor3 = parcelFileDescriptor4;
                                        try {
                                            boolean bl = ((k)object).k0();
                                            parcelFileDescriptor = object2;
                                            if (!bl) break block36;
                                            parcelFileDescriptor2 = parcelFileDescriptor5;
                                            parcelFileDescriptor3 = parcelFileDescriptor4;
                                            parcelFileDescriptor = ((k)object).e0(true);
                                            break block36;
                                        }
                                        catch (Throwable throwable) {
                                            parcelFileDescriptor = parcelFileDescriptor2;
                                            object = mediaMetadataRetriever;
                                            break block37;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            parcelFileDescriptor = parcelFileDescriptor3;
                                            object = mediaMetadataRetriever;
                                            break block38;
                                        }
                                        catch (j j8) {
                                            parcelFileDescriptor = object2;
                                        }
                                    }
                                    if (parcelFileDescriptor == null) break block40;
                                    parcelFileDescriptor2 = parcelFileDescriptor;
                                    parcelFileDescriptor3 = parcelFileDescriptor;
                                    mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
                                    break block41;
                                }
                                parcelFileDescriptor2 = parcelFileDescriptor;
                                parcelFileDescriptor3 = parcelFileDescriptor;
                                if (!(object instanceof y)) break block42;
                                parcelFileDescriptor2 = parcelFileDescriptor;
                                parcelFileDescriptor3 = parcelFileDescriptor;
                                mediaMetadataRetriever.setDataSource(((n)object).E());
                            }
                            parcelFileDescriptor2 = parcelFileDescriptor;
                            parcelFileDescriptor3 = parcelFileDescriptor;
                            object = mediaMetadataRetriever.extractMetadata(17);
                            if (object == null) {
                                try {
                                    mediaMetadataRetriever.release();
                                }
                                catch (Exception exception) {
                                    // empty catch block
                                }
                                if (parcelFileDescriptor == null) return "";
                                parcelFileDescriptor.close();
                                return "";
                            }
                            parcelFileDescriptor2 = parcelFileDescriptor;
                            parcelFileDescriptor3 = parcelFileDescriptor;
                            {
                                int n8 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                                parcelFileDescriptor2 = parcelFileDescriptor;
                                parcelFileDescriptor3 = parcelFileDescriptor;
                                int n9 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                                parcelFileDescriptor2 = parcelFileDescriptor;
                                parcelFileDescriptor3 = parcelFileDescriptor;
                                parcelFileDescriptor2 = parcelFileDescriptor;
                                parcelFileDescriptor3 = parcelFileDescriptor;
                                object = new StringBuilder();
                                parcelFileDescriptor2 = parcelFileDescriptor;
                                parcelFileDescriptor3 = parcelFileDescriptor;
                                ((StringBuilder)object).append(n8);
                                parcelFileDescriptor2 = parcelFileDescriptor;
                                parcelFileDescriptor3 = parcelFileDescriptor;
                                ((StringBuilder)object).append(" x ");
                                parcelFileDescriptor2 = parcelFileDescriptor;
                                parcelFileDescriptor3 = parcelFileDescriptor;
                                ((StringBuilder)object).append(n9);
                                parcelFileDescriptor2 = parcelFileDescriptor;
                                parcelFileDescriptor3 = parcelFileDescriptor;
                                object = ((StringBuilder)object).toString();
                            }
                            try {
                                mediaMetadataRetriever.release();
                            }
                            catch (Exception exception) {
                                // empty catch block
                            }
                            if (parcelFileDescriptor == null) return object;
                            try {
                                parcelFileDescriptor.close();
                                return object;
                            }
                            catch (Exception exception) {
                                return object;
                            }
                        }
                        parcelFileDescriptor2 = parcelFileDescriptor;
                        parcelFileDescriptor3 = parcelFileDescriptor;
                        {
                            parcelFileDescriptor2 = parcelFileDescriptor;
                            parcelFileDescriptor3 = parcelFileDescriptor;
                            object2 = new StringBuilder();
                            parcelFileDescriptor2 = parcelFileDescriptor;
                            parcelFileDescriptor3 = parcelFileDescriptor;
                            ((StringBuilder)object2).append("deviceFileInfo:");
                            parcelFileDescriptor2 = parcelFileDescriptor;
                            parcelFileDescriptor3 = parcelFileDescriptor;
                            ((StringBuilder)object2).append(((n)object).R().k());
                            parcelFileDescriptor2 = parcelFileDescriptor;
                            parcelFileDescriptor3 = parcelFileDescriptor;
                            b.g(((StringBuilder)object2).toString());
                        }
                        try {
                            mediaMetadataRetriever.release();
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                        if (parcelFileDescriptor == null) return "";
                        try {
                            parcelFileDescriptor.close();
                            return "";
                        }
                        catch (Exception exception) {
                            return "";
                        }
                        catch (Throwable throwable) {
                            ParcelFileDescriptor parcelFileDescriptor6 = null;
                            object = parcelFileDescriptor;
                            parcelFileDescriptor = parcelFileDescriptor6;
                            break block37;
                        }
                        catch (RuntimeException runtimeException) {
                            parcelFileDescriptor = null;
                            object = parcelFileDescriptor3;
                        }
                    }
                    var6_26.printStackTrace();
                    if (object == null) break block39;
                    try {
                        object.release();
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                if (parcelFileDescriptor == null) return "";
                try {
                    parcelFileDescriptor.close();
                    return "";
                }
                catch (Exception exception) {
                    return "";
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
            }
            if (object != null) {
                try {
                    object.release();
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            if (parcelFileDescriptor == null) throw var5_16;
            try {}
            catch (Exception exception) {
                throw var5_16;
            }
            break block43;
            catch (Exception exception) {
                return "";
            }
        }
        parcelFileDescriptor.close();
        throw var5_16;
    }
}

