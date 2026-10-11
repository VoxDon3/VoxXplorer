/*
 * Decompiled with CFR 0.152.
 */
package androidx.emoji2.text;

import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.j;
import androidx.emoji2.text.n;
import androidx.emoji2.text.o;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class e {
    private static final Object n = new Object();
    private static final Object o = new Object();
    private static volatile e p;
    private final ReadWriteLock a = new ReentrantReadWriteLock();
    private final Set<f> b;
    private volatile int c = 3;
    private final a d;
    final g e;
    private final i f;
    final boolean g;
    final boolean h;
    final int[] i;
    private final boolean j;
    private final int k;
    private final int l;
    private final d m;

    private e(b b8) {
        this.g = b8.c;
        this.h = b8.d;
        this.i = b8.e;
        this.j = b8.g;
        this.k = b8.h;
        this.e = b8.a;
        this.l = b8.i;
        this.m = b8.j;
        ax.B.b<f> b9 = new ax.B.b<f>();
        this.b = b9;
        Object object = b8.b;
        if (object == null) {
            object = new c();
        }
        this.f = object;
        object = b8.f;
        if (object != null && !object.isEmpty()) {
            b9.addAll(b8.f);
        }
        this.d = new a(this);
        this.m();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static e c() {
        Object object = n;
        synchronized (object) {
            e e8 = p;
            boolean bl = e8 != null;
            ax.b0.g.j(bl, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            return e8;
        }
    }

    public static boolean f(InputConnection inputConnection, Editable editable, int n8, int n9, boolean bl) {
        return androidx.emoji2.text.j.b(inputConnection, editable, n8, n9, bl);
    }

    public static boolean g(Editable editable, int n8, KeyEvent keyEvent) {
        return androidx.emoji2.text.j.c(editable, n8, keyEvent);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static e h(b b8) {
        e e8 = p;
        if (e8 != null) {
            return e8;
        }
        Object object = n;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        e e9;
                        e8 = e9 = p;
                        if (e9 != null) break block4;
                        p = e8 = new e(b8);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return e8;
            }
            throw throwable2;
        }
    }

    public static boolean i() {
        return p != null;
    }

    private boolean k() {
        return this.e() == 1;
    }

    private void m() {
        Throwable throwable2;
        block4: {
            block3: {
                this.a.writeLock().lock();
                try {
                    if (this.l != 0) break block3;
                    this.c = 0;
                }
                catch (Throwable throwable2) {
                    break block4;
                }
            }
            this.a.writeLock().unlock();
            if (this.e() == 0) {
                this.d.b();
            }
            return;
        }
        this.a.writeLock().unlock();
        throw throwable2;
    }

    public int d() {
        return this.k;
    }

    public int e() {
        this.a.readLock().lock();
        try {
            int n8 = this.c;
            return n8;
        }
        finally {
            this.a.readLock().unlock();
        }
    }

    public boolean j() {
        return this.j;
    }

    public void l() {
        block6: {
            int n8 = this.l;
            boolean bl = true;
            if (n8 != 1) {
                bl = false;
            }
            ax.b0.g.j(bl, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            if (this.k()) {
                return;
            }
            this.a.writeLock().lock();
            n8 = this.c;
            if (n8 != 0) break block6;
            this.a.writeLock().unlock();
            return;
        }
        try {
            this.c = 0;
            this.d.b();
            return;
        }
        finally {
            this.a.writeLock().unlock();
        }
    }

    void n(Throwable throwable) {
        Set<f> set = this.b;
        ArrayList<f> arrayList = new ArrayList<f>(set.size());
        this.a.writeLock().lock();
        this.c = 2;
        arrayList.addAll(set);
        set.clear();
        for (int i8 = 0; i8 < arrayList.size(); ++i8) {
            ((f)arrayList.get(i8)).c(throwable);
        }
        return;
        finally {
            this.a.writeLock().unlock();
        }
    }

    void o() {
        Set<f> set = this.b;
        ArrayList<f> arrayList = new ArrayList<f>(set.size());
        this.a.writeLock().lock();
        this.c = 1;
        arrayList.addAll(set);
        set.clear();
        for (int i8 = 0; i8 < arrayList.size(); ++i8) {
            ((f)arrayList.get(i8)).d();
        }
        return;
        finally {
            this.a.writeLock().unlock();
        }
    }

    public CharSequence p(CharSequence charSequence) {
        int n8 = charSequence == null ? 0 : charSequence.length();
        return this.q(charSequence, 0, n8);
    }

    public CharSequence q(CharSequence charSequence, int n8, int n9) {
        return this.r(charSequence, n8, n9, Integer.MAX_VALUE);
    }

    public CharSequence r(CharSequence charSequence, int n8, int n9, int n10) {
        return this.s(charSequence, n8, n9, n10, 0);
    }

    public CharSequence s(CharSequence charSequence, int n8, int n9, int n10, int n11) {
        ax.b0.g.j(this.k(), "Not initialized yet");
        ax.b0.g.e(n8, "start cannot be negative");
        ax.b0.g.e(n9, "end cannot be negative");
        ax.b0.g.e(n10, "maxEmojiCount cannot be negative");
        boolean bl = n8 <= n9;
        ax.b0.g.b(bl, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        bl = n8 <= charSequence.length();
        ax.b0.g.b(bl, "start should be < than charSequence length");
        bl = n9 <= charSequence.length();
        ax.b0.g.b(bl, "end should be < than charSequence length");
        if (charSequence.length() != 0 && n8 != n9) {
            bl = n11 != 1 ? (n11 != 2 ? this.g : false) : true;
            return this.d.d(charSequence, n8, n9, n10, bl);
        }
        return charSequence;
    }

    public void t(e e8) {
        this.u(androidx.emoji2.text.b.e(), e8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void u(Executor object, e object2) {
        Throwable throwable2;
        block6: {
            block5: {
                block4: {
                    ax.b0.g.h(object2, "initCallback cannot be null");
                    ax.b0.g.h(object, "executor cannot be null");
                    object2 = new f((Executor)object, (e)object2);
                    this.a.writeLock().lock();
                    try {
                        if (this.c != 1) break block4;
                        ((f)object2).d();
                        break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                if (this.c == 2) {
                    object = new IllegalStateException("Initialization failed prior to registering this callback, please add an initialization callback to the EmojiCompat.Config instead to see the cause.");
                    ((f)object2).c((Throwable)object);
                } else {
                    this.b.add((f)object2);
                }
            }
            this.a.writeLock().unlock();
            return;
        }
        this.a.writeLock().unlock();
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void v(e object) {
        int n8;
        ArrayList<f> arrayList;
        block5: {
            ax.b0.g.h(object, "initCallback cannot be null");
            this.a.writeLock().lock();
            try {
                arrayList = new ArrayList<f>();
                for (f f8 : this.b) {
                    if (f8.a != object) continue;
                    arrayList.add(f8);
                }
                n8 = arrayList.size();
                break block5;
            }
            catch (Throwable throwable) {}
            this.a.writeLock().unlock();
            throw throwable;
        }
        for (int i8 = 0; i8 < n8; ++i8) {
            object = arrayList.get(i8);
            object = (f)object;
            this.b.remove(object);
        }
        this.a.writeLock().unlock();
    }

    public void w(EditorInfo editorInfo) {
        if (this.k() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            this.d.e(editorInfo);
        }
    }

    private static final class a {
        private volatile j a;
        private volatile n b;
        private final e c;

        a(e e8) {
            this.c = e8;
        }

        void b() {
            try {
                h h8 = new h(this){
                    final a a;
                    {
                        this.a = a8;
                    }

                    @Override
                    public void a(Throwable throwable) {
                        this.a.c.n(throwable);
                    }

                    @Override
                    public void b(n n8) {
                        this.a.c(n8);
                    }
                };
                this.c.e.a(h8);
                return;
            }
            catch (Throwable throwable) {
                this.c.n(throwable);
                return;
            }
        }

        void c(n object) {
            if (object == null) {
                this.c.n(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            n n8 = this.b = object;
            i i8 = this.c.f;
            d d8 = this.c.m;
            object = this.c;
            this.a = new j(n8, i8, d8, ((e)object).h, ((e)object).i, androidx.emoji2.text.i.a());
            this.c.o();
        }

        CharSequence d(CharSequence charSequence, int n8, int n9, int n10, boolean bl) {
            return this.a.h(charSequence, n8, n9, n10, bl);
        }

        void e(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.b.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.c.g);
        }
    }

    public static abstract class b {
        final g a;
        i b;
        boolean c;
        boolean d;
        int[] e;
        Set<f> f;
        boolean g;
        int h = -16711936;
        int i = 0;
        d j = new androidx.emoji2.text.d();

        protected b(g g8) {
            ax.b0.g.h(g8, "metadataLoader cannot be null.");
            this.a = g8;
        }

        protected final g a() {
            return this.a;
        }

        public b b(int n8) {
            this.i = n8;
            return this;
        }
    }

    public static class c
    implements i {
        @Override
        public ax.v0.c a(o o8) {
            return new ax.v0.e(o8);
        }
    }

    public static interface d {
        public boolean a(CharSequence var1, int var2, int var3, int var4);
    }

    public static abstract class e {
        public void a(Throwable throwable) {
        }

        public void b() {
        }
    }

    private static final class f {
        e a;
        Executor b;

        f(Executor executor, e e8) {
            this.a = e8;
            this.b = executor;
        }

        public static /* synthetic */ void a(f f8, Throwable throwable) {
            f8.a.a(throwable);
        }

        public static /* synthetic */ void b(f f8) {
            f8.a.b();
        }

        void c(Throwable throwable) {
            this.b.execute(new androidx.emoji2.text.g(this, throwable));
        }

        void d() {
            this.b.execute(new androidx.emoji2.text.f(this));
        }
    }

    public static interface g {
        public void a(h var1);
    }

    public static abstract class h {
        public abstract void a(Throwable var1);

        public abstract void b(n var1);
    }

    public static interface i {
        public ax.v0.c a(o var1);
    }
}

