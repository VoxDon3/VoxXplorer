/*
 * Decompiled with CFR 0.152.
 */
package ax.aa;

import android.graphics.Bitmap;
import ax.Z9.a;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class b
implements a {
    private final LinkedHashMap<String, Bitmap> a;
    private final int b;
    private int c;

    public b(int n8) {
        if (n8 > 0) {
            this.b = n8;
            this.a = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private int d(String string, Bitmap bitmap) {
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void e(int n8) {
        CharSequence charSequence;
        Map.Entry<String, Bitmap> entry;
        Throwable throwable2;
        while (true) {
            synchronized (this) {
                try {
                    if (this.c < 0 || ((AbstractMap)this.a).isEmpty() && this.c != 0) break block5;
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                if (this.c <= n8 || ((AbstractMap)this.a).isEmpty()) break;
                entry = this.a.entrySet().iterator().next();
                if (entry == null) {
                    return;
                }
                charSequence = (String)entry.getKey();
                entry = (Bitmap)entry.getValue();
                ((AbstractMap)this.a).remove(charSequence);
                this.c -= this.d((String)charSequence, (Bitmap)entry);
            }
        }
        {
            block6: {
                block5: {
                    return;
                }
                charSequence = new StringBuilder();
                charSequence.append(this.getClass().getName());
                charSequence.append(".sizeOf() is reporting inconsistent results!");
                entry = new IllegalStateException(charSequence.toString());
                throw entry;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Collection<String> a() {
        synchronized (this) {
            return new HashSet<String>(this.a.keySet());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Bitmap b(String string) {
        if (string == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Bitmap bitmap;
                block4: {
                    try {
                        bitmap = (Bitmap)((AbstractMap)this.a).remove(string);
                        if (bitmap == null) break block4;
                        this.c -= this.d(string, bitmap);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return bitmap;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final boolean c(String string, Bitmap bitmap) {
        if (string == null) throw new NullPointerException("key == null || value == null");
        if (bitmap == null) throw new NullPointerException("key == null || value == null");
        // MONITORENTER : this
        this.c += this.d(string, bitmap);
        bitmap = ((AbstractMap)this.a).put(string, bitmap);
        if (bitmap != null) {
            this.c -= this.d(string, bitmap);
        }
        this.e(this.b);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Bitmap i(String string) {
        if (string == null) throw new NullPointerException("key == null");
        synchronized (this) {
            return this.a.get(string);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String toString() {
        synchronized (this) {
            return String.format("LruCache[maxSize=%d]", this.b);
        }
    }
}

