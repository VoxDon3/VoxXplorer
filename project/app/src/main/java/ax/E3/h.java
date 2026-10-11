/*
 * Decompiled with CFR 0.152.
 */
package ax.E3;

import com.box.androidsdk.content.BoxException;
import com.box.androidsdk.content.models.BoxObject;
import com.box.androidsdk.content.requests.BoxRequest;
import com.box.androidsdk.content.requests.BoxResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class h<E extends BoxObject>
extends FutureTask<BoxResponse<E>> {
    protected ArrayList<b<E>> c0 = new ArrayList();
    protected final BoxRequest q;

    public h(Class<E> clazz, BoxRequest boxRequest) {
        super(new Callable<BoxResponse<E>>(boxRequest){
            final BoxRequest a;
            {
                this.a = boxRequest;
            }

            public BoxResponse<E> a() throws Exception {
                Exception exception;
                Object t8;
                Object e8 = null;
                try {
                    t8 = this.a.x();
                    exception = null;
                }
                catch (Exception exception2) {
                    // empty catch block
                }
                e8 = t8;
                return new BoxResponse<Object>(e8, exception, this.a);
            }
        });
        this.q = boxRequest;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public h<E> a(b<E> b8) {
        synchronized (this) {
            this.c0.add(b8);
            return this;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected void done() {
        synchronized (this) {
            int n8;
            Serializable serializable;
            Throwable throwable;
            BoxResponse<Object> boxResponse;
            try {
                block10: {
                    try {
                        boxResponse = (BoxResponse<Object>)this.get();
                        throwable = null;
                        break block10;
                    }
                    catch (CancellationException cancellationException) {
                    }
                    catch (ExecutionException executionException) {
                    }
                    catch (InterruptedException interruptedException) {
                        // empty catch block
                    }
                    boxResponse = null;
                }
                if (throwable != null) {
                    serializable = new BoxException("Unable to retrieve response from FutureTask.", throwable);
                    boxResponse = new BoxResponse<Object>(null, (Exception)serializable, this.q);
                }
                serializable = this.c0;
                n8 = ((ArrayList)serializable).size();
            }
            catch (Throwable throwable2) {}
            throw throwable2;
            for (int i8 = 0; i8 < n8; ++i8) {
                throwable = (Throwable)((ArrayList)serializable).get(i8);
                ((b)((Object)throwable)).a(boxResponse);
            }
            return;
        }
    }

    public static interface b<E extends BoxObject> {
        public void a(BoxResponse<E> var1);
    }
}

