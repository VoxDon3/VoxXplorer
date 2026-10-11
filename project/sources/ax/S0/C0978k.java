package ax.S0;

/* renamed from: ax.S0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0978k {
    private final InterfaceC0975h a;
    private boolean b;

    public C0978k() {
        this(InterfaceC0975h.a);
    }

    public synchronized void a() throws InterruptedException {
        while (!this.b) {
            this.a.e();
            wait();
        }
    }

    public synchronized void b() {
        boolean z = false;
        while (!this.b) {
            try {
                this.a.e();
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c(long j) {
        if (j <= 0) {
            return this.b;
        }
        long b = this.a.b();
        long j2 = j + b;
        if (j2 < b) {
            b();
        } else {
            boolean z = false;
            while (!this.b && b < j2) {
                try {
                    this.a.e();
                    wait(j2 - b);
                } catch (InterruptedException unused) {
                    z = true;
                }
                b = this.a.b();
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        return this.b;
    }

    public synchronized boolean d() {
        boolean z;
        z = this.b;
        this.b = false;
        return z;
    }

    public synchronized boolean e() {
        return this.b;
    }

    public synchronized boolean f() {
        if (this.b) {
            return false;
        }
        this.b = true;
        notifyAll();
        return true;
    }

    public C0978k(InterfaceC0975h interfaceC0975h) {
        this.a = interfaceC0975h;
    }
}
