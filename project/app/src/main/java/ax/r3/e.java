/*
 * Decompiled with CFR 0.152.
 */
package ax.r3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import ax.ea.a;
import ax.ka.c;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

public class e
extends ax.ea.a {
    public e(boolean bl) {
        super(bl);
    }

    @Override
    public Bitmap a(ax.ea.c c8) throws IOException {
        return super.a(c8);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected a.b e(InputStream object, ax.ea.c object2) throws IOException {
        Throwable throwable2;
        block6: {
            Object object3;
            BitmapFactory.Options options = new BitmapFactory.Options();
            boolean bl = true;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream((InputStream)object, null, (BitmapFactory.Options)options);
            if (!((ax.ea.c)object2).l()) {
                object = new a(this);
                return new b(this, new ax.ca.e(options.outWidth, options.outHeight, ((a.a)object).a), (a.a)object);
            }
            object = object3 = this.h((InputStream)object, (ax.ea.c)object2);
            object = object3;
            Object object4 = new ax.y0.a((InputStream)object3);
            object = object3;
            int n8 = ((ax.y0.a)object4).y();
            object = object3;
            if (((ax.y0.a)object4).l("Orientation", 1) != 2) {
                bl = false;
            }
            object = object3;
            object = object3;
            object4 = new a(this, n8, bl);
            object2 = object3;
            object = object4;
            {
                catch (Throwable throwable2) {
                    break block6;
                }
                catch (RuntimeException runtimeException) {}
                object = object3;
                {
                    object = object2 = this.h((InputStream)object3, (ax.ea.c)object2);
                    object = object3 = new a(this, ax.C3.a.a((InputStream)object2, -1L), false);
                }
            }
            c.a((Closeable)object2);
            return new b(this, new ax.ca.e(options.outWidth, options.outHeight, ((a.a)object).a), (a.a)object);
        }
        c.a((Closeable)object);
        throw throwable2;
    }

    class a
    extends a.a {
        final e c;

        public a(e e8) {
            this.c = e8;
        }

        public a(e e8, int n8, boolean bl) {
            this.c = e8;
            super(n8, bl);
        }
    }

    class b
    extends a.b {
        final e c;

        public b(e e8, ax.ca.e e9, a.a a8) {
            this.c = e8;
            super(e9, a8);
        }
    }
}

