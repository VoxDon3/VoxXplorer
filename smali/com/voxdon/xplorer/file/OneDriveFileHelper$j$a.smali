.class Lcom/voxdon/xplorer/file/OneDriveFileHelper$j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/L9/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/file/OneDriveFileHelper$j;->k(Landroid/app/Activity;Lax/g3/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lax/L9/c<",
        "Lax/N9/e0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lax/g3/k;

.field final synthetic b:Lcom/voxdon/xplorer/file/OneDriveFileHelper$j;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/file/OneDriveFileHelper$j;Lax/g3/k;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$j$a;->b:Lcom/voxdon/xplorer/file/OneDriveFileHelper$j;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$j$a;->a:Lax/g3/k;

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
.method public b(Lax/M9/d;)V
    .registers 2

    .line 1
    iget-object p1, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$j$a;->a:Lax/g3/k;

    .line 2
    .line 3
    if-eqz p1, :cond_c

    .line 4
    .line 5
    new-instance p1, Lcom/voxdon/xplorer/file/OneDriveFileHelper$j$a$b;

    .line 6
    .line 7
    invoke-direct {p1, p0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper$j$a$b;-><init>(Lcom/voxdon/xplorer/file/OneDriveFileHelper$j$a;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lax/u3/B;->a0(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    :cond_c
    return-void
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

.method public bridge synthetic c(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Lax/N9/e0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/OneDriveFileHelper$j$a;->d(Lax/N9/e0;)V

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

.method public d(Lax/N9/e0;)V
    .registers 5

    .line 1
    invoke-interface {p1}, Lax/M9/f;->c()Lax/K9/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lax/K9/b;

    .line 6
    .line 7
    invoke-virtual {p1}, Lax/K9/b;->f()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v0, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$j$a;->b:Lcom/voxdon/xplorer/file/OneDriveFileHelper$j;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper$j;->l()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$j$a;->b:Lcom/voxdon/xplorer/file/OneDriveFileHelper$j;

    .line 18
    .line 19
    const-string v2, ""

    .line 20
    .line 21
    invoke-virtual {v1, v0, p1, v2, v2}, Lcom/voxdon/xplorer/file/OneDriveFileHelper$j;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$j$a;->a:Lax/g3/k;

    .line 25
    .line 26
    if-eqz p1, :cond_23

    .line 27
    .line 28
    new-instance p1, Lcom/voxdon/xplorer/file/OneDriveFileHelper$j$a$a;

    .line 29
    .line 30
    invoke-direct {p1, p0, v0}, Lcom/voxdon/xplorer/file/OneDriveFileHelper$j$a$a;-><init>(Lcom/voxdon/xplorer/file/OneDriveFileHelper$j$a;I)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Lax/u3/B;->a0(Ljava/lang/Runnable;)V

    .line 34
    .line 35
    .line 36
    :cond_23
    return-void
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method
