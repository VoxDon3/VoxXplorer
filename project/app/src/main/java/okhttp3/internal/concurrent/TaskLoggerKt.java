/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.concurrent;

import ax.Fb.a;
import ax.Gb.k;
import ax.Gb.l;
import ax.Gb.y;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;

public final class TaskLoggerKt {
    public static final String formatDuration(long l8) {
        CharSequence charSequence;
        if (l8 <= -999500000L) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((l8 - (long)500000000) / (long)1000000000);
            ((StringBuilder)charSequence).append(" s ");
            charSequence = ((StringBuilder)charSequence).toString();
        } else if (l8 <= -999500L) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((l8 - (long)500000) / (long)1000000);
            ((StringBuilder)charSequence).append(" ms");
            charSequence = ((StringBuilder)charSequence).toString();
        } else if (l8 <= 0L) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((l8 - (long)500) / (long)1000);
            ((StringBuilder)charSequence).append(" \u00b5s");
            charSequence = ((StringBuilder)charSequence).toString();
        } else if (l8 < 999500L) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((l8 + (long)500) / (long)1000);
            ((StringBuilder)charSequence).append(" \u00b5s");
            charSequence = ((StringBuilder)charSequence).toString();
        } else if (l8 < 999500000L) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((l8 + (long)500000) / (long)1000000);
            ((StringBuilder)charSequence).append(" ms");
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((l8 + (long)500000000) / (long)1000000000);
            ((StringBuilder)charSequence).append(" s ");
            charSequence = ((StringBuilder)charSequence).toString();
        }
        y y8 = y.a;
        charSequence = String.format("%6s", Arrays.copyOf(new Object[]{charSequence}, 1));
        l.e(charSequence, "format(format, *args)");
        return charSequence;
    }

    private static final void log(Task task, TaskQueue object, String string) {
        Logger logger = TaskRunner.Companion.getLogger();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((TaskQueue)object).getName$okhttp());
        stringBuilder.append(' ');
        object = y.a;
        object = String.format("%-22s", Arrays.copyOf(new Object[]{string}, 1));
        l.e(object, "format(format, *args)");
        stringBuilder.append((String)object);
        stringBuilder.append(": ");
        stringBuilder.append(task.getName());
        logger.fine(stringBuilder.toString());
    }

    public static final <T> T logElapsed(Task task, TaskQueue taskQueue, a<? extends T> object) {
        T t8;
        long l8;
        l.f(task, "task");
        l.f(taskQueue, "queue");
        l.f(object, "block");
        boolean bl = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
        if (bl) {
            l8 = taskQueue.getTaskRunner$okhttp().getBackend().nanoTime();
            TaskLoggerKt.log(task, taskQueue, "starting");
        } else {
            l8 = -1L;
        }
        try {
            t8 = object.invoke();
        }
        catch (Throwable throwable) {
            k.b(1);
            if (bl) {
                long l9 = taskQueue.getTaskRunner$okhttp().getBackend().nanoTime();
                object = new StringBuilder();
                ((StringBuilder)object).append("failed a run in ");
                ((StringBuilder)object).append(TaskLoggerKt.formatDuration(l9 - l8));
                TaskLoggerKt.log(task, taskQueue, ((StringBuilder)object).toString());
            }
            k.a(1);
            throw throwable;
        }
        k.b(1);
        if (bl) {
            long l10 = taskQueue.getTaskRunner$okhttp().getBackend().nanoTime();
            object = new StringBuilder();
            ((StringBuilder)object).append("finished run in ");
            ((StringBuilder)object).append(TaskLoggerKt.formatDuration(l10 - l8));
            TaskLoggerKt.log(task, taskQueue, ((StringBuilder)object).toString());
        }
        k.a(1);
        return t8;
    }

    public static final void taskLog(Task task, TaskQueue taskQueue, a<String> a8) {
        l.f(task, "task");
        l.f(taskQueue, "queue");
        l.f(a8, "messageBlock");
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            TaskLoggerKt.log(task, taskQueue, a8.invoke());
        }
    }
}

