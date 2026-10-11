.class Lax/W2/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/a3/H$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/W2/e;->B2(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/voxdon/xplorer/file/n;

.field final synthetic b:Lcom/voxdon/xplorer/file/n;

.field final synthetic c:Lax/W2/e;


# direct methods
.method constructor <init>(Lax/W2/e;Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/W2/e$b;->c:Lax/W2/e;

    .line 2
    .line 3
    iput-object p2, p0, Lax/W2/e$b;->a:Lcom/voxdon/xplorer/file/n;

    .line 4
    .line 5
    iput-object p3, p0, Lax/W2/e$b;->b:Lcom/voxdon/xplorer/file/n;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public a(Z)V
    .registers 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p1, :cond_25

    .line 3
    .line 4
    iget-object p1, p0, Lax/W2/e$b;->c:Lax/W2/e;

    .line 5
    .line 6
    new-instance v1, Lax/W2/e$j;

    .line 7
    .line 8
    iget-object v2, p0, Lax/W2/e$b;->c:Lax/W2/e;

    .line 9
    .line 10
    invoke-direct {v1, v2}, Lax/W2/e$j;-><init>(Lax/W2/e;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v1}, Lax/W2/e;->x0(Lax/W2/e;Lax/W2/e$j;)Lax/W2/e$j;

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lax/W2/e$b;->c:Lax/W2/e;

    .line 17
    .line 18
    invoke-static {p1}, Lax/W2/e;->w0(Lax/W2/e;)Lax/W2/e$j;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1, v0}, Lax/W2/e$j;->R(Z)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lax/W2/e$b;->c:Lax/W2/e;

    .line 26
    .line 27
    invoke-static {p1}, Lax/W2/e;->w0(Lax/W2/e;)Lax/W2/e$j;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const/4 v0, 0x0

    .line 32
    new-array v0, v0, [Ljava/lang/Void;

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_25
    iget-object p1, p0, Lax/W2/e$b;->c:Lax/W2/e;

    .line 39
    .line 40
    iget-object v1, p0, Lax/W2/e$b;->a:Lcom/voxdon/xplorer/file/n;

    .line 41
    .line 42
    iget-object v2, p0, Lax/W2/e$b;->b:Lcom/voxdon/xplorer/file/n;

    .line 43
    .line 44
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-static {p1, v1, v2, v0}, Lax/W2/e;->y0(Lax/W2/e;Lcom/voxdon/xplorer/file/n;Ljava/lang/String;I)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lax/W2/e$b;->c:Lax/W2/e;

    .line 52
    .line 53
    invoke-virtual {p1}, Lax/W2/j;->o()V

    .line 54
    .line 55
    .line 56
    return-void
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method
