.class public final synthetic Lax/a2/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Landroidx/media3/ui/PlayerView;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/ui/PlayerView;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/a2/n;->q:Landroidx/media3/ui/PlayerView;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/a2/n;->q:Landroidx/media3/ui/PlayerView;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void
.end method
