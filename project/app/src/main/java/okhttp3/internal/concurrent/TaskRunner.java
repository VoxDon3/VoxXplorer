/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.concurrent;

import ax.Gb.g;
import ax.Gb.l;
import ax.sb.t;
import ax.tb.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskLoggerKt;
import okhttp3.internal.concurrent.TaskQueue;

public final class TaskRunner {
    public static final Companion Companion = new Companion(null);
    public static final TaskRunner INSTANCE;
    private static final Logger logger;
    private final Backend backend;
    private final List<TaskQueue> busyQueues;
    private boolean coordinatorWaiting;
    private long coordinatorWakeUpAt;
    private int nextQueueName;
    private final List<TaskQueue> readyQueues;
    private final Runnable runnable;

    static {
        Object object = new StringBuilder();
        ((StringBuilder)object).append(Util.okHttpName);
        ((StringBuilder)object).append(" TaskRunner");
        INSTANCE = new TaskRunner(new RealBackend(Util.threadFactory(((StringBuilder)object).toString(), true)));
        object = Logger.getLogger(TaskRunner.class.getName());
        l.e(object, "getLogger(TaskRunner::class.java.name)");
        logger = object;
    }

    public TaskRunner(Backend backend) {
        l.f(backend, "backend");
        this.backend = backend;
        this.nextQueueName = 10000;
        this.busyQueues = new ArrayList<TaskQueue>();
        this.readyQueues = new ArrayList<TaskQueue>();
        this.runnable = new Runnable(this){
            final TaskRunner this$0;
            {
                this.this$0 = taskRunner;
            }

            /*
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Converted monitor instructions to comments
             * Lifted jumps to return sites
             */
            public void run() {
                Throwable throwable32;
                long l8;
                long l9;
                boolean bl;
                Object object;
                Task task;
                Object object2;
                while (true) {
                    object2 = this.this$0;
                    // MONITORENTER : object2
                    task = ((TaskRunner)object2).awaitTaskToRun();
                    // MONITOREXIT : object2
                    if (task == null) {
                        return;
                    }
                    object2 = task.getQueue$okhttp();
                    l.c(object2);
                    object = this.this$0;
                    bl = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
                    if (bl) {
                        l9 = ((TaskQueue)object2).getTaskRunner$okhttp().getBackend().nanoTime();
                        TaskLoggerKt.access$log(task, (TaskQueue)object2, "starting");
                    } else {
                        l9 = -1L;
                    }
                    TaskRunner.access$runTask((TaskRunner)object, task);
                    object = t.a;
                    if (!bl) continue;
                    l8 = ((TaskQueue)object2).getTaskRunner$okhttp().getBackend().nanoTime();
                    object = new StringBuilder();
                    ((StringBuilder)object).append("finished run in ");
                    ((StringBuilder)object).append(TaskLoggerKt.formatDuration(l8 - l9));
                    TaskLoggerKt.access$log(task, (TaskQueue)object2, ((StringBuilder)object).toString());
                }
                catch (Throwable throwable2) {
                    try {
                        ((TaskRunner)object).getBackend().execute(this);
                        throw throwable2;
                    }
                    catch (Throwable throwable32) {}
                }
                if (!bl) throw throwable32;
                l8 = ((TaskQueue)object2).getTaskRunner$okhttp().getBackend().nanoTime();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("failed a run in ");
                stringBuilder.append(TaskLoggerKt.formatDuration(l8 - l9));
                TaskLoggerKt.access$log(task, (TaskQueue)object2, stringBuilder.toString());
                throw throwable32;
            }
        };
    }

    public static final /* synthetic */ void access$runTask(TaskRunner taskRunner, Task task) {
        taskRunner.runTask(task);
    }

    private final void afterRun(Task object, long l8) {
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Thread ");
            ((StringBuilder)object).append(Thread.currentThread().getName());
            ((StringBuilder)object).append(" MUST hold lock on ");
            ((StringBuilder)object).append(this);
            throw new AssertionError((Object)((StringBuilder)object).toString());
        }
        TaskQueue taskQueue = ((Task)object).getQueue$okhttp();
        l.c(taskQueue);
        if (taskQueue.getActiveTask$okhttp() == object) {
            boolean bl = taskQueue.getCancelActiveTask$okhttp();
            taskQueue.setCancelActiveTask$okhttp(false);
            taskQueue.setActiveTask$okhttp(null);
            this.busyQueues.remove(taskQueue);
            if (l8 != -1L && !bl && !taskQueue.getShutdown$okhttp()) {
                taskQueue.scheduleAndDecide$okhttp((Task)object, l8, true);
            }
            if (!((Collection)taskQueue.getFutureTasks$okhttp()).isEmpty()) {
                this.readyQueues.add(taskQueue);
            }
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    private final void beforeRun(Task object) {
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Thread ");
            ((StringBuilder)object).append(Thread.currentThread().getName());
            ((StringBuilder)object).append(" MUST hold lock on ");
            ((StringBuilder)object).append(this);
            throw new AssertionError((Object)((StringBuilder)object).toString());
        }
        ((Task)object).setNextExecuteNanoTime$okhttp(-1L);
        TaskQueue taskQueue = ((Task)object).getQueue$okhttp();
        l.c(taskQueue);
        taskQueue.getFutureTasks$okhttp().remove(object);
        this.readyQueues.remove(taskQueue);
        taskQueue.setActiveTask$okhttp((Task)object);
        this.busyQueues.add(taskQueue);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void runTask(Task object) {
        long l8;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Thread ");
            ((StringBuilder)object).append(Thread.currentThread().getName());
            ((StringBuilder)object).append(" MUST NOT hold lock on ");
            ((StringBuilder)object).append(this);
            throw new AssertionError((Object)((StringBuilder)object).toString());
        }
        Thread thread = Thread.currentThread();
        String string = thread.getName();
        thread.setName(((Task)object).getName());
        try {
            l8 = ((Task)object).runOnce();
        }
        catch (Throwable throwable) {
            synchronized (this) {
                this.afterRun((Task)object, -1L);
                object = t.a;
            }
            thread.setName(string);
            throw throwable;
        }
        synchronized (this) {
            this.afterRun((Task)object, l8);
            object = t.a;
        }
        thread.setName(string);
    }

    public final List<TaskQueue> activeQueues() {
        synchronized (this) {
            List<TaskQueue> list = o.O((Collection)this.busyQueues, (Iterable)this.readyQueues);
            return list;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Task awaitTaskToRun() {
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            var8_1 = new StringBuilder();
            var8_1.append("Thread ");
            var8_1.append(Thread.currentThread().getName());
            var8_1.append(" MUST hold lock on ");
            var8_1.append(this);
            throw new AssertionError((Object)var8_1.toString());
        }
        block4: while (true) {
            block15: {
                if (this.readyQueues.isEmpty()) {
                    return null;
                }
                var4_7 = this.backend.nanoTime();
                var10_10 = this.readyQueues.iterator();
                var2_6 = 0x7FFFFFFFFFFFFFFFL;
                var8_2 = null;
                while (var10_10.hasNext()) {
                    var9_9 = var10_10.next().getFutureTasks$okhttp().get(0);
                    var6_8 = Math.max(0L, var9_9.getNextExecuteNanoTime$okhttp() - var4_7);
                    if (var6_8 > 0L) {
                        var2_6 = Math.min(var6_8, var2_6);
                        continue;
                    }
                    if (var8_2 != null) {
                        var1_5 = true;
                        break block15;
                    }
                    var8_2 = var9_9;
                }
                var1_5 = false;
            }
            if (var8_2 != null) {
                this.beforeRun(var8_2);
                if (var1_5 || !this.coordinatorWaiting && !((Collection)this.readyQueues).isEmpty()) {
                    this.backend.execute(this.runnable);
                }
                return var8_2;
            }
            if (this.coordinatorWaiting) {
                if (var2_6 < this.coordinatorWakeUpAt - var4_7) {
                    this.backend.coordinatorNotify(this);
                }
                return null;
            }
            this.coordinatorWaiting = true;
            this.coordinatorWakeUpAt = var4_7 + var2_6;
            this.backend.coordinatorWait(this, var2_6);
lbl45:
            // 2 sources

            while (true) {
                this.coordinatorWaiting = false;
                continue block4;
                break;
            }
            {
                catch (Throwable var8_3) {
                    break;
                }
                catch (InterruptedException var8_4) {}
                {
                    this.cancelAll();
                    ** continue;
                }
            }
        }
        this.coordinatorWaiting = false;
        throw var8_3;
    }

    public final void cancelAll() {
        int n8;
        for (n8 = this.busyQueues.size() - 1; -1 < n8; --n8) {
            this.busyQueues.get(n8).cancelAllAndDecide$okhttp();
        }
        for (n8 = this.readyQueues.size() - 1; -1 < n8; --n8) {
            TaskQueue taskQueue = this.readyQueues.get(n8);
            taskQueue.cancelAllAndDecide$okhttp();
            if (!taskQueue.getFutureTasks$okhttp().isEmpty()) continue;
            this.readyQueues.remove(n8);
        }
    }

    public final Backend getBackend() {
        return this.backend;
    }

    public final void kickCoordinator$okhttp(TaskQueue object) {
        l.f(object, "taskQueue");
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Thread ");
            ((StringBuilder)object).append(Thread.currentThread().getName());
            ((StringBuilder)object).append(" MUST hold lock on ");
            ((StringBuilder)object).append(this);
            throw new AssertionError((Object)((StringBuilder)object).toString());
        }
        if (((TaskQueue)object).getActiveTask$okhttp() == null) {
            if (!((Collection)((TaskQueue)object).getFutureTasks$okhttp()).isEmpty()) {
                Util.addIfAbsent(this.readyQueues, object);
            } else {
                this.readyQueues.remove(object);
            }
        }
        if (this.coordinatorWaiting) {
            this.backend.coordinatorNotify(this);
            return;
        }
        this.backend.execute(this.runnable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final TaskQueue newQueue() {
        int n8;
        synchronized (this) {
            n8 = this.nextQueueName;
            this.nextQueueName = n8 + 1;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('Q');
        stringBuilder.append(n8);
        return new TaskQueue(this, stringBuilder.toString());
    }

    public static interface Backend {
        public void beforeTask(TaskRunner var1);

        public void coordinatorNotify(TaskRunner var1);

        public void coordinatorWait(TaskRunner var1, long var2);

        public void execute(Runnable var1);

        public long nanoTime();
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        public final Logger getLogger() {
            return logger;
        }
    }

    public static final class RealBackend
    implements Backend {
        private final ThreadPoolExecutor executor;

        public RealBackend(ThreadFactory threadFactory) {
            l.f(threadFactory, "threadFactory");
            this.executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), threadFactory);
        }

        @Override
        public void beforeTask(TaskRunner taskRunner) {
            l.f(taskRunner, "taskRunner");
        }

        @Override
        public void coordinatorNotify(TaskRunner taskRunner) {
            l.f(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override
        public void coordinatorWait(TaskRunner taskRunner, long l8) throws InterruptedException {
            l.f(taskRunner, "taskRunner");
            long l9 = l8 / 1000000L;
            if (l9 <= 0L && l8 <= 0L) {
                return;
            }
            taskRunner.wait(l9, (int)(l8 - 1000000L * l9));
        }

        @Override
        public void execute(Runnable runnable2) {
            l.f(runnable2, "runnable");
            this.executor.execute(runnable2);
        }

        @Override
        public long nanoTime() {
            return System.nanoTime();
        }

        public final void shutdown() {
            this.executor.shutdown();
        }
    }
}

