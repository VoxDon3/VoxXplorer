.class Lax/W2/o$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/a3/r$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/W2/o;->l(Lax/d3/s;Lcom/voxdon/xplorer/file/o;Ljava/util/List;IZZIILax/W2/h$a;Landroid/content/DialogInterface$OnCancelListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/d3/s;

.field final synthetic b:Lax/W2/o;

.field final synthetic c:Z


# direct methods
.method constructor <init>(Lax/d3/s;Lax/W2/o;Z)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/W2/o$b;->a:Lax/d3/s;

    .line 2
    .line 3
    iput-object p2, p0, Lax/W2/o$b;->b:Lax/W2/o;

    .line 4
    .line 5
    iput-boolean p3, p0, Lax/W2/o$b;->c:Z

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
    .registers 4

    .line 1
    if-eqz p1, :cond_1d

    .line 2
    .line 3
    :try_start_2
    iget-object p1, p0, Lax/W2/o$b;->a:Lax/d3/s;

    .line 4
    .line 5
    iget-object v0, p0, Lax/W2/o$b;->b:Lax/W2/o;

    .line 6
    .line 7
    iget-boolean v1, p0, Lax/W2/o$b;->c:Z

    .line 8
    .line 9
    invoke-interface {p1, v0, v1}, Lax/d3/s;->l(Lax/W2/h;Z)V
    :try_end_b
    .catch Lax/b3/c; {:try_start_2 .. :try_end_b} :catch_c

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catch_c
    iget-object p1, p0, Lax/W2/o$b;->a:Lax/d3/s;

    .line 14
    .line 15
    invoke-interface {p1}, Lax/d3/s;->b()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const v0, 0x7f130137

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 28
    .line 29
    .line 30
    :cond_1d
    return-void
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
.end method
