.class Lax/v2/t$a$a;
.super Lax/v2/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/v2/t$a;->onPreDraw()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/B/a;

.field final synthetic b:Lax/v2/t$a;


# direct methods
.method constructor <init>(Lax/v2/t$a;Lax/B/a;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/v2/t$a$a;->b:Lax/v2/t$a;

    .line 2
    .line 3
    iput-object p2, p0, Lax/v2/t$a$a;->a:Lax/B/a;

    .line 4
    .line 5
    invoke-direct {p0}, Lax/v2/s;-><init>()V

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
.method public a(Lax/v2/k;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/v2/t$a$a;->a:Lax/B/a;

    .line 2
    .line 3
    iget-object v1, p0, Lax/v2/t$a$a;->b:Lax/v2/t$a;

    .line 4
    .line 5
    iget-object v1, v1, Lax/v2/t$a;->b:Landroid/view/ViewGroup;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lax/B/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p0}, Lax/v2/k;->Z(Lax/v2/k$f;)Lax/v2/k;

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
.end method
