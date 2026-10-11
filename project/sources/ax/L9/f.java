package ax.L9;

/* loaded from: classes3.dex */
public class f {
    private final Object a = new Object();
    private boolean b;

    public void a() {
        synchronized (this.a) {
            this.b = true;
            this.a.notifyAll();
        }
    }

    public void b() {
        synchronized (this.a) {
            if (this.b) {
                return;
            }
            try {
                this.a.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
