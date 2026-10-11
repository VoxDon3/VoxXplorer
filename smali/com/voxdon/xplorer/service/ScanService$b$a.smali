.class Lcom/voxdon/xplorer/service/ScanService$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/service/ScanService$b;->x(Ljava/lang/Void;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic q:Lcom/voxdon/xplorer/service/ScanService$b;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/service/ScanService$b;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/service/ScanService$b$a;->q:Lcom/voxdon/xplorer/service/ScanService$b;

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
    iget-object v0, p0, Lcom/voxdon/xplorer/service/ScanService$b$a;->q:Lcom/voxdon/xplorer/service/ScanService$b;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/voxdon/xplorer/service/ScanService$b;->n:Lcom/voxdon/xplorer/service/ScanService;

    .line 4
    .line 5
    iget v0, v0, Lcom/voxdon/xplorer/service/ScanService$b;->j:I

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/app/Service;->stopSelf(I)V

    .line 8
    .line 9
    .line 10
    return-void
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
.end method
