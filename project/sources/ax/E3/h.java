package ax.E3;

import com.box.androidsdk.content.BoxException;
import com.box.androidsdk.content.models.BoxObject;
import com.box.androidsdk.content.requests.BoxRequest;
import com.box.androidsdk.content.requests.BoxResponse;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public class h<E extends BoxObject> extends FutureTask<BoxResponse<E>> {
    protected ArrayList<b<E>> c0;
    protected final BoxRequest q;

    class a implements Callable<BoxResponse<E>> {
        final /* synthetic */ BoxRequest a;

        a(BoxRequest boxRequest) {
            this.a = boxRequest;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BoxResponse<E> call() throws Exception {
            BoxObject boxObject = null;
            try {
                e = null;
                boxObject = this.a.x();
            } catch (Exception e) {
                e = e;
            }
            return new BoxResponse<>(boxObject, e, this.a);
        }
    }

    public interface b<E extends BoxObject> {
        void a(BoxResponse<E> boxResponse);
    }

    public h(Class<E> cls, BoxRequest boxRequest) {
        super(new a(boxRequest));
        this.c0 = new ArrayList<>();
        this.q = boxRequest;
    }

    public synchronized h<E> a(b<E> bVar) {
        this.c0.add(bVar);
        return this;
    }

    @Override // java.util.concurrent.FutureTask
    protected synchronized void done() {
        BoxResponse<E> boxResponse;
        try {
            boxResponse = get();
            e = null;
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            e = e;
            boxResponse = null;
        }
        if (e != null) {
            boxResponse = new BoxResponse<>(null, new BoxException("Unable to retrieve response from FutureTask.", e), this.q);
        }
        ArrayList<b<E>> arrayList = this.c0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            b<E> bVar = arrayList.get(i);
            i++;
            bVar.a(boxResponse);
        }
    }
}
