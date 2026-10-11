.class public final synthetic Lax/c0/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/f;


# instance fields
.field public final synthetic c0:Landroidx/lifecycle/d$b;

.field public final synthetic d0:Lax/c0/B;

.field public final synthetic q:Lax/c0/z;


# direct methods
.method public synthetic constructor <init>(Lax/c0/z;Landroidx/lifecycle/d$b;Lax/c0/B;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/c0/x;->q:Lax/c0/z;

    iput-object p2, p0, Lax/c0/x;->c0:Landroidx/lifecycle/d$b;

    iput-object p3, p0, Lax/c0/x;->d0:Lax/c0/B;

    return-void
.end method


# virtual methods
.method public final b(Lax/G0/h;Landroidx/lifecycle/d$a;)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/c0/x;->q:Lax/c0/z;

    iget-object v1, p0, Lax/c0/x;->c0:Landroidx/lifecycle/d$b;

    iget-object v2, p0, Lax/c0/x;->d0:Lax/c0/B;

    invoke-static {v0, v1, v2, p1, p2}, Lax/c0/z;->a(Lax/c0/z;Landroidx/lifecycle/d$b;Lax/c0/B;Lax/G0/h;Landroidx/lifecycle/d$a;)V

    return-void
.end method
