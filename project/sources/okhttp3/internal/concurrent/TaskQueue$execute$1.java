package okhttp3.internal.concurrent;

import ax.Fb.a;
import ax.sb.t;

/* loaded from: classes3.dex */
public final class TaskQueue$execute$1 extends Task {
    final /* synthetic */ a<t> $block;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskQueue$execute$1(String str, boolean z, a<t> aVar) {
        super(str, z);
        this.$block = aVar;
    }

    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() {
        this.$block.invoke();
        return -1L;
    }
}
