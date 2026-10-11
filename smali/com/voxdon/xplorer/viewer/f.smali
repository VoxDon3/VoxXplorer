.class public final synthetic Lcom/voxdon/xplorer/viewer/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/b0/a;


# instance fields
.field public final synthetic a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$a;


# direct methods
.method public synthetic constructor <init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$a;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/voxdon/xplorer/viewer/f;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$a;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/f;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$a;

    check-cast p1, Ljava/lang/Integer;

    invoke-static {v0, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$a;->b(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$a;Ljava/lang/Integer;)V

    return-void
.end method
