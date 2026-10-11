/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.concurrent;

import ax.Fb.a;
import ax.Gb.l;
import ax.sb.t;
import ax.tb.o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskLoggerKt;
import okhttp3.internal.concurrent.TaskRunner;

public final class TaskQueue {
    private Task activeTask;
    private boolean cancelActiveTask;
    private final List<Task> futureTasks;
    private final String name;
    private boolean shutdown;
    private final TaskRunner taskRunner;

    public TaskQueue(TaskRunner taskRunner, String string) {
        l.f(taskRunner, "taskRunner");
        l.f(string, "name");
        this.taskRunner = taskRunner;
        this.name = string;
        this.futureTasks = new ArrayList<Task>();
    }

    public static /* synthetic */ void execute$default(TaskQueue taskQueue, String string, long l8, boolean bl, a a8, int n8, Object object) {
        if ((n8 & 2) != 0) {
            l8 = 0L;
        }
        if ((n8 & 4) != 0) {
            bl = true;
        }
        l.f(string, "name");
        l.f(a8, "block");
        taskQueue.schedule(new Task(string, bl, a8){
            final a<t> $block;
            {
                this.$block = a8;
                super(string, bl);
            }

            public long runOnce() {
                this.$block.invoke();
                return -1L;
            }
        }, l8);
    }

    public static /* synthetic */ void schedule$default(TaskQueue taskQueue, String string, long l8, a a8, int n8, Object object) {
        if ((n8 & 2) != 0) {
            l8 = 0L;
        }
        l.f(string, "name");
        l.f(a8, "block");
        taskQueue.schedule(new Task(string, a8){
            final a<Long> $block;
            {
                this.$block = a8;
                super(string, false, 2, null);
            }

            public long runOnce() {
                return ((Number)this.$block.invoke()).longValue();
            }
        }, l8);
    }

    public static /* synthetic */ void schedule$default(TaskQueue taskQueue, Task task, long l8, int n8, Object object) {
        if ((n8 & 2) != 0) {
            l8 = 0L;
        }
        taskQueue.schedule(task, l8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void cancelAll() {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Thread ");
            stringBuilder.append(Thread.currentThread().getName());
            stringBuilder.append(" MUST NOT hold lock on ");
            stringBuilder.append(this);
            throw new AssertionError((Object)stringBuilder.toString());
        }
        TaskRunner taskRunner = this.taskRunner;
        synchronized (taskRunner) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        if (!this.cancelAllAndDecide$okhttp()) break block4;
                        this.taskRunner.kickCoordinator$okhttp(this);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                t t8 = t.a;
                return;
            }
            throw throwable2;
        }
    }

    public final boolean cancelAllAndDecide$okhttp() {
        Task task = this.activeTask;
        if (task != null) {
            l.c(task);
            if (task.getCancelable()) {
                this.cancelActiveTask = true;
            }
        }
        boolean bl = false;
        for (int i8 = this.futureTasks.size() - 1; -1 < i8; --i8) {
            if (!this.futureTasks.get(i8).getCancelable()) continue;
            task = this.futureTasks.get(i8);
            if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                TaskLoggerKt.access$log(task, this, "canceled");
            }
            this.futureTasks.remove(i8);
            bl = true;
        }
        return bl;
    }

    public final void execute(String string, long l8, boolean bl, a<t> a8) {
        l.f(string, "name");
        l.f(a8, "block");
        this.schedule(new /* invalid duplicate definition of identical inner class */, l8);
    }

    public final Task getActiveTask$okhttp() {
        return this.activeTask;
    }

    public final boolean getCancelActiveTask$okhttp() {
        return this.cancelActiveTask;
    }

    public final List<Task> getFutureTasks$okhttp() {
        return this.futureTasks;
    }

    public final String getName$okhttp() {
        return this.name;
    }

    public final List<Task> getScheduledTasks() {
        TaskRunner taskRunner = this.taskRunner;
        synchronized (taskRunner) {
            List<Task> list = o.V((Iterable)this.futureTasks);
            return list;
        }
    }

    public final boolean getShutdown$okhttp() {
        return this.shutdown;
    }

    public final TaskRunner getTaskRunner$okhttp() {
        return this.taskRunner;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final CountDownLatch idleLatch() {
        TaskRunner taskRunner = this.taskRunner;
        synchronized (taskRunner) {
            Throwable throwable2;
            block6: {
                try {
                    if (this.activeTask == null && this.futureTasks.isEmpty()) {
                        return new CountDownLatch(0);
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                Object object2 = this.activeTask;
                if (object2 instanceof AwaitIdleTask) {
                    return ((AwaitIdleTask)object2).getLatch();
                }
                for (Object object2 : this.futureTasks) {
                    if (!(object2 instanceof AwaitIdleTask)) continue;
                    return ((AwaitIdleTask)object2).getLatch();
                }
                object2 = new AwaitIdleTask();
                if (!this.scheduleAndDecide$okhttp((Task)object2, 0L, false)) return ((AwaitIdleTask)object2).getLatch();
                this.taskRunner.kickCoordinator$okhttp(this);
                return ((AwaitIdleTask)object2).getLatch();
            }
            throw throwable2;
        }
    }

    public final void schedule(String string, long l8, a<Long> a8) {
        l.f(string, "name");
        l.f(a8, "block");
        this.schedule(new /* invalid duplicate definition of identical inner class */, l8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void schedule(Task object, long l8) {
        l.f(object, "task");
        TaskRunner taskRunner = this.taskRunner;
        synchronized (taskRunner) {
            Throwable throwable2;
            block9: {
                block6: {
                    block7: {
                        block8: {
                            try {
                                if (!this.shutdown) break block6;
                                if (!((Task)object).getCancelable()) break block7;
                                if (!TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) break block8;
                                TaskLoggerKt.access$log((Task)object, this, "schedule canceled (queue is shutdown)");
                            }
                            catch (Throwable throwable2) {}
                        }
                        return;
                    }
                    if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                        TaskLoggerKt.access$log((Task)object, this, "schedule failed (queue is shutdown)");
                    }
                    object = new RejectedExecutionException();
                    throw object;
                    break block9;
                }
                if (this.scheduleAndDecide$okhttp((Task)object, l8, false)) {
                    this.taskRunner.kickCoordinator$okhttp(this);
                }
                object = t.a;
                return;
            }
            throw throwable2;
        }
    }

    public final boolean scheduleAndDecide$okhttp(Task task, long l8, boolean bl) {
        int n8;
        block9: {
            Object object;
            l.f(task, "task");
            task.initQueue$okhttp(this);
            long l9 = this.taskRunner.getBackend().nanoTime();
            long l10 = l9 + l8;
            n8 = this.futureTasks.indexOf(task);
            if (n8 != -1) {
                if (task.getNextExecuteNanoTime$okhttp() <= l10) {
                    if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                        TaskLoggerKt.access$log(task, this, "already scheduled");
                    }
                    return false;
                }
                this.futureTasks.remove(n8);
            }
            task.setNextExecuteNanoTime$okhttp(l10);
            if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                if (bl) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("run again after ");
                    ((StringBuilder)object).append(TaskLoggerKt.formatDuration(l10 - l9));
                    object = ((StringBuilder)object).toString();
                } else {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("scheduled after ");
                    ((StringBuilder)object).append(TaskLoggerKt.formatDuration(l10 - l9));
                    object = ((StringBuilder)object).toString();
                }
                TaskLoggerKt.access$log(task, this, (String)object);
            }
            object = this.futureTasks.iterator();
            n8 = 0;
            while (object.hasNext()) {
                if (((Task)object.next()).getNextExecuteNanoTime$okhttp() - l9 <= l8) {
                    ++n8;
                    continue;
                }
                break block9;
            }
            n8 = -1;
        }
        int n9 = n8;
        if (n8 == -1) {
            n9 = this.futureTasks.size();
        }
        this.futureTasks.add(n9, task);
        return n9 == 0;
    }

    public final void setActiveTask$okhttp(Task task) {
        this.activeTask = task;
    }

    public final void setCancelActiveTask$okhttp(boolean bl) {
        this.cancelActiveTask = bl;
    }

    public final void setShutdown$okhttp(boolean bl) {
        this.shutdown = bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void shutdown() {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Thread ");
            stringBuilder.append(Thread.currentThread().getName());
            stringBuilder.append(" MUST NOT hold lock on ");
            stringBuilder.append(this);
            throw new AssertionError((Object)stringBuilder.toString());
        }
        TaskRunner taskRunner = this.taskRunner;
        synchronized (taskRunner) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        this.shutdown = true;
                        if (!this.cancelAllAndDecide$okhttp()) break block4;
                        this.taskRunner.kickCoordinator$okhttp(this);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                t t8 = t.a;
                return;
            }
            throw throwable2;
        }
    }

    public String toString() {
        return this.name;
    }

    private static final class AwaitIdleTask
    extends Task {
        private final CountDownLatch latch;

        public AwaitIdleTask() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Util.okHttpName);
            stringBuilder.append(" awaitIdle");
            super(stringBuilder.toString(), false);
            this.latch = new CountDownLatch(1);
        }

        public final CountDownLatch getLatch() {
            return this.latch;
        }

        @Override
        public long runOnce() {
            this.latch.countDown();
            return -1L;
        }
    }
}

