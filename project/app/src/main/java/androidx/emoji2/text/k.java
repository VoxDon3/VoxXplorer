/*
 * Decompiled with CFR 0.152.
 */
package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.emoji2.text.e;
import androidx.emoji2.text.l;
import androidx.emoji2.text.n;
import ax.T.m;
import ax.Y.u;
import ax.Z.i;
import ax.Z.k;
import ax.b0.g;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

public class k
extends e.b {
    private static final a k = new a();

    public k(Context context, i i8) {
        super(new b(context, i8, k));
    }

    public k c(Executor executor) {
        ((b)this.a()).f(executor);
        return this;
    }

    public static class a {
        public Typeface a(Context context, k.b b8) throws PackageManager.NameNotFoundException {
            return ax.Z.k.a(context, null, new k.b[]{b8});
        }

        public k.a b(Context context, i i8) throws PackageManager.NameNotFoundException {
            return ax.Z.k.b(context, null, i8);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    private static class b
    implements e.g {
        private final Context a;
        private final i b;
        private final a c;
        private final Object d = new Object();
        private Handler e;
        private Executor f;
        private ThreadPoolExecutor g;
        e.h h;
        private ContentObserver i;
        private Runnable j;

        b(Context context, i i8, a a8) {
            ax.b0.g.h(context, "Context cannot be null");
            ax.b0.g.h(i8, "FontRequest cannot be null");
            this.a = context.getApplicationContext();
            this.b = i8;
            this.c = a8;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void b() {
            Object object = this.d;
            synchronized (object) {
                Throwable throwable2;
                block6: {
                    Object object2;
                    block5: {
                        try {
                            this.h = null;
                            object2 = this.i;
                            if (object2 == null) break block5;
                            this.c.c(this.a, (ContentObserver)object2);
                            this.i = null;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    if ((object2 = this.e) != null) {
                        object2.removeCallbacks(this.j);
                    }
                    this.e = null;
                    object2 = this.g;
                    if (object2 != null) {
                        ((ThreadPoolExecutor)object2).shutdown();
                    }
                    this.f = null;
                    this.g = null;
                    return;
                }
                throw throwable2;
            }
        }

        private k.b e() {
            k.b[] bArray;
            block3: {
                try {
                    bArray = this.c.b(this.a, this.b);
                    if (bArray.c() != 0) break block3;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    throw new RuntimeException("provider not found", nameNotFoundException);
                }
                if ((bArray = bArray.b()) != null && bArray.length != 0) {
                    return bArray[0];
                }
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fetchFonts failed (");
            stringBuilder.append(bArray.c());
            stringBuilder.append(")");
            throw new RuntimeException(stringBuilder.toString());
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void a(e.h h8) {
            ax.b0.g.h(h8, "LoaderCallback cannot be null");
            Object object = this.d;
            synchronized (object) {
                this.h = h8;
            }
            this.d();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        void c() {
            Throwable throwable2;
            Object object;
            Object object2;
            block28: {
                int n8;
                block26: {
                    block27: {
                        object2 = this.d;
                        // MONITORENTER : object2
                        if (this.h == null) {
                            // MONITOREXIT : object2
                            return;
                        }
                        try {
                            object2 = this.e();
                            n8 = ((k.b)object2).b();
                            if (n8 == 2) {
                                object = this.d;
                                // MONITORENTER : object
                                // MONITOREXIT : object
                            }
                            if (n8 != 0) break block26;
                        }
                        catch (Throwable throwable2) {}
                        u.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        object = this.c.a(this.a, (k.b)object2);
                        object2 = m.f(this.a, null, ((k.b)object2).d());
                        if (object2 == null || object == null) break block27;
                        object2 = n.b((Typeface)object, (ByteBuffer)object2);
                        u.b();
                        object = this.d;
                        // MONITORENTER : object
                        e.h h8 = this.h;
                        if (h8 != null) {
                            h8.b((n)object2);
                        }
                        this.b();
                        return;
                    }
                    try {
                        object = new RuntimeException("Unable to open file.");
                        throw object;
                    }
                    catch (Throwable throwable3) {}
                    u.b();
                    throw throwable3;
                    break block28;
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("fetchFonts result is not OK. (");
                ((StringBuilder)object2).append(n8);
                ((StringBuilder)object2).append(")");
                object = new RuntimeException(((StringBuilder)object2).toString());
                throw object;
            }
            object = this.d;
            // MONITORENTER : object
            object2 = this.h;
            if (object2 != null) {
                ((e.h)object2).a(throwable2);
            }
            this.b();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        void d() {
            Object object = this.d;
            synchronized (object) {
                Throwable throwable2;
                block5: {
                    Executor executor;
                    try {
                        if (this.h == null) {
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    if (this.f == null) {
                        executor = androidx.emoji2.text.b.c("emojiCompat");
                        this.g = executor;
                        this.f = executor;
                    }
                    executor = this.f;
                    l l8 = new l(this);
                    executor.execute(l8);
                    return;
                }
                throw throwable2;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void f(Executor executor) {
            Object object = this.d;
            synchronized (object) {
                this.f = executor;
                return;
            }
        }
    }
}

