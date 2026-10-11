.class Lcom/voxdon/xplorer/file/I$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/file/I$b;->a(Lax/la/i;Ljava/lang/Throwable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c0:Lcom/voxdon/xplorer/file/I$b;

.field final synthetic q:Z


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/file/I$b;Z)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/file/I$b$a;->c0:Lcom/voxdon/xplorer/file/I$b;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/voxdon/xplorer/file/I$b$a;->q:Z

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method


# virtual methods
.method public run()V
    .registers 5

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/file/I$b$a;->q:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_30

    .line 6
    .line 7
    iget-object v0, p0, Lcom/voxdon/xplorer/file/I$b$a;->c0:Lcom/voxdon/xplorer/file/I$b;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/voxdon/xplorer/file/I$b;->g:Landroid/app/Activity;

    .line 10
    .line 11
    if-eqz v0, :cond_26

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_26

    .line 18
    .line 19
    iget-object v0, p0, Lcom/voxdon/xplorer/file/I$b$a;->c0:Lcom/voxdon/xplorer/file/I$b;

    .line 20
    .line 21
    iget-object v0, v0, Lcom/voxdon/xplorer/file/I$b;->g:Landroid/app/Activity;

    .line 22
    .line 23
    invoke-static {v0}, Lcom/voxdon/xplorer/file/I;->r0(Landroid/content/Context;)Lcom/voxdon/xplorer/file/I$d;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v1, p0, Lcom/voxdon/xplorer/file/I$b$a;->c0:Lcom/voxdon/xplorer/file/I$b;

    .line 28
    .line 29
    iget-object v2, v1, Lcom/voxdon/xplorer/file/I$b;->g:Landroid/app/Activity;

    .line 30
    .line 31
    iget-object v3, v1, Lcom/voxdon/xplorer/file/I$b;->f:Lcom/voxdon/xplorer/file/c$a;

    .line 32
    .line 33
    iget v1, v1, Lcom/voxdon/xplorer/file/I$b;->c:I

    .line 34
    .line 35
    invoke-virtual {v0, v2, v3, v1}, Lcom/voxdon/xplorer/file/I$d;->x(Landroid/app/Activity;Lcom/voxdon/xplorer/file/c$a;I)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_26
    iget-object v0, p0, Lcom/voxdon/xplorer/file/I$b$a;->c0:Lcom/voxdon/xplorer/file/I$b;

    .line 40
    .line 41
    iget-object v0, v0, Lcom/voxdon/xplorer/file/I$b;->f:Lcom/voxdon/xplorer/file/c$a;

    .line 42
    .line 43
    if-eqz v0, :cond_39

    .line 44
    .line 45
    invoke-interface {v0, v2, v1}, Lcom/voxdon/xplorer/file/c$a;->T(ZLjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_30
    iget-object v0, p0, Lcom/voxdon/xplorer/file/I$b$a;->c0:Lcom/voxdon/xplorer/file/I$b;

    .line 50
    .line 51
    iget-object v0, v0, Lcom/voxdon/xplorer/file/I$b;->f:Lcom/voxdon/xplorer/file/c$a;

    .line 52
    .line 53
    if-eqz v0, :cond_39

    .line 54
    .line 55
    invoke-interface {v0, v2, v1}, Lcom/voxdon/xplorer/file/c$a;->T(ZLjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_39
    return-void
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method
