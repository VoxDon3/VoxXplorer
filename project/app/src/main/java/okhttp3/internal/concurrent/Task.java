/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.concurrent;

import ax.Gb.g;
import ax.Gb.l;
import okhttp3.internal.concurrent.TaskQueue;

public abstract class Task {
    private final boolean cancelable;
    private final String name;
    private long nextExecuteNanoTime;
    private TaskQueue queue;

    public Task(String string, boolean bl) {
        l.f(string, "name");
        this.name = string;
        this.cancelable = bl;
        this.nextExecuteNanoTime = -1L;
    }

    public /* synthetic */ Task(String string, boolean bl, int n8, g g8) {
        if ((n8 & 2) != 0) {
            bl = true;
        }
        this(string, bl);
    }

    public final boolean getCancelable() {
        return this.cancelable;
    }

    public final String getName() {
        return this.name;
    }

    public final long getNextExecuteNanoTime$okhttp() {
        return this.nextExecuteNanoTime;
    }

    public final TaskQueue getQueue$okhttp() {
        return this.queue;
    }

    public final void initQueue$okhttp(TaskQueue taskQueue) {
        l.f(taskQueue, "queue");
        TaskQueue taskQueue2 = this.queue;
        if (taskQueue2 == taskQueue) {
            return;
        }
        if (taskQueue2 == null) {
            this.queue = taskQueue;
            return;
        }
        throw new IllegalStateException("task is in multiple queues");
    }

    public abstract long runOnce();

    public final void setNextExecuteNanoTime$okhttp(long l8) {
        this.nextExecuteNanoTime = l8;
    }

    public final void setQueue$okhttp(TaskQueue taskQueue) {
        this.queue = taskQueue;
    }

    public String toString() {
        return this.name;
    }
}

