.class public final synthetic Lax/l1/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q7/o;


# instance fields
.field public final synthetic c0:Lax/l1/n$e;

.field public final synthetic q:Lax/l1/n;


# direct methods
.method public synthetic constructor <init>(Lax/l1/n;Lax/l1/n$e;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/l1/m;->q:Lax/l1/n;

    iput-object p2, p0, Lax/l1/m;->c0:Lax/l1/n$e;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Z
    .registers 4

    .line 1
    iget-object v0, p0, Lax/l1/m;->q:Lax/l1/n;

    iget-object v1, p0, Lax/l1/m;->c0:Lax/l1/n$e;

    check-cast p1, Lax/P0/v;

    invoke-static {v0, v1, p1}, Lax/l1/n;->u(Lax/l1/n;Lax/l1/n$e;Lax/P0/v;)Z

    move-result p1

    return p1
.end method
