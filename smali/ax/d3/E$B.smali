.class Lax/d3/E$B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/a3/m$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/E;->W6(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/W2/k;

.field final synthetic b:Lax/d3/E;


# direct methods
.method constructor <init>(Lax/d3/E;Lax/W2/k;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/d3/E$B;->b:Lax/d3/E;

    .line 2
    .line 3
    iput-object p2, p0, Lax/d3/E$B;->a:Lax/W2/k;

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
.method public a(Ljava/lang/String;Lax/W2/k$a;)V
    .registers 4

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_21

    .line 6
    .line 7
    iget-object v0, p0, Lax/d3/E$B;->a:Lax/W2/k;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lax/W2/k;->p(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lax/d3/E$B;->a:Lax/W2/k;

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Lax/W2/k;->o(Lax/W2/k$a;)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    :try_start_11
    iget-object p2, p0, Lax/d3/E$B;->b:Lax/d3/E;

    .line 19
    .line 20
    iget-object v0, p0, Lax/d3/E$B;->a:Lax/W2/k;

    .line 21
    .line 22
    invoke-virtual {p2, v0, p1}, Lax/d3/E;->l(Lax/W2/h;Z)V
    :try_end_18
    .catch Lax/b3/c; {:try_start_11 .. :try_end_18} :catch_19

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catch_19
    iget-object p2, p0, Lax/d3/E$B;->b:Lax/d3/E;

    .line 27
    .line 28
    const v0, 0x7f130137

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2, v0, p1}, Lax/d3/n;->J4(II)V

    .line 32
    .line 33
    .line 34
    :cond_21
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method
