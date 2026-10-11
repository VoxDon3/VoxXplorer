package androidx.emoji2.text;

import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.e;
import ax.b0.C1446g;
import ax.v0.AbstractC3246c;
import ax.v0.C3248e;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public class e {
    private static final Object n = new Object();
    private static final Object o = new Object();
    private static volatile e p;
    private final Set<f> b;
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
    private final ReadWriteLock a = new ReentrantReadWriteLock();
    private volatile int c = 3;

    private static final class a {
        private volatile j a;
        private volatile n b;
        private final e c;

        /* renamed from: androidx.emoji2.text.e$a$a, reason: collision with other inner class name */
        class C0015a extends h {
            C0015a() {
            }

            @Override // androidx.emoji2.text.e.h
            public void a(Throwable th) {
                a.this.c.n(th);
            }

            @Override // androidx.emoji2.text.e.h
            public void b(n nVar) {
                a.this.c(nVar);
            }
        }

        a(e eVar) {
            this.c = eVar;
        }

        void b() {
            try {
                this.c.e.a(new C0015a());
            } catch (Throwable th) {
                this.c.n(th);
            }
        }

        void c(n nVar) {
            if (nVar == null) {
                this.c.n(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.b = nVar;
            n nVar2 = this.b;
            i iVar = this.c.f;
            d dVar = this.c.m;
            e eVar = this.c;
            this.a = new j(nVar2, iVar, dVar, eVar.h, eVar.i, androidx.emoji2.text.i.a());
            this.c.o();
        }

        CharSequence d(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.a.h(charSequence, i, i2, i3, z);
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

        protected b(g gVar) {
            C1446g.h(gVar, "metadataLoader cannot be null.");
            this.a = gVar;
        }

        protected final g a() {
            return this.a;
        }

        public b b(int i) {
            this.i = i;
            return this;
        }
    }

    public static class c implements i {
        @Override // androidx.emoji2.text.e.i
        public AbstractC3246c a(o oVar) {
            return new C3248e(oVar);
        }
    }

    public interface d {
        boolean a(CharSequence charSequence, int i, int i2, int i3);
    }

    /* renamed from: androidx.emoji2.text.e$e, reason: collision with other inner class name */
    public static abstract class AbstractC0016e {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class f {
        AbstractC0016e a;
        Executor b;

        f(Executor executor, AbstractC0016e abstractC0016e) {
            this.a = abstractC0016e;
            this.b = executor;
        }

        void c(final Throwable th) {
            this.b.execute(new Runnable() { // from class: androidx.emoji2.text.g
                @Override // java.lang.Runnable
                public final void run() {
                    e.f.this.a.a(th);
                }
            });
        }

        void d() {
            this.b.execute(new Runnable() { // from class: androidx.emoji2.text.f
                @Override // java.lang.Runnable
                public final void run() {
                    e.f.this.a.b();
                }
            });
        }
    }

    public interface g {
        void a(h hVar);
    }

    public static abstract class h {
        public abstract void a(Throwable th);

        public abstract void b(n nVar);
    }

    public interface i {
        AbstractC3246c a(o oVar);
    }

    private e(b bVar) {
        this.g = bVar.c;
        this.h = bVar.d;
        this.i = bVar.e;
        this.j = bVar.g;
        this.k = bVar.h;
        this.e = bVar.a;
        this.l = bVar.i;
        this.m = bVar.j;
        ax.B.b bVar2 = new ax.B.b();
        this.b = bVar2;
        i iVar = bVar.b;
        this.f = iVar == null ? new c() : iVar;
        Set<f> set = bVar.f;
        if (set != null && !set.isEmpty()) {
            bVar2.addAll(bVar.f);
        }
        this.d = new a(this);
        m();
    }

    public static e c() {
        e eVar;
        synchronized (n) {
            eVar = p;
            C1446g.j(eVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return eVar;
    }

    public static boolean f(InputConnection inputConnection, Editable editable, int i2, int i3, boolean z) {
        return j.b(inputConnection, editable, i2, i3, z);
    }

    public static boolean g(Editable editable, int i2, KeyEvent keyEvent) {
        return j.c(editable, i2, keyEvent);
    }

    public static e h(b bVar) {
        e eVar;
        e eVar2 = p;
        if (eVar2 != null) {
            return eVar2;
        }
        synchronized (n) {
            try {
                eVar = p;
                if (eVar == null) {
                    eVar = new e(bVar);
                    p = eVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public static boolean i() {
        return p != null;
    }

    private boolean k() {
        return e() == 1;
    }

    private void m() {
        this.a.writeLock().lock();
        try {
            if (this.l == 0) {
                this.c = 0;
            }
            this.a.writeLock().unlock();
            if (e() == 0) {
                this.d.b();
            }
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public int d() {
        return this.k;
    }

    public int e() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public boolean j() {
        return this.j;
    }

    public void l() {
        C1446g.j(this.l == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (k()) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            this.d.b();
        } finally {
            this.a.writeLock().unlock();
        }
    }

    void n(Throwable th) {
        Set<f> set = this.b;
        ArrayList arrayList = new ArrayList(set.size());
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(set);
            set.clear();
            this.a.writeLock().unlock();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((f) arrayList.get(i2)).c(th);
            }
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    void o() {
        Set<f> set = this.b;
        ArrayList arrayList = new ArrayList(set.size());
        this.a.writeLock().lock();
        try {
            this.c = 1;
            arrayList.addAll(set);
            set.clear();
            this.a.writeLock().unlock();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((f) arrayList.get(i2)).d();
            }
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence p(CharSequence charSequence) {
        return q(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence q(CharSequence charSequence, int i2, int i3) {
        return r(charSequence, i2, i3, SubsamplingScaleImageView.TILE_SIZE_AUTO);
    }

    public CharSequence r(CharSequence charSequence, int i2, int i3, int i4) {
        return s(charSequence, i2, i3, i4, 0);
    }

    public CharSequence s(CharSequence charSequence, int i2, int i3, int i4, int i5) {
        C1446g.j(k(), "Not initialized yet");
        C1446g.e(i2, "start cannot be negative");
        C1446g.e(i3, "end cannot be negative");
        C1446g.e(i4, "maxEmojiCount cannot be negative");
        C1446g.b(i2 <= i3, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        C1446g.b(i2 <= charSequence.length(), "start should be < than charSequence length");
        C1446g.b(i3 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i2 == i3) {
            return charSequence;
        }
        return this.d.d(charSequence, i2, i3, i4, i5 != 1 ? i5 != 2 ? this.g : false : true);
    }

    public void t(AbstractC0016e abstractC0016e) {
        u(androidx.emoji2.text.b.e(), abstractC0016e);
    }

    public void u(Executor executor, AbstractC0016e abstractC0016e) {
        C1446g.h(abstractC0016e, "initCallback cannot be null");
        C1446g.h(executor, "executor cannot be null");
        f fVar = new f(executor, abstractC0016e);
        this.a.writeLock().lock();
        try {
            if (this.c == 1) {
                fVar.d();
            } else if (this.c == 2) {
                fVar.c(new IllegalStateException("Initialization failed prior to registering this callback, please add an initialization callback to the EmojiCompat.Config instead to see the cause."));
            } else {
                this.b.add(fVar);
            }
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public void v(AbstractC0016e abstractC0016e) {
        C1446g.h(abstractC0016e, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            ArrayList arrayList = new ArrayList();
            for (f fVar : this.b) {
                if (fVar.a == abstractC0016e) {
                    arrayList.add(fVar);
                }
            }
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                this.b.remove((f) obj);
            }
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public void w(EditorInfo editorInfo) {
        if (!k() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.d.e(editorInfo);
    }
}
