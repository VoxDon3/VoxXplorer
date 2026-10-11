.class Lcom/voxdon/xplorer/widget/PathBar$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/widget/PathBar;->h(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic q:Lcom/voxdon/xplorer/widget/PathBar;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/widget/PathBar;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/widget/PathBar$d;->q:Lcom/voxdon/xplorer/widget/PathBar;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/PathBar$d;->q:Lcom/voxdon/xplorer/widget/PathBar;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/voxdon/xplorer/widget/PathBar;->f(Lcom/voxdon/xplorer/widget/PathBar;)Landroid/widget/HorizontalScrollView;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x42

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/widget/HorizontalScrollView;->fullScroll(I)Z

    .line 10
    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
