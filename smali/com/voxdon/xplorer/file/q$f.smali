.class Lcom/voxdon/xplorer/file/q$f;
.super Lax/c3/H;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/file/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "f"
.end annotation


# instance fields
.field c0:Lax/Sc/e;

.field d0:Z

.field final synthetic e0:Lcom/voxdon/xplorer/file/q;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/file/q;Lax/Sc/e;Ljava/io/InputStream;)V
    .registers 4

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/file/q$f;->e0:Lcom/voxdon/xplorer/file/q;

    .line 2
    .line 3
    invoke-direct {p0, p3}, Lax/c3/H;-><init>(Ljava/io/InputStream;)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/voxdon/xplorer/file/q$f;->c0:Lax/Sc/e;

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method


# virtual methods
.method public close()V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/file/q$f;->d0:Z

    .line 2
    .line 3
    if-nez v0, :cond_31

    .line 4
    .line 5
    invoke-super {p0}, Lax/c3/H;->close()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lcom/voxdon/xplorer/file/q$f;->d0:Z

    .line 10
    .line 11
    iget-object v0, p0, Lcom/voxdon/xplorer/file/q$f;->c0:Lax/Sc/e;

    .line 12
    .line 13
    invoke-virtual {v0}, Lax/Rc/e;->w()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_31

    .line 18
    .line 19
    iget-object v0, p0, Lcom/voxdon/xplorer/file/q$f;->c0:Lax/Sc/e;

    .line 20
    .line 21
    invoke-virtual {v0}, Lax/Sc/e;->A0()Z

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/voxdon/xplorer/file/q$f;->c0:Lax/Sc/e;

    .line 25
    .line 26
    invoke-virtual {v0}, Lax/Sc/e;->C0()Z

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/voxdon/xplorer/file/q$f;->c0:Lax/Sc/e;

    .line 30
    .line 31
    iget-object v1, p0, Lcom/voxdon/xplorer/file/q$f;->e0:Lcom/voxdon/xplorer/file/q;

    .line 32
    .line 33
    invoke-static {v1}, Lcom/voxdon/xplorer/file/q;->m0(Lcom/voxdon/xplorer/file/q;)Lax/Sc/e;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-eq v0, v1, :cond_31

    .line 38
    .line 39
    iget-object v0, p0, Lcom/voxdon/xplorer/file/q$f;->e0:Lcom/voxdon/xplorer/file/q;

    .line 40
    .line 41
    invoke-static {v0}, Lcom/voxdon/xplorer/file/q;->n0(Lcom/voxdon/xplorer/file/q;)Lcom/voxdon/xplorer/file/q$e;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v1, p0, Lcom/voxdon/xplorer/file/q$f;->c0:Lax/Sc/e;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/q$e;->i(Lax/Sc/e;)V

    .line 48
    .line 49
    .line 50
    :cond_31
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method
