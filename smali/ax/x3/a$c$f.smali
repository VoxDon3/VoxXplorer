.class Lax/x3/a$c$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/x3/a$c;-><init>(Lax/x3/a;Landroid/view/View;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/x3/a;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Lax/x3/a$c;


# direct methods
.method constructor <init>(Lax/x3/a$c;Lax/x3/a;Landroid/view/View;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/x3/a$c$f;->c:Lax/x3/a$c;

    .line 2
    .line 3
    iput-object p2, p0, Lax/x3/a$c$f;->a:Lax/x3/a;

    .line 4
    .line 5
    iput-object p3, p0, Lax/x3/a$c$f;->b:Landroid/view/View;

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
.method public onLongClick(Landroid/view/View;)Z
    .registers 6

    .line 1
    iget-object p1, p0, Lax/x3/a$c$f;->b:Landroid/view/View;

    .line 2
    .line 3
    instance-of v0, p1, Lax/x3/r;

    .line 4
    .line 5
    if-eqz v0, :cond_b

    .line 6
    .line 7
    check-cast p1, Lax/x3/r;

    .line 8
    .line 9
    invoke-interface {p1}, Lax/x3/r;->a()V

    .line 10
    .line 11
    .line 12
    :cond_b
    iget-object p1, p0, Lax/x3/a$c$f;->c:Lax/x3/a$c;

    .line 13
    .line 14
    iget-object p1, p1, Lax/x3/a$c;->r:Lax/x3/a;

    .line 15
    .line 16
    invoke-static {p1}, Lax/x3/a;->a(Lax/x3/a;)Lax/x3/z;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object v0, p0, Lax/x3/a$c$f;->c:Lax/x3/a$c;

    .line 21
    .line 22
    iget v1, v0, Lax/x3/a$c;->m:I

    .line 23
    .line 24
    invoke-static {v0}, Lax/x3/a$c;->a(Lax/x3/a$c;)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v2, p0, Lax/x3/a$c$f;->c:Lax/x3/a$c;

    .line 29
    .line 30
    invoke-static {v2}, Lax/x3/a$c;->b(Lax/x3/a$c;)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    iget-object v3, p0, Lax/x3/a$c$f;->c:Lax/x3/a$c;

    .line 35
    .line 36
    invoke-static {v3}, Lax/x3/a$c;->d(Lax/x3/a$c;)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-interface {p1, v1, v0, v2, v3}, Lax/x3/z;->c(ILandroid/view/View;II)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    return p1
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
