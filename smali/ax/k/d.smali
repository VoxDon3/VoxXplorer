.class public final synthetic Lax/k/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/f;


# instance fields
.field public final synthetic c0:Ljava/lang/String;

.field public final synthetic d0:Lax/k/b;

.field public final synthetic e0:Lax/l/a;

.field public final synthetic q:Lax/k/e;


# direct methods
.method public synthetic constructor <init>(Lax/k/e;Ljava/lang/String;Lax/k/b;Lax/l/a;)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/k/d;->q:Lax/k/e;

    iput-object p2, p0, Lax/k/d;->c0:Ljava/lang/String;

    iput-object p3, p0, Lax/k/d;->d0:Lax/k/b;

    iput-object p4, p0, Lax/k/d;->e0:Lax/l/a;

    return-void
.end method


# virtual methods
.method public final b(Lax/G0/h;Landroidx/lifecycle/d$a;)V
    .registers 9

    .line 1
    iget-object v0, p0, Lax/k/d;->q:Lax/k/e;

    iget-object v1, p0, Lax/k/d;->c0:Ljava/lang/String;

    iget-object v2, p0, Lax/k/d;->d0:Lax/k/b;

    iget-object v3, p0, Lax/k/d;->e0:Lax/l/a;

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Lax/k/e;->a(Lax/k/e;Ljava/lang/String;Lax/k/b;Lax/l/a;Lax/G0/h;Landroidx/lifecycle/d$a;)V

    return-void
.end method
