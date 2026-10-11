package ax.da;

/* renamed from: ax.da.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1952a<T> extends BlockingQueueC1953b<T> {
    @Override // java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean offer(T t) {
        return super.h(t);
    }

    @Override // java.util.AbstractQueue, java.util.Queue
    public T remove() {
        return (T) super.removeFirst();
    }
}
