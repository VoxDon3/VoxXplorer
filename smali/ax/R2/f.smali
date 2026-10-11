.class public final synthetic Lax/R2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:I

.field public final synthetic q:Lcom/voxdon/xplorer/activity/RestartActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/voxdon/xplorer/activity/RestartActivity;I)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/R2/f;->q:Lcom/voxdon/xplorer/activity/RestartActivity;

    iput p2, p0, Lax/R2/f;->c0:I

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/R2/f;->q:Lcom/voxdon/xplorer/activity/RestartActivity;

    iget v1, p0, Lax/R2/f;->c0:I

    invoke-static {v0, v1}, Lcom/voxdon/xplorer/activity/RestartActivity;->F(Lcom/voxdon/xplorer/activity/RestartActivity;I)V

    return-void
.end method
