package ax.j1;

import java.util.NoSuchElementException;

/* renamed from: ax.j1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2307e {
    public static final InterfaceC2307e a = new a();

    /* renamed from: ax.j1.e$a */
    class a implements InterfaceC2307e {
        a() {
        }

        @Override // ax.j1.InterfaceC2307e
        public long a() {
            throw new NoSuchElementException();
        }

        @Override // ax.j1.InterfaceC2307e
        public long b() {
            throw new NoSuchElementException();
        }

        @Override // ax.j1.InterfaceC2307e
        public boolean next() {
            return false;
        }
    }

    long a();

    long b();

    boolean next();
}
