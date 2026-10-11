.class public final synthetic Lax/i1/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q1/x;


# instance fields
.field public final synthetic b:Lax/i1/r;

.field public final synthetic c:Lax/P0/v;


# direct methods
.method public synthetic constructor <init>(Lax/i1/r;Lax/P0/v;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/i1/l;->b:Lax/i1/r;

    iput-object p2, p0, Lax/i1/l;->c:Lax/P0/v;

    return-void
.end method


# virtual methods
.method public synthetic a(Lax/N1/t$a;)Lax/q1/x;
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/q1/w;->d(Lax/q1/x;Lax/N1/t$a;)Lax/q1/x;

    move-result-object p1

    return-object p1
.end method

.method public synthetic b(I)Lax/q1/x;
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/q1/w;->b(Lax/q1/x;I)Lax/q1/x;

    move-result-object p1

    return-object p1
.end method

.method public final c()[Lax/q1/r;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i1/l;->b:Lax/i1/r;

    iget-object v1, p0, Lax/i1/l;->c:Lax/P0/v;

    invoke-static {v0, v1}, Lax/i1/r;->h(Lax/i1/r;Lax/P0/v;)[Lax/q1/r;

    move-result-object v0

    return-object v0
.end method

.method public synthetic d(Z)Lax/q1/x;
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/q1/w;->c(Lax/q1/x;Z)Lax/q1/x;

    move-result-object p1

    return-object p1
.end method

.method public synthetic e(Landroid/net/Uri;Ljava/util/Map;)[Lax/q1/r;
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/q1/w;->a(Lax/q1/x;Landroid/net/Uri;Ljava/util/Map;)[Lax/q1/r;

    move-result-object p1

    return-object p1
.end method
