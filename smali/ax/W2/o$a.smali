.class Lax/W2/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/a3/r$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/W2/o;->n(Lax/d3/s;Lax/c3/K;Lax/W2/h$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/d3/s;

.field final synthetic b:Lax/W2/o;


# direct methods
.method constructor <init>(Lax/d3/s;Lax/W2/o;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/W2/o$a;->a:Lax/d3/s;

    .line 2
    .line 3
    iput-object p2, p0, Lax/W2/o$a;->b:Lax/W2/o;

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
.method public a(Z)V
    .registers 4

    .line 1
    if-eqz p1, :cond_1b

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    :try_start_3
    iget-object v0, p0, Lax/W2/o$a;->a:Lax/d3/s;

    .line 5
    .line 6
    iget-object v1, p0, Lax/W2/o$a;->b:Lax/W2/o;

    .line 7
    .line 8
    invoke-interface {v0, v1, p1}, Lax/d3/s;->l(Lax/W2/h;Z)V
    :try_end_a
    .catch Lax/b3/c; {:try_start_3 .. :try_end_a} :catch_b

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catch_b
    iget-object v0, p0, Lax/W2/o$a;->a:Lax/d3/s;

    .line 13
    .line 14
    invoke-interface {v0}, Lax/d3/s;->b()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const v1, 0x7f130137

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 26
    .line 27
    .line 28
    :cond_1b
    return-void
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
.end method
