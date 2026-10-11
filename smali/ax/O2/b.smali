.class public final synthetic Lax/O2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Lax/v7/e;

.field public final synthetic q:Landroidx/work/impl/workers/ConstraintTrackingWorker;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/impl/workers/ConstraintTrackingWorker;Lax/v7/e;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/O2/b;->q:Landroidx/work/impl/workers/ConstraintTrackingWorker;

    iput-object p2, p0, Lax/O2/b;->c0:Lax/v7/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/O2/b;->q:Landroidx/work/impl/workers/ConstraintTrackingWorker;

    iget-object v1, p0, Lax/O2/b;->c0:Lax/v7/e;

    invoke-static {v0, v1}, Landroidx/work/impl/workers/ConstraintTrackingWorker;->p(Landroidx/work/impl/workers/ConstraintTrackingWorker;Lax/v7/e;)V

    return-void
.end method
